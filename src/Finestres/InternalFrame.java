package Finestres;

import javax.swing.JButton;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;

import javax.swing.JLabel;

import javax.swing.WindowConstants;

import Objetos.BaseDeDatos;
import Objetos.Usuario;

import javax.swing.JMenuBar;

import javax.swing.JMenu;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JMenuItem;

public class InternalFrame {
	
	public static JLabel lblNewLabel;
	public static JMenu mnNewMenu, mnNewMenu_1;
	public static JMenuItem mntmNuevoUsuario, mntmBuscarUsuario, mntmNuevoProjecto, mntmMostrarProyectos;

	public InternalFrame(BaseDeDatos bdd) {
		// El JFrame con el JDesktopPane
		JFrame v = new JFrame("Gestor de Proyectos");
		v.getContentPane().setLayout(null);
		JDesktopPane dp = new JDesktopPane();
		dp.setBounds(10, 57, 689, 474);
		dp.setBackground(Color.YELLOW);
		
		// Se mete el internal en el JDesktopPane (Login)
		Login login_ = new Login(bdd);
		login_.setLocation(181, 88);
		dp.add(login_);
		
		// Se visualiza todo.
		v.getContentPane().add(dp);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 709, 21);
		v.getContentPane().add(menuBar);
		
		mnNewMenu = new JMenu("Proyecto");
		menuBar.add(mnNewMenu);
		mnNewMenu.setEnabled(false);
		
		mnNewMenu_1 = new JMenu("Usuarios");
		menuBar.add(mnNewMenu_1);
		mnNewMenu_1.setEnabled(false);
		
		lblNewLabel = new JLabel();
		lblNewLabel.setBounds(380, 32, 142, 14);
		v.getContentPane().add(lblNewLabel);
		
		// Se mete el internal en el JDesktopPane (Nuevo usuario)
		mntmNuevoUsuario = new JMenuItem("Nuevo Usuario");
		mnNewMenu_1.add(mntmNuevoUsuario);
		
		mntmBuscarUsuario = new JMenuItem("Buscar/Modificar Usuario");
		mnNewMenu_1.add(mntmBuscarUsuario);
		
		mntmNuevoProjecto = new JMenuItem("Nuevo Projecto");
		mnNewMenu.add(mntmNuevoProjecto);
		
		mntmMostrarProyectos = new JMenuItem("Mostrar Proyectos");
		mnNewMenu.add(mntmMostrarProyectos);
		
		// Abre la pestaña de Nuevo Proyecto.
		mntmNuevoProjecto.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				NuevoProyecto np = new NuevoProyecto(bdd);
				np.setLocation(47,11);
				dp.add(np);
			}
		});
		
		// Abre la pestaña de Nuevo Usuario.
		mntmNuevoUsuario.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				NuevoUser nu = new NuevoUser(bdd);
				nu.setLocation(47, 11);
				dp.add(nu);
			}
		});
		
		JLabel lblUser = new JLabel("Usuario:");
		lblUser.setBounds(322, 32, 47, 14);
		v.getContentPane().add(lblUser);
		
		JButton btnNewButton = new JButton("LOGIN/SALIR");
		btnNewButton.setBounds(586, 23, 113, 23);
		v.getContentPane().add(btnNewButton);
		
		JLabel label_1 = new JLabel(conexion());
		label_1.setBounds(10, 32, 76, 14);
		v.getContentPane().add(label_1);
		
		// Boton SALIR: Sirve para salir del usuario e iniciar sesion otra vez.
		btnNewButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				lblNewLabel.setText("");
				mnNewMenu.setEnabled(false);
				mnNewMenu_1.setEnabled(false);
				
				Login login_ = new Login(bdd);
				login_.setLocation(87, 85);
				dp.add(login_);
				
			}
		});
		
		v.setSize(725,580);
		v.setVisible(true);
		v.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	}
	
	public static String conexion() {
		// Provabilidad de la Conexion con el Servidor.
		String conexion = "ONLINE;OFFLINE";
		String[] conexionSplit = conexion.split(";");
		int provabilida = (int)(Math.random()*2);
		if(provabilida == 0) {
			return conexionSplit[0];
		}else if(provabilida == 1) {
			return conexionSplit[1];
		}
		return conexion;
	}
}
