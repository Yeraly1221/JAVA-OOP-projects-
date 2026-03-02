public class OOPsolution17 {
	private static int  empNo = 0;
	private int  salary;
	private String name, department;

	public OOPsolution17(int salary, String name, String department) {
		this.empNo += 1;
		this.salary = salary;
		this.name = name;
		this.department = department;
	}

	public void displayAll() {
		System.out.println("--------------------");
		System.out.println("information about Employee:");
		System.out.println("Index: " + empNo);
		System.out.println("name: " + name);
		System.out.println("salary: " + salary);
		System.out.println("department: " + department);
		System.out.println("---------------------");
	}

	
	
	public static void main(String[] args) {
		if(args.length < 3) {
			System.out.println(" you need to put 4 elements in consol");
		}else {
			String name = args[0];
			int salary = Integer.parseInt(args[1]);
			String department = args[2];
			
			OOPsolution17  o1 = new OOPsolution17(salary, name, department);
			o1.displayAll();
		}			 
	}
}
