/* 2. Create a class Calculator with the following methods:

    calculateSum(int number1, int number2) to calculate the sum of two numbers.
    calculateDifference(int number1, int number2) to calculate the difference between two numbers.
*/
class Calculator {

	public int CalculateSum(int number1, int number2) {
		return number1 + number2;
	}
	
	public int CalculateDifference(int number1, int number2) {
		return number1 - number2;
	}
}

public class OOPsolution2 {
	public static void main(String[] args) {
		Calculator c = new Calculator();

		int num1 = 4;
		int num2 = 2;
		
		int sum =c. CalculateSum(num1, num2);
		System.out.println("num1 and num2 sum are " + sum);
	
		int difference = c.CalculateDifference(num1, num2);
		System.out.println("Difference between num1 and num2 are " + difference);

	}
}
