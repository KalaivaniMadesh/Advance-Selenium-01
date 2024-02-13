package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ToUseXpathBySurroundings {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		FirefoxDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.shoppersstack.com/");
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//span[text()='APPLE iPhone 14 Pro']/../..//button[@name = 'addToCart']")).click();
		Thread.sleep(7000);
		driver.quit();
	}

}
