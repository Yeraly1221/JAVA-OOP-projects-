import java.util.Scanner;

class Nums {
	private int num1, num2, num3;

	public Nums(int num1, int num2, int num3) {
		this.num1 = num1;
	





	this.num2 = num2;
		this.num3 = num3;
	}

	public int largNum() {
		if(num1 >= num2 && num1 >= num3) {
			return num1;
		}else if(num2 >= num3) {
			return num2;
		}else {
			return num3;
		}
	}
	
	public int  secondLargeNum() {
		int largest = largNum();

		if(largest == num1) {
			if(num2 >= num3) {
				return num2;
			}else {
				return num3;
			}
		}else if(largest == num2) {
			if(num1 >= num3) {
				return num1;
			}else {
				return num3;
			}
		}else {
			if(num1 >= num2) {
				return num1;
			}else {
				return num2;
			}
		} 
	}
	
 	public void numsOrder() {
		int largest = largNum();
		int secoundLargest = secondLargeNum();
		
		System.out.println("largest number: " + largest);
		System.out.println("Secound largest number: " + secoundLargest);
         }
}


public class OOPsolution15 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		System.out.print("Input your first number: ");		
		int num1 = sc.nextInt();
		System.out.print("Input your second number: ");
		int num2 = sc.nextInt();
		System.out.print("Input your third number: ");
		int num3 = sc.nextInt();

		Nums n1 = new Nums(num1, num2, num3);
	
		n1.numsOrder();
	}
}








