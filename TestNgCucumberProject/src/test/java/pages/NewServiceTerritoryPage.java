package pages;

import java.util.List;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewServiceTerritoryPage{

	private ChromeDriver driver;
	private Properties prop;
	private String serviceTerritoryName;

	public NewServiceTerritoryPage(ChromeDriver driver, Properties prop) {

		this.driver=driver;
		this.prop=prop;
	}

	public NewServiceTerritoryPage enterTerritoryName(String newTerritoryName) {

		this.serviceTerritoryName=newTerritoryName;
		WebElement newTerritoryNameBox= driver.findElement(By.xpath(prop.getProperty("NewServiceTerritoryPage.newTerritoryNameBox")));
		newTerritoryNameBox.sendKeys(newTerritoryName);
		return this;
	} 

	public NewServiceTerritoryPage enterOperatingHours() {

		WebElement operatingHours= driver.findElement(By.xpath(prop.getProperty("NewServiceTerritoryPage.operatingHours")));
		operatingHours.click();
		return this;
	} 

	public NewServiceTerritoryPage activeField() {

		WebElement checkBox=driver.findElement(By.xpath(prop.getProperty("NewServiceTerritoryPage.checkBox")));
		checkBox.click();
		WebElement firstOperatingHour= driver.findElement(By.xpath(prop.getProperty("NewServiceTerritoryPage.firstOperatingHour")));
		firstOperatingHour.click();
		return this;
	} 

	public NewServiceTerritoryPage enterCityName(String city) {

		WebElement cityBox= driver.findElement(By.xpath(prop.getProperty("NewServiceTerritoryPage.cityBox")));
		cityBox.sendKeys(city);
		return this;
	} 

	public NewServiceTerritoryPage enterAddress(String address) {

		WebElement addressBox= driver.findElement(By.xpath(prop.getProperty("NewServiceTerritoryPage.addressBox")));
		addressBox.sendKeys(address);
		return this;
	} 

	public NewServiceTerritoryPage enterCountry(String country) {

		WebElement countryBox=driver.findElement(By.xpath(prop.getProperty("NewServiceTerritoryPage.countryBox")));
		countryBox.sendKeys(country);
		return this;
	}

	public NewServiceTerritoryPage enterPostal(String postalCode) {

		WebElement postalCodeBox= driver.findElement(By.xpath(prop.getProperty("NewServiceTerritoryPage.postalCodeBox")));
		postalCodeBox.sendKeys(postalCode);
		return this;
	} 

	public NewServiceTerritoryPage saveTerritory() {
		WebElement saveButton= driver.findElement(By.xpath(prop.getProperty("NewServiceTerritoryPage.saveButton")));
		saveButton.click();
		return this;
	} 

	/*
	 * public boolean isTerritoryCreated() {
	 * 
	 * List<WebElement> territory=driver.findElements(By.xpath(String.format(
	 * "//table/tbody/tr/th/span/a[text()='%s']", serviceTerritoryName)));
	 * 
	 * if(territory.size()>=1) {
	 * 
	 * return true; } else return false;
	 * 
	 * }
	 */
}
