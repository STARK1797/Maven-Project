package Flipkart;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class homePage {

	@FindBy(xpath= "//input [@title='Search for products, brands and more']")
	private WebElement searchProduct;
	
	@FindBy(xpath= "//button [@type='submit']")
	private WebElement submit;
	
	public homePage (WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	
	public void productSearch() {
		searchProduct.sendKeys("Iphone12 128GB Mini White");
	}
	
	public void clickOnSubmit() {
		submit.click();
	}
}
