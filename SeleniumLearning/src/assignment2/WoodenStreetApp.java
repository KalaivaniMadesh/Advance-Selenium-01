package assignment2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WoodenStreetApp {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		FirefoxDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.woodenstreet.com/");
		Thread.sleep(3000);
		//for(;;) {
		//try {
			//driver.findElement(By.id("loginclose1")).click();
		//}
		//catch(Exception e) {
			//Thread.sleep(2000);
		
		List<WebElement> Menus = driver.findElements(By.xpath("//li[@class='menu-show']"));
		
		for(WebElement element: Menus) {
		System.out.println(element.getText());
		}
		driver.quit();
		
		

	}}
