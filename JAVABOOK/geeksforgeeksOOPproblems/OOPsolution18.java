import java.util.Scanner;

class Employee {
	private static int empNo = 0;
	private String name;
	private int salary;

	public Employee(String name, int salary){
		empNo++;
		this.name = name;
		this.salary = salary;
	}

	public void display() {
		System.out.println("---------------------------------");	
		System.out.println("imformation about Employee: ");
		System.out.println("Employee number: " + empNo);
		System.out.println("Name: " + name);
		System.out.println("Salary: " + salary);
		System.out.println("++++++++++++++++++++++++++++++++++");
	}

}

public class OOPsolution18 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("How many employe's do you have ? ");
		int empnum = sc.nextInt();
		Employee[] arr = new Employee[empnum];
		for(int i = 0; i < empnum; i++) {
			System.out.println("What is your name ? ");
			String name = sc.nextLine();
			name = sc.nextLine();
			System.out.println("How much salary do you have ? ");
			int salary = sc.nextInt();
			arr[i] = new Employee(name, salary);
		}
						

		for(int i = 0; i < empnum; i++) {
			arr[i].display();
		}
	}
}
