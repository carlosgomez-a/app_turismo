 package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import model.Agencias;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Font;
import javax.swing.ImageIcon;

public class JAAgencias extends JFrame {
 
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtNombre;
	private JTextField txtDirrecion;
	private JTextField txtcorreoelectronico;
	private JTextField txttelefono;
	private JTextField txtfechacreacion;
	private JTextField txtweb;
	private JTextField txtobservacion;
	private JButton btnGuardar;
	private JLabel lblNewLabel_8;
	private JTextField txtidcompania;
	private JTextField txtidagencia;
	Agencias rc = new Agencias();
	private JTextField txtconsultar;
	private JLabel lblNewLabel_10;
	private JButton btnRead;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JAAgencias frame = new JAAgencias();
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
	public JAAgencias() {
		setTitle("Agencia");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 426);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nombre:");
		lblNewLabel.setBounds(57, 65, 118, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Dirección:");
		lblNewLabel_1.setBounds(57, 90, 118, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Correo Electronico:");
		lblNewLabel_2.setBounds(55, 115, 120, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Telefono: ");
		lblNewLabel_3.setBounds(57, 140, 137, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Fecha De Creación");
		lblNewLabel_4.setBounds(57, 165, 137, 14);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Web:");
		lblNewLabel_5.setBounds(57, 190, 100, 14);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Observación ");
		lblNewLabel_6.setBounds(57, 215, 118, 14);
		contentPane.add(lblNewLabel_6);
		
		txtNombre = new JTextField();
		txtNombre.setBounds(218, 65, 86, 20);
		contentPane.add(txtNombre);
		txtNombre.setColumns(10);
		
		txtDirrecion = new JTextField();
		txtDirrecion.setBounds(218, 90, 86, 20);
		contentPane.add(txtDirrecion);
		txtDirrecion.setColumns(10);
		
		txtcorreoelectronico = new JTextField();
		txtcorreoelectronico.setBounds(218, 115, 86, 20);
		contentPane.add(txtcorreoelectronico);
		txtcorreoelectronico.setColumns(10);
		
		txttelefono = new JTextField();
		txttelefono.setBounds(218, 140, 86, 20);
		contentPane.add(txttelefono);
		txttelefono.setColumns(10);
		
		txtfechacreacion = new JTextField();
		txtfechacreacion.setBounds(218, 165, 86, 20);
		contentPane.add(txtfechacreacion);
		txtfechacreacion.setColumns(10);
		
		txtweb = new JTextField();
		txtweb.setBounds(218, 190, 86, 17);
		contentPane.add(txtweb);
		txtweb.setColumns(10);
		
		txtobservacion = new JTextField();
		txtobservacion.setBounds(218, 215, 86, 20);
		contentPane.add(txtobservacion);
		txtobservacion.setColumns(10);
		
		btnGuardar = new JButton("Guardar");
		btnGuardar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			
				
					
					rc.Create(txtNombre.getText(), txtDirrecion.getText(), txtcorreoelectronico.getText(), Integer.parseInt(txttelefono.getText()), txtfechacreacion.getText(),txtweb.getText(), txtobservacion.getText(), Integer.parseInt(txtidcompania.getText()));
	
			}
		});
		btnGuardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnGuardar.setBounds(166, 343, 89, 23);
		contentPane.add(btnGuardar);
		
		lblNewLabel_8 = new JLabel("Gestión de agencias ");
		lblNewLabel_8.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_8.setBounds(148, 21, 137, 33);
		contentPane.add(lblNewLabel_8);
		
		JLabel lblNewLabel_7 = new JLabel("idcompania");
		lblNewLabel_7.setBounds(57, 243, 118, 14);
		contentPane.add(lblNewLabel_7);
		
		txtidcompania = new JTextField();
		txtidcompania.setBounds(218, 240, 86, 20);
		contentPane.add(txtidcompania);
		txtidcompania.setColumns(10);
		
		JLabel lblNewLabel_9 = new JLabel("ID de agencia:");
		lblNewLabel_9.setBounds(347, 65, 76, 14);
		contentPane.add(lblNewLabel_9);
		
		txtidagencia = new JTextField();
		txtidagencia.setBounds(337, 86, 86, 23);
		contentPane.add(txtidagencia);
		txtidagencia.setColumns(10);
		
		JButton btndelete = new JButton("");
		btndelete.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			rc.delete(Integer.parseInt(txtidagencia.getText()));
			
			
			txtidagencia.setText("");
			}
		});
		btndelete.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Downloads\\616650_bin_delete_garbage_trash_icon.png"));
		btndelete.setBounds(333, 130, 89, 49);
		btndelete.setContentAreaFilled(false);
		contentPane.add(btndelete);
		
		txtconsultar = new JTextField();
		txtconsultar.setBounds(166, 291, 86, 20);
		contentPane.add(txtconsultar);
		txtconsultar.setColumns(10);
		
		lblNewLabel_10 = new JLabel("Consultar Registros ");
		lblNewLabel_10.setBounds(57, 294, 100, 14);
		contentPane.add(lblNewLabel_10);
		
		btnRead = new JButton("");
		btnRead.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				rc.readOne(Integer.parseInt(txtconsultar.getText()), txtNombre, txtDirrecion, txtcorreoelectronico, txttelefono, txtweb, txtobservacion);
			}
		});
		btnRead.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Downloads\\613531_find_glass_magnifying_search_zoom_icon.png"));
		btnRead.setBounds(273, 284, 60, 38);
		contentPane.add(btnRead);
	}
}
