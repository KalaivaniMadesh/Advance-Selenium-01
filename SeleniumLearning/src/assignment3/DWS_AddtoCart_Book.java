package assignment3;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class DWS_AddtoCart_Book extends BaseClass1_DWS {
	Boolean expectedBook = true;
	@Test
	public void toAddComputingBookToCart() {
		driver.findElement(By.partialLinkText("Books")).click();
		Reporter.log("Successfully navigated to Books page in DWS", true);
		driver.findElement(By.xpath("(//a[text()='Computing and Internet'])[2]/../../..//input[@value='Add to cart']")).click();
		Reporter.log("Book got added Successfully", true);
		driver.findElement(By.xpath("//span[text()='Shopping cart']")).click();
		boolean acuatalBook = driver.findElement(By.linkText("Computing and Internet")).isDisplayed();
		
//		if(acuatalBook==expectedBook) {
//			Reporter.log("Computing and Internet book is successfully added in the Shopping Cart", true);
//		}else {
//			Reporter.log("Computing and Internet book is not successfully added in the Shopping Cart", true);
//
//		}
		//Using Assertion for reducing 6 lines into 2
		Assert.assertEquals(acuatalBook, expectedBook, "Computing and Internet book is not successfully added in the Shopping Cart");
		Reporter.log("Computing and Internet book is successfully added in the Shopping Cart", true);
	}

}

