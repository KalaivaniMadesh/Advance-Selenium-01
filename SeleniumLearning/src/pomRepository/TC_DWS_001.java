package pomRepository;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_DWS_001 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://demowebshop.tricentis.com/");
		
		//To click on login link create object for welcome page
		WelcomePage wp = new WelcomePage(driver);
		wp.getLoginLink().click();
		
		//Login to DWS
		//To perform login we have to create a object for Welcome page ..Becoz login is there in login page
		LoginPage Lp = new LoginPage(driver);
		Lp.getEmailTextField().sendKeys("Selenium10to12@gmail.com");
		Lp.getPasswordTextField().sendKeys("Selenium@123");
		Lp.getLoginButton().click();
		

	}

}
