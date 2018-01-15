package com.choucair.formacion.pageobjects;

import org.openqa.selenium.WebElement;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;


@DefaultUrl("https://colorlib.com/polygon/metis/login.html")
public class ColorlibLoginPage extends PageObject{

	@FindBy(xpath="//*[@id='login']/form/input[1]")
	public WebElement txtUsername;
	
	@FindBy(xpath="//*[@id='login']/form/input[2]")
	public WebElement txtPassword;
	
	@FindBy(xpath="//*[@id='login']/form/button")
	public WebElement btnSignIn;
	
	@FindBy(xpath="//*[@id='bootstrap-admin-template']")
	public WebElement lblHomePpal;	
}
