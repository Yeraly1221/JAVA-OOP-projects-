import java.util.Scanner;

class Car {
	private String make;
	private String model;
	private int year;
	
	public Car(String make, String model, int year) {
		this.make = make;	
		this.model = model;
		this.year = year;
	}

	public Car() {}

	public void  setMake(String make) {
		this.make = make;
	}
	
	public void setModel(String model) {
		this.model = model;
	}
	
	public void setYear(int year) {
		this.year = year;
	}

	public void displayInfo() {
		System.out.println("Car  make: " + make);
		System.out.println("Car model: " + model);
		System.out.println("Car year: " + year);
		System.out.println("----------------------");
	}
}


class OOPsolution13 {
	public static void main(String[] args) {
		Car car1 = new Car("Toyota", "Carola", 2003);
		car1.displayInfo();

		car1.setModel("Camry");
		car1.displayInfo();

	}
}
