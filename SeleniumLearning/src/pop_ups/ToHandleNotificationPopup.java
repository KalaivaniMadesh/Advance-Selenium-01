package pop_ups;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ToHandleNotificationPopup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeOptions settings = new ChromeOptions();
		settings.addArguments("--disable-notifications"); 
		
		// Or we can use incognito it will automatically avoid it
		//settings.addArguments("incognito");
		
		WebDriver driver = new ChromeDriver(settings);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://www.yatra.com/");
	
		

	}

}
