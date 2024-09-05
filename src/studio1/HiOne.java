package studio1;

import java.util.Scanner;

public class HiOne {

	/**
	 * Says hello to the supplied argument
	 */
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
	//	System.out.print("Enter value for arg 0: ");
		
		System.out.println("Please enter your name: ");
		String name = in.next();
		System.out.println("Hi, " +name +". How are you?");

	}
	

}
