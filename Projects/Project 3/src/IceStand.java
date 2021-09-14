
public class IceStand {
	
//properties

	private String name;
	private String location;
	
	

	
	
//setName method
	
	public void setName(String nameT)
	{
		name = nameT.toUpperCase() + " SHAVED ICE";
	}
	
//setLocation method
	
	public void setLocation(String locationT)
	{
		if(locationT.equals("21228"))
		{
			location = "Catonsville";
		}
		else
		{
		if(locationT.equals("21222"))
		{
			location = "Dundalk";
		}
		else
		{
		if(locationT.equals("21237"))
		{
			location = "Essex";
		}
		else
		{
			location = "Baltimore";
		}
		}
		}
	}
	


public IceStand(String name, String location)
{
	setName(name);
	setLocation(location);
}

//toString method

	public String toString()
	{
		String billHeader = "\t " + name + " \n\t ////////~ ~ ~\\\\\\\\\\\\\\\\\n\t         " 
	+ location;
		
		return billHeader;
	}
}

