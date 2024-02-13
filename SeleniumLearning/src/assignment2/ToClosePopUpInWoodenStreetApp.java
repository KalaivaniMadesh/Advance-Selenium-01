package assignment2;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ToClosePopUpInWoodenStreetApp {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		FirefoxDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.woodenstreet.com/");

		for(;;) { //infinity loop because the condition is thread.sleep(2000) 
		try {
			driver.findElement(By.id("loginclose1")).click();
			break;
		}
		catch(Exception e) {
			Thread.sleep(2000);

		}
	}

}
}
