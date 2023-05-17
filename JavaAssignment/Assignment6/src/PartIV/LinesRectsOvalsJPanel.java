package PartIV;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JPanel;

public class LinesRectsOvalsJPanel extends JPanel {
	private int curPos;
	private int gridSize = 6;
	private int cellSize = 70;

	LinesRectsOvalsJPanel(int curPos) {
		this.curPos = curPos;
		setPreferredSize(new Dimension(400,200));
	}
	public void paintComponent(Graphics g) {
		super.paintComponent(g); // call the superclass's paint Method
		// draw grid
		for(int i=0;i<gridSize;i++) {
			g.setColor(Color.BLACK);
			g.drawLine(45+i*cellSize, 120, 45+i*cellSize, 470);
		}
		for(int j=0;j<gridSize;j++) {
			g.setColor(Color.BLACK);
			g.drawLine(45, 120+j*cellSize, 395, 120+j*cellSize);
		}
		// draw point
		g.setColor(Color.BLACK);
		if(curPos==25) {
			g.fillOval(355, 430, 10, 10);
		}else {
			int x = curPos%5;
			int y = Math.min(4, curPos/5);
			g.fillOval(75+70*x, 150+70*y, 10, 10);
		}
		

	}
}
