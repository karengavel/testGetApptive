package com.qaminds.testget_apptive;

import static org.testng.AssertJUnit.assertTrue;

import org.testng.annotations.Test;

import com.qaminds.pages.IntroductionPage;

public class IntroductionTest extends BaseTest {

	@Test()
	public void validationTest() {
		System.out.println("muestrame que sirves" +getProperty("getApptive"));
		System.out.println("Se hace una prueba .."+myDriver);
		IntroductionPage introductionPage = new IntroductionPage(myDriver);
		assertTrue(introductionPage.getTitleIntroduction());
	    introductionPage.siguiente();  
	    introductionPage.siguiente();
	    introductionPage.siguiente();
	}

}
