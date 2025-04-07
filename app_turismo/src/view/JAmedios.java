package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import model.medios;


import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

 
public class JAmedios extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtnombre;
	private JTextField txtobservacion;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_3;
	private JTextField txtidtiposmedios;
	private JLabel lblNewLabel_4;
	private JTextField txtidmedios;
	private JButton btndelete;
	medios me = new medios();
	private JLabel lblNewLabel_5;
	private JButton btnupdate;
	private JLabel lblNewLabel_6;
	private JLabel lblNewLabel_7;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JAmedios frame = new JAmedios();
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
	public JAmedios() {
		setTitle("Medios");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 367, 417);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Nombre: ");
		lblNewLabel_1.setBounds(59, 84, 108, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Observación: ");
		lblNewLabel_2.setBounds(59, 109, 94, 14);
		contentPane.add(lblNewLabel_2);
		
		txtnombre = new JTextField();
		txtnombre.setBounds(221, 78, 86, 20);
		contentPane.add(txtnombre);
		txtnombre.setColumns(10);
		
		txtobservacion = new JTextField();
		txtobservacion.setBounds(221, 103, 86, 20);
		contentPane.add(txtobservacion);
		txtobservacion.setColumns(10);
		
		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				me.Create(txtnombre.getText(), txtobservacion.getText(), Integer.parseInt(txtidtiposmedios.getText()));
			}
		});
		btnGuardar.setBounds(146, 344, 89, 23);
		contentPane.add(btnGuardar);
		
		lblNewLabel = new JLabel("Gestión de medios");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel.setBounds(146, 32, 143, 20);
		contentPane.add(lblNewLabel);
		
		lblNewLabel_3 = new JLabel("ID tipo de medios ");
		lblNewLabel_3.setBounds(59, 134, 131, 14);
		contentPane.add(lblNewLabel_3);
		
		txtidtiposmedios = new JTextField();
		txtidtiposmedios.setBounds(221, 134, 86, 20);
		contentPane.add(txtidtiposmedios);
		txtidtiposmedios.setColumns(10);
		
		lblNewLabel_4 = new JLabel("ID de medios:");
		lblNewLabel_4.setBounds(158, 193, 86, 14);
		contentPane.add(lblNewLabel_4);
		
		txtidmedios = new JTextField();
		txtidmedios.setBounds(141, 218, 86, 20);
		contentPane.add(txtidmedios);
		txtidmedios.setColumns(10);
		
		btndelete = new JButton("");
		btndelete.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
			me.delete(Integer.parseInt(txtidmedios.getText()));
			
			txtidmedios.setText("");
			}
		});
		btndelete.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Downloads\\616650_bin_delete_garbage_trash_icon.png"));
		btndelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btndelete.setBounds(146, 260, 69, 44);
		btndelete.setContentAreaFilled(false);
		contentPane.add(btndelete);
		
		lblNewLabel_5 = new JLabel("Consultar");
		lblNewLabel_5.setBounds(45, 315, 46, 14);
		contentPane.add(lblNewLabel_5);
		
		JButton btnRead = new JButton("");
		btnRead.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				me.readOne(Integer.parseInt(txtidmedios.getText()), txtnombre, txtobservacion, txtidtiposmedios);
			}
		});
		btnRead.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Downloads\\613531_find_glass_magnifying_search_zoom_icon.png"));
		btnRead.setBounds(45, 260, 61, 44);
		btnRead.setContentAreaFilled(false);
		contentPane.add(btnRead);
		
		btnupdate = new JButton("");
		btnupdate.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				me.Update(Integer.parseInt(txtidmedios.getText()), txtnombre.getText(), txtobservacion.getText(), Integer.parseInt(txtidtiposmedios.getText()));
			}
		});
		btnupdate.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Downloads\\9554514_sync_reload_refresh_update_repeat_icon.png"));
		btnupdate.setBounds(251, 260, 49, 44);
		contentPane.add(btnupdate);
		
		lblNewLabel_6 = new JLabel("Eliminar");
		lblNewLabel_6.setBounds(156, 315, 46, 14);
		contentPane.add(lblNewLabel_6);
		
		lblNewLabel_7 = new JLabel("Actualizar");
		lblNewLabel_7.setBounds(251, 315, 75, 14);
		btnupdate.setContentAreaFilled(false);
		contentPane.add(lblNewLabel_7);
	}
}
