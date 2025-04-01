package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;


import model.promotores;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.ImageIcon;

public class JApromotores extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txttipodocumento;
	private JTextField txtnumerodocumento;
	private JTextField txtnombres;
	private JTextField txtapellidos;
	private JTextField txtdireccion;
	private JTextField txtcorreopersonal;
	private JTextField txtcorreocorporativo;
	private JTextField txtfechanacimiento;
	private JTextField txttelefono;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_10;
	private JTextField txtidpromotores;
	private JButton btnidpromotores;
	promotores op = new promotores();


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JApromotores frame = new JApromotores();
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
	public JApromotores() {
		setTitle("Promotores");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 482, 383);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Tipo de documento:");
		lblNewLabel_1.setBounds(66, 57, 136, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Numero de documento: ");
		lblNewLabel_2.setBounds(66, 82, 136, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Nombres:");
		lblNewLabel_3.setBounds(66, 107, 136, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Apellidos: ");
		lblNewLabel_4.setBounds(66, 135, 113, 14);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Dirección: ");
		lblNewLabel_5.setBounds(66, 160, 136, 14);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Correo personal: ");
		lblNewLabel_6.setBounds(66, 185, 136, 14);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Correo corporativo:");
		lblNewLabel_7.setBounds(66, 210, 136, 14);
		contentPane.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("Fecha de nacimiento:");
		lblNewLabel_8.setBounds(66, 235, 136, 14);
		contentPane.add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("Telefono");
		lblNewLabel_9.setBounds(66, 260, 113, 14);
		contentPane.add(lblNewLabel_9);
		
		txttipodocumento = new JTextField();
		txttipodocumento.setBounds(235, 54, 86, 20);
		contentPane.add(txttipodocumento);
		txttipodocumento.setColumns(10);
		
		txtnumerodocumento = new JTextField();
		txtnumerodocumento.setBounds(235, 79, 86, 20);
		contentPane.add(txtnumerodocumento);
		txtnumerodocumento.setColumns(10);
		
		txtnombres = new JTextField();
		txtnombres.setBounds(235, 104, 86, 20);
		contentPane.add(txtnombres);
		txtnombres.setColumns(10);
		
		txtapellidos = new JTextField();
		txtapellidos.setBounds(235, 132, 86, 20);
		contentPane.add(txtapellidos);
		txtapellidos.setColumns(10);
		
		txtdireccion = new JTextField();
		txtdireccion.setBounds(235, 157, 86, 20);
		contentPane.add(txtdireccion);
		txtdireccion.setColumns(10);
		
		txtcorreopersonal = new JTextField();
		txtcorreopersonal.setBounds(235, 182, 86, 20);
		contentPane.add(txtcorreopersonal);
		txtcorreopersonal.setColumns(10);
		
		txtcorreocorporativo = new JTextField();
		txtcorreocorporativo.setBounds(235, 207, 86, 20);
		contentPane.add(txtcorreocorporativo);
		txtcorreocorporativo.setColumns(10);
		
		txtfechanacimiento = new JTextField();
		txtfechanacimiento.setBounds(235, 232, 86, 20);
		contentPane.add(txtfechanacimiento);
		txtfechanacimiento.setColumns(10);
		
		txttelefono = new JTextField();
		txttelefono.setBounds(235, 257, 86, 20);
		contentPane.add(txttelefono);
		txttelefono.setColumns(10);
		
		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnGuardar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				op.Create(txttipodocumento.getText(), txtnumerodocumento.getText(), txtnombres.getText(), txtapellidos.getText(), txtdireccion.getText(), txtcorreopersonal.getText(), txtcorreocorporativo.getText(), txtfechanacimiento.getText(), txttelefono.getText());
				
			}
		});
		btnGuardar.setBounds(151, 300, 89, 23);
		contentPane.add(btnGuardar);
		
		lblNewLabel = new JLabel("Gestión de promotores");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel.setBounds(128, 11, 165, 20);
		contentPane.add(lblNewLabel);
		
		lblNewLabel_10 = new JLabel("ID de promotores: ");
		lblNewLabel_10.setBounds(353, 82, 103, 14);
		contentPane.add(lblNewLabel_10);
		
		txtidpromotores = new JTextField();
		txtidpromotores.setBounds(353, 117, 86, 20);
		contentPane.add(txtidpromotores);
		txtidpromotores.setColumns(10);
		
		btnidpromotores = new JButton("");
		btnidpromotores.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				op.delete(Integer.parseInt(txtidpromotores.getText()));
				txtidpromotores.setText("");
				
			}
		});
		btnidpromotores.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Downloads\\616650_bin_delete_garbage_trash_icon.png"));
		btnidpromotores.setBounds(360, 160, 67, 39);
		contentPane.add(btnidpromotores);
	}

}
