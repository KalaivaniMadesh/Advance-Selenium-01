package dropdownhandling;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class ToHandleSingleSelectDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
	
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://www.facebook.com/signup");
		//dropdowns
		WebElement dayDropdown = driver.findElement(By.id("day"));
		WebElement monthDropdown = driver.findElement(By.id("month"));
		WebElement yearDropdown = driver.findElement(By.id("year"));
		
		//handling by select class
		Select daySelect = new Select(dayDropdown);
		Select monthSelect = new Select(monthDropdown);
		Select yearSelect = new Select(yearDropdown);
		
		//Select the date with the help of reference variable(Call the select class methods)
		
		daySelect.selectByIndex(5); //We should pass the index like 5 because it's starts from 0.
		monthSelect.selectByValue("2");
		yearSelect.selectByVisibleText("2000");
		
		//Every months present in the monthdropdown
		
		List<WebElement> allMonths = monthSelect.getOptions();
		for(WebElement month: allMonths) {
			System.out.println(month.getText());
			monthSelect.selectByVisibleText(month.getText());
			Thread.sleep(1000);
		}
		
		//To check whether dropdown is single select or multiselect
		System.out.println("*****");
		System.out.println(monthSelect.isMultiple());
		
		
		driver.quit();
		
	}

}
