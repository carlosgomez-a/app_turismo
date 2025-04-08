package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.ImageIcon;
import java.awt.Color;

public class JAinterfaz extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JAinterfaz frame = new JAinterfaz();
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
	public JAinterfaz() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 304, 506);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(170, 213, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnAgencias = new JButton("Agencia");
		btnAgencias.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				JAAgencias ag = new JAAgencias();
				
				ag.setVisible(true);
			}
		});
		btnAgencias.setBounds(78, 130, 142, 23);
		contentPane.add(btnAgencias);
		
		JButton btnPaquetes = new JButton("Paquetes");
		btnPaquetes.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				JApaquetes pa = new JApaquetes();
				
				pa.setVisible(true);
			}
		});
		btnPaquetes.setBounds(78, 164, 142, 23);
		contentPane.add(btnPaquetes);
		
		JButton btnclientes = new JButton("Clientes");
		btnclientes.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				JAClientes cli = new JAClientes();
				cli.setVisible(true);
			}
		});
		btnclientes.setBounds(78, 334, 142, 23);
		contentPane.add(btnclientes);
		
		JButton btnmedios = new JButton("Medios");
		btnmedios.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				JAmedios me = new JAmedios();
				me.setVisible(true);
			}
		});
		btnmedios.setBounds(78, 367, 142, 23);
		contentPane.add(btnmedios);
		
		JButton btnpromotores = new JButton("Promotores");
		btnpromotores.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				JApromotores pro = new JApromotores();
				
				pro.setVisible(true);
			}
		});
		btnpromotores.setBounds(78, 198, 142, 23);
		contentPane.add(btnpromotores);
		
		JButton btnTransporte = new JButton("Transporte");
		btnTransporte.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				JAtransporte tra = new JAtransporte();
				tra.setVisible(true);
			}
		});
		btnTransporte.setBounds(78, 300, 142, 23);
		contentPane.add(btnTransporte);
		
		JButton btnOperadores = new JButton("Operadores");
		btnOperadores.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JAoperadores ope = new JAoperadores();
				ope.setVisible(true);
			}
		});
		btnOperadores.setBounds(78, 232, 142, 23);
		contentPane.add(btnOperadores);
		
		JButton btnCompañia = new JButton("Compañia");
		btnCompañia.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				JACompania co = new JACompania();
				co.setVisible(true);
			}
		});
		btnCompañia.setBounds(78, 96, 142, 23);
		contentPane.add(btnCompañia);
		
		JButton btnTipostransporte = new JButton("Tipos de transporte");
		btnTipostransporte.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				JAtipostransportes tit = new JAtipostransportes();
				
				tit.setVisible(true);
			}
		});
		btnTipostransporte.setBounds(78, 266, 142, 23);
		contentPane.add(btnTipostransporte);
		
		JButton btnTiposmedios = new JButton("Tipos de medios ");
		btnTiposmedios.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				JAtiposmedios tme = new JAtiposmedios();
				tme.setVisible(true);
			}
		});
		btnTiposmedios.setBounds(78, 401, 142, 23);
		contentPane.add(btnTiposmedios);
		
		JLabel lblNewLabel = new JLabel("Menu");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel.setBounds(78, 29, 60, 48);
		contentPane.add(lblNewLabel);
		
		JButton btnMenu = new JButton("");
		btnMenu.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Downloads\\4635984_home_house_start_ui_ux_icon.png"));
		btnMenu.setBounds(160, 29, 60, 48);
		contentPane.add(btnMenu);
	}

}
