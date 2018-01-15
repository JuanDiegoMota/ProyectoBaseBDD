package com.choucair.formacion.steps;

import com.choucair.formacion.pageobjects.BusquedaEmpleadoPage;

import net.thucydides.core.annotations.Step;

public class BusquedaEmpleadoSteps {

	BusquedaEmpleadoPage busquedaEmpleadoPage;
	
	
	/*public void Abrir_Página() {
		// TODO Auto-generated method stub
		busquedaEmpleadoPage.open();
	}
*/  
	@Step
	public void filtrar_los_analistas_de_prueba() {
		// TODO Auto-generated method stub
		busquedaEmpleadoPage.selectAnalistasPrueba();
		busquedaEmpleadoPage.clickBuscar();
	}
	@Step
	public void se_enlista_todos_los_resultados() {
		// TODO Auto-generated method stub
		busquedaEmpleadoPage.verificarResultados();
	}
	@Step
	public void filtrar_los_Automatizadores() {
		// TODO Auto-generated method stub
		busquedaEmpleadoPage.selectAutomatizadores();
		busquedaEmpleadoPage.clickBuscar();
	}

}
