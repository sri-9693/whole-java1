package com.vathsa.jdbc;

import com.vathsa.jbdc.model.service.BookService;
import java.util.Scanner;
public class App 
{
    public static void main( String[] args ) 
    {
    	BookService bookService = new BookService();
    	Scanner sc = new Scanner(System.in);
    	int opt = 0;
    	do
    	{
    		System.out.println("1. add book");
    		System.out.println("2. show all books");
    		System.out.println("3. show books by category");
    		System.out.println("4. show books by title");
    		System.out.println("5. delete books by title");
    		System.out.println("6. E X I T");
    		System.out.println(" enter your option");
    		opt = sc.nextInt();
    	switch(opt)
    	{
    	case 1:
    		bookService.addBook();
    		break;
    	case 2:
    		bookService.showAllBooks();
    		break;
    	case 3:
    		bookService.showBooksByCategpry();
    		break;
    	case 4:
    		bookService.showBookByTitle();
    		break;
    	case 5:
    		bookService.deleteBookByTitle();
    		break;
    	case 6:
    		System.out.println("you are quitiing menu");
    		break;
    	default:
    		System.out.println("not a correct option..");
    	}
    
    }while(opt!=6);
  }
}




















































