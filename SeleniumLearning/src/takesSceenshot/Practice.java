package takesSceenshot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Practice {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.amazon.in/");
		//Type Casting
//		TakesScreenshot ts = (TakesScreenshot)driver;
//		File temp = ts.getScreenshotAs(OutputType.FILE);
//		File Src = new File("./errorShots/AmazonEntireWeb.png");
//		FileHandler.copy(temp, Src);
		//Thread.sleep(3000);
		//driver.quit();
		
		//WebElement SS
		
		File temp = driver.findElement(By.id("nav-logo-sprites")).getScreenshotAs(OutputType.FILE);
		File src = new File("./errorShots/AmazonLogo.jpeg");
		FileHandler.copy(temp, src);
		
		
		
	}

}
