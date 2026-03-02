class GoodDog {

	private int size;

	public int getSize() {
		return size;
	}

	public void  setSize(int s) {
		size = s;
	}

	void bark() { 
		if(size > 60) {
			System.out.println("Gav-gav");
		}
		else if (size > 14) {
			System.out.println("Vuf-vuf");
		}
		else {
			System.out.println("Auuuuuuu");
		}
	}
}

class GoodDogTestDrive {
      	public static void main(String[] args) {
 		GoodDog one = new GoodDog();
		one.setSize(70);
		GoodDog two = new GoodDog();
		two.setSize(17);
		GoodDog three = new GoodDog();
		three.setSize(9);

		System.out.println("First dog: " + one.getSize());
                System.out.println("Second dog: " + two.getSize());
                System.out.println("Third dog: " + three.getSize());

		one.bark();
		two.bark();
		three.bark();
	}
}
