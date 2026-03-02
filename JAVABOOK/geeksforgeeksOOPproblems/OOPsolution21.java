class Employee {
	private static int EmployNo = 0;
	private String name;
	private String post;
	private String department;
	private double salary;

	public Employee(String name) {
		EmployNo++;
		this.name = name;
		this.post = "Unknow";
		this.department = "Unknow";
		this.salary = 0.0;
	}
	
	public Employee(String name, String post) {
		EmployNo++;
		this.name = name;
		this.post = post;
		this.department = "Unknow";
		this.salary = 0.0;
	}
  
	public Employee(String name, String post, String departent) {
		EmployNo++;
		this.name = name;
		this.post = post;
		this.department = department;
	}
         
	public Employee(String name, String post, String department, double salary) {
		EmployNo++;
		this.name = name;
		this.post = post;
		this.department = department;
		this.salary = salary;
	}
	
	public void displayInfo() {
		System.out.println("Information about employee:");
		System.out.println("Name: " + name);
		System.out.println("Post: " + post);
		System.out.println("Department" + department);
		System.out.println("Salary: " + salary);
		System.out.println("--------------------------");
	}
  
	public void displayInfo(String version) {
		if(version.equals("short")) {
			System.out.println("Name: " + name);
			System.out.println("Post: " + post);
			System.out.println("----------------------");
		}else if(version.equals("detailed")) {
			displayInfo();
		}else {
			System.out.println("Invailid version");	
		}
	}

}

public class OOPsolution21 {
	public static void main(String[] args) {
		Employee e1 = new Employee("Yeraly");
		Employee e2 = new Employee("Serik", "Devoloper");
		Employee e3 = new Employee("Arman", "Product manager", "IT", 34567.0);
	
		
		e1.displayInfo();
		e2.displayInfo("short");
		e3.displayInfo("detailed");
	}
}
				
	
