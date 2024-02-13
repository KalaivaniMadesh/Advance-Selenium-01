package pop_ups;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class ToHandleFileUploadPopup {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.naukri.com/");
		
		driver.findElement(By.id("register_Layer")).click();
		//use Action class to scroll down
		
		Actions action = new Actions(driver);
		//Use Keys ennum inside sendKeys upon that call PAGE_DOWN
		action.sendKeys(Keys.PAGE_DOWN).perform();
		
		//To avoid file upload pop up ...find input tag then use the locator strategy
		//find the upload element then call sendKeys and pass file path with file name
		//Go to the file upload->select the file->right click & properties->then copy the location and paste it in " " give \\then copy and paste the filename and give file extension
		driver.findElement(By.id("resumeUpload")).sendKeys("C:\\Users\\kalai\\Downloads\\Recent resume Kalai (1).pdf");
		
		Thread.sleep(8000);
		driver.quit();
		
		
		
		
	}

}
