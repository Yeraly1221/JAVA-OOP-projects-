class Rectangle {
	private double length;
	private double width;
	
	public Rectangle() {
		this.length = 1;
		this.width = 1;
	}

	public Rectangle(int length, int width) {
		this.length = length;
		this.width = width;
	}

	public void setLength(int length) {
		if(length >= 1){
			this.length = length;
		}else {
			System.out.print("The length have to be a positive");
		}
	}					
	
	public double getLength() {
		return length;
	}

	public void setWidth(int width) {
		if(width >= 1) {
			this.width = width;
		}else {
			System.out.println("The width have to be a positive");
		}
	}

	public double getWidth() {
		return width;
	}

	public double area() {
		return length * width;
	}

}

class OOPsolution6 {
	public static void main(String[] args) {
		Rectangle r1 = new Rectangle();

		System.out.println("Default area: " + r1.area());

		r1.setLength(8);
                r1.setWidth(9); 

                double Length = r1.getLength();
                double Width = r1.getWidth(); 


		System.out.println("Length is a " + Length);
		System.out.println("Width is a " + Width );
		System.out.print("Area is a " + r1.area());
	}
}
