package Basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TC_FB_001 {

	public static void main(String[] args) {

		//Expected Data
		String expectedloginpageTitle = "Facebook – log in or sign up";
		String expectedUsername = "Karen123";
		String expectedPassword = "1234";
		
		//Step :- Open the Browswer
		WebDriver driver = new ChromeDriver();
		System.out.println("Browser got launched Successfully!");
		driver.manage().window().maximize();
		System.out.println("Browser got maximized Successfully");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		
		//Step 2:- enter the Valid URL
		driver.get("https://www.facebook.com/");
		String actualLoginPageTitle = driver.getTitle();
		if(actualLoginPageTitle.equals(expectedloginpageTitle)) {
			System.out.println("Successfully Navigate to Facebook Login Page!");
		}else {
			System.out.println("Failed Navigate to Facebook Login Page");
		}
		
		
		//Step 3:- Enter the valid UserName
		WebElement usernameTextfield = driver.findElement(By.id("email"));
		usernameTextfield.clear();
		usernameTextfield.sendKeys(expectedUsername);
		String actualUserName = usernameTextfield.getAttribute("value");
		if(actualUserName.equals(expectedUsername)) {
			System.out.println("UserNameTextfield successfully accept the data!");
		}
		else {
			System.out.println("UserNameTextfield failed to accept the data");
		}
		
		
		//Step 4:- Enter the valid password
		WebElement passwordTextfield = driver.findElement(By.id("pass"));
		passwordTextfield.clear();
		passwordTextfield.sendKeys(expectedPassword);
		String actualPassword = passwordTextfield.getAttribute("value");//This get attribute is used to get the data which is presenr in text field
		if(actualPassword.equals(expectedPassword)) {
		System.out.println("PasswordTextfield successfully accept the data!");	
		}else {
			System.out.println("Failed successfully accept the data");	

		}
		
		
		//Step 5:- click on Login Button
		WebElement LoginButton = driver.findElement(By.name("login"));
		LoginButton.click();
		
		
		//Step 7:- Home page should be displayed
		System.out.println("Home Page is displayed Succefully");
		
		//Step 6:- Close the browser
		driver.close();
		System.out.println("Browser got closed Successfully!");
		
		
		
		
		
		
		
		
		
		
		}

}
