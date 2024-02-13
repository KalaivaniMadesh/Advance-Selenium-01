package webelements_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ToUseGetRect {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		FirefoxDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.instagram.com/");
		Thread.sleep(5000);
		
		Rectangle rect = driver.findElement(By.xpath("//button[@type='submit']")).getRect();
		System.out.println(rect);
		System.out.println(rect.getHeight());
		System.out.println(rect.getWidth());
		System.out.println(rect.getX());
		System.out.println(rect.getY());
		
		//We can call directly also
		System.out.println(rect.getPoint());
		System.out.println(rect.getDimension());
		driver.quit();
		

	}

}
