package webelements_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ToUseClearMethod {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		FirefoxDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demo.vtiger.com/vtigercrm/index.php");
		Thread.sleep(5000);
		
		WebElement UserNameTextField = driver.findElement(By.id("username"));
		UserNameTextField.clear();
		Thread.sleep(2000);
		
		UserNameTextField.sendKeys("Kalai123");
		Thread.sleep(5000);
		driver.quit();
		

	}

}
