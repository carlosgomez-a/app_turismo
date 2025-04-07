package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

import controller.Conexion;

public class tipotransportes {

	public int idtipotransporte = 0;
	public String nombre = "";
	public String observacion = "";
	public tipotransportes(int idtipotransporte, String nombre, String observacion) {
		super();
		this.idtipotransporte = idtipotransporte;
		this.nombre = nombre;
		this.observacion = observacion;
	}
	 
	
	public tipotransportes() {
		super();
	}


	public int getIdtipotransporte() {
		return idtipotransporte;
	}
	public void setIdtipotransporte(int idtipotransporte) {
		this.idtipotransporte = idtipotransporte;
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
		
		String script = "INSERT INTO tbltipostransportes (nombre, observacion) values (?,?)";
		
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
	
	public void delete( int idtipotransporte) {
		Connection dbConnection = null;
		PreparedStatement pst = null; // preparar la trx (transacción)
		
		String script = "DELETE FROM tbltipostransportes WHERE idtipotransporte = ?";
		
		try {
			dbConnection = conector.conectarBD(); // Abrir la conexión 
			pst = dbConnection.prepareStatement(script); //Abrir el Buffer
			
			//Parametizar los campos 
			pst.setInt(1, idtipotransporte);
			
			//Confirmar la operacion
			int respuesta = JOptionPane.showConfirmDialog(null, "¿Desea eliminar el registro No. " + idtipotransporte + "?");
			
			if (respuesta == JOptionPane.OK_OPTION) {
				
				//Ejecutar la trx
				pst.executeUpdate();
				JOptionPane.showConfirmDialog(null, "Resgistro No. " + idtipotransporte + "eliminado");
				
			}
			
			
			
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		
	}
	
	//Consultar todos los registros de la tabla tipo medios
			public void readOne( int idtipotransporte, JTextField nombre, JTextField observacion) {
				Connection dbConnection = null;
				PreparedStatement pst = null; // preparar la trx (transacción)
				
				String script = "SELECT * FROM tbltipostransportes WHERE idtipotransporte = ?";
				
				try {
					dbConnection = conector.conectarBD(); // Abrir la conexión 
					pst = dbConnection.prepareStatement(script); //Abrir el Buffer
					
					//Parametizar los campos 
					pst.setInt(1, idtipotransporte);
					ResultSet rs = pst.executeQuery();//almacenamiento temporal
					
					
					while (rs.next()) {
						nombre.setText(rs.getString(2));;
						observacion.setText(rs.getString(3));;
						
					}
					
				
				} catch (SQLException e) {
					System.out.println(e.getMessage());
				}
				
			}

			public void Update( int idtipotransporte, String nombre, String observacion) {
				Connection dbConnection = null;
				PreparedStatement pst = null; // preparar la trx (transacción)
				
				String script = "UPDATE tbltipostransportes SET nombre = ?, observacion = ?  WHERE idtipotransporte = ? ";
				
				try {
					dbConnection = conector.conectarBD(); // Abrir la conexión 
					pst = dbConnection.prepareStatement(script); //Abrir el Buffer
					
					//Parametizar los campos 
					pst.setString(1, nombre);
					pst.setString(2, observacion);
					pst.setInt(3, idtipotransporte);
					
					
					
					
					
					//Confirmar la operacion
					int respuesta = JOptionPane.showConfirmDialog(null, "¿Desea actualizar el registro No. " + idtipotransporte + "?");
					
					if (respuesta == JOptionPane.YES_OPTION) {
						
						//Ejecutar la trx
						pst.executeUpdate();
						JOptionPane.showConfirmDialog(null, "Resgistro No. " + idtipotransporte + "actualizado");	
					}
				
					
				} catch (SQLException e) {
					System.out.println(e.getMessage());
				}
				
			}
			
}
