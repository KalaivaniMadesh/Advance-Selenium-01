package webDriver_methods;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ToUseNavigateMethod {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub
		FirefoxDriver driver = new FirefoxDriver();
		
		//To string url
		//driver.navigate().to("https://www.amazon.in/");
		
		//To URL url
		//driver.navigate().to(new URL("https://www.amazon.in/"));
		driver.get("https://web.whatsapp.com/");
		
		Navigation nav = driver.navigate();
		Thread.sleep(1000);
		nav.back();
		Thread.sleep(3000);
		nav.forward();
		Thread.sleep(2000);
		nav.refresh();
		driver.quit();
	}

}
