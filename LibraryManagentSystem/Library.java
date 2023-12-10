package LibraryManagentSystem;

import java.util.ArrayList;
import java.util.ListIterator;


public class Library {
      private String location;
      private Book b;
	/**
	 * @return the location
	 */
	public String getLocation() {
		return location;
	}
	/**
	 * @param location the location to set
	 */
	public void setLocation(String location) {
		this.location = location;
	}
	/**
	 * @return the b
	 */
	public Book getB() {
		return b;
	}
	/**
	 * @param b the b to set
	 */
	public void setB(Book b) {
		this.b = b;
	}
	ArrayList<Book> book=new ArrayList<Book>();
	
	public void addBooks(Book b)
	{
		book.add(b);
		System.out.println("Book Added Succesfully ");
	}
	public void displayBook()
	{
		if (book.isEmpty()) {
			throw new BookNotFoundException();
		}
		else {
			for (Book book2 : book) {
				book2.bookInfo();
			}
		}
	}
	public void searchBook(int id)
	{
		boolean isFound=false;
		if (book.isEmpty()) {
			throw new BookNotFoundException();
		}
		else {
			for (Book b1 : book) {				
				if (b1.getBookId()==id) {
					System.out.println("Book Found Successfully :Book Details are :");
					b1.bookInfo();
					isFound=true;
				}
			}
		}
		if (isFound==false) {
			throw new InvalidBookIdException();
		}
	}
	public void searchBookBasedId(int id,String bookName)
	{
		boolean isFound=false;
		if (book.isEmpty()) {
			throw new BookNotFoundException();
		}
		else {
			for (Book b1 : book) {				
				if (b1.getBookId()==id) {
					if (b1.getAuthor().equalsIgnoreCase(bookName)) {
						System.out.println("Book Found Successfully :Book details are ");
						b1.bookInfo();
						isFound=true;
					}	
			    }
			}
		}
		if (isFound==false) {
			throw new InvalidBookIdException();
		}
	}
	public void updateBook(int id)
	{
		boolean isFound=false;
		if (book.isEmpty()) {
			throw new BookNotFoundException();
		}
		else {
			for (Book b1 : book) {				
				if (b1.getBookId()==id) {
					b1.setCost(900);
					isFound=true;
					System.out.println("Book Updated Sucessfully");
				}	
			}
		}
		if (isFound==false) {
			throw new InvalidBookIdException();
		}
	}
	public void removeBook(int id)
	{
		ListIterator<Book> i=book.listIterator();
		boolean isFound=false;
		if (book.isEmpty()) {
			throw new BookNotFoundException();
		}
		else {
			while (i.hasNext()) {
				Book b1 = (Book) i.next();				
				if (b1.getBookId()==id) {
					i.remove();
					System.out.println("Book removed Suscessfully :");
					isFound=true;
				}	
			  }
		}
		if (isFound==false) {
			throw new InvalidBookIdException();
		}
		
	}
}
