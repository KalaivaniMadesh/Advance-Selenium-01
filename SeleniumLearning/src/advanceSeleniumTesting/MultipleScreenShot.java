package advanceSeleniumTesting;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

public class MultipleScreenShot {
	static WebDriver driver;
	@Test
	public void DemoWebShop()  {
        driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://demowebshop.tricentis.com/cart");
		driver.findElement(By.linkText("Register")).click();
		takeScreenShot();
		takeScreenshot("Rgister");
		driver.findElement(By.xpath("//span[text()='Shopping cart']")).click();
		takeScreenShot();
		takeScreenshot("Shopping Cart");
		driver.findElement(By.xpath("//span[text()='Wishlist']")).click();
		takeScreenShot();
		takeScreenshot("WishList");
		driver.quit();
	}
	
	public static void takeScreenShot() {
	
		LocalDateTime l = LocalDateTime.now();
		String Date = l.toString().replaceAll(":", "-");
		TakesScreenshot ts = (TakesScreenshot)driver;
		File temp = ts.getScreenshotAs(OutputType.FILE);
		File src = new File("./errorShots//"+Date+"Page.png");
		try {
			FileHandler.copy(temp, src);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	  public static void takeScreenshot(String s) {
		TakesScreenshot ts1 = (TakesScreenshot)driver;
		File temp1 = ts1.getScreenshotAs(OutputType.FILE);
		File src1 = new File("./errorShots//"+s+"Page.png");
		try {
			FileHandler.copy(temp1, src1);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
		
	}


