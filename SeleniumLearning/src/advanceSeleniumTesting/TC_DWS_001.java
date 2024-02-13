package advanceSeleniumTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC_DWS_001 extends BaseClass{
	
	String expectedPageTitle = "Books";
	
	@Test
	public void toCheckBooksPage() {
		driver.findElement(By.partialLinkText("Books")).click();
		 String actualPageTitle = driver.findElement(By.xpath("//h1[text()='Books']")).getText();
		 if(actualPageTitle.equals(expectedPageTitle)) {
			 Reporter.log("Successfully navigated to Books page in DWS", true);
		 }else {
			 Reporter.log("Failed to navigate to Books page in DWS", true);
		 }
	}

}
