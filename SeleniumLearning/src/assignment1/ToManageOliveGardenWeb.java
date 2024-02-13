package assignment1;

import org.openqa.selenium.Point;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ToManageOliveGardenWeb {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
	
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.olivegarden.com/home");
		
		driver.manage().window().maximize();
		//Thread.sleep(3000);
		driver.manage().window().minimize();
		//Thread.sleep(2000);
		driver.manage().window().fullscreen();
		//Thread.sleep(4000);
		
		Point Pos = driver.manage().window().getPosition();
		System.out.println(Pos);
		
		driver.manage().window().setPosition(new Point(50, 50));
		Point SecondPos = driver.manage().window().getPosition();
		System.out.println(SecondPos);
		driver.quit();

	}
}
