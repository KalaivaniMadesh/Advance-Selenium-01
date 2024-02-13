package webelements_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ToExploreBooleanMethods {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		FirefoxDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.instagram.com/");
		Thread.sleep(5000);
		
		WebElement LoginButton = driver.findElement(By.xpath("//button[@type='submit']"));
		System.out.println("Before Enter the data");
		System.out.println(LoginButton.isDisplayed());
		System.out.println(LoginButton.isEnabled());
		
		System.out.println("********");
		System.out.println("After Enter the data");
		driver.findElement(By.name("username")).sendKeys("Smith");
		driver.findElement(By.name("password")).sendKeys("123456789");
		Thread.sleep(3000);
		System.out.println(LoginButton.isDisplayed());
		System.out.println(LoginButton.isEnabled());
		driver.quit();
		

	}

}
