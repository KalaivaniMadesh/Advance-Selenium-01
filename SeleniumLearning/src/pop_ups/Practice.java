package pop_ups;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://www.makemytrip.com/");
		driver.findElement(By.xpath("//span[text()='Departure']")).click();
		
		for(;;) {
			try {
				driver.findElement(By.xpath("//div[text()='March 2024']/../..//p[text()='7']")).click();
				break;
			}
			catch(Exception e) {
				driver.findElement(By.xpath("//span[@aria-label='Next Month']")).click();
			}
			
		}
		Thread.sleep(4000);
		driver.quit();

	}

}
