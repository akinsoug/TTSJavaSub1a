package javacontrolflow;

public class AsciiChars 
{
	/**
	 * 0123456789
	 */
  public static void printNumbers()
  {
	  for (int i = 48; i < 58; i++) {
		
		  System.out.print(Character.toString ((char) i) + " ");
	}
  }

  public static void printLowerCase()
  {
	  for (int i = 97; i < 123; i++) {
		
		  System.out.print(Character.toString ( Character.toLowerCase((char) i))+ " ");
	}
	  
  }

  public static void printUpperCase()
  {
	  for (int i = 97; i < 123; i++) {
		
		  System.out.print(Character.toString ( Character.toUpperCase((char) i))+ " ");
	}
  }
  
  
  
}