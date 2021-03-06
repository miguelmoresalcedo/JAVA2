import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;

public class Ejemplo {

	private JFrame frame;
	private JTextField txtSoyUnTes;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejemplo window = new Ejemplo();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Ejemplo() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblSoyUnJlabel = new JLabel("Soy un JLabel");
		lblSoyUnJlabel.setBounds(123, 60, 89, 16);
		frame.getContentPane().add(lblSoyUnJlabel);
		
		JButton btnSoyUnJbutton = new JButton("Soy un JButton");
		btnSoyUnJbutton.setBounds(231, 55, 117, 29);
		frame.getContentPane().add(btnSoyUnJbutton);
		
		txtSoyUnTes = new JTextField();
		txtSoyUnTes.setText("Soy un JTextField");
		txtSoyUnTes.setBounds(133, 88, 130, 26);
		frame.getContentPane().add(txtSoyUnTes);
		txtSoyUnTes.setColumns(10);
		
		JRadioButton rdbtnSoyUnJradiobutton = new JRadioButton("Soy un JRadioButton");
		rdbtnSoyUnJradiobutton.setSelected(true);
		rdbtnSoyUnJradiobutton.setBounds(123, 129, 170, 23);
		frame.getContentPane().add(rdbtnSoyUnJradiobutton);
		
		JCheckBox chckbxSoyUnJcheckbox = new JCheckBox("Soy un JCheckBox");
		chckbxSoyUnJcheckbox.setBounds(123, 200, 144, 23);
		frame.getContentPane().add(chckbxSoyUnJcheckbox);
		
		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.setBounds(308, 229, 117, 29);
		frame.getContentPane().add(btnAceptar);
		
		JRadioButton rdbtnSoyUnJradiobutton_1 = new JRadioButton("Soy un JRadioButton 2");
		rdbtnSoyUnJradiobutton_1.setBounds(123, 165, 170, 23);
		frame.getContentPane().add(rdbtnSoyUnJradiobutton_1);
	}
}
