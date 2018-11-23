package uy.edu.cei.generala.client.ui.panel;

import javax.swing.JPanel;
import javax.swing.SpringLayout;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import java.awt.Component;
import javax.swing.Box;
import javax.swing.JProgressBar;

public class BoardPanel extends JPanel {
	private JTextField txtPlayerName;

	/**
	 * Create the panel.
	 */
	public BoardPanel() {
		setBackground(Color.GRAY);
		SpringLayout springLayout = new SpringLayout();
		setLayout(springLayout);
		
		JPanel panel = new PlayerPanel();
		panel.setBackground(Color.WHITE);
		springLayout.putConstraint(SpringLayout.NORTH, panel, 10, SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.WEST, panel, 10, SpringLayout.WEST, this);
		springLayout.putConstraint(SpringLayout.SOUTH, panel, 89, SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.EAST, panel, 92, SpringLayout.WEST, this);
		add(panel);
		
		txtPlayerName = new JTextField();
		txtPlayerName.setText("Player Name");
		springLayout.putConstraint(SpringLayout.NORTH, txtPlayerName, 10, SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.WEST, txtPlayerName, 6, SpringLayout.EAST, panel);
		add(txtPlayerName);
		txtPlayerName.setColumns(10);
		
		JTextPane txtpnPar = new JTextPane();
		springLayout.putConstraint(SpringLayout.NORTH, txtpnPar, 29, SpringLayout.SOUTH, panel);
		springLayout.putConstraint(SpringLayout.WEST, txtpnPar, 10, SpringLayout.WEST, this);
		springLayout.putConstraint(SpringLayout.EAST, txtpnPar, -183, SpringLayout.EAST, this);
		txtpnPar.setText("Par");
		add(txtpnPar);
		
		JTextPane txtpnTrio = new JTextPane();
		springLayout.putConstraint(SpringLayout.NORTH, txtpnTrio, 6, SpringLayout.SOUTH, txtpnPar);
		springLayout.putConstraint(SpringLayout.WEST, txtpnTrio, 0, SpringLayout.WEST, panel);
		springLayout.putConstraint(SpringLayout.EAST, txtpnTrio, 0, SpringLayout.EAST, txtpnPar);
		txtpnTrio.setText("Trio");
		add(txtpnTrio);
		
		JTextPane txtpnPoker = new JTextPane();
		txtpnPoker.setText("Poker");
		springLayout.putConstraint(SpringLayout.NORTH, txtpnPoker, 6, SpringLayout.SOUTH, txtpnTrio);
		springLayout.putConstraint(SpringLayout.WEST, txtpnPoker, 10, SpringLayout.WEST, this);
		springLayout.putConstraint(SpringLayout.SOUTH, txtpnPoker, 26, SpringLayout.SOUTH, txtpnTrio);
		springLayout.putConstraint(SpringLayout.EAST, txtpnPoker, 96, SpringLayout.WEST, this);
		add(txtpnPoker);
		
		JTextPane txtpnFu = new JTextPane();
		txtpnFu.setText("Full");
		springLayout.putConstraint(SpringLayout.NORTH, txtpnFu, 6, SpringLayout.SOUTH, txtpnPoker);
		springLayout.putConstraint(SpringLayout.WEST, txtpnFu, 10, SpringLayout.WEST, this);
		springLayout.putConstraint(SpringLayout.SOUTH, txtpnFu, 26, SpringLayout.SOUTH, txtpnPoker);
		springLayout.putConstraint(SpringLayout.EAST, txtpnFu, 96, SpringLayout.WEST, this);
		add(txtpnFu);
		
		JTextPane txtpnEscalera = new JTextPane();
		txtpnEscalera.setText("Escalera");
		springLayout.putConstraint(SpringLayout.NORTH, txtpnEscalera, 6, SpringLayout.SOUTH, txtpnFu);
		springLayout.putConstraint(SpringLayout.WEST, txtpnEscalera, 10, SpringLayout.WEST, this);
		springLayout.putConstraint(SpringLayout.SOUTH, txtpnEscalera, 26, SpringLayout.SOUTH, txtpnFu);
		springLayout.putConstraint(SpringLayout.EAST, txtpnEscalera, 96, SpringLayout.WEST, this);
		add(txtpnEscalera);
		
		JTextPane txtpnEscaleraAlta = new JTextPane();
		springLayout.putConstraint(SpringLayout.NORTH, txtpnEscaleraAlta, 6, SpringLayout.SOUTH, txtpnEscalera);
		springLayout.putConstraint(SpringLayout.WEST, txtpnEscaleraAlta, 10, SpringLayout.WEST, this);
		springLayout.putConstraint(SpringLayout.SOUTH, txtpnEscaleraAlta, 26, SpringLayout.SOUTH, txtpnEscalera);
		springLayout.putConstraint(SpringLayout.EAST, txtpnEscaleraAlta, 0, SpringLayout.EAST, txtpnPar);
		txtpnEscaleraAlta.setText("Escalera alta");
		add(txtpnEscaleraAlta);
		
		JTextPane txtpnGenerala = new JTextPane();
		springLayout.putConstraint(SpringLayout.NORTH, txtpnGenerala, 6, SpringLayout.SOUTH, txtpnEscaleraAlta);
		springLayout.putConstraint(SpringLayout.WEST, txtpnGenerala, 0, SpringLayout.WEST, panel);
		springLayout.putConstraint(SpringLayout.SOUTH, txtpnGenerala, 26, SpringLayout.SOUTH, txtpnEscaleraAlta);
		springLayout.putConstraint(SpringLayout.EAST, txtpnGenerala, 4, SpringLayout.EAST, panel);
		txtpnGenerala.setText("Generala");
		add(txtpnGenerala);
		
		JTextPane txtpnComodin = new JTextPane();
		txtpnComodin.setText("Comodin");
		springLayout.putConstraint(SpringLayout.NORTH, txtpnComodin, 6, SpringLayout.SOUTH, txtpnGenerala);
		springLayout.putConstraint(SpringLayout.WEST, txtpnComodin, 10, SpringLayout.WEST, this);
		springLayout.putConstraint(SpringLayout.SOUTH, txtpnComodin, 26, SpringLayout.SOUTH, txtpnGenerala);
		springLayout.putConstraint(SpringLayout.EAST, txtpnComodin, 96, SpringLayout.WEST, this);
		add(txtpnComodin);
		
		JTextPane txtpnSumaDe = new JTextPane();
		txtpnSumaDe.setText("Suma de 1");
		springLayout.putConstraint(SpringLayout.NORTH, txtpnSumaDe, 6, SpringLayout.SOUTH, txtpnComodin);
		springLayout.putConstraint(SpringLayout.WEST, txtpnSumaDe, 10, SpringLayout.WEST, this);
		springLayout.putConstraint(SpringLayout.SOUTH, txtpnSumaDe, 26, SpringLayout.SOUTH, txtpnComodin);
		springLayout.putConstraint(SpringLayout.EAST, txtpnSumaDe, 96, SpringLayout.WEST, this);
		add(txtpnSumaDe);
		
		JTextPane txtpnSumaDe_1 = new JTextPane();
		txtpnSumaDe_1.setText("Suma de 2");
		springLayout.putConstraint(SpringLayout.NORTH, txtpnSumaDe_1, 6, SpringLayout.SOUTH, txtpnSumaDe);
		springLayout.putConstraint(SpringLayout.WEST, txtpnSumaDe_1, 10, SpringLayout.WEST, this);
		springLayout.putConstraint(SpringLayout.SOUTH, txtpnSumaDe_1, 26, SpringLayout.SOUTH, txtpnSumaDe);
		springLayout.putConstraint(SpringLayout.EAST, txtpnSumaDe_1, 96, SpringLayout.WEST, this);
		add(txtpnSumaDe_1);
		
		JTextPane txtpnSumaDe_2 = new JTextPane();
		txtpnSumaDe_2.setText("Suma de 3");
		springLayout.putConstraint(SpringLayout.NORTH, txtpnSumaDe_2, 6, SpringLayout.SOUTH, txtpnSumaDe_1);
		springLayout.putConstraint(SpringLayout.WEST, txtpnSumaDe_2, 10, SpringLayout.WEST, this);
		springLayout.putConstraint(SpringLayout.SOUTH, txtpnSumaDe_2, 26, SpringLayout.SOUTH, txtpnSumaDe_1);
		springLayout.putConstraint(SpringLayout.EAST, txtpnSumaDe_2, 96, SpringLayout.WEST, this);
		add(txtpnSumaDe_2);
		
		JTextPane txtpnSumaDe_3 = new JTextPane();
		txtpnSumaDe_3.setText("Suma de 4");
		springLayout.putConstraint(SpringLayout.NORTH, txtpnSumaDe_3, 6, SpringLayout.SOUTH, txtpnSumaDe_2);
		springLayout.putConstraint(SpringLayout.WEST, txtpnSumaDe_3, 10, SpringLayout.WEST, this);
		springLayout.putConstraint(SpringLayout.SOUTH, txtpnSumaDe_3, 26, SpringLayout.SOUTH, txtpnSumaDe_2);
		springLayout.putConstraint(SpringLayout.EAST, txtpnSumaDe_3, 96, SpringLayout.WEST, this);
		add(txtpnSumaDe_3);
		
		JTextPane txtpnSumaDe_4 = new JTextPane();
		txtpnSumaDe_4.setText("Suma de 5");
		springLayout.putConstraint(SpringLayout.NORTH, txtpnSumaDe_4, 6, SpringLayout.SOUTH, txtpnSumaDe_3);
		springLayout.putConstraint(SpringLayout.WEST, txtpnSumaDe_4, 10, SpringLayout.WEST, this);
		springLayout.putConstraint(SpringLayout.SOUTH, txtpnSumaDe_4, 26, SpringLayout.SOUTH, txtpnSumaDe_3);
		springLayout.putConstraint(SpringLayout.EAST, txtpnSumaDe_4, 96, SpringLayout.WEST, this);
		add(txtpnSumaDe_4);
		
		JTextPane txtpnSumaDe_5 = new JTextPane();
		txtpnSumaDe_5.setText("Suma de 6");
		springLayout.putConstraint(SpringLayout.NORTH, txtpnSumaDe_5, 6, SpringLayout.SOUTH, txtpnSumaDe_4);
		springLayout.putConstraint(SpringLayout.WEST, txtpnSumaDe_5, 10, SpringLayout.WEST, this);
		springLayout.putConstraint(SpringLayout.SOUTH, txtpnSumaDe_5, 26, SpringLayout.SOUTH, txtpnSumaDe_4);
		springLayout.putConstraint(SpringLayout.EAST, txtpnSumaDe_5, 96, SpringLayout.WEST, this);
		add(txtpnSumaDe_5);
		
		JProgressBar progressBar = new JProgressBar();
		springLayout.putConstraint(SpringLayout.NORTH, progressBar, 0, SpringLayout.NORTH, txtpnPar);
		springLayout.putConstraint(SpringLayout.WEST, progressBar, 27, SpringLayout.EAST, txtpnPar);
		springLayout.putConstraint(SpringLayout.SOUTH, progressBar, 0, SpringLayout.SOUTH, txtpnPar);
		springLayout.putConstraint(SpringLayout.EAST, progressBar, -10, SpringLayout.EAST, this);
		add(progressBar);
		
		JProgressBar progressBar_1 = new JProgressBar();
		springLayout.putConstraint(SpringLayout.NORTH, progressBar_1, 0, SpringLayout.NORTH, txtpnTrio);
		springLayout.putConstraint(SpringLayout.WEST, progressBar_1, 0, SpringLayout.WEST, progressBar);
		springLayout.putConstraint(SpringLayout.SOUTH, progressBar_1, 0, SpringLayout.SOUTH, txtpnTrio);
		add(progressBar_1);
		
		JProgressBar progressBar_2 = new JProgressBar();
		springLayout.putConstraint(SpringLayout.NORTH, progressBar_2, 0, SpringLayout.NORTH, txtpnPoker);
		springLayout.putConstraint(SpringLayout.WEST, progressBar_2, 0, SpringLayout.WEST, progressBar);
		springLayout.putConstraint(SpringLayout.SOUTH, progressBar_2, 0, SpringLayout.SOUTH, txtpnPoker);
		add(progressBar_2);
		
		JProgressBar progressBar_3 = new JProgressBar();
		springLayout.putConstraint(SpringLayout.NORTH, progressBar_3, 0, SpringLayout.NORTH, txtpnFu);
		springLayout.putConstraint(SpringLayout.WEST, progressBar_3, 0, SpringLayout.WEST, progressBar);
		springLayout.putConstraint(SpringLayout.SOUTH, progressBar_3, 0, SpringLayout.SOUTH, txtpnFu);
		add(progressBar_3);
		
		JProgressBar progressBar_4 = new JProgressBar();
		springLayout.putConstraint(SpringLayout.NORTH, progressBar_4, 0, SpringLayout.NORTH, txtpnEscalera);
		springLayout.putConstraint(SpringLayout.WEST, progressBar_4, 0, SpringLayout.WEST, progressBar);
		springLayout.putConstraint(SpringLayout.SOUTH, progressBar_4, 0, SpringLayout.SOUTH, txtpnEscalera);
		add(progressBar_4);
		
		JProgressBar progressBar_5 = new JProgressBar();
		springLayout.putConstraint(SpringLayout.NORTH, progressBar_5, 0, SpringLayout.NORTH, txtpnEscaleraAlta);
		springLayout.putConstraint(SpringLayout.WEST, progressBar_5, 0, SpringLayout.WEST, progressBar);
		springLayout.putConstraint(SpringLayout.SOUTH, progressBar_5, 0, SpringLayout.SOUTH, txtpnEscaleraAlta);
		add(progressBar_5);
		
		JProgressBar progressBar_6 = new JProgressBar();
		springLayout.putConstraint(SpringLayout.NORTH, progressBar_6, 0, SpringLayout.NORTH, txtpnGenerala);
		springLayout.putConstraint(SpringLayout.WEST, progressBar_6, 0, SpringLayout.WEST, progressBar);
		springLayout.putConstraint(SpringLayout.SOUTH, progressBar_6, 0, SpringLayout.SOUTH, txtpnGenerala);
		add(progressBar_6);
		
		JProgressBar progressBar_7 = new JProgressBar();
		springLayout.putConstraint(SpringLayout.NORTH, progressBar_7, 0, SpringLayout.NORTH, txtpnComodin);
		springLayout.putConstraint(SpringLayout.WEST, progressBar_7, 0, SpringLayout.WEST, progressBar);
		springLayout.putConstraint(SpringLayout.SOUTH, progressBar_7, 0, SpringLayout.SOUTH, txtpnComodin);
		add(progressBar_7);
		
		JProgressBar progressBar_8 = new JProgressBar();
		springLayout.putConstraint(SpringLayout.NORTH, progressBar_8, 0, SpringLayout.NORTH, txtpnSumaDe);
		springLayout.putConstraint(SpringLayout.SOUTH, progressBar_8, 0, SpringLayout.SOUTH, txtpnSumaDe);
		springLayout.putConstraint(SpringLayout.EAST, progressBar_8, 0, SpringLayout.EAST, progressBar);
		add(progressBar_8);
		
		JProgressBar progressBar_9 = new JProgressBar();
		springLayout.putConstraint(SpringLayout.NORTH, progressBar_9, 0, SpringLayout.NORTH, txtpnSumaDe_1);
		springLayout.putConstraint(SpringLayout.SOUTH, progressBar_9, 0, SpringLayout.SOUTH, txtpnSumaDe_1);
		springLayout.putConstraint(SpringLayout.EAST, progressBar_9, 0, SpringLayout.EAST, progressBar);
		add(progressBar_9);
		
		JProgressBar progressBar_10 = new JProgressBar();
		springLayout.putConstraint(SpringLayout.NORTH, progressBar_10, 0, SpringLayout.NORTH, txtpnSumaDe_2);
		springLayout.putConstraint(SpringLayout.WEST, progressBar_10, 0, SpringLayout.WEST, progressBar);
		springLayout.putConstraint(SpringLayout.SOUTH, progressBar_10, 0, SpringLayout.SOUTH, txtpnSumaDe_2);
		add(progressBar_10);
		
		JProgressBar progressBar_11 = new JProgressBar();
		springLayout.putConstraint(SpringLayout.NORTH, progressBar_11, 0, SpringLayout.NORTH, txtpnSumaDe_3);
		springLayout.putConstraint(SpringLayout.SOUTH, progressBar_11, 0, SpringLayout.SOUTH, txtpnSumaDe_3);
		springLayout.putConstraint(SpringLayout.EAST, progressBar_11, 0, SpringLayout.EAST, progressBar);
		add(progressBar_11);
		
		JProgressBar progressBar_12 = new JProgressBar();
		springLayout.putConstraint(SpringLayout.NORTH, progressBar_12, 0, SpringLayout.NORTH, txtpnSumaDe_4);
		springLayout.putConstraint(SpringLayout.WEST, progressBar_12, 0, SpringLayout.WEST, progressBar);
		springLayout.putConstraint(SpringLayout.SOUTH, progressBar_12, 0, SpringLayout.SOUTH, txtpnSumaDe_4);
		add(progressBar_12);
		
		JProgressBar progressBar_13 = new JProgressBar();
		springLayout.putConstraint(SpringLayout.NORTH, progressBar_13, 0, SpringLayout.NORTH, txtpnSumaDe_5);
		springLayout.putConstraint(SpringLayout.WEST, progressBar_13, 0, SpringLayout.WEST, progressBar);
		springLayout.putConstraint(SpringLayout.SOUTH, progressBar_13, 0, SpringLayout.SOUTH, txtpnSumaDe_5);
		add(progressBar_13);

	}
}
