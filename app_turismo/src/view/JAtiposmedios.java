package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import model.tiposmedios;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Font;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class JAtiposmedios extends JFrame {
 
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtnombre;
	private JTextField txtobservacion;
	private JTextField txtidtiposmedios;
	tiposmedios cr = new tiposmedios();


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JAtiposmedios frame = new JAtiposmedios();
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
	public JAtiposmedios() {
		setTitle("Tipos De Medios");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 390, 411);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Nombre: ");
		lblNewLabel_1.setBounds(52, 84, 122, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Observación: ");
		lblNewLabel_2.setBounds(52, 121, 111, 14);
		contentPane.add(lblNewLabel_2);
		
		txtnombre = new JTextField();
		txtnombre.setBounds(232, 78, 86, 20);
		contentPane.add(txtnombre);
		txtnombre.setColumns(10);
		
		txtobservacion = new JTextField();
		txtobservacion.setBounds(232, 115, 86, 20);
		contentPane.add(txtobservacion);
		txtobservacion.setColumns(10);
		
		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				cr.Create(txtnombre.getText(),txtobservacion.getText());
			}
		});
		btnGuardar.setBounds(204, 327, 89, 23);
		contentPane.add(btnGuardar);
		
		JLabel lblNewLabel_1_1 = new JLabel("Gestión de tipos de medios");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1_1.setBounds(106, 26, 176, 38);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel = new JLabel("ID tipos de medios:");
		lblNewLabel.setBounds(141, 167, 133, 14);
		contentPane.add(lblNewLabel);
		
		txtidtiposmedios = new JTextField();
		txtidtiposmedios.setBounds(141, 192, 86, 20);
		contentPane.add(txtidtiposmedios);
		txtidtiposmedios.setColumns(10);
		
		JButton btndelete = new JButton("");
		btndelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btndelete.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				cr.delete(Integer.parseInt(txtidtiposmedios.getText()));
				
				txtidtiposmedios.setText("");
				
				
			}
		});
		btndelete.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Downloads\\616650_bin_delete_garbage_trash_icon.png"));
		btndelete.setBounds(161, 223, 73, 50);
		btndelete.setContentAreaFilled(false);
		contentPane.add(btndelete);
		
		JButton btnRead = new JButton("");
		btnRead.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnRead.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				cr.readOne(Integer.parseInt(txtidtiposmedios.getText()), txtnombre, txtobservacion);
			}
		});
		btnRead.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Downloads\\613531_find_glass_magnifying_search_zoom_icon.png"));
		btnRead.setBounds(80, 235, 49, 38);
		btnRead.setContentAreaFilled(false);
		contentPane.add(btnRead);
		
		JLabel lblNewLabel_3 = new JLabel("Consultar ");
		lblNewLabel_3.setBounds(80, 283, 59, 14);
		contentPane.add(lblNewLabel_3);
		btnRead.setContentAreaFilled(false);
		
		JButton btnupdate = new JButton("");
		btnupdate.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				cr.Update(Integer.parseInt(txtidtiposmedios.getText()), txtnombre.getText(), txtobservacion.getText());
			}
		});
		btnupdate.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Downloads\\9554514_sync_reload_refresh_update_repeat_icon.png"));
		btnupdate.setBounds(259, 223, 59, 50);
		contentPane.add(btnupdate);
		
		JLabel lblNewLabel_4 = new JLabel("Eliminar");
		lblNewLabel_4.setBounds(171, 284, 46, 14);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Actualizar");
		lblNewLabel_5.setBounds(269, 283, 67, 14);
		btnupdate.setContentAreaFilled(false);
		contentPane.add(lblNewLabel_5);
		
		JButton btnAtras = new JButton("Atrás");
		btnAtras.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				JAinterfaz atras = new JAinterfaz();
				
				atras.setVisible(true);
			}
		});
		btnAtras.setBounds(80, 327, 89, 23);
		contentPane.add(btnAtras);
	}
}
