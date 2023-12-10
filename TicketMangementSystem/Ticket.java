package ticketManagementSystem;

public class Ticket {
	private int ticketNum;
	private int seatNum;
	private String dest;
	private String boardingPoint;
	private String date;
	public Ticket(int ticketNum, int seatNum, String dest, String boardingPoint, String date) {
		this.ticketNum = ticketNum;
		this.seatNum = seatNum;
		this.dest = dest;
		this.boardingPoint = boardingPoint;
		this.date = date;
	}
	public Ticket() {
		
	}
	/**
	 * @return the ticketNum
	 */
	public int getTicketNum() {
		return ticketNum;
	}
	/**
	 * @param ticketNum the ticketNum to set
	 */
	public void setTicketNum(int ticketNum) {
		this.ticketNum = ticketNum;
	}
	/**
	 * @return the seatNum
	 */
	public int getSeatNum() {
		return seatNum;
	}
	/**
	 * @param seatNum the seatNum to set
	 */
	public void setSeatNum(int seatNum) {
		this.seatNum = seatNum;
	}
	/**
	 * @return the dest
	 */
	public String getDest() {
		return dest;
	}
	/**
	 * @param dest the dest to set
	 */
	public void setDest(String dest) {
		this.dest = dest;
	}
	/**
	 * @return the boardingPoint
	 */
	public String getBoardingPoint() {
		return boardingPoint;
	}
	/**
	 * @param boardingPoint the boardingPoint to set
	 */
	public void setBoardingPoint(String boardingPoint) {
		this.boardingPoint = boardingPoint;
	}
	/**
	 * @return the date
	 */
	public String getDate() {
		return date;
	}
	/**
	 * @param date the date to set
	 */
	public void setDate(String date) {
		this.date = date;
	}
	
	public void ticketInfo()
	{
		System.out.println("Date of Booked : "+getDate());
		System.out.println("Ticket Number : "+getTicketNum());
		System.out.println("Ticket SeatNumbet : "+getSeatNum());
		System.out.println("Bording Point : "+getBoardingPoint());
		System.out.println("Destination point : "+getDest());
	}
}
