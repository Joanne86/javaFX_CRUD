package co.edu.uan.modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;



public class Conexion {
    private final String user = DbPropertiesReader.getString("db.user");
    private static String password =  DbPropertiesReader.getString("db.password");
    private final String url = DbPropertiesReader.getString("db.url");
    
    private Connection connection =null;
    
    public Connection getConnection() {
		return connection; // hola he hecho un cambio aqui
	}

	public void setConnection(Connection connection) {
		this.connection = connection;
	}

    
    public Connection establecerConexion() {
        
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(url, user, password);
            
        } catch (SQLException ex) {
            System.err.println(ex);
        }
        catch (ClassNotFoundException ex) {
                
            }
        return connection;
        
    }
    
    public void cerrarConexion() {
		try {
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}


}
