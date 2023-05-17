package PartIV;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class RollListener implements ActionListener {
	private int curPos = 0;
	private ImagePanel imagePanel1 = new ImagePanel("die1.png");
	private ImagePanel imagePanel2 = new ImagePanel("die1.png");
	
	private JPanel mainPanel;
	private JButton roll;
	
	public RollListener(JPanel mainPanel, JButton roll) {
		this.mainPanel = mainPanel;
		this.roll = roll;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (curPos<25) {
			Random random = new Random();
			int num1 = random.nextInt(6) + 1;
			int num2 = random.nextInt(6) + 1;
			
			this.imagePanel1 = new ImagePanel("die" + num1 + ".png");
			this.imagePanel2 = new ImagePanel("die" + num2 + ".png");
			curPos += num1 + num2;
			curPos = Math.min(25, curPos);
			int output = num1+num2;
			
			JTextArea text = new JTextArea();
			if(curPos==25) text.setText("result: Finished");
			else text.setText("result: " + output);
			LinesRectsOvalsJPanel lrojp = new LinesRectsOvalsJPanel(curPos);
			
			mainPanel.removeAll();
			mainPanel.add(text,BorderLayout.NORTH);
			mainPanel.add(this.imagePanel1,BorderLayout.WEST);
			mainPanel.add(this.imagePanel2,BorderLayout.EAST);
			mainPanel.add(lrojp,BorderLayout.CENTER);
			mainPanel.add(roll,BorderLayout.AFTER_LAST_LINE);
			
			
			mainPanel.repaint();
			mainPanel.updateUI();
			
		}

	}
	public ImagePanel getImage1() {
		return imagePanel1;
	}
	
	public ImagePanel getImage2() {
		return imagePanel2;
	}
	
	public int getCurPos() {
		return curPos;
	}

}
