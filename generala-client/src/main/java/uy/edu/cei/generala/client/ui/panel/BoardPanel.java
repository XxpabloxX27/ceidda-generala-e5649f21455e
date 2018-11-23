package uy.edu.cei.generala.client.ui.panel;

import javax.swing.JPanel;
import javax.swing.SpringLayout;
import java.awt.Color;

public class BoardPanel extends JPanel {

	/**
	 * Create the panel.
	 */
	public BoardPanel() {
		setBackground(Color.GRAY);
		SpringLayout springLayout = new SpringLayout();
		setLayout(springLayout);

	}
}
