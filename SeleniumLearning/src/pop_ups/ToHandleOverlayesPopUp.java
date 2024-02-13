package pop_ups;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ToHandleOverlayesPopUp {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://www.makemytrip.com/");
		driver.switchTo().frame("notification-frame-~10cb447c7");
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		WebElement closeIcon = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@class='close']")));
		closeIcon.click();
		
		
		
		driver.switchTo().parentFrame();
		driver.findElement(By.xpath("//label[@for='departure']")).click();
		for(;;) {
			try {
			driver.findElement(By.xpath("//div[text()='March 2024']/../..//p[text()='17']")).click();
			break;
			}
		catch(Exception e) {
			driver.findElement(By.xpath("//span[@aria-label='Next Month']")).click();
		}
		
		}
		Thread.sleep(5000);
		driver.quit();
		
	}
}
