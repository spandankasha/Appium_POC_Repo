package com.ml.lifework.ios.driverscript;

import com.ml.lifework.ios.commonfunctions.CommonFunctions;
import com.ml.lifework.ios.utils.iOSUtils;

import java.net.MalformedURLException;


public class DriverScript {


    public static void main(String[] args) throws MalformedURLException {

        iOSUtils objUtil =new iOSUtils();

        CommonFunctions objCommon=new CommonFunctions(objUtil.fnLaunchAppium());

        objCommon.fnLogin();

    }


}


