package webelements_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ToUseGetTagName {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		FirefoxDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.actitime.com/");
		Thread.sleep(5000);
		
		String TagName = driver.findElement(By.linkText("Try Free")).getTagName();
		System.out.println(TagName);
		driver.quit();
		

	}

}
