package homework1;

public class Implement_Calc implements Implement_Charge {

	public int Charge1 = 0;
	public int Charge2 = 0;
	
	
	public void degree3() {
		Charge1 = 300000;
	}
	
	public void degree1() {
		Charge2 = 100000;
	}
	
	
	public void PrintInfo() {
		System.out.println ("3학점의 수강료는 : " + Charge1 + " 입니다.");
		System.out.println ("1학점의 수강료는 : " + Charge2 + " 입니다.");
	}
	
	
	
}
