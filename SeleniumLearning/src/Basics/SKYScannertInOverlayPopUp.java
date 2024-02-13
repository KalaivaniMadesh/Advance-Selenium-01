package Basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class SKYScannertInOverlayPopUp {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		Actions action = new Actions(driver);
		
		driver.get("https://www.skyscanner.co.in/");
		//WebElement clickandHold = driver.findElement(By.xpath("lLlKeTbWyNQZUfc"));
		//action.clickAndHold(clickandHold).perform();
		
		
		driver.findElement(By.xpath("//span[text()='Depart']")).click();
		for(;;) {
		try {
		driver.findElement(By.xpath("//h2[text()='April']/..//button[text()='24']")).click();
		break;
		
		} catch(Exception e) {
			driver.findElement(By.xpath("//h2[text()='March']/..//button[text()='20']")).click();
		}
		
		Thread.sleep(5000);
		driver.quit();
		}
}}
