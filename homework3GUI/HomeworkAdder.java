package GUI;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

public class HomeworkAdder extends JPanel{
	
	WindowFrame frame;
	
	
	
	public HomeworkAdder(WindowFrame frame1) {
		
		this.frame=frame1;
		
		JPanel panel = new JPanel();
		panel.setLayout(new SpringLayout());
		
		
		JLabel labelID = new JLabel("Lecture ID : ", JLabel.TRAILING);
		JTextField fieldID = new JTextField(10);
		labelID.setLabelFor(fieldID);
		panel.add(labelID);
		panel.add(fieldID);
		
		
		JLabel labelName = new JLabel("Lecture Name : ", JLabel.TRAILING);
		JTextField fieldName = new JTextField(10);
		labelID.setLabelFor(fieldName);
		panel.add(labelName);
		panel.add(fieldName);
		
		
		
		JLabel labelSID = new JLabel("Lecture SID : ", JLabel.TRAILING);
		JTextField fieldSID = new JTextField(10);
		labelID.setLabelFor(fieldSID);
		panel.add(labelSID);
		panel.add(fieldSID);
		
		
		
		JLabel labelPhone = new JLabel("ph.d Phone : ", JLabel.TRAILING);
		JTextField fieldPhone = new JTextField(10);
		labelID.setLabelFor(fieldPhone);
		panel.add(labelPhone);
		panel.add(fieldPhone);
		
		
		panel.add(new JButton("save"));
		panel.add(new JButton("cancle"));
		
		
		frame.add(panel);
		frame.setVisible(true);
		
		
	}

}
