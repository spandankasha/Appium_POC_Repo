package com.ml.lifework.ios.commonfunctions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CommonFunctions {


    WebDriver driver;

    public CommonFunctions(WebDriver driver){
        this.driver=driver;
    }


    public void fnLogin(){

        driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\'Log in\']")).click();
        driver.findElement(By.xpath("//*[@value='Email address or Username']")).sendKeys("lifeworkstesting+uk@workivate.com");
        driver.findElement(By.xpath("//*[@name='Continue']")).click();
        driver.findElement(By.xpath("//*[@value='Password']")).sendKeys("testtest456!");
        driver.findElement(By.xpath("//*[@name='Log In']")).click();
    }

}
