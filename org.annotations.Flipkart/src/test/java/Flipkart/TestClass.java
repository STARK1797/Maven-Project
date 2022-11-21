package Flipkart;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class TestClass {

	WebDriver driver;
	logInPage LogIn;
	homePage home;
	searchedProductPage search;
	productOpenPage product;
	placeOrderPage Order;
	
	@BeforeClass
	public void beforeClass() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Chrome Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Thread.sleep(2000);
	}
	
	@BeforeMethod
	public void beforeMethod() throws InterruptedException {
		LogIn = new logInPage(driver);
		LogIn.enterMobileNumber();
		Thread.sleep(2000);
		LogIn.enterPassword();
		Thread.sleep(2000);
		LogIn.clickOnLogIn();
		Thread.sleep(2000);
		
	}
	
	@Test
	public void test() throws InterruptedException {
		home = new homePage(driver);
		search = new searchedProductPage(driver);
		product = new productOpenPage(driver);
		Thread.sleep(2000);
		Order = new placeOrderPage(driver);
		Thread.sleep(2000);
		
		home.productSearch();
		Thread.sleep(2000);
		home.clickOnSubmit();
		Thread.sleep(2000);
		
		search.clickOnProduct();
		Thread.sleep(2000);
		
		ArrayList <String> id = new ArrayList <String> (driver.getWindowHandles());
		String childID=id.get(1);
		driver.switchTo().window(childID);
		
		product.clickOnAddToCart();
		Thread.sleep(2000);
		
		Order.clickOnPlaceOrder();
		Thread.sleep(2000);
		
	}
	
	@AfterMethod
	public void afterMethod() throws IOException, InterruptedException {
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\Users\\ABHIJIT\\Desktop\\Screenshot\\Selenium Screenshot\\Flipkart_.jpg");
		FileHandler.copy(source, dest);
		Thread.sleep(2000);
		
	}
	
	@AfterClass
	public void afterClass() {
		driver.quit();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
