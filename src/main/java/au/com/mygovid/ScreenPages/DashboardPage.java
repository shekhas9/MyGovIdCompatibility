package au.com.mygovid.ScreenPages;

import java.io.IOException;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class DashboardPage extends BasePageObject {

	public DashboardPage(AppiumDriver driver) throws IOException {
		super(driver);
		// TODO Auto-generated constructor stub
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	
	
	@AndroidFindBy(id = "au.gov.ato.mygovid.droid.integration:id/identityStrengthTitle")
	private MobileElement identityStrengthTitle;
	
	@AndroidFindBy(id = "au.gov.ato.mygovid.droid.integration:id/dashboardDocumentAustralianPassport")
	private MobileElement dashBoardPassport;
	
	@AndroidFindBy(id = "au.gov.ato.mygovid.droid.integration:id/actionbarTitle")
	private MobileElement dashBoardActionBar;

	@AndroidFindBy(id = "au.gov.ato.mygovid.droid.integration:id/dashboardDocumentDriverLicence")
	private MobileElement dashBoardDrivingLicense;
	
	@AndroidFindBy(id = "au.gov.ato.mygovid.droid.integration:id/dashboardDocumentAustralianVisa")
	private MobileElement dashBoardAustralianVisa;
	
	@AndroidFindBy(id = "au.gov.ato.mygovid.droid.integration:id/dashboardDocumentImmiCard")
	private MobileElement dashBoardImmiCard;
	
	@AndroidFindBy(id = "au.gov.ato.mygovid.droid.integration:id/dashboardDocumentCitizenshipCertificate")
	private MobileElement dashBoardCitizenshipCertificate;
	
	@AndroidFindBy(id = "au.gov.ato.mygovid.droid.integration:id/dashboardDocumentBirthCertificate")
	private MobileElement dashBoardBirthCertificate;
	
	@AndroidFindBy(id = "au.gov.ato.mygovid.droid.integration:id/dashboardDocumentMedicare")
	private MobileElement dashboardmedicare;
	
	@AndroidFindBy(id= "au.gov.ato.mygovid.droid.integration:id/about")
	private MobileElement dashBoardAboutLink;
	
	
	@AndroidFindBy(id= "au.gov.ato.mygovid.droid.integration:id/account")
	private MobileElement dashBoardMyIdentityLink;
	
	@AndroidFindBy(id= "au.gov.ato.mygovid.droid.integration:id/settings")
	private MobileElement dashBoardSettingsLink;
	
	@AndroidFindBy(id = "au.gov.ato.mygovid.droid.integration:id/accordionHeader")
	private MobileElement proveYourIdentityCheveron;

	public MobileElement getIdentityStrengthTitle() {
		return identityStrengthTitle;
	}

	public void setIdentityStrengthTitle(MobileElement identityStrengthTitle) {
		this.identityStrengthTitle = identityStrengthTitle;
	}

	public MobileElement getDashBoardPassport() {
		return dashBoardPassport;
	}

	public void setDashBoardPassport(MobileElement dashBoardPassport) {
		this.dashBoardPassport = dashBoardPassport;
	}

	public MobileElement getDashBoardActionBar() {
		return dashBoardActionBar;
	}

	public void setDashBoardActionBar(MobileElement dashBoardActionBar) {
		this.dashBoardActionBar = dashBoardActionBar;
	}

	public MobileElement getDashBoardDrivingLicense() {
		return dashBoardDrivingLicense;
	}

	public void setDashBoardDrivingLicense(MobileElement dashBoardDrivingLicense) {
		this.dashBoardDrivingLicense = dashBoardDrivingLicense;
	}

	public MobileElement getDashBoardAustralianVisa() {
		return dashBoardAustralianVisa;
	}

	public void setDashBoardAustralianVisa(MobileElement dashBoardAustralianVisa) {
		this.dashBoardAustralianVisa = dashBoardAustralianVisa;
	}

	public MobileElement getDashBoardImmiCard() {
		return dashBoardImmiCard;
	}

	public void setDashBoardImmiCard(MobileElement dashBoardImmiCard) {
		this.dashBoardImmiCard = dashBoardImmiCard;
	}

	public MobileElement getDashBoardCitizenshipCertificate() {
		return dashBoardCitizenshipCertificate;
	}

	public void setDashBoardCitizenshipCertificate(MobileElement dashBoardCitizenshipCertificate) {
		this.dashBoardCitizenshipCertificate = dashBoardCitizenshipCertificate;
	}

	public MobileElement getDashBoardBirthCertificate() {
		return dashBoardBirthCertificate;
	}

	public void setDashBoardBirthCertificate(MobileElement dashBoardBirthCertificate) {
		this.dashBoardBirthCertificate = dashBoardBirthCertificate;
	}

	public MobileElement getDashboardmedicare() {
		return dashboardmedicare;
	}

	public void setDashboardmedicare(MobileElement dashboardmedicare) {
		this.dashboardmedicare = dashboardmedicare;
	}

	public MobileElement getDashBoardAboutLink() {
		return dashBoardAboutLink;
	}

	public void setDashBoardAboutLink(MobileElement dashBoardAboutLink) {
		this.dashBoardAboutLink = dashBoardAboutLink;
	}

	public MobileElement getDashBoardMyIdentityLink() {
		return dashBoardMyIdentityLink;
	}

	public void setDashBoardMyIdentityLink(MobileElement dashBoardMyIdentityLink) {
		this.dashBoardMyIdentityLink = dashBoardMyIdentityLink;
	}

	public MobileElement getDashBoardSettingsLink() {
		return dashBoardSettingsLink;
	}

	public void setDashBoardSettingsLink(MobileElement dashBoardSettingsLink) {
		this.dashBoardSettingsLink = dashBoardSettingsLink;
	}

	public MobileElement getProveYourIdentityCheveron() {
		return proveYourIdentityCheveron;
	}

	public void setProveYourIdentityCheveron(MobileElement proveYourIdentityCheveron) {
		this.proveYourIdentityCheveron = proveYourIdentityCheveron;
	}
	
	public void expandProveYourIdentityIfDocIsNotVisible() {
		if(!getDashBoardPassport().isEnabled()) {
			 getProveYourIdentityCheveron().click();
		}
	}
}
