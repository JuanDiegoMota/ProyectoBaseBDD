package com.choucair.formacion.steps;

import org.openqa.selenium.Keys;

import com.choucair.formacion.pageobjects.LoginPlanetPage;

import net.thucydides.core.annotations.Step;

public class LoginPlanetSteps {

	LoginPlanetPage loginPlanetPage;
	
	@Step
	public void login_planet(String strUsuario, String strPass) {
		loginPlanetPage.open();	
		IngresarDatos(strUsuario, strPass);
		
//		loginPlanetPage.txtUsuario.sendKeys(strUsuario);		
//		loginPlanetPage.inputUsuario(strUsuario);
//		loginPlanetPage.inputPass(strPass);
//		loginPlanetPage.clickIngresar();
		
//		loginPlanetPage.txtUsuario.click();
//		loginPlanetPage.txtUsuario.sendKeys(strUsuario);	
	}
	
	public void IngresarDatos(String strUsuario, String strPass){
		loginPlanetPage.txtUsuario.sendKeys(strUsuario);
		loginPlanetPage.txtPwd.sendKeys(strPass);
		loginPlanetPage.txtPwd.sendKeys((Keys.ENTER));
	}
		
}


