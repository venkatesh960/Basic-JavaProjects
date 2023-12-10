package StudentManagementSystem;

import java.util.Scanner;

public class CollegeDriver {
	public static void main(String[] args) {
		
		System.out.println("****** WELCOME TO GEETANJALLI COLLEGE ********");
		College college=new College();
		boolean status=true;
		while (status) {
			System.out.println("Enter the Below Option ");
			System.out.println(" 1.AddStundent\n 2.DisplayStudent\n 3.UpadateStudentRollNumber\n 4.CancelStudentAdmission\n 5.Exit");
			Scanner sc=new Scanner(System.in);
			int option=sc.nextInt();
			switch (option) {
			case 1:{
				System.out.println("Enter Student Name ");
				String sName=sc.next();
				System.out.println("Enter Student RollNumber");
				int rollNum=sc.nextInt();
				System.out.println("Enter Student Gender ");
				String gender=sc.next();
				System.out.println("Enter Student FatherName ");
				String stuFather=sc.next();
				System.out.println("Enter Student Age ");
				int age=sc.nextInt();
				college.addStudent(new Student(sName, rollNum, gender, stuFather, age));
			}
				break;
			case 2:{
				college.displayStudentDetails();
			}
				break;
			case 3:{
				System.out.println("Enter RollNum toUpadate ");
				int sRollNum=sc.nextInt();
				college.updateStudentRollNum(sRollNum);
			}
				break;
			case 4:{
				System.out.println("Enter RollNumber to Cancel The Admission ");
				int sRollNum=sc.nextInt();
				college.cancelAdmission(sRollNum);
				sc.close();
			}
				break;
			case 5:{
				System.out.println("Thanks You Visit Again :");
				status=false;
			}
				break;
			default:
				System.out.println("Re-Enter Option ");
				break;
			}
		}
	}
}
