package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

import controller.Conexion;

public class Paquete {
	
	public int codigo = 0;
	public int iddestino = 0;
	public int idorigen = 0;
	public String precio = "";
	public String fechaventa = "";
	public String horaventa = "";
	public String fechaejecucion = "";
	public String horasalida = "";
	public String observaciones = "";
	public int idpromotores = 0;
	public int idagencia = 0;
	public int idmedios = 0;
	public int idclientes = 0;
	public int idtransporte = 0;
	public Paquete(int codigo, int iddestino, int idorigen, String precio, String fechaventa, String horaventa,
			String fechaejecucion, String horasalida, String observaciones, int idpromotores, int idagencia,
			int idmedios, int idclientes, int idtransporte) {
		super();
		this.codigo = codigo;
		this.iddestino = iddestino;
		this.idorigen = idorigen;
		this.precio = precio;
		this.fechaventa = fechaventa;
		this.horaventa = horaventa;
		this.fechaejecucion = fechaejecucion;
		this.horasalida = horasalida;
		this.observaciones = observaciones;
		this.idpromotores = idpromotores;
		this.idagencia = idagencia;
		this.idmedios = idmedios;
		this.idclientes = idclientes;
		this.idtransporte = idtransporte;
	}
	
	
	


	public Paquete() {
		super();
	}





	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public int getIddestino() {
		return iddestino;
	}
	public void setIddestino(int iddestino) {
		this.iddestino = iddestino;
	}
	public int getIdorigen() {
		return idorigen;
	}
	public void setIdorigen(int idorigen) {
		this.idorigen = idorigen;
	}
	public String getPrecio() {
		return precio;
	}
	public void setPrecio(String precio) {
		this.precio = precio;
	}
	public String getFechaventa() {
		return fechaventa;
	}
	public void setFechaventa(String fechaventa) {
		this.fechaventa = fechaventa;
	}
	public String getHoraventa() {
		return horaventa;
	}
	public void setHoraventa(String horaventa) {
		this.horaventa = horaventa;
	}
	public String getFechaejecucion() {
		return fechaejecucion;
	}
	public void setFechaejecucion(String fechaejecucion) {
		this.fechaejecucion = fechaejecucion;
	}
	public String getHorasalida() {
		return horasalida;
	}
	public void setHorasalida(String horasalida) {
		this.horasalida = horasalida;
	}
	public String getObservaciones() {
		return observaciones;
	}
	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}
	public int getIdpromotores() {
		return idpromotores;
	}
	public void setIdpromotores(int idpromotores) {
		this.idpromotores = idpromotores;
	}
	public int getIdagencia() {
		return idagencia;
	}
	public void setIdagencia(int idagencia) {
		this.idagencia = idagencia;
	}
	public int getIdmedios() {
		return idmedios;
	}
	public void setIdmedios(int idmedios) {
		this.idmedios = idmedios;
	}
	public int getIdclientes() {
		return idclientes;
	}
	public void setIdclientes(int idclientes) {
		this.idclientes = idclientes;
	}
	public int getIdtransporte() {
		return idtransporte;
	}
	public void setIdtransporte(int idtransporte) {
		this.idtransporte = idtransporte;
	}

	
Conexion conector = new Conexion();
	
	public void Create(int iddestino, int idorigen, String precio, String fechaventa, String horaventa, String fechaejecucion, String horasalida, String observaciones, int idpromotores, int idagencia,
			int idmedios, int idclientes, int idtransporte) {
		Connection dbConnection = null;
		PreparedStatement pst = null; // preparar la trx (transacción)
		
		String script = "INSERT INTO tblpaquetes ( iddestino, idorigen, precio, fechaventa, horaventa, fechaejecucion, horasalida, observaciones, idpromotores, idagencia, idmedios, idclientes, idtransporte) values (?,?,?,?,?,?,?,?,?,?,?,?,?)";
		
		try {
			dbConnection = conector.conectarBD(); // Abrir la conexión 
			pst = dbConnection.prepareStatement(script); //Abrir el Buffer
			
			//Parametizar los campos 
			pst.setInt(1, iddestino);
			pst.setInt(2, idorigen);
			pst.setString(3, precio);
			pst.setString(4, fechaventa);
			pst.setString(5, horaventa);
			pst.setString(6, fechaejecucion);
			pst.setString(7, horasalida);
			pst.setString(8, observaciones);
			pst.setInt(9, idpromotores);
			pst.setInt(10, idagencia);
			pst.setInt(11, idmedios);
			pst.setInt(12, idclientes);
			pst.setInt(13, idtransporte);
			
			
			//Ejecutar la trx (transacción)
			pst.executeUpdate();
			JOptionPane.showConfirmDialog(null, "Registro con exito. ");
			
			
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	
}
	
	public void delete( int codigo) {
		Connection dbConnection = null;
		PreparedStatement pst = null; // preparar la trx (transacción)
		
		String script = "DELETE FROM tblpaquetes WHERE codigo = ?";
		
		try {
			dbConnection = conector.conectarBD(); // Abrir la conexión 
			pst = dbConnection.prepareStatement(script); //Abrir el Buffer
			
			//Parametizar los campos 
			pst.setInt(1, codigo);
			
			//Confirmar la operacion
			int respuesta = JOptionPane.showConfirmDialog(null, "¿Desea eliminar el registro No. " + codigo + "?");
			
			if (respuesta == JOptionPane.OK_OPTION) {
				
				//Ejecutar la trx
				pst.executeUpdate();
				JOptionPane.showConfirmDialog(null, "Resgistro No. " + codigo + "eliminado");
				
			}
			 
			
			
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		
	}
	
	//Consultar todos los registros de la tabla tipo medios
			public void readOne( int codigo, JTextField iddestino, JTextField idorigen, JTextField precio ,JTextField fechaventa, JTextField horaventa, JTextField fechaejecucion, JTextField horasalida, JTextField observaciones, JTextField idpromotores, JTextField idagencia, JTextField idmedios, JTextField idclientes, JTextField idtransporte) {
				Connection dbConnection = null;
				PreparedStatement pst = null; // preparar la trx (transacción)
				
				String script = "SELECT * FROM tblpaquetes WHERE codigo = ?";
				
				try {
					dbConnection = conector.conectarBD(); // Abrir la conexión 
					pst = dbConnection.prepareStatement(script); //Abrir el Buffer
					
					//Parametizar los campos 
					pst.setInt(1, codigo);
					ResultSet rs = pst.executeQuery();//almacenamiento temporal
					
					
					while (rs.next()) {
						iddestino.setText(rs.getString(2));
						idorigen.setText(rs.getString(3));
						precio.setText(rs.getString(4));
						fechaventa.setText(rs.getString(5));
						horaventa.setText(rs.getString(6));
						fechaejecucion.setText(rs.getString(7));
						horasalida.setText(rs.getString(8));
						observaciones.setText(rs.getString(9));
						idpromotores.setText(rs.getString(10));
						idagencia.setText(rs.getString(11));
						idmedios.setText(rs.getString(12));
						idclientes.setText(rs.getString(13));
						idtransporte.setText(rs.getString(14));
					
						
					}
					
				
				} catch (SQLException e) {
					System.out.println(e.getMessage());
				}
				
			}


}