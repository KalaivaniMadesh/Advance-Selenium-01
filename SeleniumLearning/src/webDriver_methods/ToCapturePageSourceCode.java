package webDriver_methods;

import org.openqa.selenium.firefox.FirefoxDriver;

public class ToCapturePageSourceCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.get("https://www.swiggy.com/");
		String SourceCode = driver.getPageSource();
		
		System.out.println(SourceCode);

	}

}
