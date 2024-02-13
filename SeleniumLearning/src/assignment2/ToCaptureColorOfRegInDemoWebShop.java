package assignment2;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ToCaptureColorOfRegInDemoWebShop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		FirefoxDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(5000);
		
		String ColorOfReg = driver.findElement(By.linkText("Register")).getCssValue("color");
		System.out.println(ColorOfReg);
		
		Thread.sleep(5000);
		driver.quit();
	}

}
