package com.choucair.formacion.steps;

import com.choucair.formacion.pageobjects.MenuPlanetPage;

import net.thucydides.core.annotations.Step;

public class MenuPlanetSteps {

	MenuPlanetPage menuPlanetPage;
	@Step
	public void Ingresar_a_pantalla_encuentrame_empleados() {
		menuPlanetPage.menuEncuentrame();
		menuPlanetPage.submenuEmpleados();
	}
	@Step
	public void Ingresar_a_pantalla_encuentrame_empresas() {
		menuPlanetPage.menuEncuentrame();
		menuPlanetPage.submenuEmpresas();
	}
}
