class parcount {
	public static int countObj = 0;
}



class  countObject extends parcount {
	
	
	public countObject() {
		countObj++;
	}
	
	public int display() {
		return countObj;
	}
}

class OOPsolution11 {
	public static void main(String[] args) {
		countObject obj1  = new countObject();
		System.out.println("We created only " + obj1.display());
		
		countObject obj2 = new countObject();
		countObject obj3 = new countObject();
		countObject obj4 = new countObject();
		
		System.out.println("we created only " + obj4.display());
	}
}
		
