package webelements_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ToUseIsSelectedMethod {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		FirefoxDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demoapp.skillrary.com/");
		Thread.sleep(5000);
		
		WebElement select = driver.findElement(By.xpath("//option[text()='INR 200 - INR 299 ( 3 ) ']"));
		System.out.println("Before Selecting");
		System.out.println(select.isSelected());
		select.click();
		
		System.out.println("<<<<<<<<>>>>>>>>");
		System.out.println("After Selecting");
		System.out.println(select.isSelected());
		
		Thread.sleep(4000);
		driver.quit();

		
	}

}
