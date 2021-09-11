package utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class LoadProperties {

	private static Properties prop;
	private static FileInputStream fis;
	
	public static Properties initProperties() {

		try {
			fis = new FileInputStream("./src/test/resources/configFiles/config.properties");
			prop = new Properties();
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		}
		try {
			prop.load(fis);
		} catch (IOException e) {

			e.printStackTrace();
		}
		return prop;
	}

}
