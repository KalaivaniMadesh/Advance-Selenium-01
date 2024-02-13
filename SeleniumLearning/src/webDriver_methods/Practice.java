package webDriver_methods;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		Thread.sleep(2000);
		driver.manage().window().fullscreen();
		Dimension SizeOfBrowser = driver.manage().window().getSize();
		System.out.println(SizeOfBrowser.getHeight());
		System.out.println(SizeOfBrowser.getWidth());
	    
	    //set size
	    driver.manage().window().setSize(new Dimension(600,700));
	    
	    Point positionOfBrowser = driver.manage().window().getPosition();
	    System.out.println(positionOfBrowser);
	    //set pos
	    
	    driver.manage().window().setPosition(new Point(50, 90));
	    System.out.println(positionOfBrowser);
	    Thread.sleep(4000);
	    driver.quit();
	}

}
