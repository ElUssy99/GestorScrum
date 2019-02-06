package Finestres;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.text.StyledEditorKit.ForegroundAction;

import Objetos.BaseDeDatos;
import Objetos.Proyectos;

import javax.swing.JList;
import javax.swing.JOptionPane;

public class MostrarProyectos extends JInternalFrame implements ActionListener {

	private JPanel p;
	private JLabel label;
	private JLabel label_1;
	private JLabel label_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextArea textArea;
	private JButton botton;
	private JList list;
	BaseDeDatos bd;
	
	public MostrarProyectos(BaseDeDatos bdd, String datosUser) {
		bd = bdd;
		
		setTitle("Proyectos");
		ArrayList<Proyectos> proyectosBDD = bdd.getProyectos();
		p = new JPanel();
		

		GridBagLayout gbl_p = new GridBagLayout();
		gbl_p.columnWidths = new int[] { 38, 207, 0, 115, 21, 53, 50, 42, 0, 0 };
		gbl_p.rowHeights = new int[] { 0, 53, 47, 49, 68, 55, 88, 0, 0, 0, 0 };
		gbl_p.columnWeights = new double[] { 0.0, 1.0, 0.0, 1.0, 1.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
		gbl_p.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
		p.setLayout(gbl_p);
		setSize(536, 474);
		GridBagConstraints gbc = new GridBagConstraints();
		gbc.anchor = GridBagConstraints.WEST;
		gbc.insets = new Insets(0, 0, 5, 5);
		gbc.gridx = 1;
		gbc.gridy = 1;
		
		getContentPane().add(p);
		
		list = new JList();
		GridBagConstraints gbc_list = new GridBagConstraints();
		gbc_list.gridheight = 7;
		gbc_list.insets = new Insets(0, 0, 5, 5);
		gbc_list.fill = GridBagConstraints.BOTH;
		gbc_list.gridx = 1;
		gbc_list.gridy = 1;
		p.add(list, gbc_list);
		DefaultListModel modelo = new DefaultListModel();
		for (Proyectos proyectos : proyectosBDD) {
			modelo.addElement(proyectos.getNombre());
		}
		list.setModel(modelo);
		
		list.addListSelectionListener(new ListSelectionListener() {
			
			@Override
			public void valueChanged(ListSelectionEvent e) {
			for (Proyectos proyectos : proyectosBDD) {
				if(list.getSelectedValue().equals(proyectos.getNombre())) {
					textField_3.setText(proyectos.getNombre());
					textField_4.setText(proyectos.getProductOwner());
					textField_5.setText(proyectos.getScrumMaster());
					textArea.setText(proyectos.getDescripcion());
				}
				
			}
				
				
			}
		});
		
		label = new JLabel("Nuevo Proyecto:");
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridx = 3;
		gbc_lblNewLabel.gridy = 1;
		p.add(label, gbc_lblNewLabel);
		
		textField_3 = new JTextField();
		GridBagConstraints gbc_textField_3 = new GridBagConstraints();
		gbc_textField_3.gridwidth = 4;
		gbc_textField_3.insets = new Insets(0, 0, 5, 5);
		gbc_textField_3.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_3.gridx = 4;
		gbc_textField_3.gridy = 1;
		p.add(textField_3, gbc_textField_3);
		textField_3.setColumns(10);
		textField_3.setEditable(false);
		
		label_1= new JLabel("Product owner:");
		GridBagConstraints gbc_lblProductOwner = new GridBagConstraints();
		gbc_lblProductOwner.anchor = GridBagConstraints.EAST;
		gbc_lblProductOwner.insets = new Insets(0, 0, 5, 5);
		gbc_lblProductOwner.gridx = 3;
		gbc_lblProductOwner.gridy = 2;
		p.add(label_1, gbc_lblProductOwner);
		
		textField_4 = new JTextField();
		GridBagConstraints gbc_textField_4 = new GridBagConstraints();
		gbc_textField_4.gridwidth = 4;
		gbc_textField_4.insets = new Insets(0, 0, 5, 5);
		gbc_textField_4.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_4.gridx = 4;
		gbc_textField_4.gridy = 2;
		p.add(textField_4, gbc_textField_4);
		textField_4.setColumns(10);
		textField_4.setEditable(false);
		
		label_2 = new JLabel("Scrum Master:");
		GridBagConstraints gbc_lblScrumMaster = new GridBagConstraints();
		gbc_lblScrumMaster.anchor = GridBagConstraints.EAST;
		gbc_lblScrumMaster.insets = new Insets(0, 0, 5, 5);
		gbc_lblScrumMaster.gridx = 3;
		gbc_lblScrumMaster.gridy = 3;
		p.add(label_2, gbc_lblScrumMaster);
		
		textField_5 = new JTextField();
		GridBagConstraints gbc_textField_5 = new GridBagConstraints();
		gbc_textField_5.gridwidth = 4;
		gbc_textField_5.insets = new Insets(0, 0, 5, 5);
		gbc_textField_5.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_5.gridx = 4;
		gbc_textField_5.gridy = 3;
		p.add(textField_5, gbc_textField_5);
		textField_5.setColumns(10);
		textField_5.setEditable(false);
		
		textArea = new JTextArea();
		GridBagConstraints gbc_textArea_1 = new GridBagConstraints();
		gbc_textArea_1.gridheight = 3;
		gbc_textArea_1.gridwidth = 5;
		gbc_textArea_1.insets = new Insets(0, 0, 5, 5);
		gbc_textArea_1.fill = GridBagConstraints.BOTH;
		gbc_textArea_1.gridx = 3;
		gbc_textArea_1.gridy = 4;
		p.add(textArea, gbc_textArea_1);
		textArea.setEditable(false);
		
		botton = new JButton("Mostrar especificaciones");
		botton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(list.isSelectionEmpty()) {
					JOptionPane.showMessageDialog(null, "selecciona un proyecto");
				}else {
					setVisible(false);
					Sprints sp = new Sprints(textField_3.getText(), datosUser);
					sp.setLocation(40,0);
					InternalFrame.dp.add(sp);
				}
			}
		});
		
		GridBagConstraints gbc_btnMostrarEspec = new GridBagConstraints();
		gbc_btnMostrarEspec.gridwidth = 3;
		gbc_btnMostrarEspec.insets = new Insets(0, 0, 5, 5);
		gbc_btnMostrarEspec.gridx = 3;
		gbc_btnMostrarEspec.gridy = 8;
		p.add(botton, gbc_btnMostrarEspec);
		setResizable(true);
		setClosable(true);
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
	}

}
