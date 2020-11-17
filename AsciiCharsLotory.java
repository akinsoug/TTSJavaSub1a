package javacontrolflow;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

/**
 * 
Once all the numbers have been calculated, print them out in this form:
```
Lottery numbers: 4, 17, 15, 52, 26  Magic ball: 22
```

**Play again?**
After the numbers have been printed, ask the user if they would like to answer questions to generate another set of numbers.  
If so, repeat the entire process.  If not, print a thank you message and exit.  


Once the basics of this are working (happy path), go back and add error-checking for each question.  
If the user does not enter a valid entry, ask the question again until a valid entry is produced.

#### Bonus
* Remove duplicate numbers
* sort the first 5 numbers.
 *
 */
public class AsciiCharsLotory {

	public static String playLotory() {
		
		StringBuffer strBffForLotoryStr = new StringBuffer();
//		StringBuffer strBffForLotoryInteger = new StringBuffer();
		ArrayList<Integer> intLotoryArr = new ArrayList<Integer>();
		
		final int minRand1 = 1;
		final int maxRand65 = 65;
		final int maxRand75 = 75;

		Scanner mySc2 = new Scanner(System.in);
		
		Random rand = new Random();
		
		String uFavPetName = "";
		int petAge = 0;
		int uLuckyNum = 0;
		String favQuaterBack = "";
		int uJerseyNum = 0;
		int uCarTwoDigitNum = 0;
		String uFavriteActName = "";
		
		// random numbers between 1 and 65
		int randNum1 = (int)(Math.random() * (maxRand75 - minRand1 + 1) + minRand1);
		int randNum2 = (int)(Math.random() * (maxRand65 - minRand1 + 1) + minRand1);
		int randNum3 = (int)(Math.random() * (maxRand65 - minRand1 + 1) + minRand1);
		int randMagicNum = -1;
		
		String myLotoryNumStr = "";
//		int lotoryNum = 0;
		
		//The output will 5 random numbers between 1 and 65, and the "magic ball" between 1 and 75. 

		System.out.print("\n\nWhat is your Pet's name? :  \t");
		uFavPetName = mySc2.next();
		mySc2.nextLine();
		// try block to check non digit characters 
		try {
			System.out.print("\nWhat is your Pet's age? : \t");
			petAge = Integer.parseInt(mySc2.next()); 
			
		} catch (NumberFormatException numbFormatErr) {
			try {
//				do {} while (!numbFormatErr.equals(""));
					System.out.println("Please enter a number for your Pet's age??? :::  ");
					petAge = Integer.parseInt(mySc2.next()); 
				
			} catch (NumberFormatException numbFormatErr2) {
				System.out.println("Please enter a number for your Pet's age??? :::  ");
				petAge = Integer.parseInt(mySc2.next()); 
			}
		} // end petAge catch====================1
		
		try {
			System.out.print("\nWhat is your Lucky Num? :  \t");
			uLuckyNum = mySc2.nextInt();
		} catch (Exception excp) {
			System.out.println("Please enter a number for yourLucky Number??? :::  ");
			uLuckyNum = mySc2.nextInt();
		}
		
		System.out.print("\n\n Do you have a favorite quarterback? : \t");
		favQuaterBack = mySc2.next();
		mySc2.nextLine(); // 
		if (favQuaterBack.toUpperCase().equals("Y") || favQuaterBack.toUpperCase().equals("YES")) {
			System.out.print("\t What is your jersey number? : \t");
			uJerseyNum = mySc2.nextInt();
		}
		System.out.print("\nWhat is two-digit model year of their car?: \t");
		uCarTwoDigitNum = mySc2.nextInt();
		System.out.print("\nWhat is the first name of your favorite actor or actress??: \t");
		uFavriteActName = mySc2.next();
		
		
/*
 * Generate the "magic ball" first.  
It should be the user's favorite quarterback jersey number *or* their lucky number, multiplied by one of the random numbers.  
Make sure that the answer is less the max "magic" number of 75; if it 
is greater than 75 then subtract 75 from the value and that value is now the "magic ball" number. 

  Find the 3rd letter of their favorite pet.  Convert that character value to an integer value.
* Use the two digit model year of their car and add their lucky number to it.
* Use the random number between 1 and 50, subtracting one of the generated random numbers.
* Convert the first letter of their favorite actor/actress to an integer and use that value.
* Convert the last letter of their favorate actor/actress to an integer and use that value.
* Use the value 42.
Lottery numbers: 4, 17, 15, 52, 26  Magic ball: 22
 */
		// 6- Generate the "magic ball" first. It should be the user's favorite quarterback jersey number *or* their lucky number, multiplied by one of the random numbers.
		if (favQuaterBack.toUpperCase().equals("Y") || favQuaterBack.toUpperCase().equals("YES")) {
			randMagicNum = (uJerseyNum * randNum1) ;
		}else {
			randMagicNum = uLuckyNum * randNum1 ;
		}
		
		System.out.println("\n\n\n randMagicNum before math \t" + randMagicNum);
		if (randMagicNum > maxRand75) {
			do {
				randMagicNum -= maxRand75;
			} while (randMagicNum > maxRand75);
			
		}
		// 1- Find the 3rd letter of their favorite pet.  Convert that character value to an integer value.
		int petThirdLetterForFirstNum =  (int)uFavPetName.charAt(2);
		strBffForLotoryStr.append(petThirdLetterForFirstNum) ;
		strBffForLotoryStr.append(", ");
		intLotoryArr.add(petThirdLetterForFirstNum);
		
		// 2- Use the two digit model year of their car and add their lucky number to it.
		int carTwoDigitsPlusLuckyForSecondNum = uCarTwoDigitNum + uLuckyNum;
		strBffForLotoryStr.append(carTwoDigitsPlusLuckyForSecondNum) ;
		strBffForLotoryStr.append(", ");
		intLotoryArr.add(carTwoDigitsPlusLuckyForSecondNum);//------------
		
		// 3- Use the random number between 1 and 50, subtracting one of the generated random numbers.
		int subtractTwoRandNUmForThirdNUm = Math.abs(randNum2 - randNum3) ;
		strBffForLotoryStr.append(subtractTwoRandNUmForThirdNUm) ;
		strBffForLotoryStr.append(", ");
		intLotoryArr.add(subtractTwoRandNUmForThirdNUm);
		
		// 4- Convert the first letter of their favorite actor/actress to an integer and use that value.
		int actoressFirstLetterForFourth =  (int)uFavriteActName.charAt(0);
		strBffForLotoryStr.append(actoressFirstLetterForFourth) ;
		strBffForLotoryStr.append(", ");
		intLotoryArr.add(actoressFirstLetterForFourth);
		
		// 5- Convert the last letter of their favorate actor/actress to an integer and use that value.
		int actoressLastLetterForFifth =  (int)uFavriteActName.charAt(uFavriteActName.length()-1);
		strBffForLotoryStr.append(actoressFirstLetterForFourth) ;
		strBffForLotoryStr.append("  Magic ball:  ");
		intLotoryArr.add(actoressFirstLetterForFourth);
		
		// sorting the first 5 numbers.
		Collections.sort(intLotoryArr);	
		System.out.println("\n\n\t Sorted first 5 numbers:  " + intLotoryArr);
		 
		// adding the magic number
		myLotoryNumStr = strBffForLotoryStr.append(randMagicNum).toString();
		intLotoryArr.add(randMagicNum);
		
//		System.out.println("\n\n\t intLotoryArr ;;;; " + intLotoryArr);
//		Collections.reverse(intLotoryArr);// REVERSING THE ORDER OF ENTRY
//		System.out.println("\n\n\t intLotoryArr ;;;; " + intLotoryArr);
		
		
		// Remove duplicate numbers
		intLotoryArr = new ArrayList<Integer>(new LinkedHashSet<Integer>(intLotoryArr));
//		Set<Integer> set = new HashSet<>(intLotoryArr);
//		intLotoryArr.clear();
//		intLotoryArr.addAll(set);
		System.out.println("\n\n\t Removed duplicates the List:  " + intLotoryArr);
		
		return myLotoryNumStr;
	}

}




















