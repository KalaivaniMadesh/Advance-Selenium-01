package dataDrivenTesting;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToFetchDataFromPropFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//Step - 1: Create object of an FileInputStream
		
		FileInputStream jis = new FileInputStream("./testData/testData.properties");
		
		//Step - 2: Create File type object
		Properties prop = new Properties();
		
		//Step - 3: call the read method
		prop.load(jis);
		String url = prop.getProperty("url");
		String username = prop.getProperty("username");
		String password = prop.getProperty("password");
		
		//Automation Scripts starts
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get(url);
		driver.findElement(By.id("email")).sendKeys(username);
		driver.findElement(By.id("pass")).sendKeys(password);		
	}

}
