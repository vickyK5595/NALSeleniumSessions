package testngsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Registernewuser {

	WebDriver driver;

	@BeforeTest
	public void setup() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
	}
	
	@Test
	public void registration() throws InterruptedException {
		driver.findElement(By.id("input-firstname")).sendKeys("vignesh1");
		driver.findElement(By.id("input-lastname")).sendKeys("Subramani");
		driver.findElement(By.id("input-email")).sendKeys("svignesh75621@gmail.com");
		driver.findElement(By.id("input-telephone")).sendKeys("9876583210"); 
		driver.findElement(By.id("input-password")).sendKeys("Test@1234");
		driver.findElement(By.id("input-confirm")).sendKeys("Test@1234");
		driver.findElement(By.name("agree")).click();
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(100000);
		System.out.println(driver.findElement(By.id("content")).getText());
		
		 	
	}
		
}