package ennum;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ToUseEnnumKeys {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/");
		Thread.sleep(4000);
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Mobiles",Keys.ENTER);
		Thread.sleep(6000);
		
		driver.quit();

	}

}
