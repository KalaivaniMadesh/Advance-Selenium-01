package assignment1;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ToOpenKFCWebsite {
	public static void main(String[] args) {
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://online.kfc.co.in/");
		
		driver.manage().window().maximize();
		Dimension SizeOfBrowser = driver.manage().window().getSize();
		
		System.out.println(SizeOfBrowser);
	}
	

}
