/*
 * Name: Zahra Abdulwahab, Nicholas Arellano, Keilob Berchini, Nicholas Garrett 
 * Overview: accepts user input for the zip and name of the buffet then uses that information to create a bill header and displays it as requested
 * Input: name, location
 * Output: the name and location and displays them formatted as the header.
 * Variables: name, location, nameT, zipT, underline
 */
public class Buffet {
	
	private String name ;
	private String location ;
	
	public Buffet(String nameT, int zipT) 
	{ 
	name = setName(nameT) ;
	location = setLocation(zipT) ; 
	} 

	private String setName(String nameT) 
	{ 
	nameT = (nameT.substring(0,1).toUpperCase()+ nameT.substring(1).toLowerCase()) ; 
	nameT = nameT + " Buffet" ;
	return nameT ; 
	} 

	private String setLocation(int zipT) 
	{ 
	String locationT = "Var" ;
	String underline = "" ;	
	if (zipT == 21204 ) 
	{ 
	locationT = "Towson" ;
	} 
	else 
	        { 
	        if(zipT == 21237) 
	        { 
	        	locationT = "Rosedale" ;
	        } 
	        else 
	        { 
	        	locationT = "Baltimore" ;
	        } 
	        } 

	for(int t = 0; t < locationT.length(); t++) 
	{ 
	underline += "~" ; 
	} 

	return ("\t       "+ locationT + "\n\t       " + underline + "\nAll you can eat Buffet at a great price!!!") ;

	} 

	public String toString() 
	{ 
	return ("\t     " + name +"\n"+ location)  ;
	}

}
