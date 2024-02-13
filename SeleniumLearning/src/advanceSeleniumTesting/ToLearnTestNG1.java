package advanceSeleniumTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ToLearnTestNG1 { //TestNG clss
	
	@Test(enabled = true)
	public void cricbuzz(){ //Test case 1
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.cricbuzz.com/");
		Reporter.log("Cricbuzz got executed Successfully", true);//Test steps
		driver.quit();
		
	}
	
	@Test
	public void baskinRobbins(){ //Test case 2
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://baskinrobbinsindia.com/");
		Reporter.log("baskinRobbins got executed Successfully", true);
		driver.quit();
	}
	
	@Test(enabled = false)
	public void amazon(){ //Test case 3
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		Reporter.log("Amazon got executed Successfully", true);
		driver.quit();
		
	
	}

}
