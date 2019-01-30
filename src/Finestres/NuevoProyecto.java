package Finestres;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.beans.PropertyVetoException;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

import Objetos.BaseDeDatos;
import Objetos.Proyectos;
import Objetos.Usuario;

import javax.swing.JComboBox;
import java.awt.Color;

public class NuevoProyecto extends JInternalFrame {
	private JPanel p;
	private JLabel label;
	private JLabel label_1;
	private JLabel label_2;
	private JLabel label_3;
	private JLabel label_4;
	private static JTextField textField;
	private JButton btnAadir;
	private JTextArea textArea;
	private JComboBox comboBox;
	private JComboBox comboBox_1;
	public static String nombre;
	BaseDeDatos bd;
	private String sm="Scrum Master";
	private String po="Product Owner";
	
	public NuevoProyecto(BaseDeDatos bdd) {
		bd=bdd;
		ArrayList<Usuario> usuariosBDD = bdd.getUsuarios();
		ArrayList<Proyectos> proyectosBDD = bdd.getProyectos();
		setTitle("Nuevo Proyecto");
		 p = new JPanel();
		GridBagLayout gbl_p = new GridBagLayout();
		gbl_p.columnWidths = new int[] { 38, 86, 160, 62, 50, 53, 0 };
		gbl_p.rowHeights = new int[] { 43, 20, 38, 122, 31, 32, 32, 0, 0 };
		gbl_p.columnWeights = new double[] { 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
		gbl_p.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
		p.setLayout(gbl_p);
		setSize(528, 433);
		getContentPane().setLayout(new BorderLayout(0, 0));
		
		label = new JLabel("Nombre Proyecto: ");
		GridBagConstraints gbc = new GridBagConstraints();
		gbc.anchor = GridBagConstraints.WEST;
		gbc.insets = new Insets(0, 0, 5, 5);
		gbc.gridx = 1;
		gbc.gridy = 1;
		p.add(label, gbc);
		
		textField = new JTextField(10);
		GridBagConstraints gbc_1 = new GridBagConstraints();
		gbc_1.gridwidth = 3;
		gbc_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_1.insets = new Insets(0, 0, 5, 5);
		gbc_1.gridx = 2;
		gbc_1.gridy = 1;
		p.add(textField, gbc_1);
		
		label_4 = new JLabel();
		label_4.setForeground(Color.RED);
		GridBagConstraints gbc_label_4 = new GridBagConstraints();
		gbc_label_4.gridwidth = 3;
		gbc_label_4.insets = new Insets(0, 0, 5, 5);
		gbc_label_4.gridx = 2;
		gbc_label_4.gridy = 2;
		p.add(label_4, gbc_label_4);
		
		getContentPane().add(p);
		
		label_1 = new JLabel("Descripcion: ");
		label_1.setVerticalAlignment(SwingConstants.TOP);
		GridBagConstraints gbc_label = new GridBagConstraints();
		gbc_label.anchor = GridBagConstraints.WEST;
		gbc_label.insets = new Insets(0, 0, 5, 5);
		gbc_label.gridx = 1;
		gbc_label.gridy = 3;
		p.add(label_1, gbc_label);
		
		textArea = new JTextArea();
		GridBagConstraints gbc_textArea = new GridBagConstraints();
		gbc_textArea.gridwidth = 3;
		gbc_textArea.insets = new Insets(0, 0, 5, 5);
		gbc_textArea.fill = GridBagConstraints.BOTH;
		gbc_textArea.gridx = 2;
		gbc_textArea.gridy = 3;
		p.add(textArea, gbc_textArea);
		
		label_2 = new JLabel("Scrum Master: ");
		GridBagConstraints gbc_label1 = new GridBagConstraints();
		gbc_label1.anchor = GridBagConstraints.EAST;
		gbc_label1.insets = new Insets(0, 0, 5, 5);
		gbc_label1.gridx = 1;
		gbc_label1.gridy = 4;
		p.add(label_2, gbc_label1);
		
		
		
		label_3 = new JLabel("Product Owner: ");
		GridBagConstraints gbc_label2 = new GridBagConstraints();
		gbc_label2.anchor = GridBagConstraints.EAST;
		gbc_label2.insets = new Insets(0, 0, 5, 5);
		gbc_label2.gridx = 1;
		gbc_label2.gridy = 5;
		p.add(label_3, gbc_label2);
		
		btnAadir = new JButton("Anadir");
		btnAadir.setHorizontalAlignment(SwingConstants.RIGHT);
		btnAadir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (comprobar(bd) == true) {
					try {
						setClosed(true);
					} catch (PropertyVetoException e) {
						e.printStackTrace();
					}
				} 
			}
		});
		
		GridBagConstraints gbc_btnAadir = new GridBagConstraints();
		gbc_btnAadir.insets = new Insets(0, 0, 5, 5);
		gbc_btnAadir.gridx = 2;
		gbc_btnAadir.gridy = 6;
		p.add(btnAadir, gbc_btnAadir);
		
		
		comboBox_1 = new JComboBox();
		
		GridBagConstraints gbc_comboBox_1 = new GridBagConstraints();
		gbc_comboBox_1.gridwidth = 3;
		gbc_comboBox_1.insets = new Insets(0, 0, 5, 5);
		gbc_comboBox_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox_1.gridx = 2;
		gbc_comboBox_1.gridy = 5;
		p.add(comboBox_1, gbc_comboBox_1);
		
	
		
		comboBox = new JComboBox();
		GridBagConstraints gbc_comboBox = new GridBagConstraints();
		gbc_comboBox.gridwidth = 3;
		gbc_comboBox.insets = new Insets(0, 0, 5, 5);
		gbc_comboBox.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox.gridx = 2;
		gbc_comboBox.gridy = 4;
		p.add(comboBox, gbc_comboBox);
		
		for (Usuario usuario : usuariosBDD) {
			if(sm.equals(usuario.getUserPerm())) {
				comboBox.addItem(usuario.getNombre());
			}else if(po.equals(usuario.getUserPerm())) {
				comboBox_1.addItem(usuario.getNombre());
			}
		}
		getContentPane().add(p);
		setResizable(true);
		setClosable(true);
		
		setVisible(true);
	}
	public boolean comprobar(BaseDeDatos bdd) {
		nombre = textField.getText();
		ArrayList<Proyectos> ProyectosBDD = bdd.getProyectos();
		boolean existe = false;
		if(textField.getText().equals("") || textArea.getText().equals("")){
			JOptionPane.showMessageDialog(null, "Faltan datos");
			return false;
		}
		for (Proyectos proyectos : ProyectosBDD) {
			if(nombre.equals(proyectos.getNombre())) {
				label_4.setText("El proyecto ya esta creado");
				existe = true;
			}
		}
		if(!existe) {
			Proyectos p=new Proyectos(textField.getText(), textArea.getText(), comboBox.getSelectedItem().toString(), comboBox_1.getSelectedItem().toString());
			 ProyectosBDD.add(p);
			 label_4.setText("");
			 for (Proyectos proyectos2 : ProyectosBDD) {
				 System.out.print(proyectos2.getNombre()+" "+proyectos2.getDescripcion()+" "+proyectos2.getScrumMaster()+" "+proyectos2.getProductOwner()+" "+"\n");
			 }
			 
			JOptionPane.showMessageDialog(null, "El Projecto " + nombre + " creado");
		}
		return false;
	}
}
