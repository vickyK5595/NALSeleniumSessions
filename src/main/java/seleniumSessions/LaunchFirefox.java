package seleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchFirefox {

	public static void main(String[] args) {

		//geckodriver.exe --> Mozilla
		//System.setProperty("webdriver.gecko.driver", "c:\\Users\\naveenautomationlabs\\Downloads\\geckodriver.exe");

		System.setProperty("webdriver.gecko.driver", "/Users/naveenautomationlabs/Downloads/geckodriver");
		//WebDriverManager.firefoxdriver().setup();
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new FirefoxDriver();

		driver.get("https://www.google.com");
		System.out.println(driver.getTitle());
		driver.close();		
		
	}

}