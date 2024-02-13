package dropdownhandling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class ToHandleMultiSelectListBox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://demoapp.skillrary.com/");
		//listbox
		WebElement multiListBox = driver.findElement(By.id("cars"));
		
		//handle it by using select
		Select multiSelect = new Select(multiListBox);
		
		//call the select class methods
		System.out.println(multiSelect.isMultiple());
		multiSelect.selectByValue("199");
		multiSelect.selectByVisibleText("INR 200 - INR 299 ( 3 ) ");
		multiSelect.selectByIndex(1);
		Thread.sleep(2000);
		
		//deselecting
		//multiSelect.deselectByIndex(1);
		//multiSelect.deselectByValue("199");
		multiSelect.deselectAll();
		Thread.sleep(3000);		
		driver.quit();
	}
	

}
