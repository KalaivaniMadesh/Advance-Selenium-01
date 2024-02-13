package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ToUseNameLocator {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
		Thread.sleep(6000);
		driver.findElement(By.name("username")).sendKeys("1234567891");
		Thread.sleep(1000);
		driver.findElement(By.name("password")).sendKeys("kalai");
		Thread.sleep(7000);
		driver.quit();

	}

}
