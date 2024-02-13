package assignment2;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;

public class ToCaptureZomotaLogo {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.zomato.com/");
		Thread.sleep(5000);
		
		File temp = driver.findElement(By.xpath("//img[@role='presentation' and @class='high-res-image']")).getScreenshotAs(OutputType.FILE);
		File src = new File("./errorShots/ZomotaLogo.jpeg");
		FileHandler.copy(temp, src);
		driver.quit();

	}

}
