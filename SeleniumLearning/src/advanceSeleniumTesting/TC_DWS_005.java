package advanceSeleniumTesting;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC_DWS_005 extends BaseClass{
	String expectedData = "Digital downloads";

	@Test
	public void toCheckDigital_downloadsPage() {
		driver.findElement(By.partialLinkText("Digital downloads")).click();
		String actualData = driver.findElement(By.xpath("//h1[text()='Digital downloads']")).getText();
		if(actualData.equals(expectedData)) {
			Reporter.log("Successfully navigated to Digital downloads page in DWS", true);
		 }else {
			 Reporter.log("Failed to navigate to Digital downloads page in DWS", true);
		}
	}

}
