package co.edu.uan.controlador;

import java.net.URL;
import java.sql.Date;
import java.util.ResourceBundle;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXComboBox;
import com.jfoenix.controls.JFXRadioButton;

import co.edu.uan.modelo.Conexion;
import co.edu.uan.modelo.Estudiante;
import co.edu.uan.modelo.EstudianteDAO;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.cell.PropertyValueFactory;





public class CtrlFormulario implements Initializable{

	// Columnas
	@FXML private TableColumn<Estudiante,String> clmnCodigo;
	@FXML private TableColumn<Estudiante,String> clmnNombre;
	@FXML private TableColumn<Estudiante,String> clmnGenero;
	@FXML private TableColumn<Estudiante,Number> clmnEdad;
	@FXML private TableColumn<Estudiante,Date> clmnFechaIngreso;
	@FXML private TableColumn<Estudiante,String> clmnCarrera;
	// controles GUI
	@FXML
	private JFXRadioButton rbMasculino;
	@FXML
	private JFXButton btnNuevo;
	@FXML
	private TextField txtEdad;
	@FXML
	private TextField txtCodigo;
	@FXML
	private JFXButton Borrar;
	@FXML
	private TextField txtNombre;
	@FXML
	private JFXRadioButton rbFemenino;
	@FXML
	private JFXButton btnGuardar;
	@FXML
	private JFXButton btnNuevo1;
	@FXML
	private JFXComboBox<String> cbCarrera;
	@FXML
	private ToggleGroup grupoSexo;
	@FXML
	private DatePicker txtFecha;
	@FXML
	private JFXButton btnActualizar;
	
	@FXML private TableView<Estudiante> tblViewAlumnos;
	
	//colecciones
	private ObservableList<Estudiante> listaEstudiantes;

	private Conexion conexion;

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		conexion = new Conexion();
		conexion.establecerConexion();
		
		//Inicializar listas		
		listaEstudiantes = FXCollections.observableArrayList();
		//Llenar listas
		EstudianteDAO.llenarInformacionAlumnos(conexion.getConnection(), listaEstudiantes);
		//Enlazar listas TableView
		
		tblViewAlumnos.setItems(listaEstudiantes);
		//Enlazar columnas con atributos
		
		clmnCodigo.setCellValueFactory(new PropertyValueFactory<Estudiante,String>("codigo"));
		clmnNombre.setCellValueFactory(new PropertyValueFactory<Estudiante,String>("nombre"));
		clmnGenero.setCellValueFactory(new PropertyValueFactory<Estudiante,String>("genero"));
		clmnEdad.setCellValueFactory(new PropertyValueFactory<Estudiante,Number>("edad"));
		clmnFechaIngreso.setCellValueFactory(new PropertyValueFactory<Estudiante,Date>("fechaIngreso"));
		clmnCarrera.setCellValueFactory(new PropertyValueFactory<Estudiante, String>("carrera"));
	
		gestionarEventos();
		conexion.cerrarConexion();
	
	}
	
	public void gestionarEventos() {
		
	}
}
