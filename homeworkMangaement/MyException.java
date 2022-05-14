package homework1;

public class MyException extends Exception {

private int num;
	
	public void HomeWork_Revision_Management(int num) {
		this.num = num;
	}
	
	public int getNum() {
		return num;
	}
	
	
}
