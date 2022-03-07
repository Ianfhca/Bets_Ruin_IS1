package gui;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.SystemColor;
import javax.swing.border.BevelBorder;
import javax.swing.JCheckBox;
import java.awt.Font;
import javax.swing.JPasswordField;
import javax.swing.JLabel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.MatteBorder;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EtchedBorder;

public class Register extends JFrame{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPasswordField passwordField;
	private JTextField textField;
	private JTextField txtDate;
	private JTextField txtDay;

	
	//
	private JPanel panelPrincipal;
	
	// Box
	private JCheckBox Check_Remenber_Me;
	
	//Meses
	private JComboBox<String> month;
	private DefaultComboBoxModel<String> monthNames = new DefaultComboBoxModel<String>();
	private JTextField textField_3;
	
	//Etiquetas
	private JLabel lblDate, lblGender, lblCurrentAccount,lblYear ,lblMonth, lblDay, lblRegister, lblPassword, lblUsername;
	
	//Botones
	private JButton btnSingIn, btnBack;
	private JRadioButton rdbtnMale, rdbtnFemale, rdbtnOthers ;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	
	
	
	public Register() {
		getContentPane().setLayout(null);
		
		lblRegister = new JLabel("SING IN");
		lblRegister.setHorizontalAlignment(SwingConstants.CENTER);
		lblRegister.setForeground(Color.BLACK);
		lblRegister.setFont(new Font("Rockwell", Font.BOLD, 34));
		lblRegister.setBackground(Color.WHITE);
		lblRegister.setBounds(10, 10, 516, 64);
		getContentPane().add(lblRegister);
		
		panelPrincipal = new JPanel();
		panelPrincipal.setLayout(null);
		panelPrincipal.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		panelPrincipal.setBackground(SystemColor.menu);
		panelPrincipal.setBounds(10, 84, 516, 587);
		getContentPane().add(panelPrincipal);
		
		Check_Remenber_Me = new JCheckBox("Accept Permissions");
		Check_Remenber_Me.setFont(new Font("Rockwell", Font.PLAIN, 15));
		Check_Remenber_Me.setBounds(88, 529, 183, 21);
		panelPrincipal.add(Check_Remenber_Me);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(88, 225, 294, 36);
		panelPrincipal.add(passwordField);
		
		lblPassword = new JLabel("Password:");
		lblPassword.setFont(new Font("Rockwell", Font.PLAIN, 16));
		lblPassword.setBounds(46, 193, 279, 21);
		panelPrincipal.add(lblPassword);
		
		lblUsername = new JLabel("Username:");
		lblUsername.setFont(new Font("Rockwell", Font.PLAIN, 16));
		lblUsername.setBounds(46, 90, 294, 21);
		panelPrincipal.add(lblUsername);
		
		btnSingIn = new JButton("SING IN");
		btnSingIn.setEnabled(false);
		
		btnSingIn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (Check_Remenber_Me.isEnabled()) btnSingIn.setEnabled(true);
			}
		});
		btnSingIn.setFont(new Font("Rockwell", Font.PLAIN, 17));
		btnSingIn.setBackground(SystemColor.windowBorder);
		btnSingIn.setBounds(360, 520, 113, 36);
		panelPrincipal.add(btnSingIn);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(88, 121, 294, 36);
		panelPrincipal.add(textField);
		
		btnBack = new JButton("\u2190");
		btnBack.setFont(new Font("Microsoft YaHei", Font.BOLD, 34));
		btnBack.setBackground(SystemColor.textInactiveText);
		btnBack.setBounds(10, 10, 67, 64);
		panelPrincipal.add(btnBack);
		
		lblYear = new JLabel("Year:");
		lblYear.setBounds(46, 310, 33, 16);
		panelPrincipal.add(lblYear);
		
		txtDate = new JTextField();
		txtDate.setText("xxxx");
		txtDate.setColumns(10);
		txtDate.setBounds(88, 306, 50, 26);
		panelPrincipal.add(txtDate);
		
		lblMonth = new JLabel("Month:");
		lblMonth.setBounds(158, 310, 50, 16);
		panelPrincipal.add(lblMonth);
		
		month = new JComboBox<String>();
		month.setBounds(218, 305, 116, 27);
		panelPrincipal.add(month);
		
		month.setModel(monthNames);
		
			monthNames.addElement("January");
			monthNames.addElement("February");
			monthNames.addElement("March");
			monthNames.addElement("April");
			monthNames.addElement("May");
			monthNames.addElement("June");
			monthNames.addElement("July");
			monthNames.addElement("August");
			monthNames.addElement("September");
			monthNames.addElement("October");
			monthNames.addElement("November");
			monthNames.addElement("December");
			month.setSelectedIndex(0);
		
		lblDay = new JLabel("Day:");
		lblDay.setBounds(344, 310, 38, 16);
		panelPrincipal.add(lblDay);
		
		txtDay = new JTextField();
		txtDay.setText("xx");
		txtDay.setColumns(10);
		txtDay.setBounds(388, 306, 67, 26);
		panelPrincipal.add(txtDay);
		
		lblDate = new JLabel("Born date:");
		lblDate.setFont(new Font("Rockwell", Font.PLAIN, 16));
		lblDate.setBounds(46, 274, 279, 21);
		panelPrincipal.add(lblDate);
		
		lblGender = new JLabel("Gender");
		lblGender.setFont(new Font("Rockwell", Font.PLAIN, 16));
		lblGender.setBounds(46, 342, 279, 21);
		panelPrincipal.add(lblGender);
		
		rdbtnMale = new JRadioButton("Male");
		buttonGroup.add(rdbtnMale);
		rdbtnMale.setFont(new Font("Tahoma", Font.PLAIN, 15));
		rdbtnMale.setSelected(true);
		rdbtnMale.setBounds(70, 369, 68, 23);
		panelPrincipal.add(rdbtnMale);
		
		rdbtnFemale = new JRadioButton("Female");
		buttonGroup.add(rdbtnFemale);
		rdbtnFemale.setFont(new Font("Tahoma", Font.PLAIN, 15));
		rdbtnFemale.setBounds(195, 369, 77, 23);
		panelPrincipal.add(rdbtnFemale);
		
		rdbtnOthers = new JRadioButton("Others");
		buttonGroup.add(rdbtnOthers);
		rdbtnOthers.setFont(new Font("Tahoma", Font.PLAIN, 15));
		rdbtnOthers.setBounds(344, 369, 77, 23);
		panelPrincipal.add(rdbtnOthers);
		
		lblCurrentAccount = new JLabel("Current account:");
		lblCurrentAccount.setFont(new Font("Rockwell", Font.PLAIN, 16));
		lblCurrentAccount.setBounds(46, 407, 294, 21);
		panelPrincipal.add(lblCurrentAccount);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(88, 438, 294, 36);
		panelPrincipal.add(textField_3);
		
	}
}
