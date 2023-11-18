import java.util.Scanner;
public class ATMDrivers {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("********");
		System.out.println("Welocome to ATM");
		boolean status=true;
		ATM a1=new ATM();
		while (status) {
			System.out.println("Enter\n1.Deposit\n2.Withdraw\n3.ShowBalance\n4.exit");
			int choice=sc.nextInt();
			switch (choice) {
			case 1: {
                System.out.println("Enter userName");
				String name=sc.next();
				System.out.println("Enter password ");
				int userpassword=sc.nextInt();
				System.out.println("Enter amount to Deposit");
				int amount=sc.nextInt();
				a1.deposit(amount,name,userpassword);
			}
			break;
			case 2:
			{
				System.out.println("Enter amount To Withdraw");
				int amount=sc.nextInt();
				a1.withdraw(amount);
			}
			break;
			case 3:
			{
				a1.showBalance();
			}
			break;
			case 4:
			{
				System.out.println("Thanking You ");
				status=false;
			}
			break;
			default:
			{
				System.out.println("Enter Valid Option");
				sc.close();
			}
			break;
			}
			
		}
	}

}
