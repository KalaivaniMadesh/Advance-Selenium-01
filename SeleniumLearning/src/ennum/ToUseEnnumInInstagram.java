package ennum;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.UsernameAndPassword;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ToUseEnnumInInstagram {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.instagram.com/accounts/login/");
		Thread.sleep(5000);
		
		//Keys ennum is used to perform Keyboard actions
		//Keys are predefines
		
		WebElement UserName = driver.findElement(By.name("username"));
		UserName.sendKeys("Kalai",Keys.CONTROL+"a");
		UserName.sendKeys(Keys.CONTROL+"c");
		
		Thread.sleep(3000);
		
		WebElement Password = driver.findElement(By.name("password"));
		Password.sendKeys(Keys.CONTROL+"v");
		
		Thread.sleep(4000);
		driver.quit();
	}

}
