package advanceSeleniumTesting;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC_DWS_004 extends BaseClass{
	String expectedData = "Apparel & Shoes";

	@Test
	public void toCheckApparelandShoesPage() {
		driver.findElement(By.partialLinkText("Apparel & Shoes")).click();
		String actualData = driver.findElement(By.xpath("//h1[text()='Apparel & Shoes']")).getText();
		if(actualData.equals(expectedData)) {
			Reporter.log("Successfully navigated to Apparel & Shoes page in DWS", true);
		 }else {
			 Reporter.log("Failed to navigate to Apparel & Shoes page in DWS", true);
		}
	}

}
