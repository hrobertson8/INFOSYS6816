package edu.umsl.arrays;

public class BookArray {
	
	public static void main(String[] args) {
		String[] book = new String[3];
		book[0] = "Book 1: " + "The Red Rising";
		book[1] = "Book 2: " + "Big Little Lies";
		book[2] = "Book 3: " + "Being Michelle";
		processArray(book);
		System.out.println("Number of books in this array: " + book.length);
		
	}

	public static void processArray(String[] book) {
		for (String s:book) {
			System.out.println(s);
			
		}	
	}
}
