package studio1;
import java.util.Scanner;
public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		
		System.out.println("Please enter the year you want to check: ");
		
		int year = in.nextInt();
		
		boolean test1 = (year% 4 == 0);
		boolean test2 = (year % 100) != 0;
		boolean test3 = (year % 400) == 0;
		
		System.out.println(year +" is a leap year: " + ((test1 & test2) || (test1 & test3)));
		
/*		if (((year % 4) == 0)) {
			
			if ((year % 100 != 0)) {
				
				System.out.println(year +" is a leap year.");
			}
			
			else if ((year % 400) == 0){
				

				System.out.println(year +" is a leap year.");
				
			}
		}
	
		else {
			
			System.out.println(year +" is NOT a leap year.");
		}
		
		*/
	}

}
