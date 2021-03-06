import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.GridLayout;
import javax.swing.JTextField;
import javax.swing.JButton;

public class CalculadoraBorderLayout extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalculadoraBorderLayout frame = new CalculadoraBorderLayout();
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
	public CalculadoraBorderLayout() {
		setTitle("Calculadora Border Layout");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 133);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.NORTH);
		panel.setLayout(new GridLayout(1, 0, 0, 0));
		
		JLabel lblNumero = new JLabel("Numero 1");
		panel.add(lblNumero);
		
		textField = new JTextField();
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Numero 2");
		panel.add(lblNewLabel);
		
		textField_1 = new JTextField();
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		//JPanel panel_1 = new JPanel();
		//contentPane.add(panel_1, BorderLayout.SOUTH);
		
		JPanel panel_2 = new JPanel();
		contentPane.add(panel_2, BorderLayout.WEST);
		panel_2.setLayout(new GridLayout(2, 1, 0, 0));
		
		JButton button = new JButton("+");
		panel_2.add(button);
		
		JButton button_1 = new JButton("-");
		panel_2.add(button_1);
		
		JPanel panel_3 = new JPanel();
		contentPane.add(panel_3, BorderLayout.EAST);
		panel_3.setLayout(new GridLayout(2, 1, 0, 0));
		
		JButton button_3 = new JButton("*");
		panel_3.add(button_3);
		
		JButton button_2 = new JButton("/");
		panel_3.add(button_2);
		
		JPanel panel_4 = new JPanel();
		contentPane.add(panel_4, BorderLayout.CENTER);
		panel_4.setLayout(null);
		
		textField_3 = new JTextField();
		textField_3.setBounds(0, 0, 290, 75);
		panel_4.add(textField_3);
		textField_3.setColumns(10);
	}

}
