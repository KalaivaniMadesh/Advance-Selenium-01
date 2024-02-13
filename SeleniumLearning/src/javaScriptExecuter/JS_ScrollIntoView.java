package javaScriptExecuter;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class JS_ScrollIntoView {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		driver.get("https://www.countries-ofthe-world.com/flags-of-the-world.html");
		WebElement IndianFlag = driver.findElement(By.xpath("//td[text()='India']"));
		js.executeScript("arguments[0].scrollIntoView(true)", IndianFlag);
		Thread.sleep(5000);
		driver.quit();
	}

}
