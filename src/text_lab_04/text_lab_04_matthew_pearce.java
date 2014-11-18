package text_lab_04;

import java.util.Scanner;

public class text_lab_04_matthew_pearce
{
	public static void main (String args[])
	{
		System.out.println("\nTextLab04v80\n");
      Scanner input = new Scanner(System.in);
		boolean notFinished = false;
		do
		{
			System.out.print("Enter a string  ===>>  ");
			String str = input.nextLine();
			System.out.println();
			System.out.println("Entered String:     " + str);
			System.out.println("Palindrome:         " + Palindrome.isPal(str));
			System.out.println("Almost Palindrome:  " + Palindrome.almostPal(str));	  // used only for the 100 point version
			System.out.print("Do you wish to repeat this program [Y/N]?  ===>>  ");
			String repeat = input.nextLine();
			notFinished = (repeat.equals("Y")) || (repeat.equals("y"));
			System.out.println();
		}
		while (notFinished);
		
		input.close();
	}
}

class Palindrome
{
	static String reverse =  "";

	public static boolean isPal(String s)
	{
     int i = 0;
     int length= s.length(); 
     int m = length;
     reverse = "";
     
     while (i < length)
     {
    	 if (i == length)
    	 {
    		 reverse = reverse + s.substring(m);
    	 }
    	 else
    	 {
    		 reverse = reverse + s.substring(m-1,m); 
    	 }
    	 
    	 m--;
    	 i++;
     }
		
		if ( reverse.equals(s))
		{
    	  return true;    
		}
		else
		{
    	  return false;  
		}
         
	}  
	
	public static boolean almostPal(String s1)
	{
		 s1 = s1.replaceAll("[^A-Za-z0-9]", "");
		String s2 = reverse.replaceAll("[^A-Za-z0-9]", "");
		
		if (s2.equalsIgnoreCase(s1))
		{
			return true;
		}
		else 
		{
			return false;
		}
	}
}