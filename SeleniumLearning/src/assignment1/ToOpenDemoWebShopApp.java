package assignment1;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ToOpenDemoWebShopApp {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		FirefoxDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(5000);
		
		//To click register link
		driver.findElement(By.linkText("Register")).click();
		Thread.sleep(1000);
		//To select gender
		driver.findElement(By.id("gender-female")).click();
		Thread.sleep(1000);
		//To Enter first name
		driver.findElement(By.id("FirstName")).sendKeys("Kalai");
		Thread.sleep(1000);
		//To Enter last name
		driver.findElement(By.id("LastName")).sendKeys("G");
		Thread.sleep(1000);
		//To enter Email
		driver.findElement(By.id("Email")).sendKeys("kalaivanimadesh123@gmail.com");
		Thread.sleep(1000);
		//To enter PW
		driver.findElement(By.id("Password")).sendKeys("GK@123");
		Thread.sleep(1000);
		//To enter confirm PW
		driver.findElement(By.id("ConfirmPassword")).sendKeys("GK@123");
		Thread.sleep(1000);
		//To Register
		driver.findElement(By.id("register-button")).click();
		
		
		
		}

}
