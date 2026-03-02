class Person {
	private String firstName;
	private String lastName;
	
	public Person (String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}

	@Override
	public String toString() {
		return firstName + " " + lastName;
	}
}
 
public class OOPsolution7 {
	public static void main(String[] args) {
		Person p1 = new Person("Sagyngali", "Yeraly");

		System.out.println(p1.toString());
	}
}		
