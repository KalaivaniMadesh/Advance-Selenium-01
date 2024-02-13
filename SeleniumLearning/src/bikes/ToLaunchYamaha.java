package bikes;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ToLaunchYamaha {

	@Test(groups = "Integration")
	public void yamaha(){
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.yamaha-motor-india.com/");
		Reporter.log("Yamaha got launched Successfully", true);
		driver.quit();
	}
}
