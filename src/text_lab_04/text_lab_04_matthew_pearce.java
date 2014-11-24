package text_lab_04;

import java.util.Scanner;
//test2
public class text_lab_04_matthew_pearce
{
	public static void main (String args[])
	{
		System.out.println("\nTextLab04v100_Matthew_Pearce\n");
		Scanner input = new Scanner(System.in);

		String repeat = "";
		do
		{
			System.out.print("\nEnter a string  ===>>  ");
			String str = input.nextLine();
			System.out.println("\nEntered String:     " + str + "\nPalindrome:         " + Palindrome.isPal(str) + "\nAlmost Palindrome:  " + Palindrome.almostPal(str));  
			System.out.print("Do you wish to repeat this program [Y/N]?  ===>>  ");
			repeat = input.nextLine();	
		}
		while (repeat.equalsIgnoreCase("y"));
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
    		 reverse = reverse + s.substring(m); 
    	 else
    		 reverse = reverse + s.substring(m-1,m); 
    	
    	 m--;
    	 i++;
     }
		
		if ( reverse.equals(s))
    	  return true;    
		else
    	  return false;  
	}  
	
	public static boolean almostPal(String s1)
	{
		
		if (reverse.replaceAll("[^A-Za-z]", "").equalsIgnoreCase(s1.replaceAll("[^A-Za-z]", "")))
			return true;
		else 
			return false;
	}
}