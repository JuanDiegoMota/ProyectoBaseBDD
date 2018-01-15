package com.choucair.formacion.pageobjects;

import org.openqa.selenium.support.ui.Select;

import net.serenitybdd.core.pages.PageObject;

import net.serenitybdd.core.annotations.findby.By;


public class BusquedaEmpleadoPage extends PageObject{

	public void selectAnalistasPrueba() {
		// TODO Auto-generated method stub
		new Select(find(By.name("cargo"))).selectByVisibleText("Analista de Pruebas");
	}

	public void clickBuscar() {
		// TODO Auto-generated method stub
		find(By.linkText("Buscar")).click();
	}

	public void verificarResultados() {
		// TODO Auto-generated method stub
		
	}

	public void selectAutomatizadores() {
		// TODO Auto-generated method stub
		new Select(find(By.name("cargo"))).selectByVisibleText("Automatizador");
	}

}
