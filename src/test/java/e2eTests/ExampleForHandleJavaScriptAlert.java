package e2eTests;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pageObjects.ClearTripHomePage;
import pageObjects.ToolsQADemoSites;
import pageObjects.iFrameHomePage;
import utils.Constants;

public class ExampleForHandleJavaScriptAlert {
	public static WebDriver driver;
	final static Logger logger = Logger.getLogger(ExampleForHandleJavaScriptAlert.class);
	
	@BeforeMethod
	public void beforeMethod() throws Exception { 
		
			File pathToBinary = new File("C:\\Program Files\\Mozilla Firefox\\firefox.exe");
			FirefoxBinary ffBinary = new FirefoxBinary(pathToBinary);
			FirefoxProfile firefoxProfile = new FirefoxProfile();       
			//WebDriver driver = new FirefoxDriver(ffBinary,firefoxProfile)

			driver = new FirefoxDriver(ffBinary,firefoxProfile);
			logger.info("New driver instantiated");
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			logger.info("Implicit wait applied on the driver for 10 seconds");	
			driver.get(Constants.ToolsQA_URL);
		    logger.info("Launched the app");
		}
	
	@Test
	public void iFrameExampleTest() throws Exception {
		//ToolsQADemoSites._NavigateToDemoSite(driver,"Automation Practice Switch Windows");
		ToolsQADemoSites._HandleJavaScriptAlert(driver);
		
	}

	@AfterMethod
	public void afterMethod() {
	driver.quit();
 
        }
	
}
