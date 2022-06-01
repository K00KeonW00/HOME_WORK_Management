package GUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class ButtonAdderListener implements ActionListener {
	
	WindowFrame frame;

	
	public ButtonAdderListener(WindowFrame frame1) {
		this.frame = frame1;
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
