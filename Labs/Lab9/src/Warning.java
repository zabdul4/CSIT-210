/* Name: Zahra Abdulwahab
 * Overview: The program computes each student's GPA then displays the students names if their GPA is less than 2.0. It uses FileNotFoundException and NumberFormatException to deal with errors.
 * Input: name
 * Output: The students name with a GPA less than 2.0 (and Error message if something is wrong)
 * Variables: creditHrs, qualityPts, gpa, name 
 */


import java.util.Scanner; 
import java.io.*;

public class Warning 
{
	
	public static void main (String[] args) throws IOException
	{
		int creditHrs; // number of semester hours earned
		double qualityPts; // number of quality points earned
		double gpa; // grade point (quality point) average
		String name;
		try 
		{

			// Set up scanner to input file
			Scanner inFile = new Scanner(new File("students.dat"));

			System.out.println ("\n Students on Academic Warning\n");

			// Process the input file, one token at a time
			while (inFile.hasNext())
			{
				// Get the credit hours and quality points and
				// determine if the student is on warning. If so,
				// display the student's name.
				name = inFile.next();
				try
				{
					creditHrs = Integer.parseInt(inFile.next());
					qualityPts = Double.parseDouble(inFile.next());
			
					// Insert gpa calculation
					gpa = qualityPts / creditHrs; 
				
					// and statement to determine if the student name is listed.
					if (gpa < 2.0)
					{
						System.out.println(name);
					}
				}
				catch (NumberFormatException e)
				{
					System.out.println("Format mismatch; could not parse data");
				}
			}
			inFile.close();
		}
		
		//insert catch statements
		catch(FileNotFoundException e) {
			// TODO: handle exception
			System.out.println("File not found. Check name and location");
		}
	}
}

