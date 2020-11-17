package javacontrolflow;

import java.util.Scanner;

public class AsciiCharsMain {
	
	public static void main(String[] args) {
		
		System.out.println("\n ----- printNumbers ----- ");
		AsciiChars.printNumbers();
		System.out.println("\n\n----- printLowerCase -----");
		AsciiChars.printLowerCase();
		System.out.println("\n\n----- printUpperCase -----");
		AsciiChars.printUpperCase();
		

		Scanner mySc = new Scanner(System.in);
		System.out.print("\n\n\n Please enter your name:: ");     // 
		String userName = mySc.next();
		System.out.print("\n\t\t Hello  " + userName);     // 
		
		System.out.print("\n\n Do you wish to continue to the interactive portion ??? ");     // 1111111111111111111111
		String choice = mySc.next();
		
		String userCorrectChoice = checkUserChoice(choice);
		
		// do this
		if(userCorrectChoice.toUpperCase().equals("NO") || userCorrectChoice.toUpperCase().equals("N")){
			System.out.print("\n Thank you  " + userName  + " for visiting.  Goodbye" );     //
			
		}
		if (userCorrectChoice.toUpperCase().equals("YES") || userCorrectChoice.toUpperCase().equalsIgnoreCase("Y") || userCorrectChoice.toUpperCase().equals("NO") || userCorrectChoice.toUpperCase().equals("N")) {
			
			while (userCorrectChoice.toUpperCase().equals("YES") || userCorrectChoice.toUpperCase().equalsIgnoreCase("Y")){
					
				String lotoryNum = AsciiCharsLotory.playLotory();
				System.out.println(" \n The Lotory Number is::   " + lotoryNum);
				
				System.out.print("\n\n Do you wish to continue to the interactive portion ??? ------- ");     //
				choice = mySc.next();
				userCorrectChoice = checkUserChoice(choice);
				if(userCorrectChoice.toUpperCase().equals("NO") || userCorrectChoice.toUpperCase().equals("N")){
					System.out.print("\n Thank you  " + userName  + " for visiting.  Goodbye" );     //
					
				}
			} //	while
			
		} else if(userCorrectChoice.toUpperCase().equals("NO") || userCorrectChoice.toUpperCase().equals("N")){ ///==============================
			System.out.print("\n Thank you  " + userName  + " for visiting.  Goodbye" );     //
			
		} // else
		
		
	}	// end main --------------------------- http://www.eclipseonetips.com/2009/12/13/automatically-format-and-cleanup-code-every-time-you-save/
	
	/**
	 * 
	 * @param uChoice
	 * @return
	 */
	public static String checkUserChoice(String uChoice) {

		Scanner scann = new Scanner(System.in);
		
		if ( uChoice.toUpperCase().equals("YES") || uChoice.toUpperCase().equalsIgnoreCase("Y") || uChoice.toUpperCase().equals("NO") || uChoice.toUpperCase().equals("N")) {
			return uChoice;
		}
		else {
			
			do {
				System.out.print("\n Please enter 'YES' or 'Y'  'NO' or 'N'" ); 
				System.out.print("\n Do you wish to continue??? ");     // 
				uChoice = scann.next();  
				if (uChoice.toUpperCase().equals("YES") || uChoice.toUpperCase().equalsIgnoreCase("Y") || uChoice.toUpperCase().equals("NO") || uChoice.toUpperCase().equals("N")) {
					return uChoice;
					
				}
			} while (uChoice.equals("") || !uChoice.toUpperCase().equals("YES") || !uChoice.toUpperCase().equalsIgnoreCase("Y") || !uChoice.toUpperCase().equals("NO") || !uChoice.toUpperCase().equals("N"));
			
			
		} //else
		return uChoice;
		
		
		
	}

}
