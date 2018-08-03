package co.edu.uan.modelo;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javafx.collections.ObservableList;

public class EstudianteDAO {
	
	public static void llenarInformacionAlumnos(Connection connection, ObservableList<Estudiante> lista) {
		try {
			Statement instruccion = connection.createStatement();
			ResultSet resultado = instruccion.executeQuery("SELECT * from estudiante");
			while (resultado.next()) {
				lista.add(new Estudiante(resultado.getString("codigo"), resultado.getString("nombre"),
						resultado.getString("genero"), resultado.getInt("edad"), resultado.getDate("fecha"),
						resultado.getString("carrera")));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	
}
