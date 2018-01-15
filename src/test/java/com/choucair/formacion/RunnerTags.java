package com.choucair.formacion;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
//@CucumberOptions (features = "src/test/resources/features/", tags = "@SmokeTest")
//@CucumberOptions (features = "src/test/resources/features/Planet/Busqueda/BusquedaEmpleado.feature", tags = "@Critico")
//@CucumberOptions (features = "src/test/resources/features/Planet/Busqueda/BusquedaEmpleado.feature", tags = "@RutaCritica")
//@CucumberOptions (features = "src/test/resources/features/ColorLib/Forms/PopupValidation.feature", tags = "@CasoAlterno")
//@CucumberOptions (features = "src/test/resources/features/ColorLib/Forms/PopupValidation.feature", tags = "@CargarDatos")
@CucumberOptions (features = "src/test/resources/features/ColorLib/Forms/PopupValidation.feature", tags = "@Myextra")
public class RunnerTags {

}
