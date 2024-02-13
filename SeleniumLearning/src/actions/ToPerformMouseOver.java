package actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class ToPerformMouseOver {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https:www.woodenstreet.com/");
		driver.findElement(By.id("loginclose1")).click();
		WebElement KidsElements = driver.findElement(By.linkText("Kids Room"));
		
		//To use actions class
		Actions action = new Actions(driver);
		//call the method
		action.moveToElement(KidsElements).perform();
		Thread.sleep(4000);
		
		driver.quit();

	}

}
