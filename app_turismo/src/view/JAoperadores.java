package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import model.operadores;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Font;

public class JAoperadores extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txttipodocumento;
	private JTextField txtnumerodocumento;
	private JTextField txtnombres;
	private JTextField txtapellidos;
	private JTextField txtdireccion;
	private JTextField txtcorreoelectronico;
	private JTextField txttelefono;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_8;
	private JTextField txtidtransporte;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JAoperadores frame = new JAoperadores();
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
	public JAoperadores() {
		setTitle("Operadores");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 364);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Tipo de documento: ");
		lblNewLabel_1.setBounds(64, 61, 114, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Numero de documento: ");
		lblNewLabel_2.setBounds(64, 86, 128, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Nombres:");
		lblNewLabel_3.setBounds(64, 111, 93, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Apellidos:");
		lblNewLabel_4.setBounds(64, 136, 93, 14);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Dirección:");
		lblNewLabel_5.setBounds(64, 161, 93, 14);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Correo electronico: ");
		lblNewLabel_6.setBounds(64, 186, 114, 14);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Telefono: ");
		lblNewLabel_7.setBounds(64, 211, 114, 14);
		contentPane.add(lblNewLabel_7);
		
		txttipodocumento = new JTextField();
		txttipodocumento.setBounds(241, 58, 86, 20);
		contentPane.add(txttipodocumento);
		txttipodocumento.setColumns(10);
		
		txtnumerodocumento = new JTextField();
		txtnumerodocumento.setBounds(241, 83, 86, 20);
		contentPane.add(txtnumerodocumento);
		txtnumerodocumento.setColumns(10);
		
		txtnombres = new JTextField();
		txtnombres.setBounds(241, 108, 86, 20);
		contentPane.add(txtnombres);
		txtnombres.setColumns(10);
		
		txtapellidos = new JTextField();
		txtapellidos.setBounds(241, 133, 86, 20);
		contentPane.add(txtapellidos);
		txtapellidos.setColumns(10);
		
		txtdireccion = new JTextField();
		txtdireccion.setBounds(241, 158, 86, 20);
		contentPane.add(txtdireccion);
		txtdireccion.setColumns(10);
		
		txtcorreoelectronico = new JTextField();
		txtcorreoelectronico.setBounds(241, 183, 86, 20);
		contentPane.add(txtcorreoelectronico);
		txtcorreoelectronico.setColumns(10);
		
		txttelefono = new JTextField();
		txttelefono.setBounds(241, 208, 86, 20);
		contentPane.add(txttelefono);
		txttelefono.setColumns(10);
		
		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				operadores op = new operadores();
				op.Create(txttipodocumento.getText(), txtnumerodocumento.getText(), txtnombres.getText(), txtapellidos.getText(), txtdireccion.getText(), txtcorreoelectronico.getText(), txttelefono.getText(), Integer.parseInt(txtidtransporte.getText()));
				
			}
		});
		btnGuardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnGuardar.setBounds(154, 291, 89, 23);
		contentPane.add(btnGuardar);
		
		lblNewLabel = new JLabel("Gestión de operadores");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel.setBounds(129, 25, 156, 25);
		contentPane.add(lblNewLabel);
		
		lblNewLabel_8 = new JLabel("ID de transporte:");
		lblNewLabel_8.setBounds(64, 236, 128, 14);
		contentPane.add(lblNewLabel_8);
		
		txtidtransporte = new JTextField();
		txtidtransporte.setBounds(241, 233, 86, 20);
		contentPane.add(txtidtransporte);
		txtidtransporte.setColumns(10);
	}

}
