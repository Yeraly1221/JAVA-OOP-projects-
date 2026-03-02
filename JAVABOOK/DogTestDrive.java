class Dog {
	int size;
	String name;
	
	void bark(int numOfbarks) {
		while(numOfbarks != 0){
			if(size > 60){
				System.out.println("Gav-gav-gav");
			}
			else if(size > 30){
				System.out.println("Vav-vav-vav");
			}
			else {
				System.out.println("pig-pig-pig");
			}
			numOfbarks -= 1;
		}
	}
}

public class DogTestDrive {
	public static void main(String[] args) {
		Dog dog1 = new Dog();
		dog1.name = "Rex";
		dog1.size = 70;

		Dog dog2 = new Dog();
		dog2.name = "Laika";
		dog2.size = 44;
	
		Dog dog3 = new Dog();
		dog3.name = "Chi hua hua";
		dog3.size = 21;

		System.out.print(dog1.name  +  " ");
		dog1.bark(2);

		System.out.print(dog2.name  + " ");
		dog2.bark(3);

		System.out.print(dog3.name  + " ");
		dog3.bark(4);
	}
}

