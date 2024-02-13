package webDriver_methods;

import org.openqa.selenium.firefox.FirefoxDriver;

public class ToUseCloseMethod {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.instagram.com/accounts/login/");
		Thread.sleep(3000);
		driver.close();
	}

}
