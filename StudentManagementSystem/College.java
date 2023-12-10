package StudentManagementSystem;

import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Scanner;

public class College {
	private Student s;
	private String collegeName;
	private int fee;
	private int rank;
	
	
	public College(Student s, String collegeName, int fee, int rank) {
		this.s = s;
		this.collegeName = collegeName;
		this.fee = fee;
		this.rank = rank;
	}
	public College() {
		
	}
	
	
	/**
	 * @return the s
	 */
	public Student getS() {
		return s;
	}
	/**
	 * @param s the s to set
	 */
	public void setS(Student s) {
		this.s = s;
	}
	/**
	 * @return the collegeName
	 */
	public String getCollegeName() {
		return collegeName;
	}
	/**
	 * @param collegeName the collegeName to set
	 */
	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}
	/**
	 * @return the fee
	 */
	public int getFee() {
		return fee;
	}
	/**
	 * @param fee the fee to set
	 */
	public void setFee(int fee) {
		this.fee = fee;
	}
	/**
	 * @return the rank
	 */
	public int getRank() {
		return rank;
	}
	/**
	 * @param rank the rank to set
	 */
	public void setRank(int rank) {
		this.rank = rank;
	}
	public void collegeInfo()
	{
		System.out.println("College Name :"+getCollegeName());
		System.out.println("College Rank :"+getRank());
		System.out.println("College Fee :"+getFee());
		System.out.println();
	}
	
	ArrayList<Student> student=new ArrayList<Student>();
	public void addStudent(Student s1)
	{
		student.add(s1);
		System.out.println("SuccessFully Added ");
	}
	public void displayStudentDetails()
	{
		if (student.isEmpty()) {
			throw new StudentDataNotFoundFound();
		}
		else {
			for (Student student2 : student) {
				{
					student2.studentInfo();
				}
			}
		}
	}
	public void updateStudentRollNum(int sRollNo)
	{
		boolean isPresent=false;
		if (student.isEmpty()) {
			throw new StudentDataNotFoundFound();
		}
		else {
			for (Student student2 : student) {
				if (student2.getsRollNo()==sRollNo) {
					Scanner sc=new Scanner(System.in);
					System.out.println("Enter New RollNumber to update");
					int rollNum=sc.nextInt();
					student2.setsRollNo(rollNum);
					System.out.println("RollNumber is Succesfull Updated ");
					isPresent=true;
					sc.close();
				}
			}
		}
		if (isPresent==false) {
			throw new InvalidRollNumber();
		}
	}
	public void cancelAdmission(int sRollNo)
	{
		ListIterator<Student> i= student.listIterator();
		boolean isPresent=false;
		if (student.isEmpty()) {
			throw new StudentDataNotFoundFound();
		}
		else {
			while (i.hasNext()) {
				Student student = (Student) i.next();
				if (student.getsRollNo()==sRollNo) {
					i.remove();
					System.out.println("Student Data Succesfully Removed ");
					isPresent=true;
				}
			}
		}
		if (isPresent==false) {
			throw new InvalidRollNumber();
		}
		
	}
}
