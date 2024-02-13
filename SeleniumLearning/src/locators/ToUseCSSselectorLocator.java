package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ToUseCSSselectorLocator {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		FirefoxDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(4000);
		
		driver.findElement(By.cssSelector("input[value='Search']")).click();
		Thread.sleep(5000);
		
		driver.quit();
		

	}

	
}
