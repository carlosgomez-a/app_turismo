package controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
	
	public Connection conectarBD() {
		//Crear e inicializar un objeto de la clase connection 
		
		Connection connection = null;
		try {
			//String de conexión
			connection = DriverManager.getConnection ("jdbc:mysql://localhost:3307/bd_turismo", "root",   "2556229");
			System.out.println("Connected With the database successfully");
		}
		catch (SQLException e) {
			//System.out.println("Error while connecting to the database");
			System.out.println("Error" +e.getMessage());
		}
		return connection; 
	}
	

}
