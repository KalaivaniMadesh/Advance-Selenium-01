package webDriver_methods;

import org.openqa.selenium.firefox.FirefoxDriver;

public class ToCaptureTitle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.get("https://web.whatsapp.com/");
		String titleOfWebpage = driver.getTitle();
		System.out.println(titleOfWebpage);
	}

}
