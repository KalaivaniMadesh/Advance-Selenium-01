package webDriver_methods;

import org.openqa.selenium.firefox.FirefoxDriver;

public class ToCaptureUrl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.get("https://www.swiggy.com/");
		String urlOfWebpage = driver.getCurrentUrl();
		System.out.println(urlOfWebpage);

	}

}
