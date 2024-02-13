package advanceSeleniumTesting;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC_DWS_002 extends BaseClass {
	
	String expectedData = "Computers";

	@Test
	public void toCheckComputerPage() {
		driver.findElement(By.partialLinkText("Computers")).click();
		String actualData = driver.findElement(By.xpath("//h1[contains(text(),'Computers')]")).getText();
//		if(actualData.equals(expectedData)) {
//			Reporter.log("Successfully navigated to Computer page in DWS", true);
//		 }else {
//			 Reporter.log("Failed to navigate to Computer page in DWS", true);
//		}
		
		Assert.assertEquals(actualData, expectedData, "Failed to navigate to Computer page in DWS\", true");
		Reporter.log("Successfully navigated to Computer page in DWS", true);
	}
}
