package Flipkart;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class productOpenPage {

	@FindBy(xpath= "//button [text()='ADD TO CART']")
	private WebElement addToCart;
	
	productOpenPage(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnAddToCart() {
		addToCart.click();
	}
}
