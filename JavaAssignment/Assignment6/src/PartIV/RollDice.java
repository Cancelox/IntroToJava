package PartIV;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class RollDice extends JFrame {


	public RollDice() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setBackground(Color.LIGHT_GRAY);
		setupPanels();
		setSize(800,600);
		setVisible(true);
	}
	
	
	public void setupPanels() {
		JPanel mainPanel = new JPanel();
		BorderLayout layout = new BorderLayout();
		mainPanel.setLayout(layout);
		
		JButton roll = new JButton("Roll Dice");
		RollListener rl = new RollListener(mainPanel, roll);
		roll.addActionListener(rl);
		
		JTextArea text = new JTextArea();
		text.setText("result: 0");
		LinesRectsOvalsJPanel lrojp = new LinesRectsOvalsJPanel(0);
		
		mainPanel.add(text,BorderLayout.NORTH);
		mainPanel.add(rl.getImage1(),BorderLayout.WEST);
		mainPanel.add(rl.getImage2(),BorderLayout.EAST);
		mainPanel.add(lrojp,BorderLayout.CENTER);
		mainPanel.add(roll,BorderLayout.AFTER_LAST_LINE);
		
		this.add(mainPanel);
	}
	
	public static void main(String[] args) {
		RollDice rollDice = new RollDice();
	
	}
}
