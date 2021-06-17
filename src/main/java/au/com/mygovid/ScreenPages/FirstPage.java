package au.com.mygovid.ScreenPages;

import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class FirstPage extends BasePageObject {

	public FirstPage(AppiumDriver driver) throws IOException {
		super(driver);
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
		// TODO Auto-generated constructor stub
	}

	@AndroidFindBy(id = "au.gov.ato.mygovid.droid.integration:id/continueButton")
	private  MobileElement continueButton;

	@AndroidFindBy(id = "au.gov.ato.mygovid.droid.integration:id/closeButton")
	private MobileElement closeButton;

	@AndroidFindBy(id = "au.gov.ato.mygovid.droid.integration:id/registerButton")
	private MobileElement registerButton;
	
	@AndroidFindBy(id= "au.gov.ato.mygovid.droid.integration:id/enableFastForwardToDashboard")
	private MobileElement enableFastForwardToDashBoard;
	
	@AndroidFindBy(id="au.gov.ato.mygovid.droid.integration:id/termsAndConditionsLNK")
	private MobileElement termsAndConditionLink;

	public  MobileElement getContinueButton() {
		return continueButton;
	}

	public void setContinueButton(MobileElement continueButton) {
		this.continueButton = continueButton;
	}

	public MobileElement getCloseButton() {
		return closeButton;
	}

	public void setCloseButton(MobileElement closeButton) {
		this.closeButton = closeButton;
	}

	public MobileElement getRegisterButton() {
		return registerButton;
	}

	public void setRegisterButton(MobileElement registerButton) {
		this.registerButton = registerButton;
	}

	public MobileElement getTermsAndConditionLink() {
		return termsAndConditionLink;
	}

	public void setTermsAndConditionLink(MobileElement termsAndConditionLink) {
		this.termsAndConditionLink = termsAndConditionLink;
	}

	public MobileElement getEnableFastForwardToDashBoard() {
		return enableFastForwardToDashBoard;
	}

	public void setEnableFastForwardToDashBoard(MobileElement enableFastForwardToDashBoard) {
		this.enableFastForwardToDashBoard = enableFastForwardToDashBoard;
	}
	

	/*
	 * public FirstPage(AndroidDriver driver){ super(driver);
	 * PageFactory.initElements(new AppiumFieldDecorator( driver), this); }
	 * 
	 */

	
	


}
