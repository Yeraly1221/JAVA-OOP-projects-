import java.util.Scanner;
import java.util.ArrayList;

class Book {
	private int noOfBooks = 0;
	private String Title;
	private String Author;
	private int Cost;
	
	public Book(int noOfBooks, String Title, String Author, int Cost) {
		this.noOfBooks = noOfBooks; 
		this.Title = Title;
		this.Author = Author;
		this.Cost = Cost;
	}

	public String getTitle(){
		return Title;
	}
	
	public void display() {
		System.out.println("Information about the book");
		System.out.println("Title: " + Title);
		System.out.println("Number of books: " + noOfBooks);
		System.out.println("Author: " + Author);
		System.out.println("Price: " + Cost);
	}		
}

public class OOPsolution20 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("How many different books do you have ? :");
		int difBooks = Integer.parseInt(sc.nextLine());
		
		ArrayList<Book> books = new ArrayList<Book>();
		for(int i = 0; i < difBooks; i++) {
			System.out.println("What is the book title ?");
			String title = sc.nextLine();	
	
			System.out.println("What is the book authors name ?");
			String author = sc.nextLine();
				
			System.out.println("How many books like that do you have ?");
			int noOfBooks = Integer.parseInt(sc.nextLine());

			System.out.println(" How much do the book cost ?");
			int cost = Integer.parseInt(sc.nextLine());

			books.add(new Book(noOfBooks, title, author, cost));
		} 
		
	        System.out.println("What kind of book do you  want ?");
		String target = sc.nextLine();
		boolean Flag = false;	
		
		for(int i = 0; i < books.size(); i++) {
			Book b = books.get(i);
			if(b.getTitle().equals(target)) {
				b.display();
				Flag = true;
			}
		}

		if(!Flag) {
			System.out.println("We do not have this book");
		}
		
	}
}		
















