package com.choucair.formacion.pageobjects;


import net.serenitybdd.core.pages.PageObject;

public class MenuPlanetPage extends PageObject{
	
	public void menuEncuentrame() {
		findBy("//*[@id=\"patternSideBarContents\"]/span[7]/a").click();
	}
	
	public void submenuEmpleados() {
		findBy("//*[@id=\"patternMainContents\"]/div[3]/div[1]/ul/li[1]/a").click();
	}
	
	public void submenuEmpresas() {
		findBy("//*[@id=\"patternMainContents\"]/div[3]/div[1]/ul/li[2]/a").click();
		
	}
}
