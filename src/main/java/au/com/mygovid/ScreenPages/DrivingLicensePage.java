package au.com.mygovid.ScreenPages;

import java.io.IOException;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class DrivingLicensePage extends BasePageObject{

	public DrivingLicensePage(AppiumDriver driver) throws IOException {
		super(driver);
		// TODO Auto-generated constructor stub
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	
	@AndroidFindBy(id = "au.gov.ato.mygovid.droid.integration:id/licenceNumberTitle")
	private MobileElement licenseNumberTitle;


	public MobileElement getLicenseNumberTitle() {
		return licenseNumberTitle;
	}


	public void setLicenseNumberTitle(MobileElement licenseNumberTitle) {
		this.licenseNumberTitle = licenseNumberTitle;
	}
}
