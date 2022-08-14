package assignmentSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class XpathPractice {
	
	static WebDriver driver;

	public static void main(String[] args) {
		
		BrowserUtil brUtil = new BrowserUtil();
		driver = brUtil.initDriver("Chrome");
		
		driver.get("https://www.amazon.com/");
		
		By element = By.xpath("(//a[@class='nav-a  '])");
		
		System.out.println(driver.findElements(element));
		

	}

}
