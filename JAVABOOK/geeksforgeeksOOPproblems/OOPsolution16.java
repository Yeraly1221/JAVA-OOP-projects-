import java.util.ArrayList;
import java.util.Scanner;


class anArray {
	private  ArrayList<Integer> arr;
	
	public anArray() {
		arr = new ArrayList<Integer>();
	}

	public void insertInArray(int num){
		arr.add(num);
	}

	public void severalInsert(int index) {
		Scanner sc =  new Scanner(System.in); 
		for(int i = 0; i < index; i++) {
			System.out.println("input your number: ");
			int a = sc.nextInt();
			insertInArray(a);
		}
	}

	public void displayAllArray(){
		System.out.println("start -----------------");
		for(int i = 0; i < arr.size(); i++) {
			System.out.println(arr.get(i));
		}
		System.out.println("---------------------end");
	}
}

public class OOPsolution16 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please input how muck number do you  want to insert ? :");
		anArray a1 = new anArray();
		int length = sc.nextInt();
		a1.severalInsert(length);
		a1.displayAllArray();
	}	
}
