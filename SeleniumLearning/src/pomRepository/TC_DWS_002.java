package pomRepository;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_DWS_002 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String expectedPageTitle = "Wishlist";
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://demowebshop.tricentis.com/");
		
		//String actualPageTitle = driver.findElement(By.xpath("//div[@class='page-title']")).getText();
		WelcomePage Wel = new WelcomePage(driver);
		Wel.getWishListLink().click();
		
//		if(actualPageTitle.equals(expectedPageTitle)) {
//			System.out.println("Successfully Navigated to WishList Page");
//		}
//		else {
//			System.out.println("Failed To navigate to WishListPage");
//		}
//				
		driver.quit();	}


}
