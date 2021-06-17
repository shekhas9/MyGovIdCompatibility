package au.com.mygovid.CompatibilityJava;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import au.com.mygovid.ScreenPages.PageFactory;
import io.appium.java_client.AppiumDriver;

public abstract class BaseTest {
	AppiumDriver driver;
	TestUtility testUtility;
	PageFactory pageFactory;

	public BaseTest() throws IOException {

		testUtility = new TestUtility(driver);

	}

	@BeforeMethod(alwaysRun = true)
	public void setUp() throws IOException {

		driver = (AppiumDriver) testUtility.getAndroidDriver();
		pageFactory = new PageFactory(driver);

		// ModelPageaActions modelPageAction = new ModelPageaActions(driver);
	}

	@AfterMethod
	public void tearDown() {
		testEnd();
		driver.quit();
	}

	@Test
	public void testInit() {

	}

	@Test
	public void testEnd() {
	}
	/*
	 * //@Test public void firstPageTest() throws IOException, InterruptedException
	 * { // PageFactory.firstPage.clickContinue();
	 * 
	 * pageFactory.firstPage.getContinueButton().click();
	 * pageFactory.firstPage.getCloseButton().click();
	 * pageFactory.basePageObject.takeScreenPicture(
	 * "/Users/sitauto/Pictures/21Q2compatibilityScreens/Launch.jpg");
	 * pageFactory.firstPage.getRegisterButton().click(); // Include number of times
	 * you want to swipe left.Method captures screenshot
	 * pageFactory.basePageObject.swipeLeft(driver, 3);
	 * pageFactory.commonPageElements.getSubmitButton().click();
	 * pageFactory.firstPage.waitforElement(2,
	 * pageFactory.firstPage.getTermsAndConditionLink()); //
	 * pageFactory.firstPage.waitTillElementExist(pageFactory.firstPage.
	 * getTermsAndConditionLink(), 3); pageFactory.basePageObject.takeScreenPicture(
	 * "/Users/sitauto/Pictures/21Q2compatibilityScreens/T&C.jpg");
	 * pageFactory.commonPageElements.getSubmitButton().click();
	 * pageFactory.emailPage.waitforElement(2,
	 * pageFactory.emailPage.getEmailField());
	 * pageFactory.emailPage.getEmailField().sendKeys("test@mock.com");
	 * pageFactory.basePageObject.ScrollToBottomOfTheScreen(driver);
	 * pageFactory.basePageObject .takeScreenPicture(
	 * "/Users/sitauto/Pictures/21Q2compatibilityScreens/emailScreen.jpg");
	 * pageFactory.commonPageElements.getSubmitButton().click();
	 * pageFactory.emailPage.waitforElement(2,
	 * pageFactory.emailPage.getVerificationPageHeading());
	 * pageFactory.basePageObject .takeScreenPicture(
	 * "/Users/sitauto/Pictures/21Q2compatibilityScreens/verificationcode.jpg");
	 * pageFactory.emailPage.getVerificationCOdeField().sendKeys("123456");
	 * pageFactory.basePageObject.ScrollToBottomOfTheScreen(driver);
	 * pageFactory.commonPageElements.getSubmitButton().click();
	 * pageFactory.passwordScreenPage.waitforElement(2,
	 * pageFactory.passwordScreenPage.getPasswordScreenHeading());
	 * pageFactory.basePageObject .takeScreenPicture(
	 * "/Users/sitauto/Pictures/21Q2compatibilityScreens/passwordScreen.jpg");
	 * pageFactory.passwordScreenPage.getPasswordField().sendKeys("Password1!");
	 * pageFactory.basePageObject.ScrollToBottomOfTheScreen(driver);
	 * pageFactory.passwordScreenPage.getConfirmPasswordField().sendKeys(
	 * "Password1!"); pageFactory.commonPageElements.getSubmitButton().click();
	 * pageFactory.personalDetailsPage.waitforElement(3,
	 * pageFactory.personalDetailsPage.getPersonalDetailScreenHeading());
	 * pageFactory.personalDetailsPage.getGivenNameField().sendKeys("firstName");
	 * Thread.sleep(100); pageFactory.personalDetailsPage.goToElement(driver,
	 * pageFactory.personalDetailsPage.getFamilyNameField()) .sendKeys("lastName");
	 * pageFactory.personalDetailsPage.goToElement(driver,
	 * pageFactory.personalDetailsPage.getDobField()) .sendKeys("02" + "/" + "06" +
	 * "/" + "1984");
	 * 
	 * pageFactory.basePageObject .takeScreenPicture(
	 * "/Users/sitauto/Pictures/21Q2compatibilityScreens/PersonalDetails.jpg");
	 * pageFactory.commonPageElements.getSubmitButton().click();
	 * pageFactory.dashboardPage.waitforElement(3,
	 * pageFactory.dashboardPage.getIdentityStrengthTitle());
	 * pageFactory.basePageObject.takeScreenPicture(
	 * "/Users/sitauto/Pictures/21Q2compatibilityScreens/DashBoard.jpg");
	 * 
	 * }
	 */
}
