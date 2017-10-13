package Examen;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Window.Type;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import javax.swing.JScrollPane;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JTextArea;

public class Vuelos {

	private JFrame frmViajesDam;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JPanel panel_1;
	double precio = 0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Vuelos window = new Vuelos();
					window.frmViajesDam.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Vuelos() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmViajesDam = new JFrame();
		frmViajesDam.getContentPane().setEnabled(false);
		frmViajesDam.setTitle("VIAJES DAM");
		frmViajesDam.setBounds(100, 100, 832, 550);
		frmViajesDam.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmViajesDam.getContentPane().setLayout(null);
		
		JLabel lblCaracteristicasDeSu = new JLabel("Caracteristicas de su billete");
		lblCaracteristicasDeSu.setBounds(39, 29, 183, 16);
		frmViajesDam.getContentPane().add(lblCaracteristicasDeSu);
		
		JLabel lblorigen = new JLabel("*Origen:");
		lblorigen.setBounds(64, 57, 61, 16);
		frmViajesDam.getContentPane().add(lblorigen);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {null, "Madrid", "Barcelona"}));
		comboBox.setBounds(148, 53, 110, 27);
		frmViajesDam.getContentPane().add(comboBox);
		
		JLabel lbldestino = new JLabel("*Destino:");
		lbldestino.setBounds(64, 85, 61, 16);
		frmViajesDam.getContentPane().add(lbldestino);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {null, "Bilbao", "Zaragoza"}));
		comboBox_1.setBounds(148, 81, 110, 27);
		frmViajesDam.getContentPane().add(comboBox_1);
		
		JLabel lblTipoDeViaje = new JLabel("Tipo de viaje:");
		lblTipoDeViaje.setBounds(39, 152, 86, 16);
		frmViajesDam.getContentPane().add(lblTipoDeViaje);
		
		JRadioButton rdbtnIdavuelta = new JRadioButton("Ida/Vuelta");
		rdbtnIdavuelta.setSelected(true);
		rdbtnIdavuelta.setBounds(143, 148, 97, 23);
		frmViajesDam.getContentPane().add(rdbtnIdavuelta);
		
		JRadioButton rdbtnSoloIda = new JRadioButton("Solo ida");
		rdbtnSoloIda.setBounds(252, 148, 97, 23);
		frmViajesDam.getContentPane().add(rdbtnSoloIda);
		
		JLabel lblNewLabel = new JLabel("Forma de pago");
		lblNewLabel.setBounds(39, 191, 97, 16);
		frmViajesDam.getContentPane().add(lblNewLabel);
		
		JRadioButton rdbtnTarjeta = new JRadioButton("Tarjeta");
		rdbtnTarjeta.setSelected(true);
		rdbtnTarjeta.setBounds(148, 187, 92, 23);
		frmViajesDam.getContentPane().add(rdbtnTarjeta);
		
		JRadioButton rdbtnIban = new JRadioButton("IBAN(+5%)");
		rdbtnIban.setBounds(252, 187, 97, 23);
		frmViajesDam.getContentPane().add(rdbtnIban);
		
		JLabel lblDescuentos = new JLabel("Descuentos:");
		lblDescuentos.setBounds(64, 236, 78, 16);
		frmViajesDam.getContentPane().add(lblDescuentos);
		
		JCheckBox chckbxFamiliaNumerosa = new JCheckBox("Familia numerosa (-10%)");
		chckbxFamiliaNumerosa.setBounds(158, 232, 191, 23);
		frmViajesDam.getContentPane().add(chckbxFamiliaNumerosa);
		
		JLabel lblNDeBilletes = new JLabel("N de billetes:");
		lblNDeBilletes.setBounds(64, 113, 97, 16);
		frmViajesDam.getContentPane().add(lblNDeBilletes);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4"}));
		comboBox_2.setBounds(148, 109, 61, 27);
		frmViajesDam.getContentPane().add(comboBox_2);
		
		JCheckBox chckbxCarnJoven = new JCheckBox("Carné joven (-8%)");
		chckbxCarnJoven.setBounds(158, 262, 191, 23);
		frmViajesDam.getContentPane().add(chckbxCarnJoven);
		
		JCheckBox chckbxDesempleado = new JCheckBox("Desempleado (-6%)");
		chckbxDesempleado.setBounds(158, 294, 191, 23);
		frmViajesDam.getContentPane().add(chckbxDesempleado);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(409, 408, 294, 88);
		frmViajesDam.getContentPane().add(scrollPane);
		
		JTextArea textArea = new JTextArea();
		textArea.setEditable(false);
		scrollPane.setViewportView(textArea);
		
		JPanel panel = new JPanel();
		panel.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel.setBounds(409, 18, 370, 150);
		frmViajesDam.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblDatosTarjeta = new JLabel("Datos tarjeta:");
		lblDatosTarjeta.setBounds(6, 6, 94, 16);
		panel.add(lblDatosTarjeta);
		
		JLabel lblTitular = new JLabel("Titular:*");
		lblTitular.setBounds(36, 30, 61, 16);
		panel.add(lblTitular);
		
		textField = new JTextField();
		textField.setBounds(101, 25, 195, 26);
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel lblNTarjeta = new JLabel("N tarjeta:*");
		lblNTarjeta.setBounds(36, 69, 75, 16);
		panel.add(lblNTarjeta);
		
		textField_1 = new JTextField();
		
		textField_1.setBounds(111, 59, 185, 26);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblCvv = new JLabel("CVV:*");
		lblCvv.setBounds(6, 112, 42, 16);
		panel.add(lblCvv);
		
		textField_2 = new JTextField();
		textField_2.setBounds(56, 107, 44, 26);
		panel.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblDigits = new JLabel("3 DIGITS");
		lblDigits.setBounds(101, 112, 61, 16);
		panel.add(lblDigits);
		
		JLabel lblDigits_1 = new JLabel("16 DIGITS");
		lblDigits_1.setBounds(299, 64, 65, 16);
		panel.add(lblDigits_1);
		
		JLabel lblTipo = new JLabel("Tipo:");
		lblTipo.setBounds(174, 112, 44, 16);
		panel.add(lblTipo);
		
		JComboBox comboBox_3 = new JComboBox();
		comboBox_3.setModel(new DefaultComboBoxModel(new String[] {"VISA", "MasterCard"}));
		comboBox_3.setBounds(230, 108, 102, 27);
		panel.add(comboBox_3);
		
		panel_1 = new JPanel();
		panel_1.setVisible(false);
		panel_1.setLayout(null);
		panel_1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_1.setBounds(409, 227, 370, 112);
		frmViajesDam.getContentPane().add(panel_1);
		
		JLabel lblDatosCuentaIban = new JLabel("Datos cuenta IBAN:");
		lblDatosCuentaIban.setBounds(6, 6, 137, 16);
		panel_1.add(lblDatosCuentaIban);
		
		JLabel lblIbanEs = new JLabel("IBAN - ES*");
		lblIbanEs.setBounds(16, 30, 81, 16);
		panel_1.add(lblIbanEs);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(101, 25, 195, 26);
		panel_1.add(textField_3);
		
		JLabel lblBanco = new JLabel("Banco:*");
		lblBanco.setBounds(36, 69, 75, 16);
		panel_1.add(lblBanco);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(111, 59, 185, 26);
		panel_1.add(textField_4);
		
		JLabel lblDigits_2 = new JLabel("22 DIGITS");
		lblDigits_2.setBounds(299, 30, 65, 16);
		panel_1.add(lblDigits_2);
		
		JLabel lblTotalAPagar = new JLabel("Total a pagar:");
		lblTotalAPagar.setBounds(39, 361, 86, 16);
		frmViajesDam.getContentPane().add(lblTotalAPagar);
		
		textField_5 = new JTextField();
		textField_5.setEnabled(false);
		textField_5.setEditable(false);
		textField_5.setBounds(141, 356, 130, 26);
		frmViajesDam.getContentPane().add(textField_5);
		textField_5.setColumns(10);
		
		JLabel lblEuros = new JLabel("Euros");
		lblEuros.setBounds(288, 361, 43, 16);
		frmViajesDam.getContentPane().add(lblEuros);
		
		JButton btnProcedesAlPago = new JButton("Proceder al pago");
		btnProcedesAlPago.setBounds(39, 405, 140, 29);
		frmViajesDam.getContentPane().add(btnProcedesAlPago);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.setBounds(191, 405, 117, 29);
		frmViajesDam.getContentPane().add(btnSalir);
		
		//EVENTOS
		
	
		//Tarjeta
		
		rdbtnTarjeta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					rdbtnIban.setSelected(false);
					panel_1.setVisible(false);
					panel.setVisible(true);
							}
		});
		
		//iban
		
				rdbtnIban.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
							rdbtnTarjeta.setSelected(false);
							panel_1.setVisible(true);
							panel.setVisible(false);
							
							
							precio = precio * 1.05;
							textField_5.setText(String.valueOf(precio));
							
						
					}
				});
	
		//ida/vuelta
		
		rdbtnIdavuelta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(rdbtnIdavuelta.isSelected()){
					rdbtnSoloIda.setSelected(false);
				}
			}
		});
		
		//ida
		
		rdbtnSoloIda.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(rdbtnSoloIda.isSelected()){
					rdbtnIdavuelta.setSelected(false);
				}
			}
		});
		
		//
		
		//n tarjeta
		
		textField_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (textField_1.getText().length()>16) {
					JOptionPane.showMessageDialog(null, "Numero no valido", "Error", JOptionPane.DEFAULT_OPTION);
				}
			}
		});
		
		
		//cvv
		
		textField_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (textField_2.getText().length()>3){
					JOptionPane.showMessageDialog(null, "Numero no valido", "Error", JOptionPane.DEFAULT_OPTION);
				}
			}
		});
		
		//iban-es
		
		textField_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (textField_3.getText().length()>22) {
					JOptionPane.showMessageDialog(null, "Numero no valido", "Error", JOptionPane.DEFAULT_OPTION);
				}
				
			}
		});
		
		
		
		//calcular
		//en vez de poner que el boton proceder haga todo poner eventos en cada elemento para que vaya aplicando los 
		//descuentos de uno en uno, en este caso los aplica una vez hayamos pulsado el boton proceder
		
		btnProcedesAlPago.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int origen = comboBox.getSelectedIndex();
				int destino = comboBox_1.getSelectedIndex();
				String billetes = comboBox_2.getSelectedItem().toString();
				
				double billetes1 =  Double.parseDouble(billetes);
				
				if(textField.getText().equals("") && textField_3.getText().equals("") && textField_4.getText().equals("")){
					JOptionPane.showMessageDialog(null, "Por favor ingrese los campos obligatorios", "REGISTRO", JOptionPane.DEFAULT_OPTION);
				}else{
			
				
				if(origen == 1 && destino == 1 && rdbtnIdavuelta.isSelected()){
					precio = 50 * billetes1;
					textField_5.setText(String.valueOf(precio));
					JOptionPane.showMessageDialog(null, "Su compra ha sido realizada", "Completado", JOptionPane.DEFAULT_OPTION);
					
				
				}
				
				if(origen == 1 && destino == 1 && rdbtnSoloIda.isSelected()){
					 precio = 30 * billetes1;
					textField_5.setText(String.valueOf(precio));
					JOptionPane.showMessageDialog(null, "Su compra ha sido realizada", "Completado", JOptionPane.DEFAULT_OPTION);

				}
				
				if(origen == 1 && destino == 2 && rdbtnSoloIda.isSelected()){
					 precio = 15 * billetes1;
					textField_5.setText(String.valueOf(precio));
					JOptionPane.showMessageDialog(null, "Su compra ha sido realizada", "Completado", JOptionPane.DEFAULT_OPTION);

				}
				
				if(origen == 1 && destino == 2 && rdbtnIdavuelta.isSelected()){
					 precio = 25 * billetes1;
					textField_5.setText(String.valueOf(precio));
					JOptionPane.showMessageDialog(null, "Su compra ha sido realizada", "Completado", JOptionPane.DEFAULT_OPTION);

				}
				
				if(origen == 2 && destino == 1 && rdbtnSoloIda.isSelected()){
					 precio = 20 * billetes1;
					textField_5.setText(String.valueOf(precio));
					JOptionPane.showMessageDialog(null, "Su compra ha sido realizada", "Completado", JOptionPane.DEFAULT_OPTION);

				}
				
				if(origen == 2 && destino == 1 && rdbtnIdavuelta.isSelected()){
					 precio = 35 * billetes1;
					textField_5.setText(String.valueOf(precio));
					JOptionPane.showMessageDialog(null, "Su compra ha sido realizada", "Completado", JOptionPane.DEFAULT_OPTION);

				}
				
				if(origen == 2 && destino == 2 && rdbtnSoloIda.isSelected()){
					 precio = 12 * billetes1;
					textField_5.setText(String.valueOf(precio));
					JOptionPane.showMessageDialog(null, "Su compra ha sido realizada", "Completado", JOptionPane.DEFAULT_OPTION);

				}
				
				if(origen == 2 && destino == 2 && rdbtnIdavuelta.isSelected()){
					 precio = 20 * billetes1;
					textField_5.setText(String.valueOf(precio));
					JOptionPane.showMessageDialog(null, "Su compra ha sido realizada", "Completado", JOptionPane.DEFAULT_OPTION);
				
				}
				
				}
				
				
			    textArea.setText(textArea.getText() + "RESUMEN DE SU COMPRA: " + "\n"  + "Origen:" + " " + origen + "\n"  + "Destino:" + " "+ destino + "\n" + "Numero de billetes: " + " " + billetes1+ "\n" + "Precio:" + " " + precio + "Euros");
			    
				
			}
			
		});
		
		
	
		//familia numerosa
		chckbxFamiliaNumerosa.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (chckbxFamiliaNumerosa.isSelected()){
					 precio = precio - (0.1 * precio);
					textField_5.setText(String.valueOf(precio));
				}
			}
		});
		
		//CarneJoven
		
		chckbxCarnJoven.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (chckbxCarnJoven.isSelected()){
					 precio = precio - (0.08 * precio);
					textField_5.setText(String.valueOf(precio));
				}
				
			}
		});
		
		//Desempleado
		
		chckbxDesempleado.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (chckbxDesempleado.isSelected()){
					 precio = precio - (0.06 * precio);
					textField_5.setText(String.valueOf(precio));
				}
			}
		});
		
		
		
		//salir
		
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Seguro que desea salir", "Salir", JOptionPane.DEFAULT_OPTION);
				System.exit(0);
			}
		});
	}
}
