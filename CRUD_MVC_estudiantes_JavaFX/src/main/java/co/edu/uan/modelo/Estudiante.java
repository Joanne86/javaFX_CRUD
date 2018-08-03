package co.edu.uan.modelo;

import java.sql.Date;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Estudiante {
	private StringProperty codigo;
	private StringProperty nombre;
	private StringProperty genero;
	private IntegerProperty edad;
	private Date fechaIngreso;
	private StringProperty carrera;
	
	public Estudiante (String codigo, String nombre, String genero, int edad, Date fechaIngreso, String carrera) {
		this.codigo = new SimpleStringProperty(codigo);
		this.nombre = new SimpleStringProperty(nombre);
		this.genero = new SimpleStringProperty(genero);
		this.edad = new SimpleIntegerProperty(edad);
		this.fechaIngreso= fechaIngreso;
		this.carrera = new SimpleStringProperty(carrera);
	}

	public StringProperty getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = new SimpleStringProperty(codigo);
	}

	public StringProperty getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = new SimpleStringProperty(nombre);
	}

	public StringProperty getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = new SimpleStringProperty(genero);
	}

	public IntegerProperty getEdad() {
		return edad;
	}

	public void setEdad(Integer edad) {
		this.edad = new SimpleIntegerProperty(edad);
	}

	public Date getFechaIngreso() {
		return fechaIngreso;
	}

	public void setFechaIngreso(Date fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}

	public StringProperty getCarrera() {
		return carrera;
	}

	public void setCarrera(String carrera) {
		this.carrera = new SimpleStringProperty(carrera);
	}
	
	
	
}
