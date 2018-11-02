
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AppiumLauncher {
    static WebDriver driver;

    public static void main(String[] args) throws MalformedURLException {
        File app= new File("/Users/apple/Downloads");
        // TODO Auto-generated method stub


        //Set up desired capabilities and pass the Android app-activity and app-package to Appium

        DesiredCapabilities capabilities = new DesiredCapabilities();

        capabilities.setCapability("automationName", "XCUITest");
        capabilities.setCapability("platformName","iOS");
        capabilities.setCapability("app","/Users/apple/Downloads/WorkAngel.app");
        capabilities.setCapability("deviceName","iPhone Simulator");
        capabilities.setCapability("platformVersion","12.0");

        driver = new RemoteWebDriver(new URL("http://0.0.0.0:4723/wd/hub"), capabilities);

     //   WebDriverWait wait = new WebDriverWait(driver,30);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);


      //  wait.until(ExpectedConditions.presenceOfElementLocated(locator));

        driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\'Log in\']")).click();
      //  driver.findElement(By.name("Log in")).click();


    }

}