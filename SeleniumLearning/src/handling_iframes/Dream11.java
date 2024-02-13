package handling_iframes;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Dream11 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://www.dream11.com/");
		
		//To switch by using (int index)
		//driver.switchTo().frame(0);
		
		//To switch by using (id or name)
		//driver.switchTo().frame("send-sms-iframe");
		
		//To switch by using(webElement)
		WebElement iframe = driver.findElement(By.xpath("//iframe[@title='Iframe Example']"));
		driver.switchTo().frame(iframe);
		driver.findElement(By.id("regEmail")).sendKeys("1234567890");
		
		
		//To Switch back using parentFrame()
		//driver.switchTo().parentFrame();
		
		//To Switch back using defaultFrame()
		driver.switchTo().defaultContent();
		Thread.sleep(1000);
		driver.findElement(By.linkText("About Us")).click();
		Thread.sleep(3000);
		
		driver.quit();
	}

}
