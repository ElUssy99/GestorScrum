package Finestres;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JCheckBox;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.ScrollPaneConstants;
import javax.swing.JSpinner;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import java.awt.Color;
import net.miginfocom.swing.MigLayout;

public class Sprints extends JFrame {

	private JPanel contentPane;
	private JScrollPane jsp;
	private int contador = 175;
	
//	public static String nSplit, txtTArea, horas;
//	public static boolean marcado;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Sprints frame = new Sprints();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the InteralFrame.
	 */
	public Sprints() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 598, 467);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 51, 51));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		jsp = new JScrollPane(contentPane);
		jsp.setVisible(true);
		//Cambiar por el JScrollPane aqui abjo
		setContentPane(jsp);
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
		e.setBounds(22, 47, 535, 125);
		contentPane.add(e);
		
		btnAadir.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				Especificacion e2 = new Especificacion();
				e2.setBounds(22, 175, 535, 125);
				contentPane.add(e);
			}
		});
		
		JButton btnEliminar = new JButton("Eliminar");
		btnEliminar.setBounds(332, 6, 100, 23);
		panel.add(btnEliminar);
		
//		contentPane.add(new Especificacion(), "cell 0 " + contador+1 + ",alignx center,aligny top");
//		contentPane.add(new Especificacion(), "cell 0 " + contador+1 + ",alignx center,aligny top");
//		contentPane.add(new Especificacion(), "cell 0 " + contador+1 + ",alignx center,aligny top");
		
//		Especificacion especificacion = new Especificacion();
//		contentPane.add(especificacion, "cell 0 2,alignx center,aligny top");
		
//		JPanel panel_1 = new JPanel();
//		contentPane.add(panel_1, "cell 0 1,alignx center,aligny top");
//		
//		JTextArea textArea = new JTextArea();
//		JScrollPane scroll = new JScrollPane(textArea);
//		scroll.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
//		scroll.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
//		
//		JCheckBox chckbxMarcar = new JCheckBox("Marcar");
//		
//		JButton btnGuardarCambios = new JButton("Guardar cambios");
//		
//		JSpinner spinner = new JSpinner();
//		
//		JLabel lblNumeroDeHoras = new JLabel("Numero de horas");
//		
//		JComboBox comboBox = new JComboBox();
//		for (int i = 0; i < sprints.length; i++) {
//			comboBox.addItem(sprints[i]);
//		}
//		
//		btnGuardarCambios.addActionListener(new ActionListener() {
//			@Override
//			public void actionPerformed(ActionEvent arg0) {
//				nSplit = (String) comboBox.getSelectedItem();
//				txtTArea = textArea.getText();
//				horas = spinner.getValue().toString();
//				if(chckbxMarcar.isSelected()) {
//					marcado = true;
//				}else {
//					marcado = false;
//				}
//				System.out.println(nSplit + " " + horas + " " + marcado + "\n" + txtTArea);
//			}
//		});
//		
//		// Layout:
//		GroupLayout gl_panel_1 = new GroupLayout(panel_1);
//		gl_panel_1.setHorizontalGroup(
//			gl_panel_1.createParallelGroup(Alignment.LEADING)
//				.addGroup(Alignment.TRAILING, gl_panel_1.createSequentialGroup()
//					.addContainerGap(53, Short.MAX_VALUE)
//					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
//						.addGroup(gl_panel_1.createSequentialGroup()
//							.addGap(16)
//							.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, 97, GroupLayout.PREFERRED_SIZE)
//							.addPreferredGap(ComponentPlacement.RELATED)
//							.addComponent(lblNumeroDeHoras)
//							.addPreferredGap(ComponentPlacement.RELATED)
//							.addComponent(spinner, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
//							.addPreferredGap(ComponentPlacement.RELATED)
//							.addComponent(btnGuardarCambios)
//							.addPreferredGap(ComponentPlacement.RELATED)
//							.addComponent(chckbxMarcar)
//							.addContainerGap())
//						.addGroup(Alignment.TRAILING, gl_panel_1.createSequentialGroup()
//							.addComponent(scroll, GroupLayout.PREFERRED_SIZE, 428, GroupLayout.PREFERRED_SIZE)
//							.addGap(54))))
//		);
//		gl_panel_1.setVerticalGroup(
//			gl_panel_1.createParallelGroup(Alignment.LEADING)
//				.addGroup(gl_panel_1.createSequentialGroup()
//					.addContainerGap()
//					.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
//						.addComponent(chckbxMarcar)
//						.addComponent(btnGuardarCambios)
//						.addComponent(spinner, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
//						.addComponent(lblNumeroDeHoras)
//						.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
//					.addPreferredGap(ComponentPlacement.RELATED)
//					.addComponent(scroll, GroupLayout.PREFERRED_SIZE, 66, GroupLayout.PREFERRED_SIZE)
//					.addContainerGap(19, Short.MAX_VALUE))
//		);
//		panel_1.setLayout(gl_panel_1);
	}
}
