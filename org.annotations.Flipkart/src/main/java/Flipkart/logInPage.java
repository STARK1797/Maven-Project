package Flipkart;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class logInPage {

	@FindBy(xpath= "//input[@class='_2IX_2- VJZDxU']")
	private WebElement mobileNumber;
	
	@FindBy(xpath= "//input[@type='password']")
	private WebElement password;
	
	@FindBy(xpath= "//button [@class='_2KpZ6l _2HKlqd _3AWRsL']")
	private WebElement logIn;
	
	public logInPage (WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	
	public void enterMobileNumber() {
		mobileNumber.sendKeys("7385731797");
	}
	
	public void enterPassword() {
		password.sendKeys("Abhijit#1797");
	}
	
	public void clickOnLogIn() {
		logIn.click();
	}
	
}
