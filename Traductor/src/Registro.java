import java.awt.EventQueue;

import javax.swing.JFrame;
import com.toedter.calendar.JDateChooser;

//import Usuarios.Usuarios_;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JPanel;

public class Registro extends Usuarios{

	protected JFrame frmRegistro;
	protected JTextField textField;
	protected JTextField textField_2;
	protected JPasswordField passwordField;
	public int contador=0; //para registro de usuarios
	public String nombre;
	public String contrasena;
	public String correo;
	//protected arrayDato[];



	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Registro window = new Registro();
					window.frmRegistro.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Registro() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	public void initialize() {
		frmRegistro = new JFrame();
		frmRegistro.setTitle("REGISTRO");
		frmRegistro.setBounds(100, 100, 562, 300);
		frmRegistro.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmRegistro.getContentPane().setLayout(null);
		
		JDateChooser dateChooser = new JDateChooser();
		dateChooser.setBounds(376, 25, 131, 26);
		frmRegistro.getContentPane().add(dateChooser);
		
		JLabel lblNombre = new JLabel("*Nombre:");
		lblNombre.setBounds(21, 30, 61, 16);
		frmRegistro.getContentPane().add(lblNombre);
		
		JLabel lblApellido = new JLabel("Contraseña:");
		lblApellido.setBounds(21, 58, 81, 16);
		frmRegistro.getContentPane().add(lblApellido);
		
		textField = new JTextField();
		textField.setBounds(86, 25, 130, 26);
		frmRegistro.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Fecha de nacimiento:");
		lblNewLabel_1.setBounds(228, 30, 141, 16);
		frmRegistro.getContentPane().add(lblNewLabel_1);
		
		JButton btnAtras = new JButton("Atras");
		btnAtras.setBounds(6, 243, 117, 29);
		frmRegistro.getContentPane().add(btnAtras);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Si, deseo.");
		chckbxNewCheckBox.setSelected(true);
		chckbxNewCheckBox.setHorizontalAlignment(SwingConstants.CENTER);
		chckbxNewCheckBox.setBounds(123, 195, 128, 23);
		frmRegistro.getContentPane().add(chckbxNewCheckBox);
		
		JLabel lblCorreoElectronico = new JLabel("*Correo electronico:");
		lblCorreoElectronico.setBounds(228, 58, 141, 16);
		frmRegistro.getContentPane().add(lblCorreoElectronico);
		
		textField_2 = new JTextField();
		textField_2.setBounds(376, 53, 130, 26);
		frmRegistro.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Desea recibir correos de nuevas traducciones:");
		lblNewLabel.setBounds(123, 174, 289, 16);
		frmRegistro.getContentPane().add(lblNewLabel);
		
		JCheckBox chckbxNoDeseo = new JCheckBox("No, deseo.");
		chckbxNoDeseo.setHorizontalAlignment(SwingConstants.CENTER);
		chckbxNoDeseo.setBounds(292, 195, 128, 23);
		frmRegistro.getContentPane().add(chckbxNoDeseo);
		
		JButton btnRegistrar = new JButton("Registrar");
		btnRegistrar.setBounds(439, 243, 117, 29);
		frmRegistro.getContentPane().add(btnRegistrar);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(102, 53, 114, 26);
		frmRegistro.getContentPane().add(passwordField);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Masculino", "Femenino"}));
		comboBox.setBounds(241, 135, 117, 27);
		frmRegistro.getContentPane().add(comboBox);
		
		JLabel lblSexo = new JLabel("Sexo:");
		lblSexo.setBounds(197, 139, 61, 16);
		frmRegistro.getContentPane().add(lblSexo);
		
		//EVENTOS
		
		//Boton Registro
		btnRegistrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//cojo lo que se meta en los textfield
				nombre = textField.getText();
				correo = textField_2.getText();
				if(textField.getText().equals("") && textField_2.getText().equals("")){
					JOptionPane.showMessageDialog(null, "Por favor ingrese los campos obligatorios", "REGISTRO", JOptionPane.DEFAULT_OPTION);
					
				}else{
				//lo imprimo en la consola, la contraseña al estar difrada todavia no puedo ponerla
				 System.out.println("Usuario: " + nombre.toString() /*+ " - Contraseña: " + contrasena_usuario*/ + " - Email: " + correo.toString());
		       //salta el mensaje de registro y pone a "" todas las casillas
			    JOptionPane.showMessageDialog(null, "Usted ha sido registrado CORRECTAMENTE", "REGISTRO", JOptionPane.DEFAULT_OPTION);
		        textField.setText("");
				passwordField.setText("");
				textField_2.setText("");
				dateChooser.setCalendar(null); 
				chckbxNewCheckBox.setSelected(true);
				chckbxNoDeseo.setSelected(false);
				
				contador++; //sumo una posicion para que se puedan meter más datos
				}
			}
		});
		
		//checks
		
		chckbxNewCheckBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				chckbxNoDeseo.setSelected(false);	
			}
		});
		
		chckbxNoDeseo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				chckbxNewCheckBox.setSelected(false);
			}
		});
		
		//	BOTON ATRAS
		
		btnAtras.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Login atrasLogin = new Login();
				atrasLogin.frmLogin.setVisible(true);
				frmRegistro.dispose();//setVisible(false);
			}
		});
		
		
	}
}
