package webelements_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ToUseSubmitMethod {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		FirefoxDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.instagram.com/");
		Thread.sleep(6000);
		
		driver.findElement(By.name("username")).sendKeys("Smith");
		driver.findElement(By.name("password")).sendKeys("12345");
		Thread.sleep(2000);
		
		//Instead of using Click() method, we can use Submit() method to clicking Login Button
		driver.findElement(By.xpath("//button[@type='submit']")).submit();
		Thread.sleep(6000);
		
		driver.quit();

	}

}
