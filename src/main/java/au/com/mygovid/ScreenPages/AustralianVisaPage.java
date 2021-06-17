package au.com.mygovid.ScreenPages;

import java.io.IOException;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class AustralianVisaPage extends BasePageObject{

	public AustralianVisaPage(AppiumDriver driver) throws IOException {
		super(driver);
		// TODO Auto-generated constructor stub
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	
	
}
