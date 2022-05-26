package homework3GUI;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class HomeworkManagement {
	
	public static void main(String[] args) {
		JFrame frame = new JFrame ("My Homework Management System");
		JPanel panel1 = new JPanel();
		JPanel panel2 = new JPanel();
		JLabel label1 = new JLabel("올바른 PW를 입력하세요.");
		
		JLabel label2 = new JLabel("PW : ");
		JTextField field1 = new JTextField(10);
	
		panel1.add (label1);
		panel1.add(field1);
		
		panel2.add (label2);
		panel2.add(field1);
		
		frame.add(panel1,BorderLayout.NORTH);
		frame.add(panel2,BorderLayout.CENTER);
		frame.setSize(600, 200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}
