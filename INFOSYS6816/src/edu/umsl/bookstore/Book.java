package edu.umsl.bookstore;

public class Book {
	
	private long id;
	private int isbn;
	private String name;
	private Author author;

	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public int getIsbn() {
		return isbn;
	}
	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Author getAuthor() {
		return author;
	}
	public void setAuthor(Author author) {
		this.author = author;
	}
	
	

}
