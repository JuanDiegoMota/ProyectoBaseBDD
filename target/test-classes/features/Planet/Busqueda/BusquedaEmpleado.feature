@Critico
Feature: Búsqueda Empleado
	I want to use this template for my feature file

@SmokeTest
Scenario: Buscar Analistas de Prueba
Given me logueo al aplicativo planet como "wmedinan" con pass "Medellin123+"
And navego hasta la pantalla busqueda de empleados 
When filtrar los analistas de prueba
Then se enlista todos los resultados

@RutaCritica
Scenario: Buscar Automatizadores
Given me logueo al aplicativo planet como "wmedinan" con pass "Medellin123+"
And navego hasta la pantalla busqueda de empleados 
When filtrar los Automatizadores
Then se enlista todos los resultados

