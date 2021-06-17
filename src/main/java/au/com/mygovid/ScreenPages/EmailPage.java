package au.com.mygovid.ScreenPages;

import java.io.IOException;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class EmailPage extends BasePageObject {

	public EmailPage(AppiumDriver driver) throws IOException {
		super(driver);
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
		// TODO Auto-generated constructor stub
	}

	@AndroidFindBy(id = "au.gov.ato.mygovid.droid.integration:id/emailAddressET")
	private MobileElement emailField;
	
	@AndroidFindBy(id = "au.gov.ato.mygovid.droid.integration:id/emailVerificationHeading")
	private MobileElement verificationPageHeading;
	
	@AndroidFindBy(id = "au.gov.ato.mygovid.droid.integration:id/verificationCode")
	private MobileElement verificationCOdeField;

	public MobileElement getEmailField() {
		return emailField;
	}

	public void setEmailField(MobileElement emailField) {
		this.emailField = emailField;
	}

	public MobileElement getVerificationPageHeading() {
		return verificationPageHeading;
	}

	public void setVerificationPageHeading(MobileElement verificationPageHeading) {
		this.verificationPageHeading = verificationPageHeading;
	}

	public MobileElement getVerificationCOdeField() {
		return verificationCOdeField;
	}

	public void setVerificationCOdeField(MobileElement verificationCOdeField) {
		this.verificationCOdeField = verificationCOdeField;
	}
}
