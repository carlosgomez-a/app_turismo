package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import model.transporte;

import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class JAtransporte extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtmatricula;
	private JTextField txtmarca;
	private JTextField txtpuestos;
	private JTextField txtcategoria;
	private JTextField txtnumeromotor;
	private JTextField txtmodelo;
	private JTextField txtidtipotransporte;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JAtransporte frame = new JAtransporte();
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
	public JAtransporte() {
		setTitle("Transporte");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 338);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Gestión de transporte");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel.setBounds(102, 11, 197, 34);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Matricula: ");
		lblNewLabel_1.setBounds(56, 72, 98, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Marca:");
		lblNewLabel_2.setBounds(56, 97, 98, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Puestos:");
		lblNewLabel_3.setBounds(56, 122, 98, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Categoria: ");
		lblNewLabel_4.setBounds(56, 174, 98, 14);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Numero de motor: ");
		lblNewLabel_5.setBounds(56, 199, 114, 14);
		contentPane.add(lblNewLabel_5);
		
		txtmatricula = new JTextField();
		txtmatricula.setBounds(213, 66, 86, 20);
		contentPane.add(txtmatricula);
		txtmatricula.setColumns(10);
		
		txtmarca = new JTextField();
		txtmarca.setBounds(213, 94, 86, 20);
		contentPane.add(txtmarca);
		txtmarca.setColumns(10);
		
		txtpuestos = new JTextField();
		txtpuestos.setBounds(213, 119, 86, 20);
		contentPane.add(txtpuestos);
		txtpuestos.setColumns(10);
		
		txtcategoria = new JTextField();
		txtcategoria.setBounds(213, 171, 86, 20);
		contentPane.add(txtcategoria);
		txtcategoria.setColumns(10);
		
		txtnumeromotor = new JTextField();
		txtnumeromotor.setBounds(213, 196, 86, 20);
		contentPane.add(txtnumeromotor);
		txtnumeromotor.setColumns(10);
		
		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				transporte tra = new transporte();
				tra.Create(txtmatricula.getText(), txtmarca.getText(), Integer.parseInt(txtpuestos.getText()), txtmodelo.getText(), txtcategoria.getText(), txtnumeromotor.getText(), Integer.parseInt(txtidtipotransporte.getText()));
				
			}
		});
		btnGuardar.setBounds(138, 265, 89, 23);
		contentPane.add(btnGuardar);
		
		JLabel lblNewLabel_6 = new JLabel("Modelo: ");
		lblNewLabel_6.setBounds(56, 147, 98, 14);
		contentPane.add(lblNewLabel_6);
		
		txtmodelo = new JTextField();
		txtmodelo.setBounds(213, 144, 86, 20);
		contentPane.add(txtmodelo);
		txtmodelo.setColumns(10);
		
		JLabel lblNewLabel_7 = new JLabel("ID de tipo de transporte:");
		lblNewLabel_7.setBounds(56, 231, 131, 14);
		contentPane.add(lblNewLabel_7);
		
		txtidtipotransporte = new JTextField();
		txtidtipotransporte.setBounds(213, 228, 86, 20);
		contentPane.add(txtidtipotransporte);
		txtidtipotransporte.setColumns(10);
	}
}
