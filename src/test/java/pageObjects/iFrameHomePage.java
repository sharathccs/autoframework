package pageObjects;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utils.CommonMethods;

public class iFrameHomePage {
			
	private static final Logger logger = Logger.getLogger(iFrameHomePage.class);
	
	public static void _SwitchToiFrame(WebDriver driver, String text){
				
		//String id = "	//div[@class='mce-tinymce mce-container mce-panel']/descendant::iFrame[@id='mce_0_ifr']";
		String id = "mce_0_ifr";
		CommonMethods.switchToFrame(driver, id);
		
		WebElement objParagraph = driver.findElement(By.id("tinymce"));
		System.out.println(objParagraph.isDisplayed());
		objParagraph.clear();
		objParagraph.sendKeys(text);
		logger.info("Cleared the existing message and added a new one");
		CommonMethods.switchToDefaultFrame(driver);
		}
		
}
