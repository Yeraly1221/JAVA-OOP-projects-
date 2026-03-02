/*
5. Create a class Biggest that contains a single-dimensional array as a data member 
and a method display() to find and display the largest element of the array.
*/
class Biggest {
	private int[] numbers;
	
	public Biggest(int[] arr) {
		this.numbers = arr;
	}
	public void display() {
		int largNum = numbers[0];
		for (int i = 1; i < numbers.length; i++) {
			if(numbers[i] > largNum) {
				largNum = numbers[i];
			}
		}
		System.out.println(largNum);
	}
}

class OOPsolution5 {
	public static void main(String[] args) {
		int[] arr = {12, 3432, 32, 786, 463, 7653};
		Biggest n1 = new Biggest(arr);		
		n1.display();
	}
}
