package pop_ups;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ToHandlejavaScriptAlertPop_Up {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://netbanking.hdfcbank.com/netbanking/");
		//To switch the driver control to Frame
		driver.switchTo().frame("login_page");
		driver.findElement(By.linkText("CONTINUE")).click();
		Thread.sleep(3000);
		
		//To handle alert pop-up(Switch driver control to pop-up)
		Alert alertPopUp = driver.switchTo().alert();
		System.out.println(alertPopUp.getText());
		//alertPopUp.accept();
		//We can use dismiss() also in alertPopUp
		alertPopUp.dismiss();
		Thread.sleep(5000);
		
		driver.quit();
		
	}

}
