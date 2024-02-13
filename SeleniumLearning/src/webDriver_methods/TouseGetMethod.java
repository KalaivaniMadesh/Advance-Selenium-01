package webDriver_methods;

import org.openqa.selenium.firefox.FirefoxDriver;

public class TouseGetMethod {
	
	public static void main(String[] args) {
		
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.get("https://web.whatsapp.com/");
		driver.get("https://www.instagram.com/accounts/login/");
				
	}

}
