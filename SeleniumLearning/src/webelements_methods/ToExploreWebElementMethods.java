package webelements_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ToExploreWebElementMethods {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		FirefoxDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(5000);
		
		driver.findElement(By.linkText("Log in")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.id("Email")).sendKeys("kalaivanigokul123@gmail");
		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector("input[value='Log in']")).click();
		Thread.sleep(2000);
		
		String Errormsg = driver.findElement(By.xpath("//span[contains(text(),'valid email')]")).getText();
		
		System.out.println(Errormsg);
		Thread.sleep(8000);
		
		driver.quit();
	}

}
