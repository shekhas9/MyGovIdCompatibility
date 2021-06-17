package au.com.mygovid.CompatibilityJava;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import au.com.mygovid.ScreenPages.PageFactory;

public class DashBoardTest extends BaseTest {
	
	private TestConfig config;

	public DashBoardTest() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

	@Test
	
	public void dashBoardnavigationTest() throws IOException, InterruptedException {
		pageFactory.firstPage.getEnableFastForwardToDashBoard().click();
		pageFactory.firstPage.getContinueButton().click();
	//	pageFactory.firstPage.getCloseButton().click();
		pageFactory.dashboardPage.waitforElement(3, pageFactory.dashboardPage.getIdentityStrengthTitle());
		pageFactory.basePageObject.takeScreenPicture("/Users/sitauto/Pictures/21Q2compatibilityScreens/DashBoard2.jpg");
		pageFactory.dashboardPage.getDashBoardPassport().click();
		pageFactory.basePageObject.takeScreenPicture("/Users/sitauto/Pictures/21Q2compatibilityScreens/PassportManual.jpg");
		pageFactory.commonPageElements.getEnterDetailsManuallyButton().click();
		pageFactory.passportPage.waitforElement(2, pageFactory.passportPage.getPassportNumberField());
		pageFactory.basePageObject.takeScreenPicture("/Users/sitauto/Pictures/21Q2compatibilityScreens/PassportDetailScreen.jpg");
		pageFactory.passportPage.navigateBack(driver, 2);
		pageFactory.dashboardPage.getDashBoardDrivingLicense().click();
		pageFactory.basePageObject.takeScreenPicture("/Users/sitauto/Pictures/21Q2compatibilityScreens/DrivingLicenseManual.jpg");
		pageFactory.commonPageElements.getEnterDetailsManuallyButton().click();
		pageFactory.drivingLicensePage.waitforElement(2, pageFactory.drivingLicensePage.getLicenseNumberTitle());
		pageFactory.basePageObject.takeScreenPicture("/Users/sitauto/Pictures/21Q2compatibilityScreens/DrivingLicenseDetailScreen.jpg");
		pageFactory.passportPage.navigateBack(driver, 2);
		pageFactory.dashboardPage.getDashBoardAustralianVisa().click();
		pageFactory.basePageObject.takeScreenPicture("/Users/sitauto/Pictures/21Q2compatibilityScreens/AusVisa.jpg");
		pageFactory.dashboardPage.navigateBack(driver, 1);
		pageFactory.dashboardPage.goToElement(driver, pageFactory.dashboardPage.getDashBoardImmiCard()).click();
		pageFactory.basePageObject.takeScreenPicture("/Users/sitauto/Pictures/21Q2compatibilityScreens/ImmiDetails.jpg");
		pageFactory.dashboardPage.navigateBack(driver, 1);
		pageFactory.dashboardPage.getDashBoardCitizenshipCertificate().click();
		pageFactory.basePageObject.takeScreenPicture("/Users/sitauto/Pictures/21Q2compatibilityScreens/CitizenshipCertScreen.jpg");
		pageFactory.dashboardPage.navigateBack(driver, 1);
		pageFactory.dashboardPage.getDashBoardAboutLink().click();
		pageFactory.basePageObject.takeScreenPicture("/Users/sitauto/Pictures/21Q2compatibilityScreens/AboutScreen.jpg");
		pageFactory.dashboardPage.navigateBack(driver, 1);
		pageFactory.dashboardPage.waitforElement(2, pageFactory.dashboardPage.getDashBoardMyIdentityLink());
		pageFactory.dashboardPage.getDashBoardMyIdentityLink().click();
	    pageFactory.wait(100);
		pageFactory.basePageObject.takeScreenPicture("/Users/sitauto/Pictures/21Q2compatibilityScreens/MyidentityScreen.jpg");
		pageFactory.wait(100);
		pageFactory.dashboardPage.navigateBack(driver, 1);
		pageFactory.dashboardPage.getDashBoardSettingsLink().click();
		pageFactory.wait(100);
		pageFactory.basePageObject.takeScreenPicture("/Users/sitauto/Pictures/21Q2compatibilityScreens/SettingsScreen.jpg");
	}
}
