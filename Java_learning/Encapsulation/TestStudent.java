class Student {
	private static int student_id = 0;
	private String name;
	private int grade;
	
	public Student(String name) {
		this.name = name;
		student_id++;
	}

	public String getName() {
		return name;
	}
	public int getId() {
		return student_id;
	}

 	public void setGrade(int grade) {
		if(grade > 10) {
			System.out.println("grade can not be bigger than 10");
		}else if(grade < 1) {
			System.out.println("grade can not be lower than 1");
		}else {
			this.grade = grade;
		}
	}
	public int getGrade() {
		return grade;
	}
}
		
class TestStudent {
	public static void main(String[] args) {
		Student s1 = new Student("Arsen");
		Student s2 = new Student("Yerale");

		s1.setGrade(12);
		s2.setGrade(9);
		
		System.out.println(s2.getName());
		System.out.println(s2.getGrade());
	}
} 
