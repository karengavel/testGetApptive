package com.qaminds.pages;


import org.openqa.selenium.By;

import com.qaminds.coreappium.MyDriverAppium;

import io.appium.java_client.android.AndroidElement;

public class IntroductionPage extends BasePage{

	public IntroductionPage(MyDriverAppium myDriver) {
		super(myDriver);
		// TODO Auto-generated constructor stub
	}
	
	/*private final String titulo = "com.tekiti.getapptive:id/section_label";
	private final String next = "com.tekiti.getapptive:id/intro_btn_next";
	
	
	@FindBy (id = titulo)
	public 	WebElement tituloMostrado;
	
	@FindBy(id = next)
	public WebElement nextBtn;
	*/

	public final String titleIntroductionId = "section_label";
	
	public boolean getTitleIntroduction() {
		System.out.println("llegas al método"+titleIntroductionId);
		AndroidElement titleIntroduction = getDriver().findElementById(titleIntroductionId);
		System.out.println("Entro al método"+titleIntroductionId);
		return titleIntroduction.isDisplayed();
	}
	
	public void siguiente() {
		super.waitVisibility(By.id("intro_btn_next"));
		AndroidElement nextBtn = getDriver().findElementById("intro_btn_next");
		nextBtn.click();
	}
	
	


}
