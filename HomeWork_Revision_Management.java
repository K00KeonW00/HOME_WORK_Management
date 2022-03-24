package homework1;

import java.util.Scanner;

public class HomeWork_Revision_Management {
	

	public static void main(String[] args) {
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
		System.out.println(" 4. Add The New HomeWork data to Choice the Homework (add the data to 1. ) ");
		System.out.println(" 5. EXIT ");
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
			System.out.println( "]]]]]]]]]]]]]]]]]]]]  You choiced that the - 4. Add The New HomeWork data to Choice the Homework (add the data to 1. -  [[[[[[[[[[[[[[[[[[[[[[[[[" );
			System.out.println("  ");
			System.out.println(" What is you homework name? : ");
			int homworkname = input.nextInt();
			System.out.println(" ------------ Choice the New HomeWork List -------------- ");
			System.out.println(" 1. Aerodynamics ");
			System.out.println(" 2. JAVA ");
			System.out.println(" 3. DataBase Management ");
			System.out.println(" 4. Operating System and Kernel ");
			
			System.out.print( "Choice the Number : " );
			if ( homworkname == 1 ) {
				Lecture_Aerodynamic();
			}
			
			else if ( homworkname == 2 ) {
				Lecture_JAVA();
			}
			else if ( homworkname == 3 ) {
				Lecture_DataBase_Management();
			}
			else if ( homworkname == 4 ) {
				Lecture_Operating_System_and_Kernel();
			}
			else {
				System.out.println( "]]]]]]]]]]]]]]]]]]]]   Thank you for using this program   [[[[[[[[[[[[[[[[[[[[[[[[[" );
				
			}
			
			
			
			
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
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}


	