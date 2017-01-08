package pageObjects;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import utils.CommonMethods;

public class ToolsQADemoSites {
			
	private static final Logger logger = Logger.getLogger(ToolsQADemoSites.class);
	
	public static void _NavigateToDemoSite(WebDriver driver, String siteToBeNavigated){
		
		WebElement objDemoSiteLink = CommonMethods.getElement(driver,"//a[@class='ripple']/descendant::span[contains(text(), 'DEMO SITES')]");
		WebElement objDemoSiteLink2Level = CommonMethods.getElement(driver,"//ul[@class='sub-nav hover-style-click-bg level-arrows-on']/descendant::span[contains(text(), 'Automation Practice Switch Windows')]");
		try {
			Actions action = new Actions(driver);
			action.moveToElement(objDemoSiteLink).click().build().perform();
			driver.wait();
			objDemoSiteLink2Level.click();
			logger.info("Navigated to the site");
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
	}
	
	public static void _HandleJavaScriptAlert(WebDriver driver){
			WebElement objJavaScriptAlertTrigger = CommonMethods.getElement(driver,"//button[@id='alert']");
			objJavaScriptAlertTrigger.click();
			System.out.println("clicked on the button");
			try {
				
				String s1 = driver.switchTo().alert().getText();
				Thread.sleep(2000);
				System.out.println(s1);
				driver.switchTo().alert().accept();
				System.out.println("Alert handled");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}catch (IllegalMonitorStateException e1) {
				System.out.println("Got a illegal monitor state exception");
				
			}
		}
	
	
		
}
