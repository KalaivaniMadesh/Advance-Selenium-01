package assignment1;

import org.openqa.selenium.firefox.FirefoxDriver;

public class ToOpenPolarBearApp {
	public static void main(String[] args) {
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://polarbear.co.in/");
	}

}
