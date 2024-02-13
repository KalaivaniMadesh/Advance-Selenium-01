package javaScriptExecuter;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ToHandleDisabledElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://www.oracle.com/cis/java/technologies/downloads/");
		driver.findElement(By.linkText("jdk-8u401-linux-i586.tar.gz")).click();
		WebElement DisabledElement = driver.findElement(By.linkText("Download jdk-8u401-linux-i586.tar.gz"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", DisabledElement);
		
		
	}

}
