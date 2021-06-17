package au.com.mygovid.CompatibilityJava;

import java.io.IOException;
import java.util.Properties;

public class TestConfig {


	public static final String APP_KEY = "app";
	public static final String OS_KEY = "os";
	public static final String ANDROID = "Android";
	public static final String IOS = "Ios";

	private String value;
	private Properties config;

	public void loadData() throws IOException {
		config = new Properties();
		config.load(this.getClass().getResourceAsStream("../../../../config.properties"));
	}

	public String getProperty(String key) {
		String value = null;
		try {
			if (config == null) {
				loadData();
			}
			value = config.getProperty(key);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return value;
	}
	
}
