package Finestres;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JInternalFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JComboBox;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;

public class NuevaTarea extends JInternalFrame implements ActionListener  {
	JPanel p;
	JTextArea textArea;
	JSpinner spinner;
	JComboBox comboBox;
	
	private static int contador;
	
	public NuevaTarea(String datosUser) {
		contador = 1;
		setTitle("Nueva Tarea");
		p = new JPanel();
		
//		String datos = datosUser.substring(datosUser.indexOf("("+1), datosUser.indexOf(""));
//		
//		if(datos == "Developer") {
//			textArea.setEnabled(false);
//			spinner.setEnabled(false);
//			comboBox.setEnabled(false);
//		}
		
		GridBagLayout gbl_p = new GridBagLayout();
		gbl_p.columnWidths = new int[] { 38, 86, 51, 106, 78, 111, 59, 0 };
		gbl_p.rowHeights = new int[] { 20, 37, 23, 37, 42, 42, 0 };
		gbl_p.columnWeights = new double[] { 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
		gbl_p.rowWeights = new double[] { 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
		p.setLayout(gbl_p);
		setSize(618, 252);
		GridBagConstraints gbc = new GridBagConstraints();
		gbc.anchor = GridBagConstraints.WEST;
		gbc.insets = new Insets(0, 0, 5, 5);
		gbc.gridx = 1;
		gbc.gridy = 1;
		
		getContentPane().add(p);
		
		JLabel lblDescripcion = new JLabel("Descripcion:");
		GridBagConstraints gbc_lblDescripcion = new GridBagConstraints();
		gbc_lblDescripcion.insets = new Insets(0, 0, 5, 5);
		gbc_lblDescripcion.gridx = 1;
		gbc_lblDescripcion.gridy = 1;
		p.add(lblDescripcion, gbc_lblDescripcion);
		
		textArea = new JTextArea();
		GridBagConstraints gbc_textArea = new GridBagConstraints();
		gbc_textArea.gridheight = 3;
		gbc_textArea.gridwidth = 4;
		gbc_textArea.insets = new Insets(0, 0, 5, 5);
		gbc_textArea.fill = GridBagConstraints.BOTH;
		gbc_textArea.gridx = 2;
		gbc_textArea.gridy = 1;
		p.add(textArea, gbc_textArea);
		
		JLabel lblSprint = new JLabel("Sprint:");
		lblSprint.setHorizontalAlignment(SwingConstants.RIGHT);
		GridBagConstraints gbc_lblSprint = new GridBagConstraints();
		gbc_lblSprint.anchor = GridBagConstraints.EAST;
		gbc_lblSprint.insets = new Insets(0, 0, 5, 5);
		gbc_lblSprint.gridx = 1;
		gbc_lblSprint.gridy = 4;
		p.add(lblSprint, gbc_lblSprint);
		
		comboBox = new JComboBox();
		GridBagConstraints gbc_comboBox = new GridBagConstraints();
		gbc_comboBox.insets = new Insets(0, 0, 5, 5);
		gbc_comboBox.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox.gridx = 2;
		gbc_comboBox.gridy = 4;
		p.add(comboBox, gbc_comboBox);
		String[] sprint = { "Seleccionar sprint", "sprint1", "sprint2", "sprint3" };
		for (int i = 0; i < sprint.length; i++) {
			comboBox.addItem(sprint[i]);
		}
		
		JLabel lblNewLabel = new JLabel("numero hores:");
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridx = 3;
		gbc_lblNewLabel.gridy = 4;
		p.add(lblNewLabel, gbc_lblNewLabel);
		
		JButton btnNewButton = new JButton("Anadir");
		btnNewButton.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				if(textArea.getText().equals("")){
					JOptionPane.showMessageDialog(null, "Faltan datos");
				}else if (comboBox.getSelectedItem().toString().equals("Seleccionar sprint")) {
					JOptionPane.showMessageDialog(null, "se debe seleccionar un sprint.");
				}else {
					Especificacion espe= new Especificacion(datosUser, textArea.getText(),comboBox.getSelectedItem().toString(),spinner.getValue().toString());
					Sprints.contentPane.add(espe, "cell 0 " + contador + ",grow");
					contador += 1;
					int opcion =JOptionPane.showConfirmDialog(null, "Abandonar pantalla para crear Tarea?", "Confirmacion", JOptionPane.YES_NO_OPTION);
					if(opcion==0) {
						setVisible(false);
					}else if(opcion==1) {
						setVisible(true);
						textArea.setText("");
						comboBox.setSelectedItem("Seleccionar sprint");
						spinner.setValue(0);
					}
				}
			}
		});
		
		spinner = new JSpinner();
		spinner.setModel(new SpinnerNumberModel(0, 0, 18, 1));
		GridBagConstraints gbc_spinner = new GridBagConstraints();
		gbc_spinner.insets = new Insets(0, 0, 5, 5);
		gbc_spinner.gridx = 4;
		gbc_spinner.gridy = 4;
		p.add(spinner, gbc_spinner);
		GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
		gbc_btnNewButton.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton.gridx = 5;
		gbc_btnNewButton.gridy = 4;
		p.add(btnNewButton, gbc_btnNewButton);
		
		setResizable(true);
		setClosable(true);
		setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}
