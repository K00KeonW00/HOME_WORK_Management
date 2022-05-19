package homework1;

import java.util.Scanner;
import java.util.ArrayList;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class HomeWork_Revision_Management {
	

	public static void main(String[] args) {
		
		try {
			int num = getNum();
		}
		
		catch (MyException e) {
			System.out.println("올바른 PW를 입하세요. : ");
			e.printStackTrace();
			
		}
		
		
		Date date = new Date ();
		
		SimpleDateFormat format = new SimpleDateFormat ("yyy-MM-dd HH:mm:ss");
		
		try {
			
			FileOutputStream file = new FileOutputStream("log.txt");
			
		}
		
		catch (FileNotFoundException e) {
			e.printStackTrace();
			
		}
		
		catch (IOException e) {
			e.printStackTrace();
			
		}
		
		
		System.out.println ("사용자 접근 시간 : " + format.format(date));
		
			
	
		
		ArrayList<Homework_Viewer>a = new ArrayList <Homework_Viewer>();
		Homework_Viewer h1 = new Homework_Viewer();
		Homework_Viewer h2 = new Homework_Viewer();
		Homework_Viewer h3 = new Homework_Viewer();
		
		h1.setHomework_Viewer(220001, "Thermal_Dynamic", 3);
		h2.setHomework_Viewer(220002, "Computer_Vision", 3);
		h3.setHomework_Viewer(220003, "Computing_Intelligence", 2);
		
		a.add(h1);
		a.add(h2);
		a.add(h3);
		a.remove(h3);
		
		
		
		System.out.println(" ************************ NEW Add The Subjet of Major ************************ ");
		System.out.println (h1.getNAME());
		System.out.println (h2.getNAME());
		
		System.out.println(" ************************ Searching the Subject Information ************************ ");
		Scanner in = new Scanner(System.in);
		System.out.println("Please inset the Subject Name that if you want the Specific Information : ");
		String Code = in.next();
		
		for (int i = 0; i<a.size(); i++) {
			
			Homework_Viewer out = a.get(i);
			
			if (Code.equals(out.getNAME())) {
				System.out.println("Subject Number is : " + out.getSID() + "," + "Subjcet Credit" + out.getNOS()+"학점 ");
			}
				
			
		}
		
		
		Scanner input = new Scanner(System.in);
		System.out.println(" ************************ Thank you for join this Management System ************************ ");
		System.out.println(" If you want that Next Step ----- 1 ");
		System.out.println(" Or not  ------------------------ 2 ");
		System.out.print( "Choice the Number : " );
		
		int Firstnum = input.nextInt();
		if ( Firstnum == 1 ) {
			Nextstep();
		}
		else {
			System.out.println( "]]]]]]]]]]]]]]]]]]]]   Thank you for using this program   [[[[[[[[[[[[[[[[[[[[[[[[[" );
		}
		

	}
	
	public static void Nextstep() {
		Scanner input = new Scanner(System.in);
		System.out.println("  ");
		System.out.println(" **** And Choice the Menu ****");
		System.out.println(" 1. Choice the New HomeWork List ");
		System.out.println(" 2. Show me the Paused - HomeWork List ");
		System.out.println(" 3. Finished-HomeWork List ");
		System.out.println(" 4. Revision that yours Information ) ");
		System.out.println(" 5. Looking That the Charge of Lecture ");
		System.out.println(" 6. EXIT ");
	
		
		System.out.print( "Choice the Number : " );
		
		int Secnum = input.nextInt();
		
		
		if ( Secnum == 1) {
			System.out.println("  ");
			System.out.println(" ------------ Choice the New HomeWork List -------------- ");
			System.out.println(" 1. Aerodynamics ");
			System.out.println(" 2. JAVA ");
			System.out.println(" 3. DataBase Management ");
			System.out.println(" 4. Operating System and Kernel ");
			
			System.out.print( "Choice the Number : " );
			int LectureNum = input.nextInt();
			
			if ( LectureNum == 1 ) {
				Lecture_Aerodynamic();
			}
			
			else if ( LectureNum == 2 ) {
				Lecture_JAVA();
			}
			else if ( LectureNum == 3 ) {
				Lecture_DataBase_Management();
			}
			else if ( LectureNum == 4 ) {
				Lecture_Operating_System_and_Kernel();
			}
				
			else {
				System.out.println( "]]]]]]]]]]]]]]]]]]]]   Thank you for using this program   [[[[[[[[[[[[[[[[[[[[[[[[[" );
				
			}
			
			
		}
		else if ( Secnum == 2 ) { 
			System.out.println("  ");
			System.out.println( "]]]]]]]]]]]]]]]]]]]]  You choiced that the - 2. Show me the Paused - HomeWork List -  [[[[[[[[[[[[[[[[[[[[[[[[[" );
			System.out.println("  ");
			System.out.println(" You HomeWork List Is Empy!!!! ");
			System.out.println("  ");
			System.out.println(" ************************ Thank you for join this Management System ************************ ");
			System.out.println(" If you want that Return the Step ----- 1 ");
			System.out.println(" Or not  ------------------------ 2 ");
			System.out.print( "Choice the Number : " );
			
			int Firstnum = input.nextInt();
			if ( Firstnum == 1 ) {
				Nextstep();
			}
			else {
				System.out.println( "]]]]]]]]]]]]]]]]]]]]   Thank you for using this program   [[[[[[[[[[[[[[[[[[[[[[[[[" );
			}
			
		}
		else if ( Secnum == 3 ) { 
			System.out.println("  ");
			System.out.println( "]]]]]]]]]]]]]]]]]]]]  You choiced that the - 3. Finished-HomeWork List -  [[[[[[[[[[[[[[[[[[[[[[[[[" );
			System.out.println("  ");
			System.out.println(" You HomeWork List Is Empy!!!! ");
			System.out.println("  ");
			System.out.println(" ************************ Thank you for join this Management System ************************ ");
			System.out.println(" If you want that Return the Step ----- 1 ");
			System.out.println(" Or not  ------------------------ 2 ");
			System.out.print( "Choice the Number : " );
			
			int Firstnum = input.nextInt();
			if ( Firstnum == 1 ) {
				Nextstep();
			}
			else {
				System.out.println( "]]]]]]]]]]]]]]]]]]]]   Thank you for using this program   [[[[[[[[[[[[[[[[[[[[[[[[[" );
			}
		}
			
			
		else if ( Secnum == 4 ) { 
			System.out.println("  ");
			System.out.println( "You Want that revise to Personality Information?" );
			System.out.println("  ");
			System.out.print(" Hello User :  ");
			homwork_menu p = new homwork_menu();
			//
			//
			//
			//
			//
			//
			
			System.out.println(p.getSNAME());
			System.out.print(" and your SID Number is :  ");
			System.out.println(p.getSID());
			System.out.println(" ");
			System.out.println(" --------------------- Auto Information Revision System on ---------------------------");
			
			System.out.println(" ");
			System.out.print("Your name is : ");
			
			p.setSNAME("김건");
			p.setSID((2021209487));
			
			System.out.println(p.getSNAME());
			System.out.print("and Your SID is : ");
			System.out.println(p.getSID());
		}
		
		
		else if ( Secnum == 5 ) { 
			System.out.println("  ");
			System.out.println( "You Want that Looking that your's Charge of the Lecture?" );
			System.out.println("  ");
			
			Implement_Charge ic = new Implement_Calc();
			
			ic.degree3();
			ic.degree1();
			ic.PrintInfo();
			
			
			
			
		}
		
		
		
		
		else {
			System.out.println(" ************************ Thank you for join this Management System ************************ ");
			System.out.println(" If you want that Return the Step ----- 1 ");
			System.out.println(" Or not  ------------------------ 2 ");
			System.out.println( "Choice the Number : " );
			
			int Return_Loopnum = input.nextInt();
			if ( Return_Loopnum == 1 ) {
				Nextstep();
			}
			else {
				System.out.println( "]]]]]]]]]]]]]]]]]]]]   Thank you for using this program   [[[[[[[[[[[[[[[[[[[[[[[[[" );
			}
			
		}
	
		
	}
	
	public static void Lecture_Aerodynamic() {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("  ");
		System.out.println(" Aerodynamics Lecture Information ");
		System.out.println(" 1. Ph.IDnum : 2029888946 ");
		System.out.println(" 2. Ph.Email : Aero.KK@gnu.ac.kr ");
		System.out.println(" 3. Department : Aerospace and software Engineering ");
		System.out.println(" 4. Office Num : 407-1004 ");
		System.out.println("  ");
		System.out.println(" ************************ Thank you for join this Management System ************************ ");
		System.out.println(" If you want that Return the Step ----- 1 ");
		System.out.println(" Or not  ------------------------ 2 ");
		System.out.println( "Choice the Number : " );
		
		int Return_Loopnum = input.nextInt();
		if ( Return_Loopnum == 1 ) {
			Nextstep();
		}
		else {
			System.out.println( "]]]]]]]]]]]]]]]]]]]]   Thank you for using this program   [[[[[[[[[[[[[[[[[[[[[[[[[" );
		}
		
	}
	
	public static void Lecture_JAVA() {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("  ");
		System.out.println(" JAVA Lecture Information ");
		System.out.println(" 1. Ph.IDnum : 2020030002 ");
		System.out.println(" 2. Ph.Email : JAVA.KK@gnu.ac.kr ");
		System.out.println(" 3. Department : Aerospace and software Engineering ");
		System.out.println(" 4. Office Num : 407-1020 ");
		System.out.println("  ");
		System.out.println(" ************************ Thank you for join this Management System ************************ ");
		System.out.println(" If you want that Return the Step ----- 1 ");
		System.out.println(" Or not  ------------------------ 2 ");
		System.out.println( "Choice the Number : " );
		
		int Return_Loopnum = input.nextInt();
		if ( Return_Loopnum == 1 ) {
			Nextstep();
		}
		else {
			System.out.println( "]]]]]]]]]]]]]]]]]]]]   Thank you for using this program   [[[[[[[[[[[[[[[[[[[[[[[[[" );
		}
		
	}
	
	public static void Lecture_DataBase_Management() {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("  ");
		System.out.println(" DataBase Management Lecture Information ");
		System.out.println(" 1. Ph.IDnum : 20292233456 ");
		System.out.println(" 2. Ph.Email : IT.Aero@gnu.ac.kr ");
		System.out.println(" 3. Department : Aerospace and software Engineering ");
		System.out.println(" 4. Office Num : 407-1010 ");
		System.out.println("  ");
		System.out.println(" ************************ Thank you for join this Management System ************************ ");
		System.out.println(" If you want that Return the Step ----- 1 ");
		System.out.println(" Or not  ------------------------ 2 ");
		System.out.println( "Choice the Number : " );
		
		int Return_Loopnum = input.nextInt();
		if ( Return_Loopnum == 1 ) {
			Nextstep();
		}
		else {
			System.out.println( "]]]]]]]]]]]]]]]]]]]]   Thank you for using this program   [[[[[[[[[[[[[[[[[[[[[[[[[" );
		}
		
	}
	public static void Lecture_Operating_System_and_Kernel() {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("  ");
		System.out.println(" Opetating System and Kernel Lecture Information ");
		System.out.println(" 1. Ph.IDnum : 20292233456 ");
		System.out.println(" 2. Ph.Email : IT.Aero@gnu.ac.kr ");
		System.out.println(" 3. Department : Aerospace and software Engineering ");
		System.out.println(" 4. Office Num : 407-1010 ");
		System.out.println("  ");
		System.out.println(" ************************ Thank you for join this Management System ************************ ");
		System.out.println(" If you want that Return the Step ----- 1 ");
		System.out.println(" Or not  ------------------------ 2 ");
		System.out.println( "Choice the Number : " );
		
		int Return_Loopnum = input.nextInt();
		if ( Return_Loopnum == 1 ) {
			Nextstep();
		}
		else {
			System.out.println( "]]]]]]]]]]]]]]]]]]]]   Thank you for using this program   [[[[[[[[[[[[[[[[[[[[[[[[[" );
		}
		
	}
	

	
	
	
public static int getNum() throws MyException {
		
	
		System.out.println("학생의 학번 뒷자리를 누르세요 . ");
		System.out.print("올바른 PW를 입력하면 프로그램이 실행됩니다. : ");	
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		
		if ( num != 80165 ) {
			
			throw new MyException();
			
		}
		
		else {
			System.out.println("환영합니다. ");
		}
		
		return num;
	}	
	
	
	

	
	
	
}


	