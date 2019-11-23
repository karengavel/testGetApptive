package com.qaminds.testget_apptive;

import static org.testng.AssertJUnit.assertTrue;

import org.testng.annotations.Test;

import com.qaminds.pages.RegistroPage;


public class RegistroTest extends BaseTest {
	@Test()
	public void validationTest() {
		System.out.println("Se hace prueba de registro"+myDriver);
		RegistroPage registroPage = new RegistroPage(myDriver);
        registroPage.ingresarNombre();
        registroPage.ingresarEstatura();
        registroPage.ingresarPeso();
        registroPage.ingresarSexo();
        //registroPage.sexosinxpath();
        registroPage.ingresarEdad();
        registroPage.ingresarObjetivo();
        registroPage.registrar();
	}
}
