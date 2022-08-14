package assignmentSelenium;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LableAttribute {

	public static void main(String[] args) {
		
		BrowserUtil brwUtil = new BrowserUtil();
		WebDriver driver = brwUtil.initDriver("chrome");
		
		brwUtil.launchUrl("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		ElementUtil eleUtil = new ElementUtil(driver);
		
//		By fN_lable = By.xpath("//*[@id=\"account\"]/div[2]/label");
//		System.out.println(eleUtil.doElementGetText(fN_lable));
//		By fN_field = By.id("input-firstname");
//		System.out.println(eleUtil.doElementGetAttribute(fN_field, "placeholder"));
//		eleUtil.doSendKeys(fN_field, "Vignesh");
//		
//		By lN_lable = By.xpath("//*[@id=\"account\"]/div[3]/label");
//		System.out.println(eleUtil.doElementGetText(lN_lable));
//		By lN_field = By.id("input-lastname");
//		System.out.println(eleUtil.doElementGetAttribute(lN_field, "placeholder"));
//		eleUtil.doSendKeys(lN_field, "Subramani");
//		
//		By eMail_lable = By.xpath("//*[@id=\"account\"]/div[4]/label");
//		System.out.println(eleUtil.doElementGetText(eMail_lable));
//		By eMail_field = By.id("input-email");
//		System.out.println(eleUtil.doElementGetAttribute(eMail_field, "placeholder"));
//		eleUtil.doSendKeys(eMail_field, "svignesh7562@gmail");
//		
//		By tele_lable = By.xpath("//*[@id=\"account\"]/div[5]/label");
//		System.out.println(eleUtil.doElementGetText(tele_lable));
//		By tele_field = By.id("input-telephone");
//		System.out.println(eleUtil.doElementGetAttribute(tele_field, "placeholder"));
//		eleUtil.doSendKeys(tele_field, "9876543210");
//		
//		By password_lable = By.xpath("//*[@id=\"account\"]/div[5]/label");
//		System.out.println(eleUtil.doElementGetText(password_lable));
//		By Password_field = By.id("input-password");
//		System.out.println(eleUtil.doElementGetAttribute(Password_field, "placeholder"));
//		eleUtil.doSendKeys(Password_field, "Test@1123");
//		
//		By confirm_lable = By.xpath("//*[@id=\"content\"]/form/fieldset[2]/div[2]/label");
//		System.out.println(eleUtil.doElementGetText(confirm_lable));
//		By confirm_field = By.id("input-confirm");
//		System.out.println(eleUtil.doElementGetAttribute(confirm_field, "placeholder"));
//		eleUtil.doSendKeys(confirm_field, "Test@1123");
		
		
//		ArrayList<String> href = new ArrayList<String>();
//		href.add(eleUtil.doElementGetAttribute("linktext", "Login", "href"));
//		href.add(eleUtil.doElementGetAttribute("linktext", "Register", "href"));
//		href.add(eleUtil.doElementGetAttribute("linktext", "Forgotten Password", "href"));
//		href.add(eleUtil.doElementGetAttribute("linktext", "My Account", "href"));
//		href.add(eleUtil.doElementGetAttribute("linktext", "Address Book", "href"));
//		href.add(eleUtil.doElementGetAttribute("linktext", "Wish List", "href"));
//		href.add(eleUtil.doElementGetAttribute("linktext", "Order History", "href"));
//		href.add(eleUtil.doElementGetAttribute("linktext", "Downloads", "href"));
//		href.add(eleUtil.doElementGetAttribute("linktext", "Recurring payments", "href"));
//		href.add(eleUtil.doElementGetAttribute("linktext", "Reward Points", "href"));
//		href.add(eleUtil.doElementGetAttribute("linktext", "Returns", "href"));
//		href.add(eleUtil.doElementGetAttribute("linktext", "Transactions", "href"));
		
//		for (String i : href) {
//			
//			System.out.println(i);
//			
//		}
		
//		System.out.println(href);
		
		
		List<WebElement> langLinks = driver.findElements(By.xpath("//aside[@id='column-right']//a"));
		System.out.println(langLinks.size());
		
		for(WebElement e : langLinks) {
			String text = e.getText();
			System.out.println(text);
				
		}
		
		brwUtil.closeBrowser();
	}

}