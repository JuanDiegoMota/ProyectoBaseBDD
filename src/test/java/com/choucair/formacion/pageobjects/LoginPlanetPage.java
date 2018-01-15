package com.choucair.formacion.pageobjects;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;


@DefaultUrl("http://planet.choucairtesting.com/bin/login/Main/WebHome?origurl=/")
public class LoginPlanetPage extends PageObject{

	@FindBy(name="username")
	public WebElement txtUsuario;
	@FindBy(name="password")
	public WebElement txtPwd;
	
	
/*
	public void IngresarDatos(String strUsuario, String strPass){
		txtUsuario.sendKeys(strUsuario);
		txtPwd.sendKeys(strPass);
		txtPwd.sendKeys((Keys.ENTER));
	}
*/	
/*
 * 
	public void inputUsuario(String strUsuario) {
		find(By.name("username")).sendKeys(strUsuario);
	}
	
	public void inputPass(String strPass) {
		find(By.name("password")).sendKeys(strPass);
	}

	public void clickIngresar() {
		find(By.name("password")).sendKeys(Keys.ENTER);
	}
*/
}
