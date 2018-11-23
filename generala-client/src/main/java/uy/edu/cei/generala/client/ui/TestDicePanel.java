package uy.edu.cei.generala.client.ui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.SpringLayout;

import uy.edu.cei.generala.client.ui.panel.BoardPanel;
import uy.edu.cei.generala.client.ui.panel.DicePanel;

import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TestDicePanel {

	private JFrame frame;
	private DicePanel dicePanel;
	private BoardPanel panelj2;
	private JPanel panel_1;
	private JPanel panel_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TestDicePanel window = new TestDicePanel();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public TestDicePanel() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		frame = new JFrame();
		frame.setBounds(100, 100, 816, 741);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		SpringLayout springLayout = new SpringLayout();
		frame.getContentPane().setLayout(springLayout);
		
		JPanel panel = new JPanel();
		springLayout.putConstraint(SpringLayout.NORTH, panel, 10, SpringLayout.NORTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, panel, 10, SpringLayout.WEST, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, panel, 692, SpringLayout.NORTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, panel, 790, SpringLayout.WEST, frame.getContentPane());
		panel.setBackground(Color.ORANGE);
		frame.getContentPane().add(panel);
		SpringLayout sl_panel = new SpringLayout();
		panel.setLayout(sl_panel);

		
		dicePanel = new DicePanel();
		sl_panel.putConstraint(SpringLayout.NORTH, dicePanel, 584, SpringLayout.NORTH, panel);
		sl_panel.putConstraint(SpringLayout.WEST, dicePanel, 10, SpringLayout.WEST, panel);
		sl_panel.putConstraint(SpringLayout.SOUTH, dicePanel, -21, SpringLayout.SOUTH, panel);
		sl_panel.putConstraint(SpringLayout.EAST, dicePanel, 390, SpringLayout.WEST, panel);
		panel.add(dicePanel);
		
		JButton btnWiiiiii = new JButton("Spin dice");
		sl_panel.putConstraint(SpringLayout.WEST, btnWiiiiii, 26, SpringLayout.EAST, dicePanel);
		sl_panel.putConstraint(SpringLayout.SOUTH, btnWiiiiii, -21, SpringLayout.SOUTH, panel);
		sl_panel.putConstraint(SpringLayout.EAST, btnWiiiiii, -30, SpringLayout.EAST, panel);
		btnWiiiiii.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dicePanel.refreshDice();
			}
		});
		panel.add(btnWiiiiii);
		
		panel_1 = new BoardPanel();
		sl_panel.putConstraint(SpringLayout.NORTH, panel_1, 10, SpringLayout.NORTH, panel);
		sl_panel.putConstraint(SpringLayout.WEST, panel_1, 10, SpringLayout.WEST, panel);
		sl_panel.putConstraint(SpringLayout.SOUTH, panel_1, -6, SpringLayout.NORTH, dicePanel);
		sl_panel.putConstraint(SpringLayout.EAST, panel_1, 0, SpringLayout.EAST, dicePanel);
		panel.add(panel_1);
		
		panel_2 = new BoardPanel();
		sl_panel.putConstraint(SpringLayout.NORTH, panel_2, 10, SpringLayout.NORTH, panel);
		sl_panel.putConstraint(SpringLayout.WEST, panel_2, 6, SpringLayout.EAST, panel_1);
		sl_panel.putConstraint(SpringLayout.SOUTH, panel_2, -60, SpringLayout.NORTH, btnWiiiiii);
		sl_panel.putConstraint(SpringLayout.EAST, panel_2, -10, SpringLayout.EAST, panel);
		panel.add(panel_2);
	}
}
