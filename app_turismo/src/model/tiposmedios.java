package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import controller.Conexion;

public class tiposmedios {

		public int idtiposmedios = 0;
		public String nombre = "";
		public String observacion = "";
		public tiposmedios(int idtiposmedios, String nombre, String observacion) {
			super();
			this.idtiposmedios = idtiposmedios;
			this.nombre = nombre;
			this.observacion = observacion;
		}
		
		
		
		
		public tiposmedios() {
			super();
		}




		public int getIdtiposmedios() {
			return idtiposmedios;
		}
		public void setIdtiposmedios(int idtiposmedios) {
			this.idtiposmedios = idtiposmedios;
		}
		public String getNombre() {
			return nombre;
		}
		public void setNombre(String nombre) {
			this.nombre = nombre;
		}
		public String getObservacion() {
			return observacion;
		}
		public void setObservacion(String observacion) {
			this.observacion = observacion;
		}
		
		Conexion conector = new Conexion();
		
		public void Create(String nombre, String observacion) {
			Connection dbConnection = null;
			PreparedStatement pst = null; // preparar la trx (transacción)
			
			String script = "INSERT INTO tbltiposmedios (nombre, observacion) values (?,?)";
			
			try {
				dbConnection = conector.conectarBD(); // Abrir la conexión 
				pst = dbConnection.prepareStatement(script); //Abrir el Buffer
				
				//Parametizar los campos 
				pst.setString(1, nombre);
				pst.setString(2, observacion);
				
				//Ejecutar la trx (transacción)
				pst.executeUpdate();
				JOptionPane.showConfirmDialog(null, "Registro con exito. ");
				
				
			} catch (SQLException e) {
				System.out.println(e.getMessage());
			}
			
		}
}
