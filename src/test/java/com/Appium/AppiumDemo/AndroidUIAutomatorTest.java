package com.Appium.AppiumDemo;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class AndroidUIAutomatorTest extends AppiumBase {

	public static void main(String[] args) throws MalformedURLException {

		AndroidDriver<AndroidElement> adriver = AndroidCapabilities();
		adriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		/* Using AndroidUIAutomator -> Click on views -> Click on Animation within views
		 * 
		 */
		//Click on views using adriver.findElement(MobileBy.AndroidUIAutomator("attribute(\"value\")"))
		adriver.findElement(MobileBy.AndroidUIAutomator("text(\"Views\")")).click();
		
		//Click on Animation within views
		adriver.findElement(MobileBy.AndroidUIAutomator("text(\"Animation\")")).click();
		
		//Validate Clickable features for all options
		int clickableField = adriver.findElements(MobileBy.AndroidUIAutomator("new UiSelector().clickable(false)")).size();
		System.out.println("The list of not clickable links are "+clickableField);

	}

}
