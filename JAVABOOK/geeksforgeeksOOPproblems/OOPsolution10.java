class lastDigit {
	private String number;
	
	public void setNumber(int number) {
		this.number = Integer.toString(number);
	}

	public char getLastDigit() {
		int a = number.length();
		return number.charAt(a - 1);
	}
}

public class OOPsolution10 {
	public static void main(String[] args) {
		lastDigit l1 = new lastDigit();

		l1.setNumber(12345);
		System.out.println("numbers last digit is " + l1.getLastDigit());
	}
}	 
