package homework1;

import java.util.Scanner;

public class HoneWork_ManageMent {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println(" ************************ Thank you for join this Management System ************************ ");
		System.out.println(" If you want that Next Step ----- 1 ");
		System.out.println(" Or not  ------------------------ 2 ");
		System.out.println( "Choice the Number : " );
	
		int First_number_ = input.nextInt();
		
		if ( First_number_ == 1) {
		
		System.out.println(" **** And Choice the How Calculating ****");
		System.out.println(" 1. Choice the New HomeWork List ");
		System.out.println(" 2. Show me the Paused - HomeWork List ");
		System.out.println(" 3. Finished-HomeWork List ");
		System.out.println(" 4. Add The New HomeWork data to Choice the Homework (add the data to 1. ) ");
		System.out.println(" 5. EXIT ");
		System.out.println( "Choice the Number : " );
		
		int Choice_Cal = input.nextInt();
		
		switch (Choice_Cal) {
		case 1:
			System.out.println(" You want do the Homework? ");
			System.out.println(" YES-1 or NO-2 ");
			System.out.println(" Choice The Number : ");
			
			int Case_1 = input.nextInt();
			
			if ( Case_1 == 1) {
				System.out.println(" >>>>>>> EMPTY ");
			}
			else if ( Case_1 == 2) {
				System.out.println(" >>>>>>> Thank you ");
			}
			else {
				System.out.println(" >>>>>>> You Worng the Typing the Number ");
			}
			break;
		
		case 2:
			System.out.println(" You Selected the - Show me the Paused - HomeWork List? ");
			System.out.println(" YES-1 or NO-2 ");
			System.out.println(" Choice The Number : ");
			
			int Case_2 = input.nextInt();
			
			if ( Case_2 == 1) {
				System.out.println(" >>>>>>> EMPTY ");
			}
			else if ( Case_2 == 2) {
				System.out.println(" >>>>>>> Thank you ");
			}
			else {
				System.out.println(" >>>>>>> You Worng the Typing the Number ");
			}
			break;
			
		case 3:
			System.out.println(" You Selected the - Finished-HomeWork List ");
			System.out.println(" YES-1 or NO-2 ");
			System.out.println(" Choice The Number : ");
			
			int Case_3 = input.nextInt();
			
			if ( Case_3 == 1) {
				System.out.println(" >>>>>>> EMPTY ");
			}
			else if ( Case_3 == 2) {
				System.out.println(" >>>>>>> Thank you ");
			}
			else {
				System.out.println(" >>>>>>> You Worng the Typing the Number ");
			}
			break;
			
		case 4:
			System.out.println(" You Selected the - Add The New HomeWork data to Choice the Homework (add the data to 1. ) ");
			System.out.println(" YES-1 or NO-2 ");
			System.out.println(" Choice The Number : ");
			
			int Case_4 = input.nextInt();
			
			if ( Case_4 == 1) {
				System.out.println(" >>>>>>> EMPTY ");
			}
			else if ( Case_4 == 2) {
				System.out.println(" >>>>>>> Thank you ");
			}
			else {
				System.out.println(" >>>>>>> You Worng the Typing the Number ");
			}
			break;
		}
		if ( Choice_Cal == 5 )
		
		System.out.println("*******************  EXIT - THE END  ***********************");
		
		}
		else {
			System.out.println(" *******************  EXIT - THE END  *********************** ");
		}
		
	}

}
