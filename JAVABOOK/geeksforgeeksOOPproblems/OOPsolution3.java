/*3. Create a class Employee with overloaded constructors to initialize employee details
 based on different combinations of arguments. Ensure the constructors support the creation of objects
 in various ways.*/

class Employee {
	private int age;
	private String position;
	private String name;
	private String department;
	
	public Employee(String name, int age, String position, String department) {
		if(name != null) {
			this.name = name;
		}else {
			System.out.println("Employee's name can not be a null");
		}
		if(age >=  16) {
			this.age = age;
		}else {
			System.out.println("Employee's age have to be 16 or older");
		}
		if(position != null) {
			this.position = position;
		}else {
			System.out.println("Employee's position can not be a null");
		}
		if(department.equals("IT") || department.equals("HR")) {
			this.department = department;
		}else {
			System.out.println("Employee have to be from IT or HR department");
		} 
	}

	public void printInfo() {
			System.out.println("New Employee's name is " + name);
                	System.out.println("His age is " + age);
                	System.out.println("His position is " + position);
               		System.out.println("He works in a " + department + " Department");
	}
}

public class OOPsolution3 {
	public static void main(String[] args) {
		Employee e1 = new Employee("Yeraly", 20, "Backend-devoloper", "IT");
	
		e1.printInfo();
	}
} 
	

