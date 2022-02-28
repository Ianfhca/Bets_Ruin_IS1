package gui;
import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Login extends JFrame {
	public Login() {
		getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("LOGI N");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(350, 374, 99, 37);
		getContentPane().add(btnNewButton);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(140, 194, 220, 37);
		getContentPane().add(passwordField);
		
		JLabel lblNewLabel = new JLabel("Password");
		lblNewLabel.setBounds(140, 167, 220, 23);
		getContentPane().add(lblNewLabel);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Remenber me");
		chckbxNewCheckBox.setBounds(113, 382, 93, 21);
		getContentPane().add(chckbxNewCheckBox);
		
		JLabel lblNewLabel_1 = new JLabel("Username");
		lblNewLabel_1.setBounds(140, 76, 220, 23);
		getContentPane().add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setText("\uD83D\uDC68");
		textField.setBounds(140, 96, 220, 37);
		getContentPane().add(textField);
		textField.setColumns(10);
		
	}// hol

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPasswordField passwordField;
	private JTextField textField;
}
