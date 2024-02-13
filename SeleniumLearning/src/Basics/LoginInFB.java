package Basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginInFB {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("Kalai");
		driver.findElement(By.id("pass")).sendKeys("1234");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		Thread.sleep(9000);
		driver.quit();

	}

}
