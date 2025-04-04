package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

import controller.Conexion;

public class operadores {

	public int idoperadores = 0;
	public String tipodocuento = "";
	public String numerodocumento = "";
	public String nombres = "";
	public String apellidos = "";
	public String direccion = "";
	public String correoelectronico = "";
	public String telefono = "";
	public int idtransporte = 0;
	public operadores(int idoperadores, String tipodocuento, String numerodocumento, String nombres, String apellidos,
			String direccion, String correoelectronico, String telefono, int idtransporte) {
		super();
		this.idoperadores = idoperadores;
		this.tipodocuento = tipodocuento;
		this.numerodocumento = numerodocumento;
		this.nombres = nombres;
		this.apellidos = apellidos;
		this.direccion = direccion;
		this.correoelectronico = correoelectronico;
		this.telefono = telefono;
		this.idtransporte = idtransporte;
	}
	
	
	public operadores() {
		super();
	}


	public int getIdoperadores() {
		return idoperadores;
	}
	public void setIdoperadores(int idoperadores) {
		this.idoperadores = idoperadores;
	}
	public String getTipodocuento() {
		return tipodocuento;
	}
	public void setTipodocuento(String tipodocuento) {
		this.tipodocuento = tipodocuento;
	}
	public String getNumerodocumento() {
		return numerodocumento;
	}
	public void setNumerodocumento(String numerodocumento) {
		this.numerodocumento = numerodocumento;
	}
	public String getNombres() {
		return nombres;
	}
	public void setNombres(String nombres) {
		this.nombres = nombres;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getCorreoelectronico() {
		return correoelectronico;
	}
	public void setCorreoelectronico(String correoelectronico) {
		this.correoelectronico = correoelectronico;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public int getIdtransporte() {
		return idtransporte;
	}
	public void setIdtransporte(int idtransporte) {
		this.idtransporte = idtransporte;
	}
	
Conexion conector = new Conexion();
	
	public void Create(String tipodocuento, String numerodocumento, String nombres, String apellidos, String direccion, String correoelectronico, String telefono, int idtransporte ) {
		Connection dbConnection = null;
		PreparedStatement pst = null; // preparar la trx (transacción)
		
		String script = "INSERT INTO tbloperadores (tipodocuento, numerodocumento, nombres, apellidos, direccion, correoelectronico, telefono, idtransporte ) values (?,?,?,?,?,?,?,?)";
		
		try {
			dbConnection = conector.conectarBD(); // Abrir la conexión 
			pst = dbConnection.prepareStatement(script); //Abrir el Buffer
			
			//Parametizar los campos 
			pst.setString(1, tipodocuento);
			pst.setString(2, numerodocumento);
			pst.setString(3, nombres);
			pst.setString(4, apellidos);
			pst.setString(5, direccion);
			pst.setString(6, correoelectronico);
			pst.setString(7, telefono);
			pst.setInt(8, idtransporte);

			
			
			//Ejecutar la trx (transacción)
			pst.executeUpdate();
			JOptionPane.showConfirmDialog(null, "Registro con exito. ");
			
			
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	
}
	
	public void delete( int idoperadores) {
		Connection dbConnection = null;
		PreparedStatement pst = null; // preparar la trx (transacción)
		
		String script = "DELETE FROM tbloperadores WHERE idoperadores = ?";
		
		try {
			dbConnection = conector.conectarBD(); // Abrir la conexión 
			pst = dbConnection.prepareStatement(script); //Abrir el Buffer
			
			//Parametizar los campos 
			pst.setInt(1, idoperadores);
			
			//Confirmar la operacion
			int respuesta = JOptionPane.showConfirmDialog(null, "¿Desea eliminar el registro No. " + idoperadores + "?");
			
			if (respuesta == JOptionPane.OK_OPTION) {
				
				//Ejecutar la trx
				pst.executeUpdate();
				JOptionPane.showConfirmDialog(null, "Resgistro No. " + idoperadores + "eliminado");
				
			}
			
			 
			
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		
	}
	
	//Consultar todos los registros de la tabla tipo medios
		public void readOne( int idoperadores, JTextField tipodocuento, JTextField numerodocumento, JTextField nombres,JTextField apellidos, JTextField direccion,  JTextField correoelectronico ,  JTextField telefono, JTextField idtransporte) {
			Connection dbConnection = null;
			PreparedStatement pst = null; // preparar la trx (transacción)
			
			String script = "SELECT * FROM tbloperadores WHERE idoperadores = ?";
			
			try {
				dbConnection = conector.conectarBD(); // Abrir la conexión 
				pst = dbConnection.prepareStatement(script); //Abrir el Buffer
				
				//Parametizar los campos 
				pst.setInt(1, idoperadores);
				ResultSet rs = pst.executeQuery();//almacenamiento temporal
				
				
				while (rs.next()) {
					tipodocuento.setText(rs.getString(2));
					numerodocumento.setText(rs.getString(3));
					nombres.setText(rs.getString(4));
					apellidos.setText(rs.getString(5));
					direccion.setText(rs.getString(6));
					correoelectronico.setText(rs.getString(7));
					telefono.setText(rs.getString(8));
					idtransporte.setText(rs.getString(9));
					
					
					
				}
				
			
			} catch (SQLException e) {
				System.out.println(e.getMessage());
			}
			
		}
}
