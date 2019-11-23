package com.qaminds.testget_apptive;

import static org.testng.AssertJUnit.assertTrue;

import org.testng.annotations.Test;

import com.qaminds.pages.IntroductionPage;

public class IntroductionTest extends BaseTest {

	@Test(groups = {"group1"})
	public void validationTestIntroduction1() {
		IntroductionPage introductionPage = new IntroductionPage(myDriver);
		assertTrue(introductionPage.getTitleIntroduction());
	    introductionPage.siguiente(); 
	}
	
	@Test(groups = {"group2"})
	public void validationTestIntroduction2() {
		IntroductionPage introductionPage = new IntroductionPage(myDriver);
		assertTrue(introductionPage.getTitleIntroduction());
	    introductionPage.siguiente();
	}
	
	@Test(groups = {"group3"})
	public void validationTestIntroduction3() {
		IntroductionPage introductionPage = new IntroductionPage(myDriver);
		assertTrue(introductionPage.getTitleIntroduction());
	    introductionPage.siguiente();
	}

	@Test(groups = {"group4"})
	public void validationTestIntroduction4() {
		IntroductionPage introductionPage = new IntroductionPage(myDriver);
		assertTrue(introductionPage.getTitleIntroduction());
		introductionPage.finalizar();
	}
}
