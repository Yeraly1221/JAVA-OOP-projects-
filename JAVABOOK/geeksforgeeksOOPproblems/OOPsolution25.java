class Customer {
	String name;
	String address;
	String PhoneNum;
	
	public Customer(){};
	
	public Customer(String name, String address, String PhoneNum) {
		this.name = name;
		this.address = address;
		this.PhoneNum = PhoneNum;
	}

	public void displayInfo() {
		System.out.println("--------------------------------------");
		System.out.println("Information about customer:");
		System.out.println("Costomers name: " + name);
		System.out.println("Cusomers address: "  + address);
		System.out.println("Customers phone number: " + PhoneNum);
	}
}

class VipCustomer extends Customer {
	public VipCustomer() {};
	
	public VipCustomer(String name, String address, String PhoneNum) {
                this.name = name;
                this.address = address;
                this.PhoneNum = PhoneNum;
        }

	public void displayInfo() {
		System.out.println("--------------------------------------");
                System.out.println("Information about VIP-customer:");  
                System.out.println("Costomers name: " + name);
                System.out.println("Cusomers address: "  + address);
                System.out.println("Customers phone number: " + PhoneNum);
        }

}

public class OOPsolution25 {
	public static void main(String[] args) {
		Customer[] cr = new Customer[3];
		
		cr[0] = new Customer("Nursultan", "Makataeva 60", "7778674345");
		cr[1] = new VipCustomer("Aidarchan", "Al-Farabi 88", "7776665432");
		cr[2] = new Customer("Yerzhan", "Klyshiva 78", "7782392394");
		
		for(int i = 0; i < 3; i++) {
			cr[i].displayInfo();
		}
	}
}
