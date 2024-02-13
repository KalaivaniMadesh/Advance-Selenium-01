package webDriver_methods;

import org.openqa.selenium.firefox.FirefoxDriver;

public class ToUsegetWindowHandle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		driver.get("https://web.whatsapp.com/");
		
		String ParentID = driver.getWindowHandle();
		System.out.println(ParentID);//54896165-a4ca-4b44-b03d-1cda97426cdf
		                             //ce3329f2-abc6-49d2-9a91-78372ffbe1c8

		driver.quit();

	}

}
