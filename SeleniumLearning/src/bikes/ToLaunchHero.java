package bikes;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.internal.GroupsHelper;

public class ToLaunchHero {

	@Test(groups = "Integration")
	public void hero(){
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.heromotocorp.com/");
		Reporter.log("Hero got launched Successfully", true);
		driver.quit();
	}
}
