package assignmentSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ElementUtil {
	
	private WebDriver driver;

	public ElementUtil(WebDriver driver) {
		super();
		this.driver = driver;
	}
	
	
	public By getBy(String locatorType,String selector) {
		By locator = null;
		switch (locatorType.toLowerCase()) {
		case "id":
			locator = By.id(selector);			
			break;
			
		case "xpath":
			locator = By.xpath(selector);			
			break;
			
		case "linktext":
			locator = By.linkText(selector);			
			break;

		default:
			break;
		}
		return locator;
	}
	
	public void doClick(String locatorType,String selector) {
		getElement(getBy(locatorType, selector)).click();
	}
	
	public void doSendKeys(String locatorType,String selector,String value) {
		By locator = getBy(locatorType, selector);
		getElement(locator).sendKeys(value);
	}

	public void doSendKeys(By locator, String value) {
		getElement(locator).sendKeys(value);
	}
	public String doElementGetText(String locatorType,String selector) {
		return getElement(getBy(locatorType, selector)).getText();
	}
	public String doElementGetText(By locator) {
		return getElement(locator).getText();
	}
	public String doElementGetAttribute(String locatorType,String selector,String value) {
		return getElement(getBy(locatorType, selector)).getAttribute(value);
	}

	public String doElementGetAttribute(By locator,String value) {
		return getElement(locator).getAttribute(value);
	}
	
	

	public WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

}
