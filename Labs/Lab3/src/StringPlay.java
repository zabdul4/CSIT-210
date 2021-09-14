/*
 * Name: Zahra Abdulwahab
 * Overview: This project displays an initial phrase, the amount of characters it has, modifications to it using string methods, 
 * and the final version of the phrase on the Console. 
 * Input: N/A
 * Output: Initial version of a phrase, modified phrase, and final version
 * Variables: N/A
 */

//	**************************************************************************
//		StringPlay.java
//
//		Play with String objects.
//	**************************************************************************
public class StringPlay 
{
	public static void main(String[] args)
	{
		String college = new String ("CCBC - Essex Campus"); 
		String town; // part (a) 
		town = college.concat("Rosedale, MD"); // part (a) 
		
		int stringlength; 
		String change1, change2, change3; 
		stringlength = college.length(); // part (b)    
		
		System.out.println (college + " contains " + stringlength + " characters."); 
		change1 = college.toUpperCase(); // part (c) 
		System.out.println(change1); 
		
		change2 = change1.replace("C", "*"); // part (d)  
		System.out.println(change2); 
		
		change3 = college.concat(town); // part (e)  
		System.out.println ("The final string is " + change3); 
	}
}
