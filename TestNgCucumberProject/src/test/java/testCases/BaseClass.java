package testCases;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import io.cucumber.testng.AbstractTestNGCucumberTests;

/*import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.github.bonigarcia.wdm.WebDriverManager;
import pages.UserMenuPage;
import utilities.ReadExcel;*/

public class BaseClass extends AbstractTestNGCucumberTests{
	
	
	/*
	 * public static ChromeDriver driver; public String sheetName; public Properties
	 * prop; public FileInputStream fis;
	 * 
	 * @DataProvider(name = "fecthData") public String[][] getData() throws
	 * IOException {
	 * 
	 * ReadExcel data = new ReadExcel(); return data.excelData(sheetName); }
	 * 
	 * 
	 * public Properties initProp() {
	 * 
	 * try { fis = new
	 * FileInputStream("./src/test/resources/configFiles/config.properties"); prop =
	 * new Properties(); } catch (FileNotFoundException e) {
	 * 
	 * e.printStackTrace(); } try { prop.load(fis); } catch (IOException e) {
	 * 
	 * e.printStackTrace(); } return prop; }
	 * 
	 * @BeforeMethod(alwaysRun = true) public void openBrowserAndLogin() throws
	 * InterruptedException {
	 * 
	 * ChromeOptions options = new ChromeOptions();
	 * options.addArguments("--disable-notifications");
	 * 
	 * WebDriverManager.chromedriver().setup(); driver= new ChromeDriver(options);
	 * 
	 * driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	 * driver.manage().window().maximize();
	 * 
	 * //String
	 * propFileLocation="./src/test/resources/configFiles/config.properties";
	 * 
	 * }
	 * 
	 * @AfterMethod(alwaysRun = true) public void tearDown() throws
	 * InterruptedException {
	 * 
	 * 
	 * driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	 * 
	 * 
	 * UserMenuPage userMenuPage = new UserMenuPage(driver, initProp());
	 * userMenuPage.clickUserMenu().logOut();
	 * 
	 * driver.quit();
	 * 
	 * 
	 * }
	 */
}
