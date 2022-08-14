package assignmentSelenium;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NaveenSiteElements {
		
	static WebDriver driver;
	public static void main(String[] args) {

		BrowserUtil brwUtil = new BrowserUtil();
		driver = brwUtil.initDriver("Chrome");
		brwUtil.launchUrl("https://www.amazon.com");
		
		
		
//		 driver.findElement(By.id("input-firstname")).sendKeys("Vignesh");
//		 driver.findElement(By.id("input-lastname")).sendKeys("Subramani");
//		 driver.findElement(By.id("input-email")).sendKeys("svignesh7562@gmail.com");
//		 driver.findElement(By.id("input-telephone")).sendKeys("9876543210");
//		 driver.findElement(By.id("input-password")).sendKeys("Test@1234");
//		 driver.findElement(By.id("input-confirm")).sendKeys("Test@1234");
//		 
//		
//		By first_Name = By.id("input-firstname");
//		By last_Name = By.id("input-lastname");
//		By email = By.id("input-email");
//		By telephone = By.id("input-telephone");
//		By password = By.id("input-password");
//		By confirm_password = By.id("input-confirm");
//		
//		ElementUtil eleUtil = new ElementUtil(driver);
//		eleUtil.doSendKeys(first_Name, "Vignesh");
//		eleUtil.doSendKeys(last_Name, "Subramani");
//		eleUtil.doSendKeys(email, "svignesh7562@gmail.com");
//		eleUtil.doSendKeys(telephone, "9876543210");
//		eleUtil.doSendKeys(password, "Test@1234");
//		eleUtil.doSendKeys(confirm_password, "Test@1234");
//		
//		
//		driver.findElement(By.xpath("//*[@id=\"content\"]/form/fieldset[3]/div/div/label[2]/input")).click();
//		eleUtil.doClick("//*[@id=\"content\"]/form/div/div/input[2]", "xPAth");
//		
//		
//		System.out.println("Test is Pass/............");
//		
//		
//		brwUtil.closeBrowser();
		
		By imageLinks = By.tagName("img");
		
		List<String> output = getAttributesList(imageLinks, "src");
		for (String s : output) {
			
			System.out.println(s);
			
		}
		
	}
	
	public static List<String> getAttributesList(By locator, String tagName) {
		List<WebElement> eleList = getElements(locator);
		List<String> eleAttributeList = new ArrayList<String>();
		for (WebElement s : eleList) {
			String attribute = s.getAttribute(tagName);
			eleAttributeList.add(attribute);
		}
		return eleAttributeList;
	}
	
	public static List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
	}

}
