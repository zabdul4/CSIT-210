public class RTTriangle {

	// Define the properties 
		private double base;
		private double height;
		
		// Constructors
		public RTTriangle()
		{
			base = 1;
			height = 1; 
		}
		
		public RTTriangle (double base, double height)
		{
			this.base = base;
			this.height = height; 
		}
		
		// Define the methods
		
		// Base methods
		public void setBase(double baseT)
		{
			base = baseT;
		}
		
		public double getBase()
		{
			return base;
		}
		
		// Height methods 
		public void setHeight(double heightT)
		{
			height = heightT;
		}
		
		public double getHeight()
		{
			return height;
		}
		
		// Calculation methods 
		public double getArea()
		{
			return (height * base) / 2;
		}
		
		public double getHypotenuse()
		{
			return Math.sqrt(Math.pow(height, 2) + Math.pow(base, 2));
		}
		
		public double getperimeter()
		{
			return height + base + (getHypotenuse()); 
		}
		
}
