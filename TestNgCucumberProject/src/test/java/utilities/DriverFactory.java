package utilities;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class DriverFactory {

	// public WebDriver driver;

	public static ThreadLocal<ChromeDriver> tlDriver = new ThreadLocal<>();

	/**
	 * This method initialize the thread local driver on the basis of given browser
	 * @param browser
	 * @return
	 */
	public ChromeDriver init_driver() {
	
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		tlDriver.set(new ChromeDriver(options));

		getDriver().manage().deleteAllCookies();
		getDriver().manage().window().maximize();
		return getDriver();
	}

	/**
	 * this is use to get the driver with ThreadLocal 
	 * @return
	 */
	public static synchronized ChromeDriver getDriver() {
		return tlDriver.get();
	}

}


