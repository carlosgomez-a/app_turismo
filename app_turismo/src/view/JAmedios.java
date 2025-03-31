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

public class JAmedios extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtnombre;
	private JTextField txtobservacion;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_3;
	private JTextField txtidtiposmedios;

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
		setBounds(100, 100, 450, 271);
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
				
				medios me = new medios();
				me.Create(txtnombre.getText(), txtobservacion.getText(), Integer.parseInt(txtidtiposmedios.getText()));
			}
		});
		btnGuardar.setBounds(146, 179, 89, 23);
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
	}

}
