package edu.umsl.bookstore;

public class App {

	public static void main(String[] args) {
		
		Bookstore bookstore = new Bookstore();
		Book book = new Book();
		Author author = new Author();
		
		bookstore.setName("Powell's");
		bookstore.setHasACafe(true);
		
		book.setName("Red Rising");
		
		author.setFirstName("Tom");
		
		System.out.println("Bookstore: " + bookstore.getName());
		System.out.println("Book: " + book.getName());
		System.out.println("Author: " + author.getFirstName());
	}

}
