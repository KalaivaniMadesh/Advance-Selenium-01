package webelements_methods;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ToHandleAutoSuggestion {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/");
		Thread.sleep(5000);
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone");
		Thread.sleep(5000);
		
		List<WebElement> autoSuggestion = driver.findElements(By.xpath("//div[@class='two-pane-results-container']/div[1]/div"));
		for(WebElement sugg: autoSuggestion) {
			System.out.println(sugg.getText());
		}
	}
		
		

}
