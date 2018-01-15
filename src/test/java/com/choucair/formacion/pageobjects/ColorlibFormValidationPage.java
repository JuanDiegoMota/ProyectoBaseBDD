package com.choucair.formacion.pageobjects;

import org.openqa.selenium.WebElement;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class ColorlibFormValidationPage extends PageObject{

//Campo Required	
	@FindBy(xpath="//*[@id='req']")
	public WebElement txtRequired;
//Campo Seleccion de deporte 1		
	@FindBy(xpath="//*[@id='sport']")
	public WebElementFacade cmbSport1;
//Campo Url	
	@FindBy(xpath="//*[@id='url1']")
	public WebElement txtUrl;
//Campo Email	
	@FindBy(id="email1")
	public WebElement txtEmail1;
//Campo Password1
	@FindBy(id="pass1")
	public WebElement txtPass1;	
//Campo Password2
	@FindBy(id="pass2")
	public WebElement txtPass2;
//Campo Minsize	
	@FindBy(id="minsize1")
	public WebElement txtMinsize1;	
//Globo error	
	@FindBy(id="popup-validation")	
	public WebElement GloboError;	
}
