package com.Appium.AppiumDemo;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class AppiumBasicNativeApp extends AppiumBase {

	public static void main(String[] args) throws MalformedURLException {
		
		AndroidDriver<AndroidElement> adriver = AndroidCapabilities();
		adriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		/* TestCase --> Open App -> Click Preferences -> Click Preference dependencies -> 
			Select Wifi Checkbox -> Validate Wifi Settings gets enabled -> Click on wifi settings ->
			Enter text and select OK    
		*/
		//xpath = //tagname[@attribute='value'] -> In appium tagname = Classname
		
		//Click Preferences
		adriver.findElementByXPath("//android.widget.TextView[@text='Preference']").click();
		
		//Click Preference dependencies
		adriver.findElementByXPath("//android.widget.TextView[@text='3. Preference dependencies']").click();
		
		//Select Wifi Checkbox
		adriver.findElementByClassName("android.widget.CheckBox").click();
		
		//Click on wifi settings
		adriver.findElementByXPath("(//android.widget.RelativeLayout)[2]").click();
		
		//Enter text and select OK
		adriver.findElementById("android:id/edit").sendKeys("Tirtha Wifi");
		adriver.findElementsByClassName("android.widget.Button").get(1).click();
		
		
	
	}

}
