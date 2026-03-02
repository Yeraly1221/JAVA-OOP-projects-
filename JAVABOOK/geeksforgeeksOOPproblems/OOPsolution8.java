/*8. Create a Student class with name, rollNo, and marks as attributes. Write a method to calculate the grade
 based on the marks and display the grade. Create multiple instances of the Student class and print their grades.
*/
class Student {
	private String name;
	private int roolNo;
	public int mark;

	public Student (String name, int roolNo, int mark) {
		this.name = name;
		this.roolNo = roolNo;
		this.mark = mark;
	}

	public String grade(){
		
		if(mark >= 90) {
			return "A";
		}else if(mark >= 75) {
			return "B";
		}else if(mark >= 60) {
			return "C";
		}else if(mark >= 50) {
			return "D";
		}else {
			return "F";
		}
		
	}
	
	public void displaygrade() {
		System.out.println("Student name: " + name);
		System.out.println("Rool Number: " + roolNo);
		System.out.println("Mark: " + mark);
		System.out.println("Grade: " + grade());
		System.out.println("----------------------------");
	}
}

public class OOPsolution8 {
	public static void main(String[] args) {
		Student s1 = new Student("Kusia", 100, 99);
		Student s2 = new Student("Andrey", 101, 88);
		Student s3 = new Student("Alex", 102, 77);
		Student s4 = new Student("Dmitry", 103, 66);

		s1.displaygrade();
		s2.displaygrade();
		s3.displaygrade();
		s4.displaygrade();
	}
}
