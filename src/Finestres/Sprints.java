package Finestres;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JInternalFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;

import javax.swing.JButton;
import java.awt.Color;
import net.miginfocom.swing.MigLayout;

public class Sprints extends JInternalFrame {

	private JPanel contentPane;
	private JScrollPane jsp;
	private int contador;
	
//	public static String nSplit, txtTArea, horas;
//	public static boolean marcado;
	
	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					Sprints frame = new Sprints();
//					frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}

	/**
	 * Create the InteralFrame.
	 */
	public Sprints() {
		// Falta el nombre del proyecto en el titulo:
		setTitle("Especificaciones del proyecto ");
		setDefaultCloseOperation(JInternalFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 598, 432);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 51, 51));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setVisible(true);
		
		ArrayList<Especificacion> arrayEsp = new ArrayList<Especificacion>();
		contador = 172;
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 580, 31);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.setBounds(112, 6, 100, 23);
		panel.add(btnGuardar);
		
		JButton btnAadir = new JButton("A\u00F1adir");
		btnAadir.setBounds(222, 6, 100, 23);
		panel.add(btnAadir);
		
		Especificacion e = new Especificacion();
		e.setBounds(10, 42, 535, 125);
		contentPane.add(e);
		arrayEsp.add(e);
		
		Especificacion e2 = new Especificacion();
		e2.setBounds(10, 172, 535, 125);
		contentPane.add(e2);
		arrayEsp.add(e2);
		
		btnAadir.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				Especificacion e3 = new Especificacion();
				contador = contador + 130;
				e3.setBounds(10, contador, 535, 125);
				contentPane.add(e3);
				arrayEsp.add(e3);
			}
		});
		
		JButton btnEliminar = new JButton("Eliminar");
		btnEliminar.setBounds(332, 6, 100, 23);
		panel.add(btnEliminar);
		
		// Añadir el JScrollPane al JPanel.
		jsp = new JScrollPane(contentPane,
				JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
				JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		getContentPane().add(jsp);
		
		setResizable(true);
		setClosable(true);
		// Se visualiza el JInternalFrame
		setVisible(true);
	}
}
