#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: Verificar modularmente las validaciones de la pantalla de Validation Popup
  I want to use this template for my feature file

  #	Background: Ingreso a ColorLib
  #    Given Autenticar ColorLib
  #    | usuario		|	clave				|
  #		| sicotest	| admin2017		|
  #And Cargar Datos Prueba
  #    | Required	|	Select		|Url											|
  #		| Valor1		| Golf			|www.choucairtesting.com	|
  @RutaCritica
  Scenario: Autenticar en metis
    Given Autenticar con usuario "demo" y clave "demo"
    And Verificar en Home el label "Bootstrap-Admin-Template"
    And Ingresar Formulario Forms Validation
    And Diligenciar Fomulario Popup Validation
    Then Verificar mensaje de validacion
  @CasoAlterno
  Scenario: Autenticar en metis con datos en tabla
    Given Autenticar ColorLib
      | usuario  | clave     |
      | sicotest | admin2017 |
    And Verificar en Home el label "Bootstrap-Admin-Template"
#    And Ingresar Formulario Forms Validation
    When Diligenciar Fomulario Popup Validation con tabla
      | Required | Select | Url                     |Email					|Password1|Password2|MinSize|
      | Valor1   | Golf   | www.valor1.com 					|valor1@mail.com|valor1		|valor1		|123456	|
      | Valor2   | Tennis	| www.valor2.com 					|valor2@mail.com|Valor2		|Valor2		|789012	|   
    Then Verificar mensaje de validacion
  @CargarDatos
  Scenario: Demo para probar el cargue del datadriven en Excel
  Given Cargar Datos "src/test/resources/Datadriven/APP_SuraLogueo.xls"

  @Myextra
  Scenario: Ejecutar MyExtra
    Given Inicio MyExtra "C:\Users\reramos\Desktop\CALIDAD_NEW.EDP" 
    And Autenticar MyExtra "CJAVA" y clave "TESTER"