package Flipkart;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class searchedProductPage {

	@FindBy(xpath= "//div [text()='APPLE iPhone 12 Mini (White, 128 GB)']")
	private WebElement searchedProduct;
	
	public searchedProductPage(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnProduct() {
		searchedProduct.click();
	}
}
