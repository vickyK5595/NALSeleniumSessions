package assignmentSelenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleFootnotes {

		static WebDriver driver;

		public static void main(String[] args) throws InterruptedException {

			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.get("https://www.google.com/");
			
//			String text = driver.findElement(By.id("SIvCob")).getText();
//			System.out.println(text);
			
			List<WebElement> langLinks = driver.findElements(By.xpath("//div[@class='KxwPGc AghGtd']/a"));
			System.out.println(langLinks.size());
			
			for(WebElement e : langLinks) {
				String text = e.getText();
				System.out.println(text);
					
			}
			
		}

}
