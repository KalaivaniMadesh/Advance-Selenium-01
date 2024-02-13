package assignment1;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ToOpenActitimeApp {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		driver.get("https://www.actitime.com/free-online-trial");
		Thread.sleep(2000);
		driver.findElement(By.id("FirstName")).sendKeys("Kalaivani");
		Thread.sleep(1000);
		driver.findElement(By.id("LastName")).sendKeys("Gokul");
		Thread.sleep(1000);
		driver.findElement(By.id("Email")).sendKeys("kalaivanimadesh437@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.id("Company")).sendKeys("Qsp");

	}

}
