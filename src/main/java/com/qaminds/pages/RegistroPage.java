package com.qaminds.pages;


import java.util.List;

import org.openqa.selenium.By;

import com.qaminds.coreappium.MyDriverAppium;

import io.appium.java_client.android.AndroidElement;

public class RegistroPage extends BasePage{

	public RegistroPage(MyDriverAppium myDriver) {
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

	
	public void ingresarNombre() {
		waitVisibility(By.id("com.tekiti.getapptive:id/input_name"));
		AndroidElement name = getDriver().findElementById("com.tekiti.getapptive:id/input_name");
		name.click();
		name.sendKeys("Karen");
	}
	
	public void ingresarEstatura() {
		waitVisibility(By.id("com.tekiti.getapptive:id/input_height"));
		AndroidElement estatura = getDriver().findElementById("com.tekiti.getapptive:id/input_height");
		estatura.click();
		estatura.sendKeys("1.66");
	}
	
	public void ingresarPeso() {
		waitVisibility(By.id("com.tekiti.getapptive:id/input_weight"));
		AndroidElement peso = getDriver().findElementById("com.tekiti.getapptive:id/input_weight");
		peso.click();
		peso.sendKeys("70");
	}
	
	public void ingresarSexo() {
		waitVisibility(By.id("com.tekiti.getapptive:id/input_sex"));
		AndroidElement sexo = getDriver().findElementById("com.tekiti.getapptive:id/input_sex");
		sexo.click();
		waitVisibility(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView[2]"));
		AndroidElement femenino = getDriver().findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView[2]");
		femenino.click();
	}
	
	public void sexosinxpath() {
		waitVisibility(By.id("input_sex"));
		AndroidElement sexo = getDriver().findElementById("input_sex");
		sexo.click();
		List<AndroidElement> inputSex = getDriver().findElementsById("input_sex");
        for (AndroidElement element : inputSex) {
        	if(element.getText().equals("Female")) {
        		element.click();
        	}
        }
	}
	
	public void ingresarEdad() {
		waitVisibility(By.id("com.tekiti.getapptive:id/input_age"));
		AndroidElement edad = getDriver().findElementById("com.tekiti.getapptive:id/input_age");
		edad.click();
		waitVisibility(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView[7]"));
		AndroidElement anios = getDriver().findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView[7]");
		anios.click();
	}
	
	public void ingresarObjetivo() {
		waitVisibility(By.id("com.tekiti.getapptive:id/input_goal"));
		AndroidElement objetivo = getDriver().findElementById("com.tekiti.getapptive:id/input_goal");
		objetivo.click();
		waitVisibility(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView[3]"));
		AndroidElement dias = getDriver().findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView[3]");
		dias.click();
	}
	
	public void registrar() {
		waitVisibility(By.id("com.tekiti.getapptive:id/save_button"));
		AndroidElement registrar = getDriver().findElementById("com.tekiti.getapptive:id/save_button");
		registrar.click();
	}
	
	

}
