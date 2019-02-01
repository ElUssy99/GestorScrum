package Finestres;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSpinner;
import javax.swing.JTextArea;
import javax.swing.ScrollPaneConstants;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;

public class Especificacion extends JPanel{

	private JScrollPane scroll;
	private JTextArea textArea;
	private JCheckBox chMarcar;
	private JButton btnGuardarCambios;
	private JSpinner spinner;
	private JLabel lblNumeroDeHoras;
	private JComboBox comboBox;
	
	private static String nSplit, txtTArea, horas;
	private static boolean marcado;
	
	public Especificacion() {
		String[] sprints = {"Sprint 1","Sprint 2","Sprint 3"};
		
		textArea = new JTextArea();
		scroll = new JScrollPane(textArea);
		scroll.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scroll.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
		
		chMarcar = new JCheckBox("Marcar");
		
		btnGuardarCambios = new JButton("Guardar cambios");
		
		spinner = new JSpinner();
		
		lblNumeroDeHoras = new JLabel("Numero de horas");
		
		comboBox = new JComboBox();
		for (int i = 0; i < sprints.length; i++) {
			comboBox.addItem(sprints[i]);
		}
		
		btnGuardarCambios.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				nSplit = (String) comboBox.getSelectedItem();
				txtTArea = textArea.getText();
				horas = spinner.getValue().toString();
				if(chMarcar.isSelected()) {
					marcado = true;
				}else {
					marcado = false;
				}
				System.out.println(nSplit + " " + horas + " " + marcado + "\n" + txtTArea);
				// Falta saber como guardar estos datos.
			}
		});
		
		GroupLayout gl_panel_1 = new GroupLayout(this);
		gl_panel_1.setHorizontalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_panel_1.createSequentialGroup()
					.addContainerGap(53, Short.MAX_VALUE)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGap(16)
							.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, 97, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(lblNumeroDeHoras)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(spinner, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnGuardarCambios)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(chMarcar)
							.addContainerGap())
						.addGroup(Alignment.TRAILING, gl_panel_1.createSequentialGroup()
							.addComponent(scroll, GroupLayout.PREFERRED_SIZE, 428, GroupLayout.PREFERRED_SIZE)
							.addGap(54))))
		);
		gl_panel_1.setVerticalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
						.addComponent(chMarcar)
						.addComponent(btnGuardarCambios)
						.addComponent(spinner, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNumeroDeHoras)
						.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(scroll, GroupLayout.PREFERRED_SIZE, 66, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(19, Short.MAX_VALUE))
		);
		setLayout(gl_panel_1);
	}

	public static String getnSplit() {
		return nSplit;
	}

	public static String getTxtTArea() {
		return txtTArea;
	}

	public static String getHoras() {
		return horas;
	}

	public static boolean isMarcado() {
		return marcado;
	}
}
