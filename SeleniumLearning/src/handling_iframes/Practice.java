package handling_iframes;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://www.dream11.com/");
		WebElement iframe = driver.findElement(By.id("send-sms-iframe"));
		driver.switchTo().frame(iframe);
		driver.findElement(By.xpath("//input[@placeholder='Enter Mobile Number']")).sendKeys("1234567890");

		//To switch back
		driver.switchTo().defaultContent();
		driver.findElement(By.linkText("About Us")).click();
		Thread.sleep(9000);
		driver.quit();
	}

}
