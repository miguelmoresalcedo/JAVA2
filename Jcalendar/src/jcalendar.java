import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import com.toedter.calendar.JDateChooser;
import javax.swing.JPasswordField;
import javax.swing.JList;
import javax.swing.AbstractListModel;
import javax.swing.JScrollPane;

public class jcalendar {

	private JFrame frame;
	private JTextField txtSoyUnTes;
	private JPasswordField passwordField;
	private JTextField textField;
	private final JList list = new JList();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					jcalendar window = new jcalendar();
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
	public jcalendar() {
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
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Madrid ", "Albacete ", "Barcelona"}));
		comboBox.setBounds(332, 129, 112, 27);
		frame.getContentPane().add(comboBox);
		
		JDateChooser dateChooser = new JDateChooser();
		dateChooser.setBounds(23, 22, 131, 26);
		frame.getContentPane().add(dateChooser);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(190, 235, 68, 26);
		frame.getContentPane().add(passwordField);
		
		textField = new JTextField();
		textField.setBounds(24, 235, 130, 26);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(23, 111, 89, 77);
		frame.getContentPane().add(scrollPane);
		scrollPane.setViewportView(list);
		list.setModel(new AbstractListModel() {
			String[] values = new String[] {"España", "Alemania", "Francia ", "Portugal", "Brazil", "Rumania", "Polonia", "Suecia", "Noruega", "Dinamarca"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
	}
}
