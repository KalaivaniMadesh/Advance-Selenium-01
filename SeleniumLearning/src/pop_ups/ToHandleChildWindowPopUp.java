package pop_ups;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToHandleChildWindowPopUp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.amazon.in/");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Mobiles");
		driver.findElement(By.id("nav-search-submit-button")).click();
		
		//Go To apple iphone 14
		driver.findElement(By.xpath("//img[@alt='Sponsored Ad - Apple iPhone 14 (128 GB) - Midnight']")).click();
	
		//Get and store Parent window ID
		String ParentWindowID = driver.getWindowHandle();
		//Get All the window ID's
		Set<String> IDs = driver.getWindowHandles();
		//Get one by one and compare with parentID if it's not equal jump to child window
		for(String WindowID: IDs) {
			if(!WindowID.equals(ParentWindowID)) {
				driver.switchTo().window(WindowID);
				break;// Switched to the first child window, you can modify as needed
			}
		}
		
		// Now We are working in the child window, perform actions as needed
		WebElement PriceofApple = driver.findElement(By.xpath("//span[@class='a-price-whole']"));
		System.out.println(PriceofApple.getText());
		// Close the child window
		driver.close();
		// Switch back to the parent window
        driver.switchTo().window(ParentWindowID);
        // Close the main window
        driver.quit();
		
		

	}

}
