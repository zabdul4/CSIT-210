public class Rectangle {
	
		// Define the properties 
		private double length; 
		private double width; 
		
		// Constructors 
		public Rectangle()
		{
			length = 1;
			width = 1; 
		}
		
		public Rectangle (double length, double width)
		{
			this.length = length; 
			this.width = width; 
		}
		
		// Define the methods
		
		// Length methods
		public void setLength(double lengthT)
		{
			length = lengthT;
		}
		
		public double getLength()
		{
			return length;
		}
		
		// Width methods 
		public void setWidth (double widthT)
		{
			width = widthT;
		}
		
		public double getWidth()
		{
			return width; 
		}
		
		// Calculation methods
		public double getArea()
		{
			return length * width; 
		}
		
		public double getPerimeter()
		{
			double per = 2 * length + 2 * width; 
			return per; 
		}
		
}
