package homework3GUI;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class HomeworkManagementSystem2 {

	
	public static void main(String[] args) {
		JFrame frame = new JFrame (" MyHomework Management System - 승인된 사용자 ");
		JPanel panel1 = new JPanel();
		JPanel panel2 = new JPanel();
		JPanel panel3 = new JPanel();
		
		JLabel label1 = new JLabel("Choice the Menue");
		JButton button1 = new JButton(" - 1 - ");
		JButton button2 = new JButton(" - 2 - ");
		JButton button3 = new JButton(" - 3 - ");
		JButton button4 = new JButton(" - 4 - ");
		JButton button5 = new JButton(" - 5 - ");
		JButton button6 = new JButton(" - 6 - ");
		
		JLabel label2 = new JLabel("<html><body><center>1. Choice the New HomeWork List<br>2. Show me the Paused - HomeWork List<br> 3. Finished-HomeWork List<br>4. Revision that yours Information<br>5. Looking That the Charge of Lecture<br>6. EXIT  </center></body></html>");
		
		panel1.add (label1);
		
		panel2.add (button1);
		panel2.add (button2);
		panel2.add (button3);
		panel2.add (button4);
		panel2.add (button5);
		panel2.add (button6);
		
		panel3.add(label2);
		
		frame.add(panel1,BorderLayout.NORTH);
		frame.add(panel2,BorderLayout.CENTER);
		frame.add(panel3,BorderLayout.SOUTH);
		frame.setSize(600, 200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}

