package takesSceenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;

public class ToCaptureEntireWebpage {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new FirefoxDriver();// cross browser testing
		driver.manage().window().maximize();
		
		driver.get("https://www.flipkart.com/");
		Thread.sleep(4000);
		
		TakesScreenshot ts =(TakesScreenshot) driver; //typecasting
	    File temp = ts.getScreenshotAs(OutputType.FILE);
	    File src = new File("./errorShots/FlipKart.jpeg");
	    FileHandler.copy(temp, src);//We should select Selenium FileHandler class ..Don't select java FileHandler
		
	
	}

}
