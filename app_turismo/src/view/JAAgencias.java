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
		setBounds(100, 100, 450, 361);
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
			
				
					
					Agencias rc = new Agencias();
					rc.Create(txtNombre.getText(), txtDirrecion.getText(), txtcorreoelectronico.getText(), Integer.parseInt(txttelefono.getText()), txtfechacreacion.getText(),txtweb.getText(), txtobservacion.getText(), Integer.parseInt(txtidcompania.getText()));
	
			}
		});
		btnGuardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnGuardar.setBounds(163, 288, 89, 23);
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
	}
}
