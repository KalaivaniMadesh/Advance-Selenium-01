package advanceSeleniumTesting;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

    //How to test the TC with multiple datas? with the help of dataProvider or we can fetch the data from Excel

public class ToLearnDataProvider {
	@DataProvider(name = "Credentials")
	public String[][] toSendData() {
		String[][] cred = {{"Smith@gmail.com","Smith@123"},
				           {"Karan12@gmail.com","Karan@45"},
				           {"Karen67@gmail.com","Karen@123"}
		};
		return cred;
	}
	
	@Test(dataProvider = "Credentials")//Dependancy injection :- we are injecting data from data provider to testScripts
	public void toLogin(String email, String password) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys(email);
		driver.findElement(By.id("pass")).sendKeys(password);
		driver.quit();
	}

}
