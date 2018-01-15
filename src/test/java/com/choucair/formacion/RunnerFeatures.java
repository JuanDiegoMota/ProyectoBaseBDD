package com.choucair.formacion;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
//@CucumberOptions(features ="src/test/resources/features/")
@CucumberOptions(features ="src/test/resources/features/ColorLib/")
//@CucumberOptions(features ="src/test/resources/features/planet/busqueda/BusquedaEmpleado.feature")
public class RunnerFeatures {

}
