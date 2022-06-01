package GUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class ButtonViewListener implements ActionListener {
	
	WindowFrame frame;

	
	public ButtonViewListener(WindowFrame frame) {
		this.frame = frame;
	}
	


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

		JButton b = (JButton) e.getSource();
		System.out.println(b.getText());
		HomeworkViewer viewer = frame.getHomeworkviewer();
		
		frame.setupPanel(viewer);
		
		
	}

}
