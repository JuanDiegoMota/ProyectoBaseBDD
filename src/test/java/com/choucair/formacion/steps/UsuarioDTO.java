package com.choucair.formacion.steps;

import java.io.Serializable;

public class UsuarioDTO {

	/**
	 * Clase UsuarioDTO que contiene todos los atributos de un usuario con sus
	 * respectivos getter and setter
	 */
	private static final long serialVersionUID = 1370979328122585637L;

	private String nombres;
	private String apellidos;
	private String numeroIdentificacion;
	private String celular;
	private String email;

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getNumeroIdentificacion() {
		return numeroIdentificacion;
	}

	public void setNumeroIdentificacion(String numeroIdentificacion) {
		this.numeroIdentificacion = numeroIdentificacion;
	}

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "UsuarioDTO [nombres=" + nombres + ", apellidos=" + apellidos + ", numeroIdentificacion="
				+ numeroIdentificacion + ", celular=" + celular + ", email=" + email + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

}
