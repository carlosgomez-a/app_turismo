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
	private JLabel lblNewLabel_9;
	private JButton btnRead;
	private JButton btnNewButton;
	private JLabel lblNewLabel_10;
	private JLabel lblNewLabel_11;

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
		setBounds(100, 100, 391, 513);
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
		btnGuardar.setBounds(129, 440, 89, 23);
		contentPane.add(btnGuardar);
		
		lblNewLabel = new JLabel("Gestión de compañia");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel.setBounds(129, 22, 136, 28);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_8 = new JLabel("ID de la compañia:");
		lblNewLabel_8.setBounds(151, 286, 91, 14);
		contentPane.add(lblNewLabel_8);
		
		txtidcompania = new JTextField();
		txtidcompania.setBounds(151, 311, 86, 20);
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
		btndelete.setBounds(161, 342, 55, 57);
		btndelete.setContentAreaFilled(false);
		contentPane.add(btndelete);
		
		lblNewLabel_9 = new JLabel("Consultar");
		lblNewLabel_9.setBounds(74, 410, 49, 14);
		contentPane.add(lblNewLabel_9);
		
		btnRead = new JButton("");
		btnRead.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cc.readOne(Integer.parseInt(txtidcompania.getText()), txtrazonsocial, txtdirrecion, txtcorreoelectronico, txtelefono, txtfechacreacion, txtweb, txtobservacion);
			}
		});
		btnRead.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Downloads\\613531_find_glass_magnifying_search_zoom_icon.png"));
		btnRead.setBounds(60, 353, 63, 46);
		btnRead.setContentAreaFilled(false);
		contentPane.add(btnRead);
		
		btnNewButton = new JButton("");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				cc.Update(Integer.parseInt(txtidcompania.getText()), txtrazonsocial.getText(), txtdirrecion.getText(), txtcorreoelectronico.getText(), Integer.parseInt(txtelefono.getText()) , txtfechacreacion.getText(), txtweb.getText(), txtobservacion.getText());
			}
		});
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Downloads\\9554514_sync_reload_refresh_update_repeat_icon.png"));
		btnNewButton.setBounds(244, 353, 57, 46);
		contentPane.add(btnNewButton);
		
		lblNewLabel_10 = new JLabel("Eliminar");
		lblNewLabel_10.setBounds(171, 410, 46, 14);
		contentPane.add(lblNewLabel_10);
		
		lblNewLabel_11 = new JLabel("Actualizar");
		lblNewLabel_11.setBounds(254, 410, 71, 14);
		contentPane.add(lblNewLabel_11);
	}
}
