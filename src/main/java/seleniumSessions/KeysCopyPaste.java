package seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class KeysCopyPaste {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/account/about/");
		
		WebElement element = driver.findElement(By.xpath("//*[text() = 'Create an account']"));

		element.click();
		
		WebElement firstName = driver.findElement(By.id("firstName"));
		WebElement userName = driver.findElement(By.id("username"));
		
		firstName.sendKeys("naveen");
		
		Actions act = new Actions(driver);
		//windows -- Keys.CONTROL
		act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
		act.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).build().perform();

		userName.click();
		act.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();

		
	}

}