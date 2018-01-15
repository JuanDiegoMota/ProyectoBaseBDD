package com.choucair.formacion.definition;

import com.choucair.formacion.pageobjects.MenuPlanetPage;
import com.choucair.formacion.steps.BusquedaEmpleadoSteps;
import com.choucair.formacion.steps.LoginPlanetSteps;
import com.choucair.formacion.steps.MenuPlanetSteps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class BusquedaEmpleadoDefinition {
	
	@Steps
	LoginPlanetSteps loginPlanetSteps;
	
	@Steps
	MenuPlanetSteps menuPlanetSteps;
	
	@Steps
	BusquedaEmpleadoSteps busquedaEmpleadoSteps;
	 

	@Given("^me logueo al aplicativo planet como \"([^\"]*)\" con pass \"([^\"]*)\"$")
	public void me_logueo_al_aplicativo_planet_como_con_pass(String strUsuario, String strPass) throws Throwable {
		loginPlanetSteps.login_planet(strUsuario, strPass);
	}

	@Given("^navego hasta la pantalla busqueda de empleados$")
	public void navego_hasta_la_pantalla_busqueda_de_empleados() throws Throwable {
		menuPlanetSteps.Ingresar_a_pantalla_encuentrame_empleados();
	}

	@When("^filtrar los analistas de prueba$")
	public void filtrar_los_analistas_de_prueba() throws Throwable {
		busquedaEmpleadoSteps.filtrar_los_analistas_de_prueba();
	}

	@Then("^se enlista todos los resultados$")
	public void se_enlista_todos_los_resultados() throws Throwable {
		busquedaEmpleadoSteps.se_enlista_todos_los_resultados();
	}

	@When("^filtrar los Automatizadores$")
	public void filtrar_los_Automatizadores() throws Throwable {
		busquedaEmpleadoSteps.filtrar_los_Automatizadores();
	}

}
