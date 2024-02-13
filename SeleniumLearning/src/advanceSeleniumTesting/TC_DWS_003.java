package advanceSeleniumTesting;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC_DWS_003 extends BaseClass{
	String expectedData = "Electronics";

	@Test
	public void toCheckElectronicsPage() {
		driver.findElement(By.partialLinkText("Electronics")).click();
		String actualData = driver.findElement(By.xpath("//h1[text()='Electronics']")).getText();
		if(actualData.equals(expectedData)) {
			Reporter.log("Successfully navigated to Electronics page in DWS", true);
		 }else {
			 Reporter.log("Failed to navigate to Electronics page in DWS", true);
		}
	}

}
