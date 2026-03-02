/*4. Create a class SeriesCalculator with a method calculateSum(int n) to calculate the sum of the first n numbers in the series 1 + 3 + 5 + 7 + .... Use the formula Sum = (n/2) * [2*a + (n-1)*d], where "a" is the
 first term and "d" is the common difference. */

class SeriesCalculator {
	public int calculateSum(int n) {
	/*	int i = 0;
		int odd = 1;
		int SumOddNums = 0;
		while(i < n) {
			SumOddNums += odd;
			odd += 2;
			i += 1;
		}
		return SumOddNums;
	*/
		int a = 1;
		int d = 2;
		return (n  * (2 * a + (n - 1) * d)) / 2;
	}
	
}

public class OOPsolution4 {
	public static void main(String[] args) {
		int num = 5;
		SeriesCalculator c1 = new SeriesCalculator();
		System.out.println(c1.calculateSum(num));
	}
}			
		
