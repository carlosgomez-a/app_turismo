package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import model.Clientes;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;

public class JAClientes extends JFrame {
 
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txttipodocumento;
	private JTextField txtnumerodocumento;
	private JTextField txtnombre;
	private JTextField txtapellido;
	private JTextField txteps;
	private JTextField txtalergia;
	private JTextField txtfechanacimiento;
	private JTextField txtcorreoelectronico;
	private JTextField txtestadocivil;
	private JTextField txttelefono;
	private JTextField txtdirecion;
	Clientes cl = new Clientes();
	private JTextField txtidclientes;
	private JTextField txtconsulta;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JAClientes frame = new JAClientes();
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
	public JAClientes() {
		setTitle("Clientes");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 541, 482);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Tipo de documento: ");
		lblNewLabel.setBounds(63, 62, 110, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Numero de documento: ");
		lblNewLabel_1.setBounds(63, 87, 139, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Nombres: ");
		lblNewLabel_2.setBounds(63, 112, 110, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Apellidos: ");
		lblNewLabel_3.setBounds(63, 137, 123, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("EPS:");
		lblNewLabel_4.setBounds(63, 162, 46, 14);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Alergias: ");
		lblNewLabel_5.setBounds(63, 187, 46, 14);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Fecha de nacimiento: ");
		lblNewLabel_6.setBounds(63, 212, 123, 14);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Correo electronico: ");
		lblNewLabel_7.setBounds(63, 239, 110, 14);
		contentPane.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("Estado civil: ");
		lblNewLabel_8.setBounds(63, 264, 110, 14);
		contentPane.add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("Telefono:");
		lblNewLabel_9.setBounds(63, 291, 46, 14);
		contentPane.add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("Dirección:");
		lblNewLabel_10.setBounds(63, 316, 97, 14);
		contentPane.add(lblNewLabel_10);
		
		JLabel lblNewLabel_11 = new JLabel("Gestión de clientes");
		lblNewLabel_11.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_11.setBounds(196, 11, 139, 26);
		contentPane.add(lblNewLabel_11);
		
		txttipodocumento = new JTextField();
		txttipodocumento.setBounds(249, 59, 86, 20);
		contentPane.add(txttipodocumento);
		txttipodocumento.setColumns(10);
		
		txtnumerodocumento = new JTextField();
		txtnumerodocumento.setBounds(249, 84, 86, 20);
		contentPane.add(txtnumerodocumento);
		txtnumerodocumento.setColumns(10);
		
		txtnombre = new JTextField();
		txtnombre.setBounds(249, 109, 86, 20);
		contentPane.add(txtnombre);
		txtnombre.setColumns(10);
		
		txtapellido = new JTextField();
		txtapellido.setBounds(249, 134, 86, 20);
		contentPane.add(txtapellido);
		txtapellido.setColumns(10);
		
		txteps = new JTextField();
		txteps.setBounds(249, 159, 86, 20);
		contentPane.add(txteps);
		txteps.setColumns(10);
		
		txtalergia = new JTextField();
		txtalergia.setBounds(249, 184, 86, 20);
		contentPane.add(txtalergia);
		txtalergia.setColumns(10);
		
		txtfechanacimiento = new JTextField();
		txtfechanacimiento.setBounds(249, 212, 86, 20);
		contentPane.add(txtfechanacimiento);
		txtfechanacimiento.setColumns(10);
		
		txtcorreoelectronico = new JTextField();
		txtcorreoelectronico.setBounds(249, 239, 86, 20);
		contentPane.add(txtcorreoelectronico);
		txtcorreoelectronico.setColumns(10);
		
		txtestadocivil = new JTextField();
		txtestadocivil.setBounds(249, 264, 86, 20);
		contentPane.add(txtestadocivil);
		txtestadocivil.setColumns(10);
		
		txttelefono = new JTextField();
		txttelefono.setBounds(249, 291, 86, 20);
		contentPane.add(txttelefono);
		txttelefono.setColumns(10);
		
		txtdirecion = new JTextField();
		txtdirecion.setBounds(249, 316, 86, 20);
		contentPane.add(txtdirecion);
		txtdirecion.setColumns(10);
		
		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
		
				cl.Create(txttipodocumento.getText(), Integer.parseInt(txtnumerodocumento.getText()), txtnombre.getText(), txtapellido.getText(), txteps.getText(), txtalergia.getText(), txtfechanacimiento.getText(), txtcorreoelectronico.getText(), txtestadocivil.getText(), txttelefono.getText(), txtdirecion.getText());

			
			}
		});
		btnGuardar.setBounds(198, 400, 89, 23);
		contentPane.add(btnGuardar);
		
		JLabel lblNewLabel_12 = new JLabel("ID de clientes:");
		lblNewLabel_12.setBounds(395, 62, 86, 14);
		contentPane.add(lblNewLabel_12);
		
		txtidclientes = new JTextField();
		txtidclientes.setBounds(384, 87, 86, 20);
		contentPane.add(txtidclientes);
		txtidclientes.setColumns(10);
		
		JButton btndelete = new JButton("");
		btndelete.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				cl.delete(Integer.parseInt(txtidclientes.getText()));
				
				txtidclientes.setText("");
			}
		});
		btndelete.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Downloads\\616650_bin_delete_garbage_trash_icon.png"));
		btndelete.setBounds(384, 118, 81, 58);
		btndelete.setContentAreaFilled(false);
		contentPane.add(btndelete);
		
		JLabel lblNewLabel_13 = new JLabel("Consultar Registros");
		lblNewLabel_13.setBounds(63, 356, 110, 14);
		contentPane.add(lblNewLabel_13);
		
		txtconsulta = new JTextField();
		txtconsulta.setBounds(215, 353, 86, 20);
		contentPane.add(txtconsulta);
		txtconsulta.setColumns(10);
		
		JButton btnConsultar = new JButton("");
		btnConsultar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				cl.readOne(Integer.parseInt(txtconsulta.getText()), txttipodocumento, txtnumerodocumento, txtnombre, txtapellido, txteps, txtalergia, txtfechanacimiento, txtcorreoelectronico, txtestadocivil, txttelefono, txtalergia);
				
			}
		});
		btnConsultar.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Downloads\\613531_find_glass_magnifying_search_zoom_icon.png"));
		btnConsultar.setBounds(346, 341, 46, 41);
		btnConsultar.setContentAreaFilled(false);
		contentPane.add(btnConsultar);
	}
}
