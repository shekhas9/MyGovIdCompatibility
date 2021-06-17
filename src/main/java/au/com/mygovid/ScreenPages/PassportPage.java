package au.com.mygovid.ScreenPages;

import java.io.IOException;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class PassportPage extends BasePageObject {

	public PassportPage(AppiumDriver driver) throws IOException {
		super(driver);
		// TODO Auto-generated constructor stub
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	
	@AndroidFindBy(id = "au.gov.ato.mygovid.droid.integration:id/documentNumberET")
	private MobileElement passportNumberField;
	
	@AndroidFindBy(id = "au.gov.ato.mygovid.droid.integration:id/givenNameET")
	private MobileElement passportGivenNameField;
	
	@AndroidFindBy(id = "au.gov.ato.mygovid.droid.integration:id/familyNameET")
	private MobileElement passportFamilynameField;
	
	@AndroidFindBy(id = "au.gov.ato.mygovid.droid.integration:id/dateOfBirthET")
	private MobileElement passportdateOfBirthField;
	
	
	@AndroidFindBy(xpath = ("//android.widget.RadioButton[@content-desc=\"Female\"]"))
	private MobileElement passportFemaleGender;
	
	@AndroidFindBy(id="au.gov.ato.mygovid.droid.integration:id/consent")
	private MobileElement passportConsent;

	public MobileElement getPassportNumberField() {
		return passportNumberField;
	}

	public void setPassportNumberField(MobileElement passportNumberField) {
		this.passportNumberField = passportNumberField;
	}

	public MobileElement getPassportGivenNameField() {
		return passportGivenNameField;
	}

	public void setPassportGivenNameField(MobileElement passportGivenNameField) {
		this.passportGivenNameField = passportGivenNameField;
	}

	public MobileElement getPassportFamilynameField() {
		return passportFamilynameField;
	}

	public void setPassportFamilynameField(MobileElement passportFamilynameField) {
		this.passportFamilynameField = passportFamilynameField;
	}

	public MobileElement getPassportdateOfBirthField() {
		return passportdateOfBirthField;
	}

	public void setPassportdateOfBirthField(MobileElement passportdateOfBirthField) {
		this.passportdateOfBirthField = passportdateOfBirthField;
	}

	public MobileElement getPassportFemaleGender() {
		return passportFemaleGender;
	}

	public void setPassportFemaleGender(MobileElement passportFemaleGender) {
		this.passportFemaleGender = passportFemaleGender;
	}

	public MobileElement getPassportConsent() {
		return passportConsent;
	}

	public void setPassportConsent(MobileElement passportConsent) {
		this.passportConsent = passportConsent;
	}
	
	
	
}
