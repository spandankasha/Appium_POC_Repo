package com.ml.lifework.ios.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class iOSUtils {
    public static WebDriver driver;

    public WebDriver fnLaunchAppium () throws  MalformedURLException{
        File app = new File("/Users/apple/Downloads");

        // TODO Auto-generated method stub
        //Set up desired capabilities and pass the Android app-activity and app-package to Appium

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("automationName", "XCUITest");
        capabilities.setCapability("platformName", "iOS");
        capabilities.setCapability("app", "/Users/apple/Downloads/WorkAngel.app");
        capabilities.setCapability("deviceName", "iPhone Simulator");
        capabilities.setCapability("platformVersion", "12.0");

        driver = new RemoteWebDriver(new URL("http://0.0.0.0:4723/wd/hub"), capabilities);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        return  driver;
    }
}
