package actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class ToHandleDoubleClick {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://demoapp.skillrary.com/product.php");
		WebElement addButton = driver.findElement(By.id("add"));
		
		// To use actions class
		Actions action = new Actions(driver);
		//call the method
		action.doubleClick(addButton).perform();
		Thread.sleep(3000);
		action.doubleClick(addButton).perform();
		Thread.sleep(3000);
		action.doubleClick(addButton).perform();
		Thread.sleep(3000);
		driver.quit();

	}

}
