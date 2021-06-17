package au.com.mygovid.ScreenPages;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.base.Function;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.AndroidKeyCode;
import io.appium.java_client.android.AndroidKeyMetastate;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import io.appium.java_client.windows.PressesKeyCode;

public class BasePageObject {

	public BasePageObject(AppiumDriver driver) throws IOException {
		this.driver = driver;
		// TODO Auto-generated constructor stub
	}

	protected static final int DEFAULT_FLUENTWAIT_TIMEOUT = 20;
	private static final int DEFAULT_THRESHOLD = 100;
	private static final int DEFAULT_WAIT_SECS = 10;
	protected static RemoteWebDriver driver;
	/*
	 * public static void waitForElementToLoad(AndroidDriver driver, String locator)
	 * { WebDriverWait wait = new WebDriverWait(driver, 30);
	 * wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(locator))); }
	 * 
	 * 
	 */

	public MobileElement goToElement(AppiumDriver driver, MobileElement element) throws InterruptedException {
		System.out.println(element.isDisplayed());
		if (element.isDisplayed() || !element.isDisplayed()) {
			ScrollToBottomOfTheScreen(driver);
		}
		return element;
	}

	public static void takeScreenPicture(String pathOfScreen) throws IOException {
		File file = driver.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file, new File(pathOfScreen));
	}

	public void waitforElement(int timeOutInSeconds, MobileElement permissionFrame) {
		WebDriverWait wait = new WebDriverWait(driver, timeOutInSeconds);
		wait.until(ExpectedConditions.visibilityOf(permissionFrame));
	}

	public  void click(MobileElement continueButton) {
		try {
			(new WebDriverWait(driver, DEFAULT_WAIT_SECS))
					.until(ExpectedConditions.elementToBeClickable(continueButton));
			continueButton.click();
		} catch (StaleElementReferenceException sere) {
			continueButton.click();
		}
	}

	public void pressDeviceBackButton() {
		((PressesKeyCode) driver).pressKeyCode(AndroidKeyCode.BACK);
	}

	public void pressDeviceEnterButton() {
		((PressesKeyCode) driver).pressKeyCode(AndroidKeyCode.ENTER);

	}

	public void pressTab(MobileElement element) {
		element.sendKeys(Keys.TAB);

	}

	public void pressDevicePressSpace(WebDriver driver) {
		((PressesKeyCode) driver).pressKeyCode(AndroidKeyCode.SPACE, AndroidKeyMetastate.META_SHIFT_ON);
	}

	public void typeText(WebElement locator, String keyTextValue) {
		try {
			(new WebDriverWait(driver, 10)).until(ExpectedConditions.elementToBeClickable(locator));
			locator.sendKeys(keyTextValue);
		} catch (StaleElementReferenceException sere) {
			locator.sendKeys(keyTextValue);
		}
	}

	public void setText(WebElement locator, String keyTextValue) {
		try {
			(new WebDriverWait(driver, 10)).until(ExpectedConditions.elementToBeClickable(locator));
			((MobileElement) locator).setValue(keyTextValue);
		} catch (StaleElementReferenceException sere) {
			locator.sendKeys(keyTextValue);
		}
	}

	@SuppressWarnings("deprecation")
	public static WebElement fluentWait(final MobileElement object, int timeinsec) {

		FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(timeinsec, TimeUnit.SECONDS)
				.pollingEvery(5, TimeUnit.SECONDS).ignoring(NoSuchElementException.class);
		WebElement element = wait.until(new Function<WebDriver, AndroidElement>() {
			@SuppressWarnings("unused")
			public MobileElement apply(@SuppressWarnings("rawtypes") AndroidDriver driver) {
				return object;
			}

			public AndroidElement apply(WebDriver arg0) {
				// TODO Auto-generated method stub
				return null;
			}
		});
		return element;
	}

	public final static WebElement getElement(MobileElement object) {
		return fluentWait(object, DEFAULT_FLUENTWAIT_TIMEOUT);
	}

	public boolean isTextVisible(String text) {
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("content", text);
		params.put("threshold", DEFAULT_THRESHOLD);
		WebElement errorText = (MobileElement) ((RemoteWebDriver) driver).executeScript("mobile:text:find", params);
		return errorText != null;
	}

	/**
	 * Check whether an element exists on the screen or not
	 * 
	 * @param xpath - property of the element in xpath
	 * @return boolean result
	 */
	public boolean isElementExistsByXPath(MobileElement xpath) {
		WebElement elementName = getElementByXPath(xpath, 60);
		return elementName != null;
	}

	/**
	 * Check whether an element exists on the screen or not
	 * 
	 * @param Name - property of the element in name
	 * @return boolean result
	 */
	public boolean isElementExistsByName(MobileElement name) {
		MobileElement elementName = (MobileElement) getElement(name);
		return elementName != null;
	}

	public boolean isElementExistsByName(MobileElement name, long timeout) {
		WebElement elementName = getElement(name);
		return elementName != null;
	}

	public String getElementTextByXPath(MobileElement xpath) throws Exception {
		try {
			if (isElementExistsByXPath(xpath)) {
				return getElementByXPath(xpath, DEFAULT_FLUENTWAIT_TIMEOUT).getText();
			}
		} catch (RuntimeException runTimeException) {
			runTimeException.printStackTrace();
		}
		return null;
	}

	public static void swipeLeft(AppiumDriver driver, int numberOfSwipes) throws IOException {
		for (int i = 0; i <= numberOfSwipes; i++) {

			Dimension size = driver.manage().window().getSize();
			int startx = (int) (size.width * 0.9);
			int endx = (int) (size.width * 0.10);
			int starty = size.height / 2;

			TouchAction action = new TouchAction(driver);
			action.press(PointOption.point(startx, starty)).waitAction(WaitOptions.waitOptions(Duration.ofMillis(1300)))
					.moveTo(PointOption.point(endx, starty)).release().perform();
			takeScreenPicture("/Users/sitauto/Pictures/21Q2compatibilityScreens/" + i + "Swipe.jpg");
		}
	}

	public void navigateBack(AppiumDriver driver, int numberOfBackClicks) throws InterruptedException {
		for (int i = 0; i < numberOfBackClicks; i++) {
			driver.findElement(By.id("au.gov.ato.mygovid.droid.integration:id/actionbarBack")).click();
			Thread.sleep(100);

		}
	}

	public boolean isElementExistsByXPath(MobileElement fieldValue, long timeOut) {
		WebElement elementName = getElementByXPath(fieldValue, timeOut);
		return elementName != null;
	}

	public boolean isElementEnabled(MobileElement element) {
		boolean state = element.isEnabled();
		return state;
	}

	/**
	 * Check whether an element is displayed on the screen or not
	 * 
	 */
	public static boolean isElementDisplayed(MobileElement locator, long timeOut) {
		WebElement elementName = getElement(locator);
		return elementName.isDisplayed();
	}

	public WebElement getElementByXPath(MobileElement xpath, long elementWaitTime) {
		return getElement(xpath);
	}

	public void clearTextField(MobileElement element) {
		if (!element.getText().isEmpty()) {
			element.clear();
		}
	}

	public static boolean isElementPresent(WebDriver driver, By by) {
		boolean size = driver.findElements(by).size() > 0;
		return size;
	}

	public boolean isElementToBeClickableByLocator(MobileElement locator) {
		WebDriverWait wait = new WebDriverWait(driver, 10);

		return (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(locator)) != null;
	}

	public boolean waitTillElementExist(MobileElement mobileElement, int timeout) {
		WebDriverWait wait = new WebDriverWait(driver, timeout);
		return wait.until(ExpectedConditions.invisibilityOf(mobileElement)) != null;

	}

	public static void ScrollToBottomOfTheScreen(AppiumDriver driver) throws InterruptedException {
		Dimension size = driver.manage().window().getSize();
		Thread.sleep(1000);
		int startx = (int) (size.width * 0.90);
		int endy = (int) (size.height * 0.10);
		int starty = size.height / 2;

		TouchAction action = new TouchAction(driver);
		action.press(PointOption.point(startx, starty)).waitAction(WaitOptions.waitOptions(Duration.ofMillis(1300)))
				.moveTo(PointOption.point(startx, endy)).release().perform();
		Thread.sleep(100);
	}
	
	  public static  boolean IsElementDisplayed(MobileElement locator)
      {
          boolean dispalyed = false;

          try
          {
              return locator.isDisplayed();
          }
          catch (Exception e)
          {
              return dispalyed;
          }
      }

	  
		public static void expandAndSelectDashboardDocElement1(AppiumDriver driver, String locatorElement) {
			if (!driver.findElement(By.id(locatorElement)).isDisplayed()) {
				driver.findElement(By.id("au.gov.ato.mygovid.droid.integration:id/accordionHeader")).click();
			}
			
			driver.findElement(By.id(locatorElement)).click();
		}
		
		/*
		public void selectDocumentFromDashBoard(AppiumDriver driver,String DocName, MobileElement locator) {
			switch(DocName) {
			case("Passport"):
				driver.findElement(By.id("au.gov.ato.mygovid.droid.integration:id/dashboardDocumentAustralianPassport")).click();
			break;
			case("MediCare"):
				expandAndSelectDashboardDocElement1(driver,locator);
				driver.findElement(By.id("au.gov.ato.mygovid.droid.integration:id/dashboardDocumentMedicare")).click();
			break;
			case("BirthCertificate"):
				expandDocumentList(driver,locator);
				driver.findElement(By.id("au.gov.ato.mygovid.droid.integration:id/dashboardDocumentBirthCertificate")).click();
			break;
			}
		}
		
		
*/
		
	
}
