package utilities;

import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.After;
import io.cucumber.java.Before;


public class Hooks{

	private ChromeDriver driver;
	public String sheetName;
	public DriverFactory factory;
	public static Properties prop;

	@Before(order = 0)
	public void initProperties() {

		prop=LoadProperties.initProperties();
		System.out.println("Before hook");
	}

	@Before(order=1)
	public void getDriver() {
		
		factory= new DriverFactory();
		driver=factory.init_driver();

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();

	}

	@After(order=0 )
	public void tearDown() {
		System.out.println("After hook");
		driver.quit();
	}
}
