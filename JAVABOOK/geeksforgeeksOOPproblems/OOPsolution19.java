import java.util.Scanner;
class AlphabetChecker {

	public void checkVowelOrConsonant(char letter) {
			
		if(!Character.isLetter(letter)){
			System.out.println("This character is not letter");
		} else {
			if(letter == 'a' || letter == 'o' || letter == 'u' || letter == 'e' || letter == 'i' || letter == 'A' || letter == 'U' || letter == 'O' || letter == 'E' || letter == 'I') {
				System.out.println("This letter is vowel");
			}else {
				System.out.println("This letter is consonant");
			}
		}

	}
}

public class OOPsolution19 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		AlphabetChecker A1 = new AlphabetChecker();
		
		System.out.println("Can you input any letter");
		char letter = sc.next().charAt(0);
		A1.checkVowelOrConsonant(letter);
	}
}			
	
	
