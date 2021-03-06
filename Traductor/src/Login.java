import java.awt.EventQueue;
import java.awt.Window;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JMenuBar;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Login extends Registro{

	public JFrame frmLogin;
	public JTextField textFieldUser;
	public JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login window = new Login();
					window.frmLogin.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Login() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	public void initialize() {
		frmLogin = new JFrame();
		frmLogin.setTitle("LOGIN");
		frmLogin.setBounds(100, 100, 450, 300);
		frmLogin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmLogin.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Por favor, introduzca su usuario y contraseña");
		lblNewLabel.setBounds(71, 31, 302, 25);
		frmLogin.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Usuario:");
		lblNewLabel_1.setBounds(71, 84, 61, 16);
		frmLogin.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Password:");
		lblNewLabel_2.setBounds(71, 121, 72, 16);
		frmLogin.getContentPane().add(lblNewLabel_2);
		
		textFieldUser = new JTextField();
		textFieldUser.setBounds(175, 79, 130, 26);
		frmLogin.getContentPane().add(textFieldUser);
		textFieldUser.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(175, 116, 130, 26);
		frmLogin.getContentPane().add(passwordField);
		
		JButton btnAceptar = new JButton("Ingresar");
		btnAceptar.setBounds(297, 184, 117, 29);
		frmLogin.getContentPane().add(btnAceptar);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.setBounds(31, 184, 117, 29);
		frmLogin.getContentPane().add(btnSalir);
		
		JMenuBar menuBar = new JMenuBar();
		frmLogin.setJMenuBar(menuBar);
		
		JMenu mnMenud = new JMenu("MENU");
		menuBar.add(mnMenud);
		
		JMenuItem mntmRegistro = new JMenuItem("REGISTRO");
		mnMenud.add(mntmRegistro);
		
		//EVENTOS
		
	    // Boton salir
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		
		
		//REGISTRO
		
		mntmRegistro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Registro nuevoRegistro = new Registro(); 
					nuevoRegistro.frmRegistro.setVisible(true);
					frmLogin.dispose();//setVisible(false);
				
			}
		});
		
		//Boton Login
		
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				char[] contraseña = passwordField.getPassword();
				String contraseñaFinal = new String(contraseña);
				
				//en lugar de comparar con una cadena de texto voy a comparar el campo usuario con el contenido de la array de usuarios
				//nombre = contraseña, y entra como valido
				
				//esto sería otra forma de meter el usuario en la que tanto user como password tiene que ser lo mismo, sino da error
				
				
				if(!textFieldUser.getText().isEmpty() && !passwordField.getText().isEmpty() && textFieldUser.getText().equals(passwordField.getText())){
				//if(textFieldUser.getText().equals("miguel") && contraseñaFinal.equals("more")){
					
					JOptionPane.showMessageDialog(null, "Usted se ha logueado", "Ingresaste", JOptionPane.INFORMATION_MESSAGE);
					
				     //llamo a principal para mostrar el traductor.
					 Principal p = new Principal();
					p.frmTraductor.setVisible(true);
					frmLogin.dispose();//setVisible(false);
					
				}else{
					
					JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrestos", "ERROR", JOptionPane.ERROR_MESSAGE);
					
					textFieldUser.setText("");
					passwordField.setText("");
					textFieldUser.requestFocus(); //pone el cursor en este caso en el textFieldUser
				}
			}
		});
	}
}
