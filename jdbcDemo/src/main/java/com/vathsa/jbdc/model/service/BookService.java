package com.vathsa.jbdc.model.service;

import java.util.Scanner;

import com.vathsa.jdbc.model.bean.Book;
import com.vathsa.jdbc.model.dao.BookDAO;
public class BookService 
{
	private static Scanner sc = new Scanner(System.in);
    private BookDAO bdao = new BookDAO();
	public String addBook()
	{
		System.out.println("enter book id");
		String bookId = sc.nextLine();
		System.out.println("enter book title");
		String bookTitle = sc.nextLine();
		System.out.println("enter book Author");
		String bookAuthor = sc.nextLine();
		System.out.println("enter book Category");
		String bookCategpry = sc.nextLine();
		System.out.println("enter book price");
		double bookPrice = sc.nextDouble();
		System.out.println("enter book copies");
		int copies = sc.nextInt();
		//sc.nextLine();
		if(bdao.insertBook(new Book(bookId,bookTitle,bookAuthor,bookCategpry,bookPrice,copies)))
			return "Book details added";
		return "book addition failed";
	}
	public void showAllBooks()
	{
		for(Book b : bdao.getAllBooks())
			System.out.println(b.getBookId()+" "+b.getBookTitle()+" "+b.getBookAuthor()+" "+b.getBookCategpry()+" "+b.getBookPrice()+" "+b.getCopies());
			
	}
	public void showBooksByCategpry()
	{
		System.out.println("enter book Category");
		String bookCategpry = sc.nextLine();
		for(Book b : bdao.getBookByCategpry(bookCategpry))
				System.out.println(b.getBookId()+" "+b.getBookTitle()+" "+b.getBookAuthor()+" "+b.getBookCategpry()+" "+b.getBookPrice()+" "+b.getCopies());
				
	}
	public void showBookByTitle()
	{
		System.out.println("enter title");
		String bookTitle = sc.nextLine();
		Book b = bdao.getBookByTitle(bookTitle);
		if(b!=null)
            System.out.println(b.getBookId()+" "+b.getBookTitle()+" "+b.getBookAuthor()+" "+b.getBookCategpry()+" "+b.getBookPrice()+" "+b.getCopies());
		else
			System.out.println("book doesnt exist"+bookTitle);
	}
	public void deleteBookByTitle()
	{
		System.out.println("enter book title");
		String bookTitle = sc.nextLine();
		
		if(bdao.deleteBookByTitle(bookTitle))
			System.out.println(bookTitle+" deleted");
		else
			System.out.println("book doesnt exist by title"+ bookTitle);
	}
	

}
