package assignment2;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ToClickMotorolaCheckBoxInAmazon {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		FirefoxDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.com/");
		Thread.sleep(5000);
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Mobiles 5g");
		Thread.sleep(3000);
		
		driver.findElement(By.id("nav-search-submit-button")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//span[text()='Motorola']/../../..//i[@class='a-icon a-icon-checkbox']")).click();
		Thread.sleep(6000);
		
		driver.quit();
		

	}

}
