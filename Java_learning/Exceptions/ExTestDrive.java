class MyEx extends Exception {};

public class ExTestDrive {
	public static void main(String[] args) {
		String test = args[0];
		System.out.print("t");
		try {
			doRisky(test);
		} catch (MyEx e) {}
		finally {
			if("yes".equals(test)){
				System.out.print("a");
				System.out.print("w");
				System.out.print("s");
			}else {
				System.out.print("r");
				System.out.print("o");
				System.out.print("w");
				System.out.print("s");
			}
		}
	}

	public static void doRisky(String t) throws MyEx {
		System.out.print("h");
	}
}
