package utils;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class CommonMethods {
	
	
	private static final Logger logger = Logger.getLogger(CommonMethods.class);
	
	public static WebElement getElement(WebDriver driver, String xpath)
	{
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
		WebElement element = driver.findElement(By.xpath(xpath));
		Assert.assertNotNull(element);
		return element;
	}
	
	public static void testElementAssert(WebDriver driver, String xpath, String expectedText)
	{
		WebElement element = driver.findElement(By.xpath(xpath));
		String elementText = element.getAttribute(expectedText);
		Assert.assertNotNull(element);
		Assert.assertEquals(expectedText, elementText);
	}
	
	public static void selectFromDropDown(WebElement e1, String valueToBeSelected){
		
		Select dropdown = new Select(e1);
		dropdown.selectByValue(valueToBeSelected);
		logger.info("The value:" + valueToBeSelected + "is selected from the dropdown");
		
	}
	
	

}
