package edu.umsl.bookstore;

public class Bookstore {
	
	private long id;
	private String name;
	private String address;
	private boolean hasACafe;
	private Book book;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public boolean isHasACafe() {
		return hasACafe;
	}
	public void setHasACafe(boolean hasACafe) {
		this.hasACafe = hasACafe;
	}
	public Book getBook() {
		return book;
	}
	public void setBook(Book book) {
		this.book = book;
	}

}
