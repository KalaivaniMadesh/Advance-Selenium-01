package assignment1;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TousePartialLinkTextinDemoWebShop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		FirefoxDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(6000);
		
		driver.findElement(By.partialLinkText("Computers")).click();
		Thread.sleep(3000);
		driver.close();

	}

}
