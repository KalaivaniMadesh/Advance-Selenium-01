package pop_ups;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ToHandleJSConfirmationPopUp {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://licindia.in/");
		driver.findElement(By.xpath("//button[text()='Close']")).click();
		driver.findElement(By.cssSelector("a[title='Login']")).click();
		Thread.sleep(3000);
		
		//To handle confirmation pop up
		Alert confirmationPopUp = driver.switchTo().alert();//Alert is a interface in selenium
		System.out.println(confirmationPopUp.getText());
		confirmationPopUp.accept();
		driver.quit();

	}

}
