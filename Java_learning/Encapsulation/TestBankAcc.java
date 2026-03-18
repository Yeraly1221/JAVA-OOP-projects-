class BankAccount {
	private static int accountNumber = 0;
	private int balance;

	public BankAccount() {
		accountNumber++;
	}
	public int getAccNum() {
		return accountNumber;
	}
	
	public void balanceSet(int num) {
		this.balance = num;
	}
	public int balanceGet() {
		return balance;
	}
}

class TestBankAcc {
	public static void main(String[] args) {
		BankAccount b = new BankAccount();
		b.balanceSet(8); 
	
		System.out.println(b.getAccNum());
		System.out.println(b.balanceGet());
	}
}
