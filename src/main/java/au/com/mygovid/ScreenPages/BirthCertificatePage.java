package au.com.mygovid.ScreenPages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class BirthCertificatePage extends BasePageObject{

	public BirthCertificatePage(AppiumDriver driver) throws IOException {
		super(driver);
		// TODO Auto-generated constructor stub
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	@AndroidFindBy(id = "au.gov.ato.mygovid.droid.integration:id/stateTitle")
	private MobileElement birthCertificateStateTitle;
	
	@AndroidFindBy(id = "au.gov.ato.mygovid.droid.integration:id/dateOfBirthTitle")
	private MobileElement birthCertificateDobTitle;
	
	@AndroidFindBy(id="android:id/text1")
	private MobileElement birthCertificateStateDropBox;

	public MobileElement getBirthCertificateStateTitle() {
		return birthCertificateStateTitle;
	}

	public void setBirthCertificateStateTitle(MobileElement birthCertificateStateTitle) {
		this.birthCertificateStateTitle = birthCertificateStateTitle;
	}

	public MobileElement getBirthCertificateDobTitle() {
		return birthCertificateDobTitle;
	}

	public void setBirthCertificateDobTitle(MobileElement birthCertificateDobTitle) {
		this.birthCertificateDobTitle = birthCertificateDobTitle;
	}

	public MobileElement getBirthCertificateStateDropBox() {
		return birthCertificateStateDropBox;
	}

	public void setBirthCertificateStateDropBox(MobileElement birthCertificateStateDropBox) {
		this.birthCertificateStateDropBox = birthCertificateStateDropBox;
	}
	
	public void selectTheStateForBirthCertificate(String state) {
		switch (state) {
		case("ACT"):
			driver.findElement(By.xpath("//android.widget.LinearLayout[@index='1']")).click();
		break;
		case("NSW"):
			driver.findElement(By.xpath("//android.widget.LinearLayout[@index='2']")).click();
		break;
		case("NT"):
			driver.findElement(By.xpath("//android.widget.LinearLayout[@index='3']")).click();
		break;
		case("QLD"):
			driver.findElement(By.xpath("//android.widget.LinearLayout[@index='4']")).click();
		break;
		case("SA"):
			driver.findElement(By.xpath("//android.widget.LinearLayout[@index='5']")).click();
		break;
		case("TAS"):
			driver.findElement(By.xpath("//android.widget.LinearLayout[@index='6']")).click();
		break;
		case("VIC"):
			driver.findElement(By.xpath("//android.widget.LinearLayout[@index='7']")).click();
		break;
		case("WA"):
			driver.findElement(By.xpath("//android.widget.LinearLayout[@index='8']")).click();
		break;
		}
	}
}
