package advanceSeleniumTesting;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class ToLearnDependsOnMethods {

	@Test
	public void createAccount() {
		Reporter.log("Account Created Successfully", true);
	}
	@Test
	public void editAccount() {
		Reporter.log("Account Edited Successfully", true);
	}
	@Test(dependsOnMethods = {"editAccount","createAccount"})//Inside the{}bracket also it will execute based on the alphabets
	public void deleteAccount() {
		Reporter.log("Account Deleted Successfully", true);
	}
}
