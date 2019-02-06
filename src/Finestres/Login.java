package Finestres;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyVetoException;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import Objetos.BaseDeDatos;
import Objetos.Usuario;

public class Login extends JInternalFrame implements ActionListener {
	
	JPanel p;
	JLabel label_1;
	JLabel label ;
	
	private static JTextField textField_1;
	private static JPasswordField textField;
	public static String user, pass;
	BaseDeDatos bd;

	public Login(BaseDeDatos bdd) {
		// Se construye el panel que ira dentro del JInternalFrame
		bd = bdd;
		setTitle("login");
		p = new JPanel();
		
		GridBagLayout gbl_p = new GridBagLayout();
		gbl_p.columnWidths = new int[] { 38, 86, 51, 39, 43, 41, 0 };
		gbl_p.rowHeights = new int[] { 20, 37, 23, 37, 42, 42, 0 };
		gbl_p.columnWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
		gbl_p.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
		p.setLayout(gbl_p);
		setSize(332, 252);
		GridBagConstraints gbc = new GridBagConstraints();
		gbc.anchor = GridBagConstraints.WEST;
		gbc.insets = new Insets(0, 0, 5, 5);
		gbc.gridx = 1;
		gbc.gridy = 1;
		label_1 = new JLabel("Loguin: ");
		p.add(label_1, gbc);
		GridBagConstraints gbc_1 = new GridBagConstraints();
		gbc_1.gridwidth = 4;
		gbc_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_1.insets = new Insets(0, 0, 5, 0);
		gbc_1.gridx = 2;
		gbc_1.gridy = 1;
		textField_1 = new JTextField(10);
		p.add(textField_1, gbc_1);
		label = new JLabel("Password: ");
		GridBagConstraints gbc_label = new GridBagConstraints();
		gbc_label.anchor = GridBagConstraints.WEST;
		gbc_label.insets = new Insets(0, 0, 5, 5);
		gbc_label.gridx = 1;
		gbc_label.gridy = 3;
		p.add(label, gbc_label);
		textField = new JPasswordField(10);
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.gridwidth = 4;
		gbc_textField.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField.insets = new Insets(0, 0, 5, 0);
		gbc_textField.gridx = 2;
		gbc_textField.gridy = 3;
		p.add(textField, gbc_textField);
		JButton button = new JButton("Enviar");

		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (comprobar(bd) == true) {
					try {
						setClosed(true);
					} catch (PropertyVetoException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		});
		
		textField_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (comprobar(bd) == true) {
					try {
						setClosed(true);
					} catch (PropertyVetoException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		});
		
		textField.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (comprobar(bd) == true) {
					try {
						setClosed(true);
					} catch (PropertyVetoException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
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
		setVisible(true);
	}

	public boolean comprobar(BaseDeDatos bdd) {
		String[] permisos = { "Administrador", "Master Owner", "Scrum Master", "Developer" };
		user = textField_1.getText();
		pass = textField.getText();
		ArrayList<Usuario> usuariosBDD = bdd.getUsuarios();
		boolean existe = false;
		for (Usuario usuario : usuariosBDD) {
			if (user.equals(usuario.getLogin()) && pass.equals(usuario.getPassword())) {
				JOptionPane.showMessageDialog(null, "El Usuario " + user + " existe");
				// Mostrar por pantalla el resultado: del usuario que inicia sesion.
				System.out.println("--El usuario \"" + textField_1.getText() + "\" ha iniciado sesion y es \"" + bdd.getUsuarioByUserPerm(textField_1.getText()) + "\"");
				// Pasar los datos del usuario que se registra en la pantalla de Login y a la pantalla de InteralFrame.
				String datosUser = textField_1.getText() + "(" + bdd.getUsuarioByUserPerm(textField_1.getText()) + ")";
				InternalFrame.lblNewLabel.setText(datosUser);
				// ADMINISTRADOR:
				if (bdd.getUsuarioByUserPerm(textField_1.getText()) == permisos[0]) {
					InternalFrame.mnNewMenu_1.setEnabled(true);
					// Mostrar por pantalla el resultado: de los permisos que tiene.
					System.out.println("--Este usuario tiene acceso al menu de Usuarios");
					// Tiene todos los permisos para manipular Usuarios.
				// SCRUM MASTER:
				} else if(bdd.getUsuarioByUserPerm(textField_1.getText()) == permisos[2]) {
					InternalFrame.mnNewMenu.setEnabled(true);
					// Mostrar por pantalla el resultado: del unico permiso que tiene.
					System.out.println("--Este usuario tiene acceso al menu de Proyectos");
					// Tienen todos los permisos para manipular Proyectos y editar todas las subramas de los Proyectos.
				// DEVELOPER:
				} else if(bdd.getUsuarioByUserPerm(textField_1.getText()) == permisos[3]) {
					InternalFrame.mnNewMenu.setEnabled(true);
					InternalFrame.mntmNuevoProjecto.setEnabled(false);
					InternalFrame.mntmMostrarProyectos.setEnabled(true);
					System.out.println("--Este usuario tiene acceso al menu de Proyectos, pero solo visualizacion de Datos.");
					// Tiene solo permisos para visualizar datos de los Poryectos.
				// PRODUCT OWNER:
				} else if(bdd.getUsuarioByUserPerm(textField_1.getText()) == permisos[1]) {
					InternalFrame.mnNewMenu.setEnabled(true);
					InternalFrame.mntmNuevoProjecto.setEnabled(false);
					InternalFrame.mntmMostrarProyectos.setEnabled(true);
					System.out.println("--Este usuario tiene acceso al menu de Proyectos, pero solo visualizacion de Datos.");
					// Tiene solo permisos para visualizar datos de los Proyectos y editar especificaciones.
				}
				existe = true;
				this.desktopIcon.setVisible(false);
				return true;
			}
		}
		if (!existe) {
			JOptionPane.showMessageDialog(null, "El Usuario " + user + " no existe");
		}
		return false;
	}

	public void enterPressed(ActionEvent e) throws IOException {
		comprobar(bd);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		try {
			enterPressed(e);
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}
}
