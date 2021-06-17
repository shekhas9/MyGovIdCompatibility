package au.com.mygovid.ScreenPages;

import java.io.IOException;

import au.com.mygovid.CompatibilityJava.ModelInterfaceActions;
import io.appium.java_client.AppiumDriver;

public class PageFactory {

	public static FirstPage firstPage;
	public static AustralianVisaPage australianVisaPage;
	public static BirthCertificatePage birthCertificatePage;
	public static CitizenShipScreenPage citizenshipScreenPage;
	public static CommonPageElements commonPageElements;
	public static DashboardPage dashboardPage;
	public static DrivingLicensePage drivingLicensePage;
	public static EmailPage emailPage;
	public static MedicarePage medicarePage;
	public static PassportPage passportPage;
	public static PasswordScreenPage passwordScreenPage;
	public static PersonalDetailsPage personalDetailsPage;
	public static SettingsPage settingsPage;
	public static BasePageObject basePageObject;
	

	// newly added

	public PageFactory(AppiumDriver driver) throws IOException {
		firstPage = new FirstPage(driver);
		australianVisaPage = new AustralianVisaPage(driver);
		birthCertificatePage = new BirthCertificatePage(driver);
		citizenshipScreenPage =  new CitizenShipScreenPage(driver);
		commonPageElements = new CommonPageElements(driver);
		dashboardPage = new DashboardPage(driver);
		drivingLicensePage = new DrivingLicensePage(driver);
		emailPage = new EmailPage(driver);
		medicarePage =  new MedicarePage(driver);
		passportPage = new PassportPage(driver);
		passwordScreenPage = new PasswordScreenPage(driver);
		personalDetailsPage = new PersonalDetailsPage(driver);
		settingsPage = new SettingsPage(driver);
		basePageObject = new BasePageObject(driver);

	}

}
