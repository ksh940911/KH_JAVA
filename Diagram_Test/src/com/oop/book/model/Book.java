package com.oop.book.model;

public class Book {
	private String bookName;
	private int price;
	private double sale;
	private String author;
	
	public Book() {
		super();
	}
	
	public Book(String bookName, int price, double sale, String author) {
		super();
		this.bookName = bookName;
		this.price = price;
		this.sale = sale;
		this.author = author;
	}
	
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public double getSale() {
		return sale;
	}
	public void setSale(double sale) {
		this.sale = sale;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}

	public void information() {
		System.out.println("책제목은 " + bookName + "가격은 " + price + "할인율은 " + sale + "저자명은 " + author);
	} 
}
