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
		setBounds(100, 100, 492, 300);
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
		btnGuardar.setBounds(146, 189, 89, 23);
		contentPane.add(btnGuardar);
		
		JLabel lblNewLabel_1_1 = new JLabel("Gestión de tipos de medios");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1_1.setBounds(106, 26, 176, 38);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel = new JLabel("ID tipos de medios:");
		lblNewLabel.setBounds(358, 84, 133, 14);
		contentPane.add(lblNewLabel);
		
		txtidtiposmedios = new JTextField();
		txtidtiposmedios.setBounds(358, 118, 86, 20);
		contentPane.add(txtidtiposmedios);
		txtidtiposmedios.setColumns(10);
		
		JButton btnidtiposmedios = new JButton("");
		btnidtiposmedios.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				cr.delete(Integer.parseInt(txtidtiposmedios.getText()));
				
				txtidtiposmedios.setText("");
				
				
			}
		});
		btnidtiposmedios.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Downloads\\616650_bin_delete_garbage_trash_icon.png"));
		btnidtiposmedios.setBounds(368, 149, 73, 50);
		contentPane.add(btnidtiposmedios);
	}
}
