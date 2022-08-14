package assignmentSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginURL {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		String url = driver.getCurrentUrl();
		if(url.contains("account/login")) {
			System.out.println(url);
			System.out.println("account/login is present inside URL");
		}
		else {
			System.out.println("URL fetched is not matching with given URL");
		}
		
		String title = driver.getTitle();
		if(title.equals("Account Login")) {
			System.out.println(title);
			System.out.println("Account Login is present inside Title");
		}
		else {
			System.out.println("Account Login title is not matching with given URL");
		}
		
		driver.close();
		
	}

}
