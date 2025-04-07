package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

import controller.Conexion;

public class transporte {

	public int idtransporte = 0;
	public String matricula = "";
	public String marca = "";
	public int puestos = 0;	
	public String modelo = "";
	public String categoria = "";
	public int idtipotransporte = 0;	
	public int numero_motor = 0;
	
	public int getIdtransporte() {
		return idtransporte;
	}
	 
	
	public transporte() {
		super();
	}



	public void setIdtransporte(int idtransporte) {
		this.idtransporte = idtransporte;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getPuestos() {
		return puestos;
	}

	public void setPuestos(int puestos) {
		this.puestos = puestos;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public int getIdtipotransporte() {
		return idtipotransporte;
	}

	public void setIdtipotransporte(int idtipotransporte) {
		this.idtipotransporte = idtipotransporte;
	}

	public int getNumero_motor() {
		return numero_motor;
	}

	public void setNumero_motor(int numero_motor) {
		this.numero_motor = numero_motor;
	}

	public transporte(int idtransporte, String matricula, String marca, int puestos, String modelo, String categoria,
			int idtipotransporte, int numero_motor) {
		super();
		this.idtransporte = idtransporte;
		this.matricula = matricula;
		this.marca = marca;
		this.puestos = puestos;
		this.modelo = modelo;
		this.categoria = categoria;
		this.idtipotransporte = idtipotransporte;
		this.numero_motor = numero_motor;
	}	

Conexion conector = new Conexion();
	
	public void Create(String matricula, String marca, int puestos, String modelo, String categoria, String numero_motor, int idtipotransporte ) {
		Connection dbConnection = null;
		PreparedStatement pst = null; // preparar la trx (transacción)
		
		String script = "INSERT INTO tbltransporte (matricula, marca, puestos, modelo, categoria, numero_motor, idtipotransporte) values (?,?,?,?,?,?,?)";
		
		try {
			dbConnection = conector.conectarBD(); // Abrir la conexión 
			pst = dbConnection.prepareStatement(script); //Abrir el Buffer
			
			//Parametizar los campos 
			pst.setString(1, matricula);
			pst.setString(2, marca);
			pst.setInt(3, puestos);
			pst.setString(4, modelo);
			pst.setString(5, categoria);
			pst.setString(6, numero_motor);
			pst.setInt(7, idtipotransporte);
			;

			
			
			//Ejecutar la trx (transacción)
			pst.executeUpdate();
			JOptionPane.showConfirmDialog(null, "Registro con exito. ");
			
			
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	
	}
	public void delete( int idtransporte) {
		Connection dbConnection = null;
		PreparedStatement pst = null; // preparar la trx (transacción)
		
		String script = "DELETE FROM tbltransporte WHERE idtransporte = ?";
		
		try {
			dbConnection = conector.conectarBD(); // Abrir la conexión 
			pst = dbConnection.prepareStatement(script); //Abrir el Buffer
			
			//Parametizar los campos 
			pst.setInt(1, idtransporte);
			
			//Confirmar la operacion
			int respuesta = JOptionPane.showConfirmDialog(null, "¿Desea eliminar el registro No. " + idtransporte + "?");
			
			if (respuesta == JOptionPane.OK_OPTION) {
				
				//Ejecutar la trx
				pst.executeUpdate();
				JOptionPane.showConfirmDialog(null, "Resgistro No. " + idtransporte + "eliminado");
				
			}
			
			
			
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		
	}
	//Consultar todos los registros de la tabla tipo medios
		public void readOne( int idtransporte, JTextField matricula, JTextField marca, JTextField puestos ,JTextField modelo, JTextField categoria, JTextField idtipotransporte, JTextField numero_motor) {
			Connection dbConnection = null;
			PreparedStatement pst = null; // preparar la trx (transacción)
			
			String script = "SELECT * FROM tbltransporte WHERE idtransporte = ?";
			
			try {
				dbConnection = conector.conectarBD(); // Abrir la conexión 
				pst = dbConnection.prepareStatement(script); //Abrir el Buffer
				
				//Parametizar los campos 
				pst.setInt(1, idtransporte);
				ResultSet rs = pst.executeQuery();//almacenamiento temporal
				
				
				while (rs.next()) {
					matricula.setText(rs.getString(2));
					marca.setText(rs.getString(3));
					puestos.setText(rs.getString(4));
					modelo.setText(rs.getString(5));
					categoria.setText(rs.getString(6));
					idtipotransporte.setText(rs.getString(7));
					numero_motor.setText(rs.getString(8));
				
					
				}
				
			
			} catch (SQLException e) {
				System.out.println(e.getMessage());
			}
			
		}

		public void Update( int idtransporte, String matricula, String marca, int puestos, 
				String modelo, String categoria, int idtipotransporte, int numero_motor) {
			Connection dbConnection = null;
			PreparedStatement pst = null; // preparar la trx (transacción)
			
			String script = "UPDATE tbltransporte SET matricula = ?, marca = ?, puestos = ?, modelo = ?, categoria = ?, idtipotransporte = ?, numero_motor = ?  WHERE idtransporte = ? ";
			
			try {
				dbConnection = conector.conectarBD(); // Abrir la conexión 
				pst = dbConnection.prepareStatement(script); //Abrir el Buffer
				
				//Parametizar los campos 
				pst.setString(1, matricula);
				pst.setString(2, marca);
				pst.setInt(3, puestos);
				pst.setString(4, modelo);
				pst.setString(5, categoria);
				pst.setInt(6, idtipotransporte);
				pst.setInt(7, numero_motor);
				pst.setInt(8, idtransporte);
				
				
				
				
				
				//Confirmar la operacion
				int respuesta = JOptionPane.showConfirmDialog(null, "¿Desea actualizar el registro No. " + idtransporte + "?");
				
				if (respuesta == JOptionPane.YES_OPTION) {
					
					//Ejecutar la trx
					pst.executeUpdate();
					JOptionPane.showConfirmDialog(null, "Resgistro No. " + idtransporte + "actualizado");	
				}
			
				
			} catch (SQLException e) {
				System.out.println(e.getMessage());
			}
			
		}
	
	 
	
}
