import java.util.Scanner; 

class Student {
	private String name;
	private int mark1, mark2, mark3;

	public Student(String name, int mark1, int mark2, int mark3) {
		this.name = name;
		this.mark1 = mark1;
		this.mark2 = mark2;
		this.mark3 = mark3;
	}

	public int calcSum() {
		int sum = mark1 + mark2 + mark3;
		return sum; 
	}

	public int calcAvg() {
		int avg = (mark1 + mark2 + mark3) / 3;
		return avg;
	}

	public void  displayResults() {
		int average = calcAvg();
		int sum = calcSum();
		
		System.out.println("Information about student");
		System.out.println("Name: " + name);
		System.out.println("averege marks: " + average);
		System.out.println("All marks sum: " + sum);
	}
	
}


class OOPsolution12 {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
		
	System.out.println("Enter your name: ");
	String name = sc.nextLine();

	System.out.println("Enter your first mark: ");
	int mark1 = sc.nextInt();
	System.out.println("Enter your second mark: ");
	int mark2 = sc.nextInt();
	System.out.println("Enter your third mark: ");
	int mark3 = sc.nextInt();

	Student s1 = new Student(name, mark1, mark2, mark3);
	
	s1.displayResults();
	
	sc.close();
	}
}		
