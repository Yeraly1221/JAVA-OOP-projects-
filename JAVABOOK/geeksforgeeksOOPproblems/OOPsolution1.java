/* 1. Create a class MessagePrinter with a method printMessage(String name) which prints the message "hello <name>".
*/ 
class MessagePrinter {
	public void printMessage(String name) {
		System.out.println("Hello " + name);
	}
}

public class OOPsolution1 {
	public static void main(String[] args) {
		MessagePrinter p1 = new MessagePrinter();
		String name = "Satbayev";

		p1.printMessage(name);
	}
}

