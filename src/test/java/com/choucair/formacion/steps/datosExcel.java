package com.choucair.formacion.steps;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class datosExcel {

	/**
	 * Método que se encarga de consultar una lista de casos de prueba para ejecutar
	 * 
	 * @param connection
	 * @return
	 * @throws Exception
	 */
	public ArrayList<UsuarioDTO> listaDatosPrueba(String rutaData) throws Exception {

		String direccionConexion = "jdbc:odbc:Driver={Microsoft Excel Driver (*.xls, *.xlsx, *.xlsm, *.xlsb)};DBQ="
				+ rutaData + ";READONLY=false";

		PreparedStatement preparedStatement = null;
		String sql;
		ResultSet rs = null;
		ArrayList<UsuarioDTO> datosPrueba = new ArrayList<UsuarioDTO>();
		sql = "SELECT * FROM [Global$] WHERE EjecutarCaso = 'S'";
		System.out.println("El SQL es :" + sql);
		Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
		String MyConexion = direccionConexion;
		Connection conexion = DriverManager.getConnection(MyConexion);
		try {
			preparedStatement = conexion.prepareStatement(sql);
			// int index = 1;
			// preparedStatement.setString(index++, "S");
			rs = preparedStatement.executeQuery();
			while (rs.next()) {
				UsuarioDTO usuarioDTO = new UsuarioDTO();

				usuarioDTO.setCelular(rs.getString("Celular"));
				usuarioDTO.setEmail(rs.getString("Email"));
				usuarioDTO.setNumeroIdentificacion(rs.getString("NumeroIdentificacion"));
				datosPrueba.add(usuarioDTO);
				
			}
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		} finally {
			// Garantizo que se cierren los objetos
			conexion.close();
		}
		return datosPrueba;
	}
}
