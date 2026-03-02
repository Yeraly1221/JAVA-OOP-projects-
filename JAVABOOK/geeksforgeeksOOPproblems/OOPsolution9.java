/*9. Write a program to accept three numbers and find the largest of the three using method overloading.*/
class LargestNumber {
	public int findLarges(int a, int b, int c) {
		
		if(a > b && a > c) {
			return a;
		} else if(b > c && a > c) {
			return b;
		} else {
			return c;
		}
	}

	public double  findLarges(double a, double b, double c) {
		
		if(a > b && a > c) { 
                        return a;
                } else if(b > c && a > c) {
                        return b;
                } else {
                        return c;
                }
	}
}

public class OOPsolution9 {
	public static void main(String[] args) {
		LargestNumber l1 = new LargestNumber();

		System.out.println("Find the largest integer number " + l1.findLarges(1, 4, 9));
		
		System.out.println("Find the largest double number " + l1.findLarges(99.9, 7.1, 121.2));
	}
}
			
		 
