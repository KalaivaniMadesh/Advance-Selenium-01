package webelements_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ToUseGetSCSSValue {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		FirefoxDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.actitime.com/");
		Thread.sleep(4000);
		
		WebElement tryfree = driver.findElement(By.linkText("Try Free"));
		System.out.println(tryfree.getCssValue("border-radius"));
		System.out.println(tryfree.getCssValue("background-color"));
		System.out.println(tryfree.getCssValue("font-family"));
		driver.quit();

	}

}
