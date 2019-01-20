package Finestres;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class login extends JInternalFrame implements ActionListener{
	
	public login() {
		// Se construye el panel que ira dentro del JInternalFrame
		setTitle("login");
		JPanel p = new JPanel();
		GridBagLayout gbl_p = new GridBagLayout();
		gbl_p.columnWidths = new int[]{38, 86, 51, 39, 43, 41, 0};
		gbl_p.rowHeights = new int[]{20, 37, 23, 37, 42, 42, 0};
		gbl_p.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_p.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		p.setLayout(gbl_p);
	
		
		// Se construye el JInternalFrame
//		JInternalFrame login = new JInternalFrame("Loguin");
		setSize(332, 252);
//		login.setLocation(46, 125);
		
		GridBagConstraints gbc = new GridBagConstraints();
		gbc.anchor = GridBagConstraints.WEST;
		gbc.insets = new Insets(0, 0, 5, 5);
		gbc.gridx = 1;
		gbc.gridy = 1;
		JLabel label_1 = new JLabel("Loguin: ");
		p.add (label_1, gbc);
		GridBagConstraints gbc_1 = new GridBagConstraints();
		gbc_1.gridwidth = 4;
		gbc_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_1.insets = new Insets(0, 0, 5, 0);
		gbc_1.gridx = 2;
		gbc_1.gridy = 1;
		JTextField textField_1 = new JTextField(10);
		p.add (textField_1, gbc_1);
		JLabel label = new JLabel("Password: ");
		GridBagConstraints gbc_label = new GridBagConstraints();
		gbc_label.anchor = GridBagConstraints.WEST;
		gbc_label.insets = new Insets(0, 0, 5, 5);
		gbc_label.gridx = 1;
		gbc_label.gridy = 3;
		p.add (label, gbc_label);
		JPasswordField textField = new JPasswordField (10);
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.gridwidth = 4;
		gbc_textField.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField.insets = new Insets(0, 0, 5, 0);
		gbc_textField.gridx = 2;
		gbc_textField.gridy = 3;
		p.add (textField, gbc_textField);
		JButton button = new JButton("Enviar");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				comprobar(textField_1,textField);
				
			}
		});
		GridBagConstraints gbc_button = new GridBagConstraints();
		gbc_button.gridwidth = 5;
		gbc_button.anchor = GridBagConstraints.NORTH;
		gbc_button.fill = GridBagConstraints.HORIZONTAL;
		gbc_button.gridx = 1;
		gbc_button.gridy = 5;
		p.add(button, gbc_button);

		getContentPane().add(p);
		// Por defecto el JInternalFrame no es redimensionable ni
		// tiene el botón de cerrar, así que se lo ponemos.
		setResizable(true);
		setClosable(true);
		// Se visualiza el JInternalFrame 
		setVisible( true);
	}
	private void comprobar(JTextField textField_1,JPasswordField textfield) {
		String user = textField_1.getText();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		
		
	}
}
