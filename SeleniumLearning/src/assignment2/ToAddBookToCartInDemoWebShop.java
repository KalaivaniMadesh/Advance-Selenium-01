package assignment2;

import java.awt.Window;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ToAddBookToCartInDemoWebShop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		FirefoxDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(5000);
		
		driver.findElement(By.partialLinkText("Books")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.linkText("Computing and Internet")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.id("add-to-cart-button-13")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//span[text()='Shopping cart']")).click();
		Thread.sleep(6000);
		
		driver.quit();

	}

}
