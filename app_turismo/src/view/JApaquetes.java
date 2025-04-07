package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;


import model.Paquete;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.ImageIcon;

public class JApaquetes extends JFrame {
 
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtiddestino;
	private JTextField txtidorigen;
	private JTextField txtprecio;
	private JTextField txtfechaventa;
	private JTextField txthoraventa;
	private JTextField txtfechaejecucion;
	private JTextField txthorasalida;
	private JTextField txtobservaciones;
	private JButton btnGuardar;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_9;
	private JLabel lblNewLabel_10;
	private JLabel lblNewLabel_11;
	private JLabel lblNewLabel_12;
	private JLabel lblNewLabel_13;
	private JTextField txtidpromotores;
	private JTextField txtidagencia;
	private JTextField txtidmedios;
	private JTextField txtidclientes;
	private JTextField txtidtransporte;
	private JLabel lblNewLabel_14;
	private JTextField txtcodigo;
	private JButton btndelete;
	Paquete pa = new Paquete();
	private JButton btnupdate;
	private JLabel lblNewLabel_16;
	private JLabel lblNewLabel_17;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JApaquetes frame = new JApaquetes();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public JApaquetes() {
		setTitle("Paquetes");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 416, 621);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("ID de destino: ");
		lblNewLabel_1.setBounds(57, 53, 108, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("ID de origen: ");
		lblNewLabel_2.setBounds(57, 78, 126, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Precio");
		lblNewLabel_3.setBounds(57, 103, 81, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Fecha de venta:");
		lblNewLabel_4.setBounds(57, 128, 95, 14);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Hora de venta: ");
		lblNewLabel_5.setBounds(57, 154, 95, 14);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Fecha de ejecución:");
		lblNewLabel_6.setBounds(57, 184, 126, 14);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Hora de salida: ");
		lblNewLabel_7.setBounds(57, 209, 108, 14);
		contentPane.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("Observaciones: ");
		lblNewLabel_8.setBounds(57, 234, 108, 14);
		contentPane.add(lblNewLabel_8);
		
		txtiddestino = new JTextField();
		txtiddestino.setBounds(243, 53, 86, 20);
		contentPane.add(txtiddestino);
		txtiddestino.setColumns(10);
		
		txtidorigen = new JTextField();
		txtidorigen.setBounds(243, 78, 86, 20);
		contentPane.add(txtidorigen);
		txtidorigen.setColumns(10);
		
		txtprecio = new JTextField();
		txtprecio.setBounds(243, 103, 86, 20);
		contentPane.add(txtprecio);
		txtprecio.setColumns(10);
		
		txtfechaventa = new JTextField();
		txtfechaventa.setBounds(243, 128, 86, 20);
		contentPane.add(txtfechaventa);
		txtfechaventa.setColumns(10);
		
		txthoraventa = new JTextField();
		txthoraventa.setBounds(243, 154, 86, 20);
		contentPane.add(txthoraventa);
		txthoraventa.setColumns(10);
		
		txtfechaejecucion = new JTextField();
		txtfechaejecucion.setBounds(243, 184, 86, 20);
		contentPane.add(txtfechaejecucion);
		txtfechaejecucion.setColumns(10);
		
		txthorasalida = new JTextField();
		txthorasalida.setBounds(243, 209, 86, 20);
		contentPane.add(txthorasalida);
		txthorasalida.setColumns(10);
		
		txtobservaciones = new JTextField();
		txtobservaciones.setBounds(243, 234, 86, 20);
		contentPane.add(txtobservaciones);
		txtobservaciones.setColumns(10);
		
		btnGuardar = new JButton("Guardar");
		btnGuardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnGuardar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				pa.Create (Integer.parseInt(txtiddestino.getText()) , Integer.parseInt(txtidorigen.getText()), txtprecio.getText(), txtfechaventa.getText(), txthoraventa.getText(), txtfechaejecucion.getText(), txthorasalida.getText(), txtobservaciones.getText(),  Integer.parseInt(txtidpromotores.getText()),  Integer.parseInt(txtidagencia.getText()),  Integer.parseInt(txtidmedios.getText()),  Integer.parseInt(txtidclientes.getText()),  Integer.parseInt(txtidtransporte.getText()));
				
			}
		});
		btnGuardar.setBounds(163, 550, 89, 23);
		contentPane.add(btnGuardar);
		
		lblNewLabel = new JLabel("Gestión de paquetes ");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel.setBounds(133, 22, 139, 17);
		contentPane.add(lblNewLabel);
		
		lblNewLabel_9 = new JLabel("ID de promotores:");
		lblNewLabel_9.setBounds(57, 259, 108, 14);
		contentPane.add(lblNewLabel_9);
		
