package au.com.mygovid.CompatibilityJava;

import java.io.IOException;

import org.testng.annotations.Test;

import au.com.mygovid.ScreenPages.PageFactory;

public class BirthCertificateTest extends BaseTest {

	public BirthCertificateTest() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}


@Test
public void BirthCertificateTest() throws InterruptedException, IOException {
	
	pageFactory.firstPage.getEnableFastForwardToDashBoard().click();
	pageFactory.firstPage.getContinueButton().click();
	pageFactory.dashboardPage.getDashBoardPassport().click();
	pageFactory.commonPageElements.getEnterDetailsManuallyButton().click();
	pageFactory.passportPage.waitforElement(2, pageFactory.passportPage.getPassportNumberField());
	pageFactory.passportPage.getPassportNumberField().sendKeys("PA0000179");
	pageFactory.passportPage.getPassportGivenNameField().sendKeys("Erin");
	pageFactory.passportPage.getPassportFamilynameField().sendKeys("young");
	pageFactory.passportPage.goToElement(driver, pageFactory.passportPage.getPassportdateOfBirthField()).sendKeys("02" + "/" + "06" + "/" + "1984");
	pageFactory.passportPage.goToElement(driver, pageFactory.passportPage.getPassportFemaleGender()).click();
	pageFactory.basePageObject.takeScreenPicture("/Users/sitauto/Pictures/21Q2compatibilityScreens/PassportFilledDetails.jpg");
	pageFactory.passportPage.getPassportConsent().click();
	pageFactory.commonPageElements.getSubmitButton().click();
	pageFactory.dashboardPage.waitforElement(3, pageFactory.dashboardPage.getIdentityStrengthTitle());
	pageFactory.basePageObject.takeScreenPicture("/Users/sitauto/Pictures/21Q2compatibilityScreens/Dashboard3.jpg");
	pageFactory.commonPageElements.selectDashboardDocElement(driver);
	
	pageFactory.dashboardPage.click(pageFactory.dashboardPage.getDashBoardBirthCertificate());
	pageFactory.basePageObject.takeScreenPicture("/Users/sitauto/Pictures/21Q2compatibilityScreens/BirthCertificate1.jpg");
	pageFactory.birthCertificatePage.waitforElement(4, pageFactory.birthCertificatePage.getBirthCertificateStateTitle());
	pageFactory.birthCertificatePage.getBirthCertificateStateDropBox().click();
	pageFactory.basePageObject.takeScreenPicture("/Users/sitauto/Pictures/21Q2compatibilityScreens/BirthCertStatesList.jpg");
	pageFactory.birthCertificatePage.selectTheStateForBirthCertificate("ACT");
	pageFactory.basePageObject.takeScreenPicture("/Users/sitauto/Pictures/21Q2compatibilityScreens/BirthCertScreenDetails.jpg");
	PageFactory.birthCertificatePage.ScrollToBottomOfTheScreen(driver);
//	pageFactory.basePageObject.takeScreenPicture("/Users/sitauto/Pictures/21Q2compatibilityScreens/BirthCertScreenDetails2.jpg");
	
}
}
