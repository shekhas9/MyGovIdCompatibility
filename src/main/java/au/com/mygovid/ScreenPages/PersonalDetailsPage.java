package au.com.mygovid.ScreenPages;

import java.io.IOException;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class PersonalDetailsPage extends BasePageObject {

	public PersonalDetailsPage(AppiumDriver driver) throws IOException {
		super(driver);
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
		// TODO Auto-generated constructor stub
	}
	
	@AndroidFindBy(id = "au.gov.ato.mygovid.droid.integration:id/personalDetailsHeadingLabel")
	private MobileElement personalDetailScreenHeading;
	
	@AndroidFindBy(id = "au.gov.ato.mygovid.droid.integration:id/givenNameET")
	private MobileElement givenNameField;
	
	@AndroidFindBy(id = "au.gov.ato.mygovid.droid.integration:id/familyNameET")
	private MobileElement familyNameField;

	@AndroidFindBy(id = "au.gov.ato.mygovid.droid.integration:id/dateOfBirthET")
	private MobileElement dobField;

	public MobileElement getPersonalDetailScreenHeading() {
		return personalDetailScreenHeading;
	}

	public void setPersonalDetailScreenHeading(MobileElement personalDetailScreenHeading) {
		this.personalDetailScreenHeading = personalDetailScreenHeading;
	}

	public MobileElement getGivenNameField() {
		return givenNameField;
	}

	public void setGivenNameField(MobileElement givenNameField) {
		this.givenNameField = givenNameField;
	}

	public MobileElement getFamilyNameField() {
		return familyNameField;
	}

	public void setFamilyNameField(MobileElement familyNameField) {
		this.familyNameField = familyNameField;
	}

	public MobileElement getDobField() {
		return dobField;
	}

	public void setDobField(MobileElement dobField) {
		this.dobField = dobField;
	}

}
