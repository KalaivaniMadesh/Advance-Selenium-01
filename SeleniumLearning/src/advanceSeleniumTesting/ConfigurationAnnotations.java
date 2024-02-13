package advanceSeleniumTesting;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ConfigurationAnnotations {
	
	@BeforeSuite
	public void connectServer() {
		Reporter.log("Connection to Server", true);
	}
	@AfterSuite
	public void disConnectServer() {
		Reporter.log("Disconnection to Server", true);
	}
	@BeforeTest
	public void connectDB() {
		Reporter.log("Connection to DB", true);
	}
	@AfterTest
	public void disConnectDB() {
		Reporter.log("Disconnection to DB", true);
	}
	@BeforeClass
	public void openBrowser() {
		Reporter.log("Open the Browser", true);
	}
	@AfterClass
	public void closeBrowser() {
		Reporter.log("Close the browser", true);
	}
	@BeforeMethod
	public void login() {
		Reporter.log("Logged in Successfully", true);
	}
	@AfterMethod
	public void logout() {
		Reporter.log("Logged out successfully", true);
	}
	
	@Test
	public void testCase() {
		Reporter.log("Test Case got Executed", true);
	}

}
