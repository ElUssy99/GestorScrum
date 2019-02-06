package Finestres;

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

	static JPanel contentPane;
	private JScrollPane jsp;
	
	public Sprints(String nombreproyecto, String datosUser) {
		setTitle("Especificaciones proyecto "+nombreproyecto);
		ArrayList<Especificacion> arrayEsp = new ArrayList<Especificacion>();
		
		setBounds(100, 100, 593, 467);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 51, 51));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		jsp = new JScrollPane(contentPane);
		jsp.setVisible(true);
		//Cambiar por el JScrollPane aqui abjo
		setContentPane(jsp);
		contentPane.setLayout(new MigLayout("", "[551px]", "[31px]"));
		
		JPanel panel = new JPanel();
		contentPane.add(panel, "cell 0 0,grow");
		panel.setLayout(null);
		
		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.setBounds(112, 6, 100, 23);
		panel.add(btnGuardar);
		
		JButton btnAadir = new JButton("Anadir");
		btnAadir.setBounds(222, 6, 100, 23);
		panel.add(btnAadir);
		
		btnAadir.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				NuevaTarea nt= new NuevaTarea(datosUser);
				nt.setLocation(15,10);
				InternalFrame.dp.add(nt);
			}
		});
		
		JButton btnEliminar = new JButton("Eliminar");
		btnEliminar.setBounds(332, 6, 100, 23);
		panel.add(btnEliminar);
		
		setResizable(true);
		setClosable(true);
		setVisible(true);
	}
}
