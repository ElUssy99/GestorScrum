package Finestres;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.JButton;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import Objetos.BaseDeDatos;
import Objetos.Proyectos;
import Objetos.Usuario;

import java.awt.GridLayout;
import javax.swing.JComboBox;
import java.awt.Color;

public class NuevoUser extends JInternalFrame implements ActionListener {

	JPanel p;
	JTextField tfLogin, tfName, tfMail;
	JLabel lblLoguinGenerado, lblPassword, lblRepetirPassword, lblMail;
	JPasswordField passField, passFieldRep;
	JButton btnGenerarPassword, btnGuardar;
	JComboBox comboBox;
	private JLabel label, lblNewLabel;
	BaseDeDatos bd;
	
	public NuevoUser(BaseDeDatos bdd) {
		bd = bdd;
		ArrayList<Usuario> usuariosBDD = bd.getUsuarios();
		
		// Se construye el panel que ira dentro del JInternalFrame
		setTitle("Nuevo usuario");
		p = new JPanel();
		GridBagLayout gbl_p = new GridBagLayout();
		gbl_p.columnWidths = new int[] { 0, 65, 35, 51, 39, 43, 41, 0, 0, 0, 0, 0, 0 };
		gbl_p.rowHeights = new int[] { 20, 37, 20, 18, 37, 42, 42, 0 };
		gbl_p.columnWeights = new double[] { 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE, 0.0, 0.0,
				0.0 };
		gbl_p.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
		p.setLayout(gbl_p);

		setSize(477, 356);
		getContentPane().setLayout(new GridLayout(0, 1, 0, 0));

		GridBagConstraints gbc_lblNombre = new GridBagConstraints();
		gbc_lblNombre.gridwidth = 2;
		gbc_lblNombre.anchor = GridBagConstraints.WEST;
		gbc_lblNombre.insets = new Insets(0, 0, 5, 5);
		gbc_lblNombre.gridx = 0;
		gbc_lblNombre.gridy = 1;
		JLabel lblNombre = new JLabel("Nombre: ");
		p.add(lblNombre, gbc_lblNombre);

		tfName = new JTextField(10);
		GridBagConstraints gbc_1 = new GridBagConstraints();
		gbc_1.gridwidth = 4;
		gbc_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_1.insets = new Insets(0, 0, 5, 5);
		gbc_1.gridx = 3;
		gbc_1.gridy = 1;
		p.add(tfName, gbc_1);

		lblLoguinGenerado = new JLabel("Loguin generado: ");
		GridBagConstraints gbc_lblLoguinGenerado = new GridBagConstraints();
		gbc_lblLoguinGenerado.gridwidth = 2;
		gbc_lblLoguinGenerado.anchor = GridBagConstraints.WEST;
		gbc_lblLoguinGenerado.insets = new Insets(0, 0, 5, 5);
		gbc_lblLoguinGenerado.gridx = 0;
		gbc_lblLoguinGenerado.gridy = 2;
		p.add(lblLoguinGenerado, gbc_lblLoguinGenerado);
		
		lblNewLabel = new JLabel("");
		lblNewLabel.setForeground(Color.RED);
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.gridwidth = 6;
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridx = 7;
		gbc_lblNewLabel.gridy = 2;
		p.add(lblNewLabel, gbc_lblNewLabel);

		lblPassword = new JLabel("Password: ");
		GridBagConstraints gbc_lblPassword = new GridBagConstraints();
		gbc_lblPassword.gridwidth = 2;
		gbc_lblPassword.anchor = GridBagConstraints.WEST;
		gbc_lblPassword.insets = new Insets(0, 0, 5, 5);
		gbc_lblPassword.gridx = 0;
		gbc_lblPassword.gridy = 3;
		p.add(lblPassword, gbc_lblPassword);

		lblRepetirPassword = new JLabel("Repetir Password: ");
		GridBagConstraints gbc_lblRepetirPassword = new GridBagConstraints();
		gbc_lblRepetirPassword.gridwidth = 2;
		gbc_lblRepetirPassword.anchor = GridBagConstraints.WEST;
		gbc_lblRepetirPassword.insets = new Insets(0, 0, 5, 5);
		gbc_lblRepetirPassword.gridx = 0;
		gbc_lblRepetirPassword.gridy = 4;
		p.add(lblRepetirPassword, gbc_lblRepetirPassword);

		passField = new JPasswordField(10);
		passField.setEnabled(false);
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.gridwidth = 4;
		gbc_textField.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField.insets = new Insets(0, 0, 5, 5);
		gbc_textField.gridx = 3;
		gbc_textField.gridy = 3;
		p.add(passField, gbc_textField);

		passFieldRep = new JPasswordField(10);
		GridBagConstraints gbc_textField_11 = new GridBagConstraints();
		gbc_textField_11.gridwidth = 4;
		gbc_textField_11.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_11.insets = new Insets(0, 0, 5, 5);
		gbc_textField_11.gridx = 3;
		gbc_textField_11.gridy = 4;
		p.add(passFieldRep, gbc_textField_11);

		tfLogin = new JTextField(10);
		GridBagConstraints gbc_12 = new GridBagConstraints();
		gbc_12.gridwidth = 4;
		gbc_12.fill = GridBagConstraints.HORIZONTAL;
		gbc_12.insets = new Insets(0, 0, 5, 5);
		gbc_12.gridx = 3;
		gbc_12.gridy = 2;
		p.add(tfLogin, gbc_12);

		label = new JLabel("");
		label.setForeground(Color.RED);
		GridBagConstraints gbc_label = new GridBagConstraints();
		gbc_label.gridwidth = 6;
		gbc_label.insets = new Insets(0, 0, 5, 5);
		gbc_label.gridx = 7;
		gbc_label.gridy = 4;
		p.add(label, gbc_label);

		lblMail = new JLabel("Mail: ");
		GridBagConstraints gbc_lblMail = new GridBagConstraints();
		gbc_lblMail.gridwidth = 2;
		gbc_lblMail.anchor = GridBagConstraints.WEST;
		gbc_lblMail.insets = new Insets(0, 0, 5, 5);
		gbc_lblMail.gridx = 0;
		gbc_lblMail.gridy = 5;
		p.add(lblMail, gbc_lblMail);

		tfMail = new JTextField(10);
		GridBagConstraints gbc_13 = new GridBagConstraints();
		gbc_13.gridwidth = 4;
		gbc_13.fill = GridBagConstraints.HORIZONTAL;
		gbc_13.insets = new Insets(0, 0, 5, 5);
		gbc_13.gridx = 3;
		gbc_13.gridy = 5;
		p.add(tfMail, gbc_13);

		getContentPane().add(p);

		btnGenerarPassword = new JButton("Generar password");
		GridBagConstraints gbc_btnGenerarPassword = new GridBagConstraints();
		gbc_btnGenerarPassword.insets = new Insets(0, 0, 5, 5);
		gbc_btnGenerarPassword.gridwidth = 5;
		gbc_btnGenerarPassword.anchor = GridBagConstraints.NORTH;
		gbc_btnGenerarPassword.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnGenerarPassword.gridx = 7;
		gbc_btnGenerarPassword.gridy = 3;
		p.add(btnGenerarPassword, gbc_btnGenerarPassword);

		btnGenerarPassword.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String pass = "";
				try {
					pass = generarPasswd();
					boolean comprPass = comprobarPassword();
					passField.setText(pass);
					passFieldRep.setText(pass);
					JOptionPane.showMessageDialog(null, "La contraseña generada es: " + pass);
					label.setText("");
				} catch (NoSuchAlgorithmException e2) {
					e2.printStackTrace();
				}

			}
		});

		comboBox = new JComboBox();
		String[] permisos = { "Seleccionar un perfil de usuario", "Master Owner", "Scrum Master", "Developer",
				"Administrador" };
		for (int i = 0; i < permisos.length; i++) {
			comboBox.addItem(permisos[i]);
		}
		GridBagConstraints gbc_comboBox = new GridBagConstraints();
		gbc_comboBox.gridwidth = 3;
		gbc_comboBox.insets = new Insets(0, 0, 0, 5);
		gbc_comboBox.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox.gridx = 0;
		gbc_comboBox.gridy = 6;
		p.add(comboBox, gbc_comboBox);

		btnGuardar = new JButton("Guardar");
		GridBagConstraints gbc_btnGuardar = new GridBagConstraints();
		gbc_btnGuardar.insets = new Insets(0, 0, 0, 5);
		gbc_btnGuardar.gridwidth = 7;
		gbc_btnGuardar.anchor = GridBagConstraints.NORTH;
		gbc_btnGuardar.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnGuardar.gridx = 5;
		gbc_btnGuardar.gridy = 6;
		p.add(btnGuardar, gbc_btnGuardar);

		btnGuardar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				boolean compr = validaMail();
				boolean comprL = generateUsername(bdd);
				boolean comprPass = comprobarPassword();
				
				if (comprPass = false) {
					label.setText("Contraseña incorrecta");
					passField.setText("");
					passFieldRep.setText("");
				}
				if (compr == false) {
					JOptionPane.showMessageDialog(null, "Error de Mail: Datos incorrectos. ");
					tfMail.setText("");
				}
				if (comboBox.getSelectedItem().toString().equals("Seleccionar un perfil de usuario")) {
					JOptionPane.showMessageDialog(null, "Error de Perfil: Datos incorrectos. ");
				}
				if (compr == true && comprL == true && comprPass == true) {
					Usuario u = new Usuario(tfName.getText(), tfLogin.getText(), passField.getPassword().toString(), passFieldRep.getPassword().toString(), tfMail.getText(), comboBox.getSelectedItem().toString());
					usuariosBDD.add(u);
					
					JOptionPane.showMessageDialog(null, "El usuario " + tfLogin.getText() + " a sido creado.");
					
					tfName.setText("");
					tfLogin.setText("");
					passField.setText("");
					passFieldRep.setText("");
					tfMail.setText("");
					comboBox.setSelectedIndex(0);
				}
			}
		});

		// Por defecto el JInternalFrame no es redimensionable ni
		// tiene el botón de cerrar, así que se lo ponemos.
		setResizable(true);
		setClosable(true);
		// Se visualiza el JInternalFrame
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub

	}
	
	public static String generarPasswd() throws NoSuchAlgorithmException {
		String[] symbols = { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "a", "b", "c", "d", "e", "f", "g", "h",
				"i", "j", "k", "l", "m", "n", "ñ", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z" + "A",
				"B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "Ñ", "O", "P", "Q", "R", "S", "T", "U",
				"V", "W", "X", "Y", "Z" };
		int length = 6;
		Random random = SecureRandom.getInstanceStrong();
		StringBuilder sb = new StringBuilder(length);
		for (int i = 0; i < length; i++) {
			int indexRandom = random.nextInt(symbols.length);
			sb.append(symbols[indexRandom]);
		}
		String password = sb.toString();
		// Mostrar por pantalla el resultado: de la contraseña que se genera
		// automaticamente.
		System.out.println("La contraseña que recibe el usuario es: " + password);
		return password;
	}

	private boolean validaMail() {
		String email = tfMail.getText();
		Pattern pattern = Pattern.compile("\\b[\\w.%-]+@[-.\\w]+\\.[A-Za-z]{2,4}\\b");
		Matcher matcher = pattern.matcher(email);

		if (!matcher.find()) {
			return false;
		} else {
			return true;
		}
	}

	private boolean generateUsername(BaseDeDatos bdd) {
		ArrayList<Usuario> usuariosBDD = bdd.getUsuarios();
		if (this.tfName.getText().split(" ").length < 2) {
			System.out.println("Login demasiado corto");
			lblNewLabel.setText("Demasiado corto");
			lblNewLabel.setVisible(true);
			return false;
		} else {
			lblNewLabel.setVisible(false);
			String nickname = this.tfName.getText().split(" ")[0].toUpperCase().charAt(0)
					+ this.tfName.getText().split(" ")[1].substring(0, 1).toUpperCase()
					+ this.tfName.getText().split(" ")[1].substring(1).toLowerCase();

			int count = 0;
			for (Usuario usuario : usuariosBDD) {
				if (nickname.equals(usuario.getNombre())) {
					count++;
				}
			}
			if (count != 0) {
				nickname = nickname + count;
			}

			this.tfLogin.setText(nickname);
			return true;
		}
	}

	private boolean comprobarPassword() {
		if (!Arrays.equals(passField.getPassword(), passFieldRep.getPassword())) {
			label.setText("Contraseña incorrecta");
			label.setVisible(true);
			return false;
		}
		return true;
	}
}
