package assignment1;

import org.openqa.selenium.firefox.FirefoxDriver;

public class ToOpenBaskinRobbinsApp {
	public static void main(String[] args) {
		
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.get("https://baskinrobbinsindia.com/");
		String TitleOfWebpage = driver.getTitle();
		System.out.println(TitleOfWebpage);
	}

}
