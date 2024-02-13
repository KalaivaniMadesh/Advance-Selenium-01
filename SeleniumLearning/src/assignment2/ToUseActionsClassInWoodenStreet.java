package assignment2;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ToUseActionsClassInWoodenStreet {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.woodenstreet.com/");
		driver.findElement(By.id("loginclose1")).click();
		WebElement profileIcon = driver.findElement(By.linkText("Profile"));
		//To use Actions class to perform mouse over
		Actions action = new Actions(driver);
		
		
		action.moveToElement(profileIcon).perform();
		WebElement Myprofile = driver.findElement(By.linkText("My Profile"));
		action.click(Myprofile).perform();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("login_submit_btn")));
		WebElement signUp = driver.findElement(By.id("login_submit_btn"));
		action.click(signUp).perform();
		
		//to capture the error msg
		WebElement errorMsg = driver.findElement(By.xpath("//p[contains(text(),'valid')]"));
		System.out.println(errorMsg.getText());
		System.out.println(errorMsg.getCssValue("color"));
		System.out.println(errorMsg.getCssValue("font-size"));
		
		
	
		Thread.sleep(4000);
		driver.quit();

	}

}
