package assignment2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class ToHandleSingleSelectInDemoWebShop {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.partialLinkText("Books")).click();
		
		//dropdowns
		WebElement position = driver.findElement(By.id("products-orderby"));
		WebElement display = driver.findElement(By.id("products-pagesize"));
		WebElement Viewmode = driver.findElement(By.id("products-viewmode"));
		
		Select posistionSelect = new Select(position);
		Select displayeSelect = new Select(display);
		Select ViewmodeSelect = new Select(Viewmode);
		
		posistionSelect.selectByVisibleText("Price: Low to High");
		//Thread.sleep(7000);
		displayeSelect.selectByVisibleText("12");
		//Thread.sleep(8000);
		ViewmodeSelect.selectByVisibleText("List");
		Thread.sleep(5000);
		
		driver.quit();
	}

}
