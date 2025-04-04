package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

import controller.Conexion;

public class Compania {

	
	public int idcompania = 0;
	public String razonsocial = "";
	public String direccion = "";
	public String correoElectronico = "";
	public int telefono = 0;
	public String fechacreacion = "";
	public String web = "";
	public String observacion = "";
	public Compania(int idcompania, String razonsocial, String direccion, String correoElectronico, int telefono,
			String fechacreacion, String web, String observacion) {
		super();
		this.idcompania = idcompania;
		this.razonsocial = razonsocial;
		this.direccion = direccion;
		this.correoElectronico = correoElectronico;
		this.telefono = telefono;
		this.fechacreacion = fechacreacion;
		this.web = web;
		this.observacion = observacion;
		
	}
	
	
	public Compania() {
		super();
	}


	public int getIdcompania() {
		return idcompania;
	}
	public void setIdcompania(int idcompania) {
		this.idcompania = idcompania;
	}
	public String getRazonsocial() {
		return razonsocial;
	}
	public void setRazonsocial(String razonsocial) {
		this.razonsocial = razonsocial;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getCorreoElectronico() {
		return correoElectronico;
	}
	public void setCorreoElectronico(String correoElectronico) {
		this.correoElectronico = correoElectronico;
	}
	public int getTelefono() {
		return telefono;
	}
	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}
	public String getFechacreacion() {
		return fechacreacion;
	}
	public void setFechacreacion(String fechacreacion) {
		this.fechacreacion = fechacreacion;
	}
	public String getWeb() {
		return web;
	}
	public void setWeb(String web) {
		this.web = web;
	}
	public String getObservacion() {
		return observacion;
	}
	public void setObservacion(String observacion) {
		this.observacion = observacion;
	}
	
	Conexion conector = new Conexion();
	
	public void Create( String razonsocial, String direccion, String correoelectronico, int telefono, String fechacreacion, String web, String observacion) {
		Connection dbConnection = null;
		PreparedStatement pst = null; // preparar la trx (transacción)
		
		String script = "INSERT INTO tblcompania ( razonsocial, direccion, correoelectronico, telefono, fechacreacion, web, observacion) values (?,?,?,?,?,?,?)";
		
		try {
			dbConnection = conector.conectarBD(); // Abrir la conexión 
			pst = dbConnection.prepareStatement(script); //Abrir el Buffer
			
			//Parametizar los campos 
			pst.setString(1, razonsocial);
			pst.setString(2, direccion);
			pst.setString(3, correoelectronico);
			pst.setInt(4, telefono);
			pst.setString(5, fechacreacion);
			pst.setString(6, web);
			pst.setString(7, observacion);
			
			
			//Ejecutar la trx (transacción)
			pst.executeUpdate();
			JOptionPane.showConfirmDialog(null, "Registro con exito. ");
			
			
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		
	}
	
	public void delete( int idcompania) {
		Connection dbConnection = null;
		PreparedStatement pst = null; // preparar la trx (transacción)
		
		String script = "DELETE FROM tblcompania WHERE idcompania = ?";
		
		try {
			dbConnection = conector.conectarBD(); // Abrir la conexión 
			pst = dbConnection.prepareStatement(script); //Abrir el Buffer
			
			//Parametizar los campos 
			pst.setInt(1, idcompania);
			
			//Confirmar la operacion
			int respuesta = JOptionPane.showConfirmDialog(null, "¿Desea eliminar el registro No. " + idcompania + "?");
			
			if (respuesta == JOptionPane.OK_OPTION) {
				
				//Ejecutar la trx
				pst.executeUpdate();
				JOptionPane.showConfirmDialog(null, "Resgistro No. " + idcompania + "eliminado");
				
			}
			
			
			
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		
	}
	
	//Consultar todos los registros de la tabla tipo medios
	public void readOne( int idcompania, JTextField razonsocial, JTextField direccion, JTextField correoElectronico,JTextField telefono, JTextField fechacreacion, JTextField web, JTextField observacion) {
		Connection dbConnection = null;
		PreparedStatement pst = null; // preparar la trx (transacción)
		
		String script = "SELECT * FROM tblcompania WHERE idcompania = ?";
		
		try {
			dbConnection = conector.conectarBD(); // Abrir la conexión 
			pst = dbConnection.prepareStatement(script); //Abrir el Buffer
			
			//Parametizar los campos 
			pst.setInt(1, idcompania);
			ResultSet rs = pst.executeQuery();//almacenamiento temporal
			
			
			while (rs.next()) {
				razonsocial.setText(rs.getString(2));
				direccion.setText(rs.getString(3));
				correoElectronico.setText(rs.getString(4));
				telefono.setText(rs.getString(5));
				fechacreacion.setText(rs.getString(6));
				web.setText(rs.getString(7));
				observacion.setText(rs.getString(8));
				
			}
			
		
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		
	}


}
