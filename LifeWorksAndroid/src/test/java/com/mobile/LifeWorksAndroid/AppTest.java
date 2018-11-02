package com.mobile.LifeWorksAndroid;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

public class AppTest 
{
	public static AppiumDriver<WebElement> driver;
	public static DesiredCapabilities cap;
	
	public static void Android_LaunchApp() throws MalformedURLException {
		cap = new DesiredCapabilities();
		cap.setCapability("platformName", "Android");
		cap.setCapability("platformVersion", "8.1.0");
		cap.setCapability("deviceName", "Nexus");
		cap.setCapability("app", "/Users/spandan/LifeWorksProject/Automation/wa-automation/android.4.23.apk");
		cap.setCapability("appPackage", "com.wam.android.beta");
		cap.setCapability("appWaitActivity", "com.wam.android.login.PreLoginActivity");
		driver = new AndroidDriver<WebElement>(new URL("http://127.0.0.1:4723/wd/hub"), cap);
		Assert.assertNotNull(driver);
	}
	
	public static void CloseApp() {
		driver.quit();
	}
}