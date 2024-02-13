package webDriver_methods;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ToExploreManageMethod {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://skillrary.com/");
		
		//To Maximize
		//driver.manage().window().maximize();
		Thread.sleep(3000);
		//To Minimize
		//driver.manage().window().minimize();
		
		//To Fullscreen
		//driver.manage().window().fullscreen();
		
		//To getsize
	    //Dimension sizeofBrowser = driver.manage().window().getSize();
		//System.out.println(sizeofBrowser);
		//System.out.println(sizeofBrowser.getHeight());
		//System.out.println(sizeofBrowser.getWidth());
		
		//To setsize
		//driver.manage().window().setSize(new Dimension(500, 700));
		
		//To getposition
		//Point position = driver.manage().window().getPosition();
		//System.out.println(position);
		//System.out.println(position.getX());
		//System.out.println(position.getY());
		
		//To setposition
		driver.manage().window().setPosition(new Point(300, 400));
		
		
		
		
		
		
		
		
		
	}

	
}
