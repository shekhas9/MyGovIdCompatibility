package au.com.mygovid.ScreenPages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class CommonPageElements extends BasePageObject {
	
	DashboardPage dashBoardPage;

	public CommonPageElements(AppiumDriver driver) throws IOException {
		super(driver);
		// TODO Auto-generated constructor stub
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	@AndroidFindBy(id = "au.gov.ato.mygovid.droid.integration:id/nextButton")
	private MobileElement submitButton;
	
	@AndroidFindBy(id = "au.gov.ato.mygovid.droid.integration:id/enterManuallyButton")
	private MobileElement enterDetailsManuallyButton;
	
	@AndroidFindBy(id = "au.gov.ato.mygovid.droid.integration:id/actionbarBack")
	private MobileElement backButton;

	public MobileElement getSubmitButton() {
		return submitButton;
	}

	public void setSubmitButton(MobileElement submitButton) {
		this.submitButton = submitButton;
	}

	public MobileElement getEnterDetailsManuallyButton() {
		return enterDetailsManuallyButton;
	}

	public void setEnterDetailsManuallyButton(MobileElement enterDetailsManuallyButton) {
		this.enterDetailsManuallyButton = enterDetailsManuallyButton;
	}
	
	
	public static void selectDashboardDocElement(AppiumDriver driver) {
	//	if (!(locatorElement.isDisplayed())) {
			driver.findElement(By.id("au.gov.ato.mygovid.droid.integration:id/accordionHeader")).click();
	//	}
		
	//	locatorElement.click();
	}
	
	public void expandDocumentList(AppiumDriver driver,MobileElement locator) {
		if(!isElementDisplayed( locator, 1)) {
			waitforElement(2, locator);
			driver.findElement(By.id("au.gov.ato.mygovid.droid.integration:id/accordionHeader")).click();
		}
	}
	
	

	public DashboardPage getDashBoardPage() {
		return dashBoardPage;
	}

	public void setDashBoardPage(DashboardPage dashBoardPage) {
		this.dashBoardPage = dashBoardPage;
	}

	public MobileElement getBackButton() {
		return backButton;
	}

	public void setBackButton(MobileElement backButton) {
		this.backButton = backButton;
	}
	


	
}
