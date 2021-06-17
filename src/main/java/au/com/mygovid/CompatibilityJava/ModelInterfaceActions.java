package au.com.mygovid.CompatibilityJava;

import java.io.IOException;
import java.lang.reflect.Method;

import au.com.mygovid.ScreenPages.PageFactory;
import io.appium.java_client.AppiumDriver;

public interface ModelInterfaceActions {

//ToDo-This interface class will be used for reflection to run tests
public class ImodelInterfaceActions {
	public static PageFactory actionKeywords;
	 public static String sActionKeyword;
	 AppiumDriver driver;
 //	 public static Method method[]
	 
	 
	

	 

	 static	 Method	 method[] = actionKeywords.getClass().getMethods();
		
	 
	 
	
		public  void execute_Actions() throws Exception {
			
			 for(int i = 0;i < method.length;i++){
			 if(method[i].getName().equals(sActionKeyword)){
			 
				 method[i].invoke(actionKeywords);
			 //Once any method is executed, this break statement will take the flow outside of for loop
			 break;
			 }
			 }
			 }
	
}
}