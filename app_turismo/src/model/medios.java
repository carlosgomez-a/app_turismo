package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

import controller.Conexion;

public class medios {
	
	public int idmedios = 0;
	public String nombre = "";
	public String observacion = "";
	public int idtiposmedios = 0;
	public medios(int idmedios, String nombre, String observacion, int idtiposmedios) {
		super();
		this.idmedios = idmedios;
		this.nombre = nombre;
		this.observacion = observacion;
		this.idtiposmedios = idtiposmedios;
	}
	
	



	public medios() {
		super();
	}





	public int getIdmedios() {
		return idmedios;
	}
	public void setIdmedios(int idmedios) {
		this.idmedios = idmedios;
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
	public int getIdtiposmedios() {
		return idtiposmedios;
	}
	public void setIdtiposmedios(int idtiposmedios) {
		this.idtiposmedios = idtiposmedios;
	}

	Conexion conector = new Conexion();
	
	public void Create(String nombre, String observacion, int idtiposmedios) {
		Connection dbConnection = null;
		PreparedStatement pst = null; // preparar la trx (transacción)
		
		String script = "INSERT INTO tblmedios (nombre, observacion, idtiposmedios) values (?,?,?)";
		
		try {
			dbConnection = conector.conectarBD(); // Abrir la conexión 
			pst = dbConnection.prepareStatement(script); //Abrir el Buffer
			
			//Parametizar los campos 
			pst.setString(1, nombre);
			pst.setString(2, observacion);
			pst.setInt(3, idtiposmedios);
			
			//Ejecutar la trx (transacción)
			pst.executeUpdate();
			JOptionPane.showConfirmDialog(null, "Registro con exito. ");
			
			
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		
	}

	public void delete( int idmedios) {
		Connection dbConnection = null;
		PreparedStatement pst = null; // preparar la trx (transacción)
		
		String script = "DELETE FROM tblmedios WHERE idmedios = ?";
		
		try {
			dbConnection = conector.conectarBD(); // Abrir la conexión 
			pst = dbConnection.prepareStatement(script); //Abrir el Buffer
			
			//Parametizar los campos 
			pst.setInt(1, idmedios);
			
			//Confirmar la operacion
			int respuesta = JOptionPane.showConfirmDialog(null, "¿Desea eliminar el registro No. " + idmedios + "?");
			
			if (respuesta == JOptionPane.OK_OPTION) {
				
				//Ejecutar la trx
				pst.executeUpdate();
				JOptionPane.showConfirmDialog(null, "Resgistro No. " + idmedios + "eliminado");
				
			}
			
			
			
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		
	}
	//Consultar todos los registros de la tabla tipo medios
			public void readOne( int idmedios, JTextField nombre, JTextField observacion, JTextField idtiposmedios) {
				Connection dbConnection = null;
				PreparedStatement pst = null; // preparar la trx (transacción)
				
				String script = "SELECT * FROM tblmedios WHERE idmedios = ?";
				
				try {
					dbConnection = conector.conectarBD(); // Abrir la conexión 
					pst = dbConnection.prepareStatement(script); //Abrir el Buffer
					
					//Parametizar los campos 
					pst.setInt(1, idmedios);
					ResultSet rs = pst.executeQuery();//almacenamiento temporal
					
					
					while (rs.next()) {
						nombre.setText(rs.getString(2));;
						observacion.setText(rs.getString(3));;
						idtiposmedios.setText(rs.getString(4));;
						
					}
					
				
				} catch (SQLException e) {
					System.out.println(e.getMessage());
				}
				
			}
			
			public void Update( int idmedios, String nombre, String observacion, int idtiposmedios ) {
				Connection dbConnection = null;
				PreparedStatement pst = null; // preparar la trx (transacción)
				
				String script = "UPDATE tblmedios SET nombre = ?, observacion = ?, idtiposmedios = ?  WHERE idmedios = ? ";
				
				try {
					dbConnection = conector.conectarBD(); // Abrir la conexión 
					pst = dbConnection.prepareStatement(script); //Abrir el Buffer
					
					//Parametizar los campos 
					pst.setString(1, nombre);
					pst.setString(2, observacion);
					pst.setInt(3, idtiposmedios);
					pst.setInt(4, idmedios);
					
					
					
					
					//Confirmar la operacion
					int respuesta = JOptionPane.showConfirmDialog(null, "¿Desea actualizar el registro No. " + idmedios + "?");
					
					if (respuesta == JOptionPane.YES_OPTION) {
						
						//Ejecutar la trx
						pst.executeUpdate();
						JOptionPane.showConfirmDialog(null, "Resgistro No. " + idmedios + "actualizado");	
					}
				
					
				} catch (SQLException e) {
					System.out.println(e.getMessage());
				}
				
			}
}
