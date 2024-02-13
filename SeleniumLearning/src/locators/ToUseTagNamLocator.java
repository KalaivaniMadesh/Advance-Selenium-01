package locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ToUseTagNamLocator {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		FirefoxDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.meesho.com/");
		Thread.sleep(6000);
		
		List<WebElement> images = driver.findElements(By.tagName("img"));
		System.out.println(images.size());
		driver.quit();
		
	}

}
