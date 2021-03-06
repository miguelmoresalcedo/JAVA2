import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.Font;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.Checkbox;
import javax.swing.JCheckBox;
import javax.swing.JTextField;
import javax.swing.JButton;
import com.toedter.calendar.JDateChooser;
import java.awt.Color;

public class Ejercicio extends JFrame {

	private JPanel contentPane;
	private JTextField txtHola;
	private JTextField txtIntroduzcaLosDatos;
	private JTextField txtIntroduzcaLosDatos_1;
	private JTextField txtIntroduzcaLosDatos_3;
	private JTextField txtIntroduzcaLosDatos_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejercicio frame = new Ejercicio();
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
	public Ejercicio() {
		setResizable(false);
		setTitle("COMPRA DE COCHES");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 414);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnEdicion = new JMenu("MENU");
		menuBar.add(mnEdicion);
		
		JMenuItem mntmAnular = new JMenuItem("ANULAR");
		mnEdicion.add(mntmAnular);
		
		JMenuItem mntmReservar = new JMenuItem("RESERVAR");
		mnEdicion.add(mntmReservar);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(153, 204, 204));
		contentPane.setForeground(Color.PINK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblVentaDeCoches = new JLabel("VENTA DE COCHES POR INTERNET");
		lblVentaDeCoches.setFont(new Font("Lucida Grande", Font.BOLD, 15));
		lblVentaDeCoches.setHorizontalAlignment(SwingConstants.CENTER);
		lblVentaDeCoches.setVerticalAlignment(SwingConstants.BOTTOM);
		lblVentaDeCoches.setBounds(63, 6, 311, 16);
		contentPane.add(lblVentaDeCoches);
		
		JLabel lblNewLabel = new JLabel("Elija el vehiculo que quiere comprar");
		lblNewLabel.setBounds(17, 34, 239, 16);
		contentPane.add(lblNewLabel);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBackground(new Color(204, 255, 255));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"None...", "Ferrari", "Audi", "BMW", "Mercedes", "Porsche", "Aston Marin", "Alfa Romeo"}));
		comboBox.setBounds(17, 53, 165, 27);
		contentPane.add(comboBox);
		
		JLabel lblNewLabel_1 = new JLabel("Elija el metodo de pago");
		lblNewLabel_1.setBounds(17, 82, 222, 16);
		contentPane.add(lblNewLabel_1);
		
		JCheckBox chckbxPagoPorPlazos = new JCheckBox("Pago por plazos");
		chckbxPagoPorPlazos.setBounds(27, 110, 132, 23);
		contentPane.add(chckbxPagoPorPlazos);
		
		JCheckBox chckbxPagoUnico = new JCheckBox("Pago unico");
		chckbxPagoUnico.setBounds(180, 110, 111, 23);
		contentPane.add(chckbxPagoUnico);
		
		txtHola = new JTextField();
		txtHola.setBackground(new Color(204, 255, 255));
		txtHola.setText("Introduzca los datos");
		txtHola.setBounds(94, 162, 145, 26);
		contentPane.add(txtHola);
		txtHola.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Nombre:");
		lblNewLabel_2.setBounds(27, 167, 61, 16);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblRelleneLosSiguientes = new JLabel("Rellene los siguientes datos para finalizar la compra");
		lblRelleneLosSiguientes.setBounds(17, 139, 329, 16);
		contentPane.add(lblRelleneLosSiguientes);
		
		JLabel lblNewLabel_3 = new JLabel("Apellidos");
		lblNewLabel_3.setBounds(27, 195, 61, 16);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("DNI");
		lblNewLabel_4.setBounds(27, 223, 61, 16);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Direccion");
		lblNewLabel_5.setBounds(27, 251, 61, 16);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Numero");
		lblNewLabel_6.setBounds(27, 276, 61, 16);
		contentPane.add(lblNewLabel_6);
		
		txtIntroduzcaLosDatos = new JTextField();
		txtIntroduzcaLosDatos.setBackground(new Color(204, 255, 255));
		txtIntroduzcaLosDatos.setText("Introduzca los datos");
		txtIntroduzcaLosDatos.setBounds(94, 190, 145, 26);
		contentPane.add(txtIntroduzcaLosDatos);
		txtIntroduzcaLosDatos.setColumns(10);
		
		txtIntroduzcaLosDatos_1 = new JTextField();
		txtIntroduzcaLosDatos_1.setBackground(new Color(204, 255, 255));
		txtIntroduzcaLosDatos_1.setText("Introduzca los datos");
		txtIntroduzcaLosDatos_1.setBounds(94, 218, 145, 26);
		contentPane.add(txtIntroduzcaLosDatos_1);
		txtIntroduzcaLosDatos_1.setColumns(10);
		
		txtIntroduzcaLosDatos_3 = new JTextField();
		txtIntroduzcaLosDatos_3.setBackground(new Color(204, 255, 255));
		txtIntroduzcaLosDatos_3.setText("Introduzca los datos");
		txtIntroduzcaLosDatos_3.setBounds(94, 246, 145, 26);
		contentPane.add(txtIntroduzcaLosDatos_3);
		txtIntroduzcaLosDatos_3.setColumns(10);
		
		txtIntroduzcaLosDatos_2 = new JTextField();
		txtIntroduzcaLosDatos_2.setBackground(new Color(204, 255, 255));
		txtIntroduzcaLosDatos_2.setText("Introduzca los datos");
		txtIntroduzcaLosDatos_2.setBounds(94, 271, 145, 26);
		contentPane.add(txtIntroduzcaLosDatos_2);
		txtIntroduzcaLosDatos_2.setColumns(10);
		
		JButton btnNewButton = new JButton("FINALIZAR COMPRA");
		btnNewButton.setBackground(new Color(153, 204, 255));
		btnNewButton.setBounds(270, 297, 159, 53);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_7 = new JLabel("Fecha de entrega");
		lblNewLabel_7.setBounds(286, 34, 111, 16);
		contentPane.add(lblNewLabel_7);
		
		JDateChooser dateChooser = new JDateChooser();
		dateChooser.setBackground(new Color(102, 204, 204));
		dateChooser.setBounds(286, 53, 131, 26);
		contentPane.add(dateChooser);
	}
}
