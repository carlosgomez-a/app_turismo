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
import javax.swing.ImageIcon;

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
	private JLabel lblNewLabel_9;
	private JTextField txtidoperadores;
	private JButton btndelete;
	operadores op = new operadores();
	private JLabel lblNewLabel_10;
	private JButton btnRead;
	private JLabel lblNewLabel_11;
	private JLabel lblNewLabel_12;
	private JButton btnupdate;

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
		setBounds(100, 100, 400, 495);
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
				
				
				op.Create(txttipodocumento.getText(), txtnumerodocumento.getText(), txtnombres.getText(), txtapellidos.getText(), txtdireccion.getText(), txtcorreoelectronico.getText(), txttelefono.getText(), Integer.parseInt(txtidtransporte.getText()));
				
			}
		});
		btnGuardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnGuardar.setBounds(160, 422, 89, 23);
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
		
		lblNewLabel_9 = new JLabel("ID de operadores:");
		lblNewLabel_9.setBounds(175, 280, 97, 14);
		contentPane.add(lblNewLabel_9);
		
		txtidoperadores = new JTextField();
		txtidoperadores.setBounds(175, 305, 86, 20);
		contentPane.add(txtidoperadores);
		txtidoperadores.setColumns(10);
		
		btndelete = new JButton("");
		btndelete.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				op.delete(Integer.parseInt(txtidoperadores.getText()));
				
				txtidoperadores.setText("");
				
			}
		});
		btndelete.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Downloads\\616650_bin_delete_garbage_trash_icon.png"));
		btndelete.setBounds(175, 346, 74, 43);
		btndelete.setContentAreaFilled(false);
		contentPane.add(btndelete);
		
		lblNewLabel_10 = new JLabel("Consultar");
		lblNewLabel_10.setBounds(88, 400, 58, 14);
		contentPane.add(lblNewLabel_10);
		
		btnRead = new JButton("");
		btnRead.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				op.readOne(Integer.parseInt(txtidoperadores.getText()), txttipodocumento, txtnumerodocumento, txtnombres, txtapellidos, txtdireccion, txtcorreoelectronico, txttelefono, txtidtransporte);
			}
		});
		btnRead.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Downloads\\613531_find_glass_magnifying_search_zoom_icon.png"));
		btnRead.setBounds(79, 352, 53, 37);
		btnRead.setContentAreaFilled(false);
		contentPane.add(btnRead);
		
		lblNewLabel_11 = new JLabel("Eliminar");
		lblNewLabel_11.setBounds(185, 400, 46, 14);
		contentPane.add(lblNewLabel_11);
		
		lblNewLabel_12 = new JLabel("Actualizar");
		lblNewLabel_12.setBounds(269, 400, 86, 14);
		contentPane.add(lblNewLabel_12);
		
		btnupdate = new JButton("");
		btnupdate.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Downloads\\9554514_sync_reload_refresh_update_repeat_icon.png"));
		btnupdate.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				op.Update(Integer.parseInt(txtidoperadores.getText()),txttipodocumento.getText(), txtnumerodocumento.getText(), txtnombres.getText(), txtapellidos.getText(), txtdireccion.getText(), txtcorreoelectronico.getText(), txttelefono.getText(), Integer.parseInt(txtidtransporte.getText()));
			}
		});
		btnupdate.setBounds(269, 352, 58, 43);
		btnupdate.setContentAreaFilled(false);
		contentPane.add(btnupdate);
	}

}
