package com.qaminds.testget_apptive;

import java.util.ResourceBundle;

import org.testng.annotations.AfterSuite;
//import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeTest;
import org.testng.log4testng.Logger;


import com.qaminds.coreappium.MyDriverAppium;

public class BaseTest {

	Logger log = Logger.getLogger(BaseTest.class);
	MyDriverAppium myDriver = new MyDriverAppium();

	
	private ResourceBundle resource = ResourceBundle.getBundle("propertiesConfig");
	@BeforeTest(alwaysRun = true)
	public void BeforeSuite() {
		try {
			myDriver.setUpAppiumDriver();
		} catch (Exception e) {
			log.error("error BaseTest.beforeSuite()", e);
		}
	}

 	@AfterSuite
	public void afterTest() {
		myDriver.getDriver().quit();
	}
 	
 	public String getProperty (String key) {
 		return resource.getString(key);
 	}
}
