package LibraryManagentSystem;
import java.util.Scanner;
public class LibraryDriver {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("*****Welcome To Library ******");
	    Library library =new Library();
        boolean b=true;
	   while (b) {
		   System.out.println("Enter the option ");
		   System.out.println("1.AddBook\n2.DisplayBook\n3.SearchBook\n4.SearchBookWithIdAndAuthor\n5.UpdateBook\n6.RemoveBook\n7.Exit");
		   int option=sc.nextInt();
	    	switch (option) {
			case 1:{
				System.out.println("Enter The ID:");
				int id=sc.nextInt();
				System.out.println("Enter the BookName");
				String name=sc.next();
				System.out.println("Enter the Author Name ");
				String author=sc.next();
				System.out.println("Enter cost of the Book ");
				int cost=sc.nextInt();
				System.out.println("Enter the No.pages ");
				int pages=sc.nextInt();
				library.addBooks(new Book(id, name, author, cost, pages));	
			}
				break;
			
            case 2:{
            	library.displayBook();
            }
            	break;              
            case 3:{
            	System.out.println("Enter The ID Of Book To Add ");
				int id1=sc.nextInt();
            	library.searchBook(id1);
            }
            	break;
            case 4:{
            	System.out.println("Enter Id and Title of the Book to search ");
            	int id3 =sc.nextInt();
            	System.out.println("Enter the Book name");
            	String bookName=sc.next();
            	library.searchBookBasedId(id3,bookName);
            }
            	break;
            case 5:{
            	System.out.println("Enter the ID of the Book to update ");
            	int id4=sc.nextInt();
            	library.updateBook(id4);
            }
            	break;
            case 6:{
            	System.out.println("Enter the ID of the Book to Remove ");
            	int id5=sc.nextInt();
            	library.removeBook(id5);
				sc.close();
            }
            	break; 
            case 7:{
            	b=false;
            	System.out.println("Thank You....");
            }
            break;
			default:
				System.out.println("Enter Valid Option ");
				break;
			}
	    }
	}
}
