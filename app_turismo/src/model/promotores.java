package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

import controller.Conexion;

public class promotores {

	public int idpromotores = 0;
	public int numerodocumento = 0;
	public String nombres = "";
	public String apellidos = "";
	public String direccion = "";
	public String correopersonal = "";
	public String correocorporativo = "";
	public String fechanacimiento = "";
	public String telefono = "";
	
	public promotores(int idpromotores, int numerodocumento, String nombres, String apellidos, String direccion,
			String correopersonal, String correocorporativo, String fechanacimiento, String telefono) {
		super();
		this.idpromotores = idpromotores;
		this.numerodocumento = numerodocumento;
		this.nombres = nombres;
		this.apellidos = apellidos;
		this.direccion = direccion;
		this.correopersonal = correopersonal;
		this.correocorporativo = correocorporativo;
		this.fechanacimiento = fechanacimiento;
		this.telefono = telefono;
	}
	
	

	public promotores() {
		super();
	}



	public int getIdpromotores() {
		return idpromotores;
	}

	public void setIdpromotores(int idpromotores) {
		this.idpromotores = idpromotores;
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

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getCorreopersonal() {
		return correopersonal;
	}

	public void setCorreopersonal(String correopersonal) {
		this.correopersonal = correopersonal;
	}

	public String getCorreocorporativo() {
		return correocorporativo;
	}

	public void setCorreocorporativo(String correocorporativo) {
		this.correocorporativo = correocorporativo;
	}

	public String getFechanacimiento() {
		return fechanacimiento;
	}

	public void setFechanacimiento(String fechanacimiento) {
		this.fechanacimiento = fechanacimiento;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	
Conexion conector = new Conexion();
	
	public void Create(String tipodocuento, String numerodocumento, String nombres, String apellidos, String direccion, String correopersonal, String correocorporativo, String fechanacimiento, String telefono) {
		Connection dbConnection = null;
		PreparedStatement pst = null; // preparar la trx (transacción)
		
		String script = "INSERT INTO tblpromotores (tipodocuento, numerodocumento, nombres, apellidos, direccion, correopersonal, correocorporativo,fechanacimiento, telefono ) values (?,?,?,?,?,?,?,?,?)";
		
		try {
			dbConnection = conector.conectarBD(); // Abrir la conexión 
			pst = dbConnection.prepareStatement(script); //Abrir el Buffer
			
			//Parametizar los campos 
			pst.setString(1, tipodocuento);
			pst.setString(2, numerodocumento);
			pst.setString(3, nombres);
			pst.setString(4, apellidos);
			pst.setString(5, direccion);
			pst.setString(6, correopersonal);
			pst.setString(7, correocorporativo);
			pst.setString(8, fechanacimiento);
			pst.setString(9, telefono);

			
			
			//Ejecutar la trx (transacción)
			pst.executeUpdate();
			JOptionPane.showConfirmDialog(null, "Registro con exito. ");
			
			
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		
}
	public void delete( int idpromotores) {
		Connection dbConnection = null;
		PreparedStatement pst = null; // preparar la trx (transacción)
		
		String script = "DELETE FROM tblpromotores WHERE idpromotores = ?";
		
		try {
			dbConnection = conector.conectarBD(); // Abrir la conexión 
			pst = dbConnection.prepareStatement(script); //Abrir el Buffer
			
			//Parametizar los campos 
			pst.setInt(1, idpromotores);
			
			//Confirmar la operacion
			int respuesta = JOptionPane.showConfirmDialog(null, "¿Desea eliminar el registro No. " + idpromotores + "?");
			
			if (respuesta == JOptionPane.OK_OPTION) {
				
				//Ejecutar la trx
				pst.executeUpdate();
				JOptionPane.showConfirmDialog(null, "Resgistro No. " + idpromotores + "eliminado");
				
			}
			
			
			
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		
	}
	
	//Consultar todos los registros de la tabla tipo medios
		public void readOne( int idpromotores, JTextField tipodocuento, JTextField numerodocumento, JTextField nombres, JTextField apellidos, JTextField direccion, JTextField correopersonal, JTextField correocorporativo, JTextField fechanacimiento, JTextField telefono ) {
			Connection dbConnection = null;
			PreparedStatement pst = null; // preparar la trx (transacción)
			
			String script = "SELECT * FROM tblpromotores WHERE idpromotores = ?";
			
			try {
				dbConnection = conector.conectarBD(); // Abrir la conexión 
				pst = dbConnection.prepareStatement(script); //Abrir el Buffer
				
				//Parametizar los campos 
				pst.setInt(1, idpromotores);
				ResultSet rs = pst.executeQuery();//almacenamiento temporal
				
				
				while (rs.next()) {
					tipodocuento.setText(rs.getString(2));
					numerodocumento.setText(rs.getString(3));
					nombres.setText(rs.getString(4));
					apellidos.setText(rs.getString(5));
					direccion.setText(rs.getString(6));
					correopersonal.setText(rs.getString(7));
					correocorporativo.setText(rs.getString(8));
					fechanacimiento.setText(rs.getString(9));
					telefono.setText(rs.getString(10));
					
					
				}
				
			
			} catch (SQLException e) {
				System.out.println(e.getMessage());
			}
			
		}


	
	 
}
