package TicketMangementSystem;

import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Scanner;

public class User {
	private String userName;
	private int age;
	private String gender;
	private long mobileNumber;
	
	private Ticket t1;
	
	public User(String userName, int age, String gender, long mobileNumber) {
		this.userName = userName;
		this.age = age;
		this.gender = gender;
		this.mobileNumber = mobileNumber;
	}
	public User() {
		System.out.println("Ticket Booked Succesfully ");
		
	}
	/**
	 * @return the userName
	 */
	public String getUserName() {
		return userName;
	}
	/**
	 * @param userName the userName to set
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}
	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}
	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}
	/**
	 * @return the gender
	 */
	public String getGender() {
		return gender;
	}
	/**
	 * @param gender the gender to set
	 */
	public void setGender(String gender) {
		this.gender = gender;
	}
	/**
	 * @return the mobileNumber
	 */
	public long getMobileNumber() {
		return mobileNumber;
	}
	/**
	 * @param mobileNumber the mobileNumber to set
	 */
	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public void userInfo()
	{
		System.out.println("UserName : "+getUserName());
		System.out.println("Age : "+getAge());
		System.out.println("Gender : "+getGender());
		System.out.println("Mobile Number : "+getMobileNumber());
	}
	
	ArrayList<Ticket>ticket=new ArrayList<Ticket>();
	Scanner sc=new Scanner(System.in);
	
	public void bookkTicket(Ticket t1)
	{
		ticket.add(t1);
		System.out.println("Ticket Booked Succesfully");
	}
	public void displayTicket()
	{
		if (ticket.isEmpty()) {
			throw new TicketNotFoundException();
		}
		else {
			for (Ticket ticket2 : ticket) {
					userInfo();
					ticket2.ticketInfo();
			}
		}
	}
	public void changeBoardingPoint(int ticketNum)
	{

		boolean isFound=false;
		if (ticket.isEmpty()) {
			throw new TicketNotFoundException();
		}
		else {			
			System.out.println("Enter the Boarding Point : ");
			String boardingPoint=sc.next();
			Ticket t2=new Ticket();
			t2.setDest(boardingPoint);
			isFound=true;
		}
		if (isFound==false) {
			throw new InvalidTicketNumber();
		}
	}
	public void changeDestination(int ticketNum)
	{
		boolean isFound=false;
		if (ticket.isEmpty()) {
			throw new TicketNotFoundException();
		}
		else {
			System.out.println("Enter the New Destination Point : ");
			String dest=sc.next();
			for (Ticket ticket2 : ticket) {
				if (ticket2.getTicketNum()==ticketNum) {
					
					t1.setDest(dest);
					isFound=true;
				}
			}
		}
		if (isFound==false) {
			throw new InvalidTicketNumber();
		}
	}
	public void changeJourneyDate(int ticketNum)
	{
		boolean isFound=false;
		if (ticket.isEmpty()) {
			throw new TicketNotFoundException();
		}
		else {			
			System.out.println("Enter the Date to bo book : ");
			String date=sc.next();
			for (Ticket ticket2 : ticket) {
				if (ticket2.getTicketNum()==ticketNum) {
					
					t1.setDest(date);
					isFound=true;
				}
			}
		}
		if (isFound==false) {
			throw new InvalidTicketNumber();
		}
	}
	public void cancelTicket(int ticketNum)
	{
		ListIterator<Ticket> i=ticket.listIterator();
		boolean isFound=false;
		if (ticket.isEmpty()) {
			throw new TicketNotFoundException();
		}
		else {
			while (i.hasNext()) {
				Ticket ticket = (Ticket) i.next();
				if (ticket.getTicketNum()==ticketNum) {
					i.remove();
					System.out.println("Ticket successfully Cancelled...");
					isFound=true;
				}
			}
		}
		if (isFound==false) {
			throw new InvalidTicketNumber();
		}
	}
	public void journeyDetails(int ticketNum)
	{
		boolean isFound=false;
		if (ticket.isEmpty()) {
			throw new TicketNotFoundException();
		}
		else {	
			if (t1.getTicketNum()==ticketNum) {
				
				userInfo();
				t1.ticketInfo();
			}
		}
		if (isFound==false) {
			throw new InvalidTicketNumber();
		}
	}
}
