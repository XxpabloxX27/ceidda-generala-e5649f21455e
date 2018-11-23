package uy.edu.cei.generala.client.ui.panel;

import javax.swing.JPanel;
import javax.swing.SpringLayout;
import java.awt.Color;

public class PlayerPanel extends JPanel {

	/**
	 * Create the panel.
	 */
	public PlayerPanel() {
		SpringLayout springLayout = new SpringLayout();
		setLayout(springLayout);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		springLayout.putConstraint(SpringLayout.NORTH, panel, 77, SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.WEST, panel, 76, SpringLayout.WEST, this);
		springLayout.putConstraint(SpringLayout.SOUTH, panel, 169, SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.EAST, panel, 180, SpringLayout.WEST, this);
		add(panel);

	}

}
