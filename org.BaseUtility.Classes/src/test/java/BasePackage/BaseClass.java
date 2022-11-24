package BasePackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseClass {

	public static WebDriver driver;
	
	public static void launchBrowser(String browser) throws InterruptedException {
		
		if(browser.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Chrome Driver\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		
		else if(browser.equalsIgnoreCase("Firefox")){
			System.setProperty("webdriver.gecko.driver", "C:\\Selenium\\Gecko Drivers\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		
		else if(browser.equalsIgnoreCase("Edge")) {
			System.setProperty("webdriver.edge.driver", "C:\\Selenium\\Edge Drivers\\msedgedriver.exe");
			driver = new EdgeDriver();
		}
		
		Options option = driver.manage();
		Window window = option.window();
		window.maximize();
		Thread.sleep(2000);
		
		driver.get("https://www.youtube.com/");
		Thread.sleep(2000);
		
	}
	
}
