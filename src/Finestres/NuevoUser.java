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

import java.awt.GridLayout;
import javax.swing.JComboBox;


public class NuevoUser extends JInternalFrame implements ActionListener{
	
	public NuevoUser() {
		// Se construye el panel que ira dentro del JInternalFrame
				setTitle("Nuevo usuario");
				JPanel p = new JPanel();
				GridBagLayout gbl_p = new GridBagLayout();
				gbl_p.columnWidths = new int[]{0, 65, 35, 51, 39, 43, 41, 0, 0, 0, 0, 0, 0};
				gbl_p.rowHeights = new int[]{20, 37, 20, 18, 37, 42, 42, 0};
				gbl_p.columnWeights = new double[]{0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE, 0.0, 0.0, 0.0};
				gbl_p.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
				p.setLayout(gbl_p);
			
				
				setSize(477, 356);
								getContentPane().setLayout(new GridLayout(0, 1, 0, 0));
				//				login.setLocation(46, 125);
								
								GridBagConstraints gbc_lblNombre = new GridBagConstraints();
								gbc_lblNombre.gridwidth = 2;
								gbc_lblNombre.anchor = GridBagConstraints.WEST;
								gbc_lblNombre.insets = new Insets(0, 0, 5, 5);
								gbc_lblNombre.gridx = 0;
								gbc_lblNombre.gridy = 1;
								JLabel lblNombre = new JLabel("Nombre: ");
								p.add (lblNombre, gbc_lblNombre);
								
				JTextField textField_1 = new JTextField(10);
				GridBagConstraints gbc_1 = new GridBagConstraints();
				gbc_1.gridwidth = 4;
				gbc_1.fill = GridBagConstraints.HORIZONTAL;
				gbc_1.insets = new Insets(0, 0, 5, 5);
				gbc_1.gridx = 3;
				gbc_1.gridy = 1;
				p.add (textField_1, gbc_1);
				
				JLabel lblLoguinGenerado = new JLabel("Loguin generado: ");
				GridBagConstraints gbc_lblLoguinGenerado = new GridBagConstraints();
				gbc_lblLoguinGenerado.gridwidth = 2;
				gbc_lblLoguinGenerado.anchor = GridBagConstraints.WEST;
				gbc_lblLoguinGenerado.insets = new Insets(0, 0, 5, 5);
				gbc_lblLoguinGenerado.gridx = 0;
				gbc_lblLoguinGenerado.gridy = 2;
				p.add (lblLoguinGenerado, gbc_lblLoguinGenerado);
				
				JLabel lblPassword = new JLabel("Password: ");
				GridBagConstraints gbc_lblPassword= new GridBagConstraints();
				gbc_lblPassword.gridwidth = 2;
				gbc_lblPassword.anchor = GridBagConstraints.WEST;
				gbc_lblPassword.insets = new Insets(0, 0, 5, 5);
				gbc_lblPassword.gridx = 0;
				gbc_lblPassword.gridy = 3;
				p.add (lblPassword, gbc_lblPassword);
				
				JLabel lblRepetirPassword = new JLabel("Repetir Password: ");
				GridBagConstraints gbc_lblRepetirPassword= new GridBagConstraints();
				gbc_lblRepetirPassword.gridwidth = 2;
				gbc_lblRepetirPassword.anchor = GridBagConstraints.WEST;
				gbc_lblRepetirPassword.insets = new Insets(0, 0, 5, 5);
				gbc_lblRepetirPassword.gridx = 0;
				gbc_lblRepetirPassword.gridy = 4;
				p.add (lblRepetirPassword, gbc_lblRepetirPassword);
				
				JPasswordField textField = new JPasswordField (10);
				textField.setEnabled(false);
				GridBagConstraints gbc_textField = new GridBagConstraints();
				gbc_textField.gridwidth = 4;
				gbc_textField.fill = GridBagConstraints.HORIZONTAL;
				gbc_textField.insets = new Insets(0, 0, 5, 5);
				gbc_textField.gridx = 3;
				gbc_textField.gridy = 3;
				p.add (textField, gbc_textField);
				
				JPasswordField textField_11 = new JPasswordField (10);
				GridBagConstraints gbc_textField_11 = new GridBagConstraints();
				gbc_textField_11.gridwidth = 4;
				gbc_textField_11.fill = GridBagConstraints.HORIZONTAL;
				gbc_textField_11.insets = new Insets(0, 0, 5, 5);
				gbc_textField_11.gridx = 3;
				gbc_textField_11.gridy = 4;
				p.add (textField_11, gbc_textField_11);
				
				JTextField textField_12 = new JTextField(10);
				GridBagConstraints gbc_12 = new GridBagConstraints();
				gbc_12.gridwidth = 4;
				gbc_12.fill = GridBagConstraints.HORIZONTAL;
				gbc_12.insets = new Insets(0, 0, 5, 5);
				gbc_12.gridx = 3;
				gbc_12.gridy = 2;
				p.add (textField_12, gbc_12);
				
				JLabel lblMail = new JLabel("Mail: ");
				GridBagConstraints gbc_lblMail= new GridBagConstraints();
				gbc_lblMail.gridwidth = 2;
				gbc_lblMail.anchor = GridBagConstraints.WEST;
				gbc_lblMail.insets = new Insets(0, 0, 5, 5);
				gbc_lblMail.gridx = 0;
				gbc_lblMail.gridy = 5;
				p.add (lblMail, gbc_lblMail);

				JTextField textField_13 = new JTextField(10);
				GridBagConstraints gbc_13 = new GridBagConstraints();
				gbc_13.gridwidth = 4;
				gbc_13.fill = GridBagConstraints.HORIZONTAL;
				gbc_13.insets = new Insets(0, 0, 5, 5);
				gbc_13.gridx = 3;
				gbc_13.gridy = 5;
				p.add (textField_13, gbc_13);
				
				getContentPane().add(p);
				
				JButton btnGenerarPassword = new JButton("Generar password");
				GridBagConstraints gbc_btnGenerarPassword = new GridBagConstraints();
				gbc_btnGenerarPassword.insets = new Insets(0, 0, 5, 5);
				gbc_btnGenerarPassword.gridwidth = 5;
				gbc_btnGenerarPassword.anchor = GridBagConstraints.NORTH;
				gbc_btnGenerarPassword.fill = GridBagConstraints.HORIZONTAL;
				gbc_btnGenerarPassword.gridx = 7;
				gbc_btnGenerarPassword.gridy = 3;
				p.add(btnGenerarPassword, gbc_btnGenerarPassword);
				
				JComboBox comboBox = new JComboBox();
				comboBox.addItem("Seleccionar un perfil de usuario");
				comboBox.addItem("Master Owiner");
				comboBox.addItem("Scrum Master");
				comboBox.addItem("Developer");
				comboBox.addItem("Administrador");
				GridBagConstraints gbc_comboBox = new GridBagConstraints();
				gbc_comboBox.gridwidth = 3;
				gbc_comboBox.insets = new Insets(0, 0, 0, 5);
				gbc_comboBox.fill = GridBagConstraints.HORIZONTAL;
				gbc_comboBox.gridx = 0;
				gbc_comboBox.gridy = 6;
				p.add(comboBox, gbc_comboBox);
				
				JButton btnGuardar = new JButton("Guardar");
				GridBagConstraints gbc_btnGuardar = new GridBagConstraints();
				gbc_btnGuardar.insets = new Insets(0, 0, 0, 5);
				gbc_btnGuardar.gridwidth = 7;
				gbc_btnGuardar.anchor = GridBagConstraints.NORTH;
				gbc_btnGuardar.fill = GridBagConstraints.HORIZONTAL;
				gbc_btnGuardar.gridx = 5;
				gbc_btnGuardar.gridy = 6;
				p.add(btnGuardar, gbc_btnGuardar);
				// Por defecto el JInternalFrame no es redimensionable ni
				// tiene el botón de cerrar, así que se lo ponemos.
				setResizable(true);
				setClosable(true);
				// Se visualiza el JInternalFrame 
				setVisible( true);
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}
