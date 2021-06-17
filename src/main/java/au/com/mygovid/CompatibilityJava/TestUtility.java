package au.com.mygovid.CompatibilityJava;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;


public class TestUtility {
	

	public static final Logger Log = Logger.getLogger(TestUtility.class.getName());
	private AppiumDriver service;
	private AppiumServiceBuilder builder;
	//private TestConfig config;
	private AppiumDriverLocalService appiumService;
	private String appiumServiceUrl;
	private AppiumDriver driver;

	public TestUtility(AppiumDriver driver) throws IOException {
		
		driver= androidDriver();
	}
/*
	public void startAppium() throws IOException, InterruptedException {

		appiumService = AppiumDriverLocalService.buildDefaultService();
		System.out.println("The Url is"+ appiumService.getUrl());;
		appiumService.start();
		appiumServiceUrl = appiumService.getUrl().toString();
		System.out.println("Appium Service Address : - " + appiumServiceUrl);
	}

	public void endAppiumServer() {
		appiumService.stop();
	}
	*/

	private void waitFor(int sec) throws InterruptedException {
		Thread.sleep(sec * 1000);
	}

	public void stopEmulator() throws IOException, InterruptedException {

	}
	
//	public void startGrid() throws IOException{
//		Runtime.getRuntime().exec("java -jar selenium-server-standalone-3.13.0.jar -port 4444 -role hub");
//				}

	public void launchEmulator(String deviceName) throws IOException, InterruptedException {
		Map<String, String> env = System.getenv();
		String location = env.get("ANDROID_HOME") + "/tools";
		Runtime.getRuntime().exec("cmd.exe /c start " + "emulator -avd " + deviceName, null, new File(location));
		waitFor(8);
	}

	public RemoteWebDriver getAndroidDriver() throws IOException {
		File fil = new File("src");
		File f = new File("au.gov.ato.mygovid.droid.integration-Signed.apk");
	//	String url = String.format("http://%1$s:%2$s%3$s", ip, port, path);

		
		
		DesiredCapabilities cap = new DesiredCapabilities();
	//	cap.setCapability(MobileCapabilityType.DEVICE_NAME, device);
				cap.setCapability(MobileCapabilityType.DEVICE_NAME, "ANDROID");
		// cap.setCapability(MobileCapabilityType.NO_RESET,"false");
		/*
		 * cap.setCapability(AndroidMobileCapabilityType.AUTO_GRANT_PERMISSIONS,
		 * "true"); cap.setCapability("autoGrantPermissions", "true");
		 */
		// cap.setCapability("platformVersion", "5.0");
		// cap.setCapability("platformName", "Android");
		// cap.setCapability("udid", Properties.udid);
		// cap.setCapability("unicodeKeyboard", true);
		// cap.setCapability("resetKeyboard", true);
		// cap.setCapability("noReset", "true");
		// cap.setCapability("fullReset", false);
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "ANDROID");
			//cap.setCapability(MobileCapabilityType.UDID, "emulator-5554");
		cap.setCapability(MobileCapabilityType.APP, f.getAbsolutePath());
		driver=new AndroidDriver<AndroidElement>(new URL("http://localhost:4723/wd/hub"),cap);
		//driver=new AndroidDriver<AndroidElement>(new URL("http://localhost:4723/wd/hub"),cap);
	//	driver = new AndroidDriver<AndroidElement>(new URL("http://localhost:" + port1 + "/wd/hub"), cap);
		driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
		
		return driver;
		// "http://127.0.0.1:4723/wd/hub"
	}

	public RemoteWebDriver getIosDriver() throws IOException {
		DesiredCapabilities dc = DesiredCapabilities.iphone();
		dc.setCapability("platformName", "iOS");
		dc.setCapability("platformVersion", "7.1");
		dc.setCapability("appiumVersion", "4.1.2");
		dc.setCapability("deviceName", "iPhone Simulator");
		dc.setCapability("browserName", "safari");

		WebDriver driver = new IOSDriver(
				new URL("http://shashank:e950d779-1817-4c3c-b122-06715b814dfd@ondemand.saucelabs.com:80/wd/hub"), dc);
		return (RemoteWebDriver) driver;
	}

	
	

/*
	public boolean isAndroid() {
		String os = config.getProperty(TestConfig.OS_KEY);
		return TestConfig.ANDROID.equals(os);
	}

	public boolean isOS() {
		String os = config.getProperty(TestConfig.OS_KEY);
		return TestConfig.IOS.equals(os);
	}

	public String getOperatingSystem() {
		String os = config.getProperty(TestConfig.OS_KEY);
		return os;
	}

	public TestConfig getTestConfig() {
		return config;
	}
	
	*/
	
private AppiumDriver androidDriver() throws IOException {
		
	return (AppiumDriver) (this.driver = (AppiumDriver) getAndroidDriver());
	
		
	}

}
