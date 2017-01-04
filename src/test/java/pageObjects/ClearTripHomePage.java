package pageObjects;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import utils.CommonMethods;

public class ClearTripHomePage {
			
	private static final Logger logger = Logger.getLogger(ClearTripHomePage.class);
	
	public static void _SelectNumberOfAdults(WebDriver driver, String noOfAdults){
		
		
		WebElement objNumberOfAdults = CommonMethods.getElement(driver,"//select[@id='Adults']");
		CommonMethods.selectFromDropDown(objNumberOfAdults, noOfAdults);
}
	
	
	
	public static void _ValidateHomePage(WebDriver driver){
			
		
			WebElement objHomePageText = CommonMethods.getElement(driver,"//h2[contains(text(), 'Das Boot')]");
			logger.info("Validated home page");
			Assert.assertEquals(objHomePageText.isDisplayed(), true,"Validated Shipwrecks Home Page");
	}
	
	public static void _ValidateHomePage2(WebDriver driver){
		
		
		WebElement objHomePageText2 = CommonMethods.getElement(driver,"//h2[contains(text(), 'WWII Shipwreck Dive Locations')]");
		logger.info("Validated home page");
		Assert.assertEquals(objHomePageText2.isDisplayed(), true,"Validated Shipwrecks Home Page");
}
	
	
	public static void _NavigateShipwrecksPage(WebDriver driver){
		
		
		WebElement objShipWrecksNavigate = CommonMethods.getElement(driver,"//a[@href='#/shipwrecks']");
		objShipWrecksNavigate.click();
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			System.out.println("Encountered an exception");
		}
		catch (Exception e1) {
			System.out.println("Encountered an exception");
		}
		logger.info("Navigated to shipwrecks listing page");
		
	}
		
}
