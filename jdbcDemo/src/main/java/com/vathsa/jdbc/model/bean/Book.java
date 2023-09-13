package com.vathsa.jdbc.model.bean;

public class Book 
{
	private String bookId;
	private String bookTitle;
	private String bookAuthor;
	private String bookCategpry;
	private double bookPrice;
    private int copies;
    public Book() {}
    
	public Book(String bookId, String bookTitle, String bookAuthor, String bookCategpry, double bookPrice, int copies)
	{
		super();
		this.bookId = bookId;           this.bookCategpry = bookCategpry;
		this.bookTitle = bookTitle;     this.bookAuthor = bookAuthor;
		this.bookPrice = bookPrice;     this.copies = copies;
	}
	public String getBookId() {
		return bookId;
	}
	public void setBookId(String bookId) {
		this.bookId = bookId;
	}
	public String getBookTitle() {
		return bookTitle;
	}
	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}
	public String getBookAuthor() {
		return bookAuthor;
	}
	public void setBookAuthor(String bookAuthor) {
		this.bookAuthor = bookAuthor;
	}
	public String getBookCategpry() {
		return bookCategpry;
	}
	public void setBookCategpry(String bookCategpry) {
		this.bookCategpry = bookCategpry;
	}
	public double getBookPrice() {
		return bookPrice;
	}
	public void setBookPrice(double bookPrice) {
		this.bookPrice = bookPrice;
	}
	public int getCopies() {
		return copies;
	}
	public void setCopies(int copies) {
		this.copies = copies;
	}
    
}
