package webelements_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ToUseGetSize {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		FirefoxDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.instagram.com/");
		Thread.sleep(6000);
		
		Dimension SizeOfLoginButton = driver.findElement(By.xpath("//button[@type='submit']")).getSize();
	    System.out.println(SizeOfLoginButton);
	    System.out.println(SizeOfLoginButton.getHeight());
	    System.out.println(SizeOfLoginButton.getWidth());
	    
	    driver.quit();

	}

}
