package pop_ups;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ToHandleJSPromptPopUp {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_prompt");
		
		//To switch by using webelement
		WebElement iframe = driver.findElement(By.xpath("//iframe[@id='iframeResult']"));
		driver.switchTo().frame(iframe);
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		
		//to switch the driver control to prompt pop up
		Alert promptPopUp = driver.switchTo().alert();
		promptPopUp.sendKeys("Karen");
		promptPopUp.accept();
		Thread.sleep(5000);
		
		driver.quit();
	}

}
