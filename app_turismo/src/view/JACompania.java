package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import model.Compania;


import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class JACompania extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtrazonsocial;
	private JTextField txtdirrecion;
	private JTextField txtcorreoelectronico;
	private JTextField txtelefono;
	private JTextField txtfechacreacion;
	private JTextField txtweb;
	private JTextField txtobservacion;
	private JLabel lblNewLabel;
	private JTextField txtidcompania;
	Compania cc = new Compania();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JACompania frame = new JACompania();
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
	public JACompania() {
		setTitle("Compañia");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 498, 383);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Razon Social:");
		lblNewLabel_1.setBounds(60, 82, 104, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Direción:");
		lblNewLabel_2.setBounds(60, 110, 104, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Correo Electronico:");
		lblNewLabel_3.setBounds(60, 135, 127, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Telefono: ");
		lblNewLabel_4.setBounds(60, 160, 104, 14);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Fecha De Creación:");
		lblNewLabel_5.setBounds(60, 185, 127, 14);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Web: ");
		lblNewLabel_6.setBounds(60, 210, 92, 14);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Observación: ");
		lblNewLabel_7.setBounds(60, 235, 92, 14);
		contentPane.add(lblNewLabel_7);
		
		txtrazonsocial = new JTextField();
		txtrazonsocial.setBounds(215, 73, 86, 20);
		contentPane.add(txtrazonsocial);
		txtrazonsocial.setColumns(10);
		
		txtdirrecion = new JTextField();
		txtdirrecion.setBounds(215, 101, 86, 20);
		contentPane.add(txtdirrecion);
		txtdirrecion.setColumns(10);
		
		txtcorreoelectronico = new JTextField();
		txtcorreoelectronico.setBounds(215, 126, 86, 20);
		contentPane.add(txtcorreoelectronico);
		txtcorreoelectronico.setColumns(10);
		
		txtelefono = new JTextField();
		txtelefono.setBounds(215, 154, 86, 20);
		contentPane.add(txtelefono);
		txtelefono.setColumns(10);
		
		txtfechacreacion = new JTextField();
		txtfechacreacion.setBounds(215, 179, 86, 20);
		contentPane.add(txtfechacreacion);
		txtfechacreacion.setColumns(10);
		
		txtweb = new JTextField();
		txtweb.setBounds(215, 204, 86, 20);
		contentPane.add(txtweb);
		txtweb.setColumns(10);
		
		txtobservacion = new JTextField();
		txtobservacion.setBounds(215, 232, 86, 20);
		contentPane.add(txtobservacion);
		txtobservacion.setColumns(10);
		
		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnGuardar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
			
				cc.Create (txtrazonsocial.getText(), txtdirrecion.getText(), txtcorreoelectronico.getText(), Integer.parseInt(txtelefono.getText()) , txtfechacreacion.getText(), txtweb.getText(), txtobservacion.getText());
				
			}
		});
		btnGuardar.setBounds(138, 292, 89, 23);
		contentPane.add(btnGuardar);
		
		lblNewLabel = new JLabel("Gestión de compañia");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel.setBounds(136, 21, 136, 28);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_8 = new JLabel("ID de la compañia:");
		lblNewLabel_8.setBounds(355, 82, 91, 14);
		contentPane.add(lblNewLabel_8);
		
		txtidcompania = new JTextField();
		txtidcompania.setBounds(355, 107, 86, 20);
		contentPane.add(txtidcompania);
		txtidcompania.setColumns(10);
		
		JButton btndelete = new JButton("");
		btndelete.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				cc.delete(Integer.parseInt(txtidcompania.getText()));
				
				txtidcompania.setText("");
				
			}
		});
		btndelete.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Downloads\\616650_bin_delete_garbage_trash_icon.png"));
		btndelete.setBounds(365, 135, 61, 57);
		contentPane.add(btndelete);
	}
}
