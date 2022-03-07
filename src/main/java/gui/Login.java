package gui;
import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;
import java.awt.Font;
import javax.swing.border.EtchedBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.BevelBorder;
import java.awt.Color;


public class Login extends JFrame {

	//JPanel
	private JPanel panelPrincipal;
	
	//JCheckBox
	private JCheckBox Check_Remenber_Me;
	
	//JButton
	private JButton btnLogin, btnBack;
	
	//Etiquetas
	private JLabel lblLOGIN, Label_Password, Label_Username;
	
	public Login() {
		setTitle("Login Box");
		setBackground(SystemColor.controlShadow);
		getContentPane().setBackground(new Color(65, 105, 225));
		getContentPane().setLayout(null);
		
		lblLOGIN = new JLabel("LOG IN");
		lblLOGIN.setForeground(new Color(0, 0, 0));
		lblLOGIN.setFont(new Font("Rockwell", Font.BOLD, 34));
		lblLOGIN.setHorizontalAlignment(SwingConstants.CENTER);
		lblLOGIN.setBounds(10, 10, 516, 64);
		getContentPane().add(lblLOGIN);
		
		panelPrincipal = new JPanel();
		panelPrincipal.setBackground(SystemColor.menu);
		panelPrincipal.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		panelPrincipal.setBounds(10, 84, 516, 373);
		getContentPane().add(panelPrincipal);
		panelPrincipal.setLayout(null);
		
		Check_Remenber_Me = new JCheckBox("Remenber me");
		Check_Remenber_Me.setFont(new Font("Rockwell", Font.PLAIN, 15));
		Check_Remenber_Me.setBounds(88, 319, 183, 21);
		panelPrincipal.add(Check_Remenber_Me);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(88, 225, 340, 36);
		panelPrincipal.add(passwordField);
		
		Label_Password = new JLabel("Password");
		Label_Password.setFont(new Font("Rockwell", Font.PLAIN, 16));
		Label_Password.setBounds(88, 194, 279, 21);
		panelPrincipal.add(Label_Password);
		
		Label_Username = new JLabel("Username");
		Label_Username.setFont(new Font("Rockwell", Font.PLAIN, 16));
		Label_Username.setBounds(88, 90, 294, 21);
		panelPrincipal.add(Label_Username);
		
		btnLogin = new JButton("LOG IN");
		btnLogin.setFont(new Font("Rockwell", Font.PLAIN, 17));
		btnLogin.setBounds(360, 310, 113, 36);
		panelPrincipal.add(btnLogin);
		
		textUser = new JTextField();
		textUser.setBounds(88, 121, 340, 36);
		textUser.setColumns(10);
		panelPrincipal.add(textUser);
		
		btnBack = new JButton("\u2190");
		btnBack.setFont(new Font("Microsoft YaHei", Font.BOLD, 34));
		btnBack.setBounds(10, 10, 84, 44);
		panelPrincipal.add(btnBack);
	
		
		this.setSize(550, 500);
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPasswordField passwordField;
	private JTextField textUser;
	
}
