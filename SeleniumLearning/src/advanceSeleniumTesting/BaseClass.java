package advanceSeleniumTesting;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import com.beust.jcommander.Parameter;

public class BaseClass {
	
	WebDriver driver;
	String expectedWelcomePageTitle = "Demo Web Shop";
	
	@Parameters("browserName")
	@BeforeClass
	public void toLaunch(String bname) {
		if(bname.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		}else if(bname.equalsIgnoreCase("FireFox")) {
			driver = new FirefoxDriver();
		}else if(bname.equalsIgnoreCase("edge")){
			driver = new EdgeDriver();
		}
		
		Reporter.log("Browser got launched Successfully", true);
		driver.manage().window().maximize();
		Reporter.log("Browser got maximized Successfully", true);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	}
	@BeforeMethod
	public void toLogin() {
		driver.get("https://demowebshop.tricentis.com/");
		String actualWelcomePageTitle = driver.getTitle();
		if(actualWelcomePageTitle.equals(expectedWelcomePageTitle)) {
			Reporter.log("Navigated to the DWS welcome page successfully", true);
		}
		else {
			Reporter.log("Failed to Navigate to the DWS welcome page", true);
		}
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.id("Email")).sendKeys("Selenium10to12@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("Selenium@123");
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		Reporter.log("Navigated to the DWS HOMe page successfully", true);
		}
	
	@AfterMethod
	public void toLogout(){
		driver.findElement(By.linkText("Log out")).click();
		Reporter.log("Successfully Logged out", true);
	}
	
	@AfterClass
	public void toCloseBrowser() {
		Reporter.log("Browser got closed Successfully", true);
		driver.quit();
	}
		

}
