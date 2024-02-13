package pop_ups;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToHandleAuthenticationPopUp {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		//We have to pass the username and pw in the URL itself then only it will alow to open the app
		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
		Thread.sleep(5000);
		
		driver.quit();

	}

}
