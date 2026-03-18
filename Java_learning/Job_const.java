// The condition:Write a Java program that creates a class hierarchy for employees of a company. The base class 
//should be Employee, with subclasses Manager, Developer, and Programmer. Each subclass should have properties 
//such as name, address, salary, and job title. Implement methods for calculating bonuses, generating performance 
//reports, and managing projects. 
 
class Employee {
	private String name;
	private String address;
	private int salary; // per month
	private String title;
	
	public Employee() {}

	public Employee(String name, String address, int salary, String jobTitle) {
		this.name = name;
		this.address = address;
		this.salary = salary;
		this.title = jobTitle;
	}

	public int CalcBonuses() {
		return  Math.round(salary / 7); //bonuses he/she will get per month
	}
	
	public void empRespons() {
	}

	public void displayInfo() {
		System.out.println("All information about the Employee: ");
		System.out.println("Name: " + name);
		System.out.println("Address: " + address);
		System.out.println("Salary: " + salary);
		System.out.println("Title: " + title);
		System.out.println("Calculate the bonuses for this month: " + CalcBonuses());
		empRespons();
	}
}

class Manager extends Employee {
	private String project;

	public Manager(String address, int salary, String name, String project) {
		super(name, address, salary, "Manager");
		this.project = project;
	}
	public void empRespons() {
		System.out.println("* Clearly communicate the goal to employees.");
		System.out.println("* Set key performance indicators to measure success");
		System.out.println("* Make strategy adjustments as necessary.");
	}

	public void displayInfo() {  
		super.displayInfo();
		System.out.println("The project name: " + project);
	}

}

class Programmer extends Employee {
	private String programmingLanguage;

        public Programmer(String address, int salary, String name, String progLang) {
                super(name, address, salary, "Programmer");
		this.programmingLanguage = progLang;
        }

        public void empRespons() {
                System.out.println("* Write, debug and execute the source code of a software application.");
                System.out.println("* Analyze and understand the requirements and translate them into functional code");
                System.out.println("* Document all programming tasks and procedures.");
	}        
	public void displayInfo() {
		super.displayInfo();
		System.out.println("The main programmin language: " + programmingLanguage);
	}
}

class Developer  extends Employee { 
	String  fraimwork;
        public Developer (String address, int salary, String name, String fraimwork) {
                super(name, address, salary, "Developer");
                this.fraimwork = fraimwork;
        }

        public void empRespons() {       
		System.out.println("* Monitor AI code tool usage to ensure secure.");
                System.out.println("* Trace CVE scan results to the developers and AI agents who introduced them..");
                System.out.println("* Monitor security risks of developer actions by generating insights.");
        }

	public void displayInfo(){
		super.displayInfo();
		System.out.println("The main fraimwork: " + fraimwork);
	}
}


public class Job_const {
	public static void  main(String[] args) {
		
		Employee[] e = new Employee[3];
		
		e[0] = new Manager("Gromova 18", 123456, "Alina", "The computer network for busnies");
		e[1] = new Programmer("Gabdulia 5", 654321, "Ulan", "Java");
		e[2] = new Developer("Qurmangazy 78", 654123, "Ailin", "Springboot");

		for(Employee a: e) {
			a.displayInfo();
			System.out.println();
		}
	}
}
