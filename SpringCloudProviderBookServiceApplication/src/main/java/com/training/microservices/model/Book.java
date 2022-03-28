package com.training.microservices.model;


public class Book {

	private Integer bookId;
	private String bookName;
	private String bookType;
	private Double bookCost;
	public Book() {
		super();
	}
	public Book(Integer bookId, String bookName, String bookType, Double bookCost) {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
		this.bookType = bookType;
		this.bookCost = bookCost;
	}
	public Integer getBookId() {
		return bookId;
	}
	public void setBookId(Integer bookId) {
		this.bookId = bookId;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getBookType() {
		return bookType;
	}
	public void setBookType(String bookType) {
		this.bookType = bookType;
	}
	public Double getBookCost() {
		return bookCost;
	}
	public void setBookCost(Double bookCost) {
		this.bookCost = bookCost;
	}
	@Override
	public String toString() {
		return "Book==>bookId=" + bookId + ", bookName=" + bookName + ", bookType=" + bookType + ", bookCost=" + bookCost
				;
	}
	
	
}
