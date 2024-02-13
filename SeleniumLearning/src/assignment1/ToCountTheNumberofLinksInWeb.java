package assignment1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ToCountTheNumberofLinksInWeb {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		FirefoxDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.com/");
		Thread.sleep(5000);
		
		List<WebElement> Links = driver.findElements(By.tagName("a"));
		System.out.println(Links.size());
		driver.quit();
	}

}
