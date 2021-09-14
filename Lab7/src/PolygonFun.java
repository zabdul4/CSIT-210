public class PolygonFun {

	// Define the properties 
	private int sides;
	private double sideLength;
	private double xCoordinate;
	private double yCoordinate;
	
	// Constructors 
	public PolygonFun()
	{
		sides = 3;
		sideLength = 1;
		xCoordinate = 0;
		yCoordinate = 0;
	}
	
	public PolygonFun(int sides, double sideLength)
	{
		this.sides = sides;
		this.sideLength = sideLength;
		xCoordinate = 0;
		yCoordinate = 0;
	}
	
	public PolygonFun(int sides, double sideLength, double xCoordinate, double yCoordinate)
	{
		this.sides = sides;
		this.sideLength = sideLength;
		this.xCoordinate = xCoordinate;
		this.yCoordinate = yCoordinate;
	}
	
	// Accessor methods
	public int getSides()
	{
		return sides;
	}
	
	public double getsideLength()
	{
		return sideLength;
	}
	
	public double getxCoordinate()
	{
		return xCoordinate;
	}
	
	public double getyCoordinate()
	{
		return yCoordinate;
	}

	
	// Mutator methods
	public void setSides(int sidesT)
	{
		sides = sidesT;
	}
	
	public void setSideLength(double sideLengthT)
	{
		sideLength = sideLengthT;
	}
	
	public void setXCoordinate(double xCoordinateT)
	{
		xCoordinate = xCoordinateT;
	}
	
	public void setYCoordinate(double yCoordinateT)
	{
		yCoordinate = yCoordinateT;
	}
	
	
	// Calculation methods 
	public double getPerimeter()
	{
		return sides * sideLength;
	}
	
	public double getArea()
	{
		return (Math.pow(sideLength, 2) * sides) / (4 * Math.tan(180/sides)); 
	}
}
