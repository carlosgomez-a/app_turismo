package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import model.Clientes;
import model.promotores;

import javax.swing.JPasswordField;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class JAprincipal extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	promotores acesso = new promotores ();
	private JPasswordField txtcontraseña;
	private JTextField txtusuario;
	
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JAprincipal frame = new JAprincipal();
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
	public JAprincipal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(170, 213, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Control Acceso");
		lblNewLabel.setForeground(new Color(0, 0, 0));
		lblNewLabel.setFont(new Font("Dialog", Font.PLAIN, 25));
		lblNewLabel.setBounds(116, 21, 189, 43);
		contentPane.add(lblNewLabel);
		
		txtcontraseña = new JPasswordField();
		txtcontraseña.setBounds(174, 166, 196, 20);
		contentPane.add(txtcontraseña);
		
		txtusuario = new JTextField();
		txtusuario.setBounds(174, 98, 196, 20);
		contentPane.add(txtusuario);
		txtusuario.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Usuario: ");
		lblNewLabel_1.setBounds(86, 101, 58, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Contraseña:");
		lblNewLabel_2.setBounds(86, 169, 72, 14);
		contentPane.add(lblNewLabel_2);
		
		JButton btningresar = new JButton("INGRESAR");
		btningresar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				JAinterfaz interfaz = new JAinterfaz();
				
				interfaz.setVisible(true);
			}
		});
		btningresar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				acesso.controlAcceso(Integer.parseInt(txtusuario.getText()), txtcontraseña.getText());
			}
		});
		btningresar.setBounds(162, 227, 89, 23);
		contentPane.add(btningresar);
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Downloads\\1564534_customer_man_user_account_profile_icon.png"));
		btnNewButton_1.setBounds(10, 87, 63, 43);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("");
		btnNewButton_2.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Downloads\\2537322_access_key_password_unlock_icon.png"));
		btnNewButton_2.setBounds(10, 141, 58, 48);
		contentPane.add(btnNewButton_2);
	}
}
