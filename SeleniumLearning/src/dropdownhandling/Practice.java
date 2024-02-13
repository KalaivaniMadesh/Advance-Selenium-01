package dropdownhandling;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.amazon.in/");
		
		//Identify DropDown
		WebElement dropDown = driver.findElement(By.id("searchDropdownBox"));
		
		//use Select Class
		Select AllCategory = new Select(dropDown);
		
		//To perform actions on WebElement
		AllCategory.selectByVisibleText("Baby");
		List<WebElement> DD = AllCategory.getOptions();
		for (WebElement option : DD) {
			System.out.println(option.getText());
		}

	}

}
