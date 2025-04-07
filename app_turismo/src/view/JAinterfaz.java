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
		setBounds(100, 100, 646, 506);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnAgencias = new JButton("Agencia");
		btnAgencias.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				JAAgencias ag = new JAAgencias();
				
				ag.show();
			}
		});
		btnAgencias.setBounds(78, 130, 142, 23);
		contentPane.add(btnAgencias);
		
		JButton btnPaquetes = new JButton("Paquetes");
		btnPaquetes.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				JApaquetes pa = new JApaquetes();
				
				pa.show();
			}
		});
		btnPaquetes.setBounds(78, 164, 142, 23);
		contentPane.add(btnPaquetes);
		
		JButton btnclientes = new JButton("Clientes");
		btnclientes.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				JAClientes cli = new JAClientes();
				cli.show();
			}
		});
		btnclientes.setBounds(78, 334, 142, 23);
		contentPane.add(btnclientes);
		
		JButton btnmedios = new JButton("Medios");
		btnmedios.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				JAmedios me = new JAmedios();
				me.show();
			}
		});
		btnmedios.setBounds(78, 367, 142, 23);
		contentPane.add(btnmedios);
		
		JButton btnpromotores = new JButton("Promotores");
		btnpromotores.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				JApromotores pro = new JApromotores();
				
				pro.show();
			}
		});
		btnpromotores.setBounds(78, 198, 142, 23);
		contentPane.add(btnpromotores);
		
		JButton btnTransporte = new JButton("Transporte");
		btnTransporte.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				JAtransporte tra = new JAtransporte();
				tra.show();
			}
		});
		btnTransporte.setBounds(78, 300, 142, 23);
		contentPane.add(btnTransporte);
		
		JButton btnOperadores = new JButton("Operadores");
		btnOperadores.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JAoperadores ope = new JAoperadores();
				ope.show();
			}
		});
		btnOperadores.setBounds(78, 232, 142, 23);
		contentPane.add(btnOperadores);
		
		JButton btnCompañia = new JButton("Compañia");
		btnCompañia.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				JACompania co = new JACompania();
				co.show();
			}
		});
		btnCompañia.setBounds(78, 96, 142, 23);
		contentPane.add(btnCompañia);
		
		JButton btnTipostransporte = new JButton("Tipos de transporte");
		btnTipostransporte.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				JAtipostransportes tit = new JAtipostransportes();
				
				tit.show();
			}
		});
		btnTipostransporte.setBounds(78, 266, 142, 23);
		contentPane.add(btnTipostransporte);
		
		JButton btnTiposmedios = new JButton("Tipos de medios ");
		btnTiposmedios.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				JAtiposmedios tme = new JAtiposmedios();
				tme.show();
			}
		});
		btnTiposmedios.setBounds(78, 401, 142, 23);
		contentPane.add(btnTiposmedios);
	}

}
