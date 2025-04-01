package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;


import model.tipotransportes;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;

public class JAtipostransportes extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtnombre;
	private JTextField txtobservacion;
	private JTextField txtidtipotransporte;
	tipotransportes tit = new tipotransportes();


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JAtipostransportes frame = new JAtipostransportes();
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
	public JAtipostransportes() {
		setTitle("Tipos de transporte");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 517, 254);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Gestión de tipos de transporte");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel.setBounds(101, 23, 216, 19);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Nombre: ");
		lblNewLabel_1.setBounds(52, 77, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Observación: ");
		lblNewLabel_2.setBounds(52, 118, 98, 14);
		contentPane.add(lblNewLabel_2);
		
		txtnombre = new JTextField();
		txtnombre.setBounds(248, 74, 86, 20);
		contentPane.add(txtnombre);
		txtnombre.setColumns(10);
		
		txtobservacion = new JTextField();
		txtobservacion.setBounds(248, 115, 86, 20);
		contentPane.add(txtobservacion);
		txtobservacion.setColumns(10);
		
		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				tit.Create(txtnombre.getText(), txtobservacion.getText());
			
			
				
			}
		});
		btnGuardar.setBounds(158, 164, 89, 23);
		contentPane.add(btnGuardar);
		
		JLabel lblNewLabel_3 = new JLabel("ID tipos de transporte:");
		lblNewLabel_3.setBounds(361, 77, 130, 14);
		contentPane.add(lblNewLabel_3);
		
		txtidtipotransporte = new JTextField();
		txtidtipotransporte.setBounds(379, 102, 86, 20);
		contentPane.add(txtidtipotransporte);
		txtidtipotransporte.setColumns(10);
		
		JButton btnidtipotransporte = new JButton("");
		btnidtipotransporte.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				tit.delete(Integer.parseInt(txtidtipotransporte.getText()));
				
			}
		});
		btnidtipotransporte.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Downloads\\616650_bin_delete_garbage_trash_icon.png"));
		btnidtipotransporte.setBounds(389, 133, 68, 54);
		contentPane.add(btnidtipotransporte);
	}

}
