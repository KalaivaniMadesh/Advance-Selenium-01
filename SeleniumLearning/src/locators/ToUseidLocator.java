package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ToUseidLocator {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		FirefoxDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		
		driver.findElement(By.id("email")).sendKeys("Kalai@12");
		Thread.sleep(3000);
		driver.findElement(By.id("pass")).sendKeys("12345");		

	}

}
