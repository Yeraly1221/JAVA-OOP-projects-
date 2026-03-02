interface Shape {
	abstract public double  calculateArea();
	abstract public double calculatePerimetr();
	abstract public void displayInfo();
}

class Rectangle implements Shape {
	private double length = 0;
	private double width = 0;

	public Rectangle(double length, double width) {
		if(length >= 0) {
			this.length = length;
		}else {
			System.out.println("Shape's length can not be a negotive number");
		}

		if(width >= 0){
			this.width = width;
		}else {
			System.out.println("Shape's width can not be a  negotive number");
		}
        }	
	@Override
	public double calculateArea() { return length * width; };
	@Override	
	public double calculatePerimetr() { return 2 * ( length * width ); };
	
	public void displayInfo() {
		System.out.println("Information about the shape:");
		System.out.println("The length: " + length +"\n " + "The width: " + width);
		System.out.println("The area: " + calculateArea());
		System.out.println("The perimetr: " + calculatePerimetr());
		System.out.println("------------------------------------------------------------");
	}
}







class Circle implements Shape {
	private final double pi = 3.14;
	private double radius;
		
	public  Circle(double radius) {
		if(radius >= 0) {
			this.radius = radius;
		}else {
			System.out.println("The radius can not be a negotive number");
		}
	}

	@Override
	public double calculateArea() { return pi * (radius * radius); };
	@Override
        public double calculatePerimetr() { return 2 * ( pi * radius ); };
        
        public void displayInfo() {
                System.out.println("Information about the circle:");
                System.out.println("The radius: " + radius);
                System.out.println("The area: " + calculateArea());
                System.out.println("The perimetr: " + calculatePerimetr());
                System.out.println("------------------------------------------------------------");
        }
}

public class OOPsolution24 {
	public static void main(String[] args) {
		Shape[] s = new Shape[3];
		
		s[0] = new Circle(2.3);
		s[1] = new Circle(7.7);
		s[2] = new Rectangle(4.5, 7.7);
	
		for(int i = 0; i < 3; i++) {
			s[i].displayInfo();
		}
	}
} 
		






 


  







