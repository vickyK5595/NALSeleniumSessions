package assignmentSelenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CricBuzz {
	
	static WebDriver driver;
	

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.espncricinfo.com/series/india-women-in-sri-lanka-2022-1319706/sri-lanka-women-vs-india-women-2nd-odi-1319713/full-scorecard");
		
		By element = By.xpath("//span[text()='Vishmi Gunaratne']/ancestor::td/following-sibling::td");
		List<WebElement> scorecard = driver.findElements(element);
		
		for (WebElement e : scorecard) {
			System.out.println(e.getText());
		}	

	}

}
