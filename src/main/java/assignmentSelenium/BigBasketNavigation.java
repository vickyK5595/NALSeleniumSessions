package assignmentSelenium;


import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BigBasketNavigation {

	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.bigbasket.com/");
		Thread.sleep(5000);
		
		WebElement mainCat = driver.findElement(By.cssSelector("a.meganav-shop"));
		
		WebElement s1 = driver.findElement(By.xpath("//li[@ng-repeat='item in vm.leftmenu']/a[contains(@class,'ng-binding active')]"));
		
		System.out.println(s1.getText());
		Actions act = new Actions(driver);
		act.moveToElement(mainCat).perform();
		Thread.sleep(6000);
		
		
		
//		List<WebElement> firstColoumn = driver.findElements(By.xpath("//li[@ng-repeat='item in vm.leftmenu']/a[contains(@class,'ng-binding')]"));
//		
//		for (WebElement e : firstColoumn) {
//			
//			System.out.println(e.getText());
//		}
		
	}
}
