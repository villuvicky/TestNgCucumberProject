package pages;

import java.util.List;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class LoginPage{
	
	private ChromeDriver driver;
	private Properties prop;

	public LoginPage(ChromeDriver driver, Properties prop){

		this.driver=driver;
		this.prop=prop;
	}

	public LoginPage enterUserName() {

		WebElement userName=driver.findElement(By.id(prop.getProperty("LoginPage.userNameLocator")));
		userName.sendKeys(prop.getProperty("admin"));
		return this;
	}

	public LoginPage enterPassword() {

		WebElement password=driver.findElement(By.id(prop.getProperty("LoginPage.passwordLocator")));
		password.sendKeys(prop.getProperty("password"));
		return this;
	}

	public SalesForceHomePage clickLogin() {

		driver.findElement(By.id(prop.getProperty("LoginPage.loginLocator"))).submit();
		
		By lightningElement= By.xpath("//a[@class='switch-to-lightning']");

		List<WebElement> elements=driver.findElements(lightningElement);

		if(elements.size()>=1) {

			elements.get(0).click();
		}
		
		return new SalesForceHomePage(driver,prop);
	}
}
