package Finestres;

import javax.swing.JButton;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;

import javax.swing.JLabel;

import javax.swing.WindowConstants;

import javax.swing.JMenuBar;

import javax.swing.JMenu;
import java.awt.Color;



public class internalFrame {
	public static void main(String[] args) {
		new internalFrame();
	}
	public internalFrame() {
		// El JFrame con el JDesktopPane
				JFrame v = new JFrame("Gestor de Proyectos");
				v.getContentPane().setLayout(null);
				JDesktopPane dp = new JDesktopPane();
				dp.setBounds(20, 57, 594, 457);
				dp.setBackground(Color.YELLOW);
				
				// Se mete el internal en el JDesktopPane
				login login_ = new login();
				login_.setLocation(87, 85);
				dp.add(login_);
				NuevoUser nu= new NuevoUser();
				nu.setLocation(47, 11);
				dp.add(nu);
				// Se visualiza todo.
				v.getContentPane().add(dp);
				
				JMenuBar menuBar = new JMenuBar();
				menuBar.setBounds(0, 0, 660, 21);
				v.getContentPane().add(menuBar);
				
				JMenu mnNewMenu = new JMenu("Proyecto");
				menuBar.add(mnNewMenu);
				
				JMenu mnNewMenu_1 = new JMenu("Usuarios");
				menuBar.add(mnNewMenu_1);
				
				JLabel lblNewLabel = new JLabel("User:");
				lblNewLabel.setBounds(354, 25, 142, 21);
				v.getContentPane().add(lblNewLabel);
				
				JButton btnNewButton = new JButton("Salir");
				btnNewButton.setBounds(499, 23, 89, 23);
				v.getContentPane().add(btnNewButton);
				v.setSize(676,580);
				v.setVisible(false);
				v.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
				
				
	}
}
