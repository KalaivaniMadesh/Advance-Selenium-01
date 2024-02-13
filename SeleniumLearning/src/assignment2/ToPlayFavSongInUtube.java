package assignment2;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ToPlayFavSongInUtube {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		FirefoxDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.youtube.com/");
		Thread.sleep(5000);
		
		driver.findElement(By.name("search_query")).sendKeys("Vizhiyil Un Vizhiyil");
		Thread.sleep(2000);
		
		driver.findElement(By.id("search-icon-legacy")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector("a[title='Vizhiyil Un Vizhiyil Kireedam Video Song 1080P Ultra HD 5 1 Dolby Atmos Dts Audio']")).click();
		Thread.sleep(30000);
		
		driver.quit();
		
	}

}
