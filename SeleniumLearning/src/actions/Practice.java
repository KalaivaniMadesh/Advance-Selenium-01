package actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Practice {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://yonobusiness.sbi/login/yonobusinesslogin");
		driver.findElement(By.id("password")).sendKeys("1234");
		WebElement EyeIcon = driver.findElement(By.xpath("//div[@class='showPassword shownhide']"));
		
		//Use actions class
		Actions action = new Actions(driver);
		action.clickAndHold(EyeIcon).perform();
		Thread.sleep(5000);
		action.release(EyeIcon).perform();
		Thread.sleep(3000);
		driver.quit();

	}

}
