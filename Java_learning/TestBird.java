
abstract class Bird {
	private String breed;
	private String[]  habitat;

	public Bird() {};
	public Bird(String breed, String[]  habitat) {
		this.breed = breed;
		this.habitat = habitat;
	}		

	abstract public void  fly();
	abstract public void makeSound();

	public void allInfo(){
		System.out.println("Bird breed: " +  breed);
		System.out.println("Where " + breed + " live: ");
		for(String a : habitat) {
			 System.out.println(a + " ");
		}
		fly();
		makeSound();
	}
}

class Eagle extends Bird {
	
	public Eagle(String[] habitat) {
		super("Eagle", habitat);
	}

	public void fly() {
		System.out.println("How do Eagles fly ?");
		System.out.println("Eagles fly by utilizing their impressive wingspan, muscular bodies, and specialized flight adaptations.");
	 }
	
	public void makeSound() {
		System.out.println("How do Eagles make sound ?");
		System.out.println("They make sound like *whit-whit-whit* or *kee-kee-kee* ");
	}
}

class Hawk extends Bird{ 
	
	public Hawk(String[] habitat) {
		super("Hawk", habitat);
	}

	public void fly() {
		System.out.println("How do Hawks fly ?");
		System.out.println("Hawks soar at heights from 100 to 300 feet above, utilizing their streamlined bodies for efficient flight.");
	}

	public void makeSound() {
		System.out.println("How  do Hawks make sound ?");
		System.out.println("They make sound like  *kree-eee-ar or *tsee-eeee-arr");
	}
}

public class TestBird {	
	public static void main(String[] args) {
		Bird[] b = new Bird[2];
		
		String[] EagleHabitat = {"Kazakstan", "Russia", "Kavkaz", "USA"};
		String[] HawkHabitat = {"North America", "Europe", "Central Asia", "Africa"};
		
		b[0] = new Eagle(EagleHabitat);
		b[1] = new Hawk(HawkHabitat);

		for(int i = 0; i < 2; i++) {
			b[i].allInfo();
			System.out.print("\n");
		}
	}
}
