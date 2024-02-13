package assignment2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ToHandleDropdownInFB {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://www.facebook.com/signup");
		driver.findElement(By.id("day"));//day select
		driver.findElement(By.xpath("//option[text()='6']")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//option[text()='Feb']")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//option[text()='2000']")).click();
		Thread.sleep(4000);
		
		driver.quit();
		
	}

}
