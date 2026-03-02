class test {
	ArrayList<DotCom> DotComBust = new ArrayList;
	int numOfGuess = 0; 
	public void testSetUpGame() {
		DotComBust.setUpGame();

		for(DotCom dot1 :DotComBust) {
			System.out.println(dot1.name);
			System.out.println(dot1.location);
		}
	}
	
	public void testStartPlaying() {
		GameHelper helper = new GameHelper(); // we will get some cordinate like "A6"	
		 // Elements.isEmpty() is not true		
		Elements.startPlaying();
		
		//while Elements is not Empty game keep going if Element is true we need too see  finiisFunction
	}
	
	public void testCheckTest() {
		checkGuess("A2");
		
		System.out.println(numOfGuess);
		
		// check numOfGuess
		
		//for example i know i will miss for A5 cordination
		
		checkGuess("A2");
		// i need to see a missed 
		
		//example i  know in a "B3" cordinat i hove somethink it need to be hit 
		
		checkGuess("B3"); //i will see hit

		//example if we sunk the site we eill see sunked
		
		checkGuess("C1");
		}

	public void testFinish() {
	
		finish(numOfGuess); // if  numOfGuess > 18 output "Good job" or "loser"
	}
}
	
	
