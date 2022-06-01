package GUI;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

public class HomeworkViewer extends JPanel {

	WindowFrame frame;
	
	public HomeworkViewer(WindowFrame windowFrame2) {
		// TODO Auto-generated constructor stub
		
		this.frame = windowFrame2;
		
	}

	public void StudentViewer(WindowFrame frame2) {
		
		this.frame = frame2;
		
		
		DefaultTableModel model = new DefaultTableModel();
		model.addColumn("Thermodynamic");
		model.addColumn("Aerodynamic");
		model.addColumn("Database Management System");
		model.addColumn("Operating System");

		
		
		JTable table = new JTable(model);
		JScrollPane sp = new JScrollPane(table);
		
		
		this.add(sp);
		
	}
	
}
