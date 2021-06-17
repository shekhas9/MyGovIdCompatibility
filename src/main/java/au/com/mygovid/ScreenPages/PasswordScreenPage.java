package au.com.mygovid.ScreenPages;

import java.io.IOException;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class PasswordScreenPage extends BasePageObject {
	

	public PasswordScreenPage(AppiumDriver driver) throws IOException {
		super(driver);
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
		// TODO Auto-generated constructor stub
	}

	@AndroidFindBy(id = "au.gov.ato.mygovid.droid.integration:id/capturePasswordHeadingLabel")
	private MobileElement passwordScreenHeading;
	
	@AndroidFindBy(id = "au.gov.ato.mygovid.droid.integration:id/passwordET")
	private MobileElement passwordField;
	
	@AndroidFindBy(id = "au.gov.ato.mygovid.droid.integration:id/confirmPasswordET")
	private MobileElement confirmPasswordField;

	public MobileElement getPasswordScreenHeading() {
		return passwordScreenHeading;
	}

	public void setPasswordScreenHeading(MobileElement passwordScreenHeading) {
		this.passwordScreenHeading = passwordScreenHeading;
	}

	public MobileElement getPasswordField() {
		return passwordField;
	}

	public void setPasswordField(MobileElement passwordField) {
		this.passwordField = passwordField;
	}

	public MobileElement getConfirmPasswordField() {
		return confirmPasswordField;
	}

	public void setConfirmPasswordField(MobileElement confirmPasswordField) {
		this.confirmPasswordField = confirmPasswordField;
	}

}
