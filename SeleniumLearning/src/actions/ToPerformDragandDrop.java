package actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class ToPerformDragandDrop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
		WebElement photoManager = driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']"));
		
		//To switch the driver control
		driver.switchTo().frame(photoManager);
		
		//images
		WebElement image1 = driver.findElement(By.xpath("//img[@alt='The peaks of High Tatras']"));
		WebElement image2 = driver.findElement(By.xpath("//img[@alt='The chalet at the Green mountain lake']"));
		WebElement image3 = driver.findElement(By.xpath("//img[@alt='Planning the ascent']"));
		WebElement image4 = driver.findElement(By.xpath("//img[@alt='On top of Kozi kopka']"));
		WebElement trash = driver.findElement(By.id("trash"));
		WebElement gallery = driver.findElement(By.id("gallery"));
		

		
		//To use Actions class
		Actions action = new Actions(driver);
		//To drag images to trashbox
		action.dragAndDrop(image1, trash).perform();
		Thread.sleep(2000);
		
		//action.dragAndDrop(image2, trash).perform();
		
		///We can also drag and drop another method
		action.dragAndDropBy(image2, 500, 0).perform();//we have to assume the coordinates
		Thread.sleep(2000);
		action.dragAndDrop(image3, trash).perform();
		Thread.sleep(2000);
		action.dragAndDrop(image4, trash).perform();
		Thread.sleep(3000);
		
		//To drag the images to gallery or photomanager
		action.dragAndDrop(image1, gallery).perform();
		Thread.sleep(2000);
		
		//action.dragAndDrop(image2, gallery).perform();
		///We can use below method to perform drag and drop
		action.clickAndHold(image2).moveToElement(gallery).release().perform();
		Thread.sleep(2000);
		action.dragAndDrop(image3, gallery).perform();
		Thread.sleep(2000);
		action.dragAndDrop(image4, gallery).perform();
		Thread.sleep(5000);
		
		driver.quit();	
		
		

	}

}
