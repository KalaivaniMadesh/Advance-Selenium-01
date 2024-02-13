package webelements_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ToUseGetLoction {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		FirefoxDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.instagram.com/");
		Thread.sleep(5000);
		
		Point location = driver.findElement(By.xpath("//button[@type='submit']")).getLocation();
		System.out.println(location);
		System.out.println(location.getX());
		System.out.println(location.getY());
		
		driver.quit();
		
	}

}
