package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import controller.Conexion;

public class Clientes {

	public int idclientes = 0;
	public String tipodocuemto = "";
	public int numerodocumento = 0;
	public String nombres = "";
	public String apellidos = "";
	public String eps = "";
	public String alergias = "";
	public String fechanacimiento = "";
	public String correoelectronico = "";
	public String estadocivil = "";
	public String telefono = "";
	public String direccion = "";
	public Clientes(int idclientes, String tipodocuemto, int numerodocumento, String nombres, String apellidos,
			String eps, String alergias, String fechanacimiento, String correoelectronico, String estadocivil,
			String telefono, String direccion) {
		super();
		this.idclientes = idclientes;
		this.tipodocuemto = tipodocuemto;
		this.numerodocumento = numerodocumento;
		this.nombres = nombres;
		this.apellidos = apellidos;
		this.eps = eps;
		this.alergias = alergias;
		this.fechanacimiento = fechanacimiento;
		this.correoelectronico = correoelectronico;
		this.estadocivil = estadocivil;
		this.telefono = telefono;
		this.direccion = direccion;
		
		
	}
	
	
	public Clientes() {
		super();
	}


	public int getIdclientes() {
		return idclientes;
	}
	public void setIdclientes(int idclientes) {
		this.idclientes = idclientes;
	}
	public String getTipodocuemto() {
		return tipodocuemto;
	}
	public void setTipodocuemto(String tipodocuemto) {
		this.tipodocuemto = tipodocuemto;
	}
	public int getNumerodocumento() {
		return numerodocumento;
	}
	public void setNumerodocumento(int numerodocumento) {
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
	public String getEps() {
		return eps;
	}
	public void setEps(String eps) {
		this.eps = eps;
	}
	public String getAlergias() {
		return alergias;
	}
	public void setAlergias(String alergias) {
		this.alergias = alergias;
	}
	public String getFechanacimiento() {
		return fechanacimiento;
	}
	public void setFechanacimiento(String fechanacimiento) {
		this.fechanacimiento = fechanacimiento;
	}
	public String getCorreoelectronico() {
		return correoelectronico;
	}
	public void setCorreoelectronico(String correoelectronico) {
		this.correoelectronico = correoelectronico;
	}
	public String getEstadocivil() {
		return estadocivil;
	}
	public void setEstadocivil(String estadocivil) {
		this.estadocivil = estadocivil;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	
Conexion conector = new Conexion();
	
	public void Create( String tipodocuemto, int numerodocumento,  String nombres, String apellidos,  String eps, String alergias, String fechanacimiento, String correoelectronico, String estadocivil, String telefono, String direccion) {
		Connection dbConnection = null;
		PreparedStatement pst = null; // preparar la trx (transacción)
		
		String script = "INSERT INTO tblclientes ( tipodocuemto, numerodocumento, nombres, apellidos, eps, alergias, fechanacimiento, correoelectronico, estadocivil, telefono, direccion) values (?,?,?,?,?,?,?,?,?,?,?)";
		
		try {
			dbConnection = conector.conectarBD(); // Abrir la conexión 
			pst = dbConnection.prepareStatement(script); //Abrir el Buffer
			
			//Parametizar los campos 
			pst.setString(1, tipodocuemto);
			pst.setInt(2, numerodocumento);
			pst.setString(3, nombres);
			pst.setString(4, apellidos);
			pst.setString(5, eps);
			pst.setString(6, alergias);
			pst.setString(7, fechanacimiento);
			pst.setString(8, correoelectronico);
			pst.setString(9, estadocivil);
			pst.setString(10, telefono);
			pst.setString(11, direccion);
			
			
			//Ejecutar la trx (transacción)
			pst.executeUpdate();
			JOptionPane.showConfirmDialog(null, "Registro con exito. ");
			
			
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	
}
	
}
