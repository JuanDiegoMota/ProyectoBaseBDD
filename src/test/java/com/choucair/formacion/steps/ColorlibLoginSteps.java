package com.choucair.formacion.steps;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;

import com.choucair.formacion.pageobjects.ColorlibLoginPage;

import net.thucydides.core.annotations.Step;

public class ColorlibLoginSteps {
	
	ColorlibLoginPage colorlibLoginPage;
	
	@Step
	public void login_colorlib(String strUsuario, String strPass) {
		colorlibLoginPage.open();	
		IngresarDatos(strUsuario, strPass);		
		
//		loginPlanetPage.txtUsuario.sendKeys(strUsuario);		
//		loginPlanetPage.inputUsuario(strUsuario);
//		loginPlanetPage.inputPass(strPass);
//		loginPlanetPage.clickIngresar();
		
//		loginPlanetPage.txtUsuario.click();
//		loginPlanetPage.txtUsuario.sendKeys(strUsuario);	
	}
	
	public void IngresarDatos(String strUsuario, String strPass){
		colorlibLoginPage.txtUsername.sendKeys(strUsuario);
		colorlibLoginPage.txtPassword.sendKeys(strPass);
		colorlibLoginPage.btnSignIn.click();		
	}
	
	public void VerificaHome(String labelv){
		String strMensaje = colorlibLoginPage.lblHomePpal.getText();
		assertThat(strMensaje, containsString(labelv));
	}
		
}


