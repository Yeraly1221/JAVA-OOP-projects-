import java.util.Scanner;

class BankAccount {
	private static  int acctNo = 0;
	private int balance = 0;
	private String acctType;
	
	public BankAccount() {
		System.out.println("Hello dare client");
		System.out.println("you can create several account types like saving, checking,");
		System.out.println("and bussinness. And also you can deposit or withdraw amount with");
		System.out.println("depositAmount or withdrawAmount and display all informations with");
		System.out.println("displayInfo functions");
		System.out.println("Thank you beeing with our bank"); 
		acctNo++;
	}

	public void setType(String acctType) {
		if(acctType == "Savings" || acctType == "Checking" || acctType == "Credit" || acctType == "Bussiness") {
			this.acctType = acctType;
		}else {
			System.out.println("Your account type is " + acctType + " and it is not correct");
		}
	}
			
	public void depositeAmount(int num) {
		if(num < 1){
			System.out.println("You can not deposit 0 or negotive amount, please try again!");
		}else {
			balance += num;
		}
	}

	public void withdrawAmount(int num) {
		if(num < 1) {
			System.out.println("You can not withdrae 0 or negotive amount, please try again!");
		}else if(balance - num < 0) {
			System.out.println("You do not have enouqh money in your balance, pleace try again!");
		}else {
			balance -= num;
		}
	}
	
	public void displayInfo() {
		System.out.println("Hello, our dare client");
		System.out.println("Your bank account type: " + acctType);
		System.out.println("balance :" + balance);
		System.out.println("Thank you for using our bank!");
		System.out.println("--------------------------------------");
	}
}

public class OOPsolution14 {
	public  static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		BankAccount ac1 = new BankAccount();
		
		System.out.println("Please write your account type");
		String acctType = sc.nextLine();
		ac1.setType(acctType);
		
		System.out.println("How many money are you going to deposite to the amount ?");
		int depo = sc.nextInt();
		ac1.depositeAmount(depo);
		ac1.displayInfo();
		
		System.out.println("How many money are you going to wothdraw ?");
		int with = sc.nextInt();
		ac1.withdrawAmount(with);
		ac1.displayInfo();

	}
} 








