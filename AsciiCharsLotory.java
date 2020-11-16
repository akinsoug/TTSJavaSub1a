package javacontrolflow;

import java.util.Random;
import java.util.Scanner;

/**
 * 
Enter a random number between 1 and 50.

**Generating output** 
Now that you have 6 or 7 pieces of information it's time to generate the lottery numbers.  

The output will 5 random numbers between 1 and 65, and the "magic ball" between 1 and 75.   ------- 
To accomplish this you should have 3 random integers, generated in the same way as in the previous exercises.  
You may also want to declare constants for the max values of each set of of numbers.   

Generate the "magic ball" first.  //--------------------
It should be the user's favorite quarterback jersey number *or* their lucky number, multiplied by one of the random numbers.  
Make sure that the answer is less the max "magic" number of 75; if it 
is greater than 75 then subtract 75 from the value and that value is now the "magic ball" number.  

For the 5 non-magic numbers use your choice of any of the following methods to generate values: 
(Note that you may have to adjust each value to correct range by adding/subtracting.)
* Find the 3rd letter of their favorite pet.  Convert that character value to an integer value.
* Use the two digit model year of their car and add their lucky number to it.
* Use the random number between 1 and 50, subtracting one of the generated random numbers.
* Convert the first letter of their favorite actor/actress to an integer and use that value.
* Convert the last letter of their favorate actor/actress to an integer and use that value.
* Use the value 42.
* Use the age of their favorite pet + their car model year.
* Favorite quarterback number + age of pet + lucky number.

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

	public static int playLotory() {
		


		Scanner mySc2 = new Scanner(System.in);
		
		Random rand = new Random();
		
		String uFavPetName = "";
		int petAge = -1;
		int uLuckyNum = -1;
		String favQuaterBack = "";
		int uJerseyNum = -1;
		int uCarTwoDigitNum = -1;
		String uFavriteActName = "";
		
		int nandNum1 = rand.nextInt(50);
		int nandNum2 = -1;
		int nandNum3 = -1;
		int nandMagicNum = -1;
		final int maxNum;
		
		int lotoryNum = -1;
		
		//The output will 5 random numbers between 1 and 65, and the "magic ball" between 1 and 75. 

		System.out.print("\n\nWhat is your Pet's name? :  \t");
		uFavPetName = mySc2.next();
		mySc2.nextLine(); 
		System.out.print("\nWhat is your Pet's age? : \t");
		petAge = mySc2.nextInt();
		
		System.out.print("\nWhat is your Lucky Num? :  \t");
		uLuckyNum = mySc2.nextInt();
		System.out.print("\n\nDo you have a favorite quarterback? : \t");
		favQuaterBack = mySc2.next();
		mySc2.nextLine(); // 
		if (favQuaterBack.toUpperCase().equals("Y") || favQuaterBack.toUpperCase().equals("YES")) {
			System.out.print("\t What is your jersey number? : \t");
			uJerseyNum = mySc2.nextInt();
		}
		System.out.print("\nWhat is two-digit model year of their car?: \t");
		uCarTwoDigitNum = mySc2.nextInt();
		System.out.print("\nWhat is the first name of the their favorite actor or actress??: \t");
		uFavriteActName = mySc2.next();
		
		
/*
 * Generate the "magic ball" first.  
It should be the user's favorite quarterback jersey number *or* their lucky number, multiplied by one of the random numbers.  
Make sure that the answer is less the max "magic" number of 75; if it 
is greater than 75 then subtract 75 from the value and that value is now the "magic ball" number.  
 */
		nandMagicNum = uJerseyNum * nandNum1;	
		System.out.print("\n\n\t nandNum1:   " + nandNum1 + " " + "\t uJerseyNum:  " + uJerseyNum +  "\t nandMagicNum: \t"+ nandMagicNum);
		
		return lotoryNum;
	}

}
