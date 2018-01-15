package com.choucair.formacion.steps;

import java.util.List;

import com.choucair.formacion.pageobjects.ColorlibFormValidationPage;
import com.choucair.formacion.pageobjects.ColorlibMenuPage;

import net.serenitybdd.core.annotations.findby.By;
import net.thucydides.core.annotations.Step;

public class ColorlibFormValidationSteps {

	ColorlibFormValidationPage colorlibFormValidationPage;
	ColorlibMenuPage colorlibMenuPage;
	
	@Step
	public void diligenciar_popup() {
		colorlibMenuPage.menuFormValidation();
		
		String strRequired, strUrl, strSport;
		strRequired = "Demo Required";
		strUrl = "http://www.google.com";
		strSport = "Football";
		
//Ingresar texto en campo Required		
		colorlibFormValidationPage.txtRequired.sendKeys(strRequired);
//Seleccionar un item de un combobox		
		colorlibFormValidationPage.cmbSport1.selectByVisibleText(strSport);
//Ingresar la url		
		colorlibFormValidationPage.txtUrl.sendKeys(strUrl);			
	}	
	@Step
	public void diligenciar_popup_datos(String[] datosP) {
		colorlibMenuPage.menuFormValidation();
		
		String strRequired, strUrl, strSport;
		strRequired = datosP[0];
		strUrl = datosP[2];
		strSport = datosP[1];
		
		//		Ingresar texto en campo Required		
		colorlibFormValidationPage.txtRequired.sendKeys(strRequired);
		//Seleccionar un item de un combobox		
		colorlibFormValidationPage.cmbSport1.selectByVisibleText(strSport);
		//Ingresar la url		
		colorlibFormValidationPage.txtUrl.sendKeys(strUrl);			
	}
	@Step
	public void diligenciar_popup_datos_tabla(List<List<String>> data, int id) {
	//Ingresar al menu Forms Validation
			colorlibMenuPage.menuFormValidation();
		
		//List<List<String>> datosP = data;
		
		String strRequired, strUrl, strSport;
		strRequired = data.get(id).get(0).trim();
		strRequired = data.get(id).get(0).trim();
		strSport = data.get(id).get(1).trim();
		strUrl = data.get(id).get(2).trim();
			
//Ingresar texto en campo Required		
		colorlibFormValidationPage.txtRequired.sendKeys(strRequired);
//Seleccionar un item de un combobox		
		colorlibFormValidationPage.cmbSport1.selectByVisibleText(strSport);
//Ingresar la url	
		colorlibFormValidationPage.txtUrl.click();
		colorlibFormValidationPage.txtUrl.clear();
		colorlibFormValidationPage.txtUrl.sendKeys(strUrl);
//Campo email		
		colorlibFormValidationPage.txtEmail1.click();
		colorlibFormValidationPage.txtEmail1.clear();
		colorlibFormValidationPage.txtEmail1.sendKeys(data.get(id).get(3).trim());
//Campo Password 1		
		colorlibFormValidationPage.txtPass1.click();
		colorlibFormValidationPage.txtPass1.clear();
		colorlibFormValidationPage.txtPass1.sendKeys(data.get(id).get(4).trim());		
//Campo Password 2		
		colorlibFormValidationPage.txtPass2.click();
		colorlibFormValidationPage.txtPass2.clear();
		colorlibFormValidationPage.txtPass2.sendKeys(data.get(id).get(5).trim());
//Campo MinSize		
		colorlibFormValidationPage.txtMinsize1.click();
		colorlibFormValidationPage.txtMinsize1.clear();
		colorlibFormValidationPage.txtMinsize1.sendKeys(data.get(id).get(6).trim());		
	}	
}
