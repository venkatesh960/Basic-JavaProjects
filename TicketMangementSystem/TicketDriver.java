package TicketMangementSystem;
import java.util.*;
public class TicketDriver {
	public static void main(String[] args) {
		
		User u1=new User();
		
		System.out.println("***** WELCOME T.S.R.T.C. *****");
		boolean status=true;
		while (status) {
			System.out.println("Enter the Option\n 1.BookTicket\n 2.DisplayTicket\n 3.ChangeBoardingPoint\n 4.ChangeDestinationPoint\n 5.ChangeJourneyDate\n 6.CancelTicket\n 7.JourneyDetails\n 8.Exit");
		    Scanner sc=new Scanner(System.in);
		    int ch=sc.nextInt();
		    switch (ch) {
			case 1:
			{
				System.out.println("Enter userName :");
				String name=sc.next();
				System.out.println("Enter age :");
				int age=sc.nextInt();
				System.out.println("Enter Gender :");
				String gender=sc.next();
				System.out.println("Enter mobileNumber :");
				long num=sc.nextLong();
				u1.setUserName(name);
				u1.setAge(age);
				u1.setGender(gender);
				u1.setMobileNumber(num);
				
				System.out.println("Enter BoardingPoint ");
				String boradingPoint=sc.next();
				System.out.println("Enter the Destination Point");
				String dest=sc.next();
				System.out.println("Enter the date to Travel ");
				String date=sc.next();
				u1.bookkTicket(new Ticket(1050, 10, dest, boradingPoint, date));
			}
				
				break;
			case 2:
			{
				u1.displayTicket();
			}
                break;
			case 3:
			{
				System.out.println("Enter TicketNumber :");
				int ticketNum=sc.nextInt();
				u1.changeBoardingPoint(ticketNum);
			}
			    break;
			case 4: 
			{
				System.out.println("Enter TicketNumber :");
				int ticketNum=sc.nextInt();
				u1.changeDestination(ticketNum);
			}
		    	break;
			case 5:
			{
				System.out.println("Enter TicketNumber :");
				int ticketNum=sc.nextInt();
				u1.changeJourneyDate(ticketNum);
			}
			    break;
			case 6:{
				System.out.println("Enter TicketNumber :");
				int ticketNum=sc.nextInt();
				u1.cancelTicket(ticketNum);
			}
				break;
			case 7:{
				System.out.println("Enter TicketNumber :");
				int ticketNum=sc.nextInt();
				u1.journeyDetails(ticketNum);
				sc.close();
			}
				break;
			case 8:
				status=false;
				System.out.println("Thank You Visit Again....");
				break;
			default:
				System.out.println("Enter Valid Option ");
				break;
			}
		}
	}

}
