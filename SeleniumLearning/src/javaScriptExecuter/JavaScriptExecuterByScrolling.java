package javaScriptExecuter;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecuterByScrolling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://www.google.co.in/");
		driver.findElement(By.name("q")).sendKeys("flowers",Keys.ENTER);
		driver.findElement(By.linkText("Images")).click();
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		////   scrollbY(int x, int y)
		for(;;) {
			try {
			//driver.findElement(By.xpath("//img[@alt='1K+ Nature Flower Pictures | Download Free Images on Unsplash']")).click();
			driver.findElement(By.xpath("//div[text()='26 Most Beautiful Blue Flowers']")).click();
			break;
		}catch(Exception e) {
			js.executeScript("window.scrollBy(0,1000)");
		}
			
		}			
		
		
	}

}
