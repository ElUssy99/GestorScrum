package Finestres;

import javax.swing.JButton;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;

import javax.swing.JLabel;

import javax.swing.WindowConstants;

import Objetos.BaseDeDatos;

import javax.swing.JMenuBar;

import javax.swing.JMenu;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JMenuItem;

public class InternalFrame {
	
	public static JLabel lblNewLabel;

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
		
		JMenu mnNewMenu = new JMenu("Proyecto");
		menuBar.add(mnNewMenu);
		
		JMenu mnNewMenu_1 = new JMenu("Usuarios");
		menuBar.add(mnNewMenu_1);
		
		lblNewLabel = new JLabel();
		lblNewLabel.setBounds(485, 24, 115, 22);
		v.getContentPane().add(lblNewLabel);
		
		// Se mete el internal en el JDesktopPane (Nuevo usuario)
		JMenuItem mntmNuevoUsuario = new JMenuItem("Nuevo Usuario");
		mnNewMenu_1.add(mntmNuevoUsuario);
		
		mntmNuevoUsuario.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				NuevoUser nu= new NuevoUser();
				nu.setLocation(47, 11);
				dp.add(nu);
			}
		});
		
		JLabel lblNewLabel = new JLabel("Usuario:");
		lblNewLabel.setBounds(428, 24, 47, 21);
		v.getContentPane().add(lblNewLabel);
		
		JButton btnNewButton = new JButton("SALIR");
		btnNewButton.setBounds(610, 23, 89, 23);
		v.getContentPane().add(btnNewButton);
		
		JLabel label_1 = new JLabel(conexion());
		label_1.setBounds(10, 32, 76, 14);
		v.getContentPane().add(label_1);
		
		btnNewButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Login login_ = new Login(bdd);
				login_.setLocation(87, 85);
				if(!login_.isShowing()) {
					dp.add(login_);	
				}
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
