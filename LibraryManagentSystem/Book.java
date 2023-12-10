package libraryMangentSystem;

public class Book {
	private int bookId;
	private String bookName;
	private String author;
	private int cost;
	private int pages;
	public Book(int bookId, String bookName, String author, int cost, int pages) {
		this.bookId = bookId;
		this.bookName = bookName;
		this.author = author;
		this.cost = cost;
		this.pages = pages;
	}
	public Book() {
		
	}
	public void bookInfo() {
		System.out.println("Book Name :"+ getBookName());
		System.out.println("Book ID :"+ getBookId());
		System.out.println("Book author :"+ getAuthor());
		System.out.println("Book cost :"+ getCost());
		System.out.println("Number of pages :"+ getPages());
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	
	public int getBookId() {
		return bookId;
	}
	
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	
	public String getBookName() {
		return bookName;
	}
	
	public void setAuthor(String author) {
		this.author = author;
	}
	
	public String getAuthor() {
		return author;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}
	
	public int getCost() {
		return cost;
	}
	
	public void setPages(int pages) {
		this.pages = pages;
	}
	
	public int getPages() {
		return pages;
	}
}
