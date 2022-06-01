package GUI;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class WindowFrame extends JFrame {
	
	
	MenuSelection menuselection;
	HomeworkAdder homeworkadder;
	HomeworkViewer homeworkviewer;
	
	
	
	
	public WindowFrame() {
		
		this.menuselection = new MenuSelection(this);
		this.homeworkadder = new HomeworkAdder(this);
		this.homeworkviewer = new HomeworkViewer(this);
		
		
		this.setSize(500,500);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		

		
		this.setupPanel(menuselection);
			
		
		
		this.setVisible(true);
	}
	
	
	public void setupPanel(JPanel panel) {
		this.getContentPane().removeAll();
		this.getContentPane().add(panel);
		this.getContentPane().revalidate();
		this.getContentPane().repaint();
		
	}
	
	
	public MenuSelection getMenuselection() {
		return menuselection;
	}


	public void setMenuselection(MenuSelection menuselection) {
		this.menuselection = menuselection;
	}


	public HomeworkAdder getHomeworkadder() {
		return homeworkadder;
	}


	public void setHomeworkadder(HomeworkAdder homeworkadder) {
		this.homeworkadder = homeworkadder;
	}


	public HomeworkViewer getHomeworkviewer() {
		return homeworkviewer;
	}


	public void setHomeworkviewer(HomeworkViewer homeworkviewer) {
		this.homeworkviewer = homeworkviewer;
	}
	
	
}
