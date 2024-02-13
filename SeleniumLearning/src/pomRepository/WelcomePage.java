package pomRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WelcomePage {
	
	//First, we have to create the constructor
	
	public WelcomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(linkText = "Register")
	private WebElement RegisterLink;
	
	@FindBy(linkText = "Log in")
	private WebElement loginLink;
	
	@FindBy(xpath = "//span[text()='Wishlist']")
	private WebElement WishlistLink;
	
	//To create getters:- Right click-Source-Generate getters and setters-select getters-generate

	public WebElement getRegisterLink() { 
		return RegisterLink;
	}

	public WebElement getLoginLink() {
		return loginLink;
	}
	public WebElement getWishListLink() {
		return WishlistLink;
		
	}
	

}