		lblNewLabel_10 = new JLabel("ID de agencia: ");
		lblNewLabel_10.setBounds(57, 284, 108, 14);
		contentPane.add(lblNewLabel_10);
		
		lblNewLabel_11 = new JLabel("ID de medios:");
		lblNewLabel_11.setBounds(57, 309, 126, 14);
		contentPane.add(lblNewLabel_11);
		
		lblNewLabel_12 = new JLabel("ID de clientes:");
		lblNewLabel_12.setBounds(57, 334, 108, 14);
		contentPane.add(lblNewLabel_12);
		
		lblNewLabel_13 = new JLabel("ID de transporte:");
		lblNewLabel_13.setBounds(57, 359, 108, 14);
		contentPane.add(lblNewLabel_13);
		
		txtidpromotores = new JTextField();
		txtidpromotores.setBounds(243, 256, 86, 20);
		contentPane.add(txtidpromotores);
		txtidpromotores.setColumns(10);
		
		txtidagencia = new JTextField();
		txtidagencia.setBounds(243, 281, 86, 20);
		contentPane.add(txtidagencia);
		txtidagencia.setColumns(10);
		
		txtidmedios = new JTextField();
		txtidmedios.setBounds(243, 306, 86, 20);
		contentPane.add(txtidmedios);
		txtidmedios.setColumns(10);
		
		txtidclientes = new JTextField();
		txtidclientes.setBounds(243, 331, 86, 20);
		contentPane.add(txtidclientes);
		txtidclientes.setColumns(10);
		
		txtidtransporte = new JTextField();
		txtidtransporte.setBounds(243, 356, 86, 20);
		contentPane.add(txtidtransporte);
		txtidtransporte.setColumns(10);
		
		lblNewLabel_14 = new JLabel("ID de paquetes:");
		lblNewLabel_14.setBounds(163, 405, 95, 14);
		contentPane.add(lblNewLabel_14);
		
		txtcodigo = new JTextField();
		txtcodigo.setBounds(163, 442, 86, 20);
		contentPane.add(txtcodigo);
		txtcodigo.setColumns(10);
		
		btndelete = new JButton("");
		btndelete.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				pa.delete(Integer.parseInt(txtcodigo.getText()));
				
				txtcodigo.setText("");
				
			}
		});
		btndelete.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Downloads\\616650_bin_delete_garbage_trash_icon.png"));
		btndelete.setBounds(163, 473, 81, 43);
		btndelete.setContentAreaFilled(false);
		contentPane.add(btndelete);
		
		JLabel lblNewLabel_15 = new JLabel("Consultar");
		lblNewLabel_15.setBounds(73, 523, 51, 14);
		contentPane.add(lblNewLabel_15);
		
		JButton btnRead = new JButton("");
		
		btnRead.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Downloads\\613531_find_glass_magnifying_search_zoom_icon.png"));
		btnRead.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				pa.readOne(Integer.parseInt(txtcodigo.getText()), txtiddestino, txtidorigen, txtprecio, txtfechaventa, txthoraventa, txtfechaejecucion, txthorasalida, txtobservaciones, txtidpromotores, txtidagencia, txtidmedios, txtidclientes, txtidtransporte);
			}
		});
		btnRead.setBounds(83, 473, 41, 43);
		btnRead.setContentAreaFilled(false);
		contentPane.add(btnRead);
		
		btnupdate = new JButton("");
		btnupdate.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				pa.Update(Integer.parseInt(txtcodigo.getText()), Integer.parseInt(txtiddestino.getText()) , Integer.parseInt(txtidorigen.getText()), txtprecio.getText(), txtfechaventa.getText(), txthoraventa.getText(), txtfechaejecucion.getText(), txthorasalida.getText(), txtobservaciones.getText(),  Integer.parseInt(txtidpromotores.getText()),  Integer.parseInt(txtidagencia.getText()),  Integer.parseInt(txtidmedios.getText()),  Integer.parseInt(txtidclientes.getText()),  Integer.parseInt(txtidtransporte.getText()));
			}
		});
		btnupdate.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Downloads\\9554514_sync_reload_refresh_update_repeat_icon.png"));
		btnupdate.setBounds(270, 473, 62, 43);
		contentPane.add(btnupdate);
		
		lblNewLabel_16 = new JLabel("Eliminar");
		lblNewLabel_16.setBounds(183, 527, 46, 14);
		contentPane.add(lblNewLabel_16);
		
		lblNewLabel_17 = new JLabel("Actualizar");
		lblNewLabel_17.setBounds(280, 527, 62, 14);
		btnupdate.setContentAreaFilled(false);
		contentPane.add(lblNewLabel_17);
	}
}
