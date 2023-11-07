
import java.util.Scanner;
class CustomerInfo
{
   public String accountHolderName;
   public int accountNumber;
   public int amount;
public CustomerInfo(String accountHolderName, int accountNumber, int amount) {
    this.accountHolderName = accountHolderName;
    this.accountNumber = accountNumber;
    this.amount = amount;
}
public void customerInfo()
{
    System.out.println("Account HolderName :"+accountHolderName);
    System.out.println("Account Number: "+accountNumber);
}
 public void withdrawInfo(int withdrawAmount)
 {
    if (withdrawAmount<=amount) {
    int balance=amount-withdrawAmount;
    System.out.println("Withdra Succesfull:");
    System.out.println("Balance Amount:"+balance);   
    }
    else{
        System.out.println("Insufficient Funds ");
    }
 } 
 public void balanceInfo()
 {
    System.out.println("Balance Info:"+amount);
 }
 public void message()
 {
    System.out.println("Account Succcessfull Created ");
 } 

}
class Bank
{
    public static void main(String[] args) {

        CustomerInfo c1=new CustomerInfo("Scott", 101, 5000);
        //CustomerInfo c2=new CustomerInfo("David", 102, 2000);

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Account Number");
        int ac=sc.nextInt();
        if (ac==c1.accountNumber) {
            System.out.println("Enter\n1.To Check Balance\n2.To Withdraw");
            int choice =sc.nextInt();
            switch (choice) {
                case 1:
                    c1.balanceInfo();
                    break;
                case 2:
                    System.out.print("Enter Amount:");
                    int withdrawAmount=sc.nextInt();
                    c1.withdrawInfo(withdrawAmount);
                    break;
                default:
                    System.out.println("Enter Valid Option:");
                    break;
            }   
        }
        else{
            System.out.println("Account Not Found");
            System.out.println("Enter\n1.Create Account\n2.Exit");
            int choice=sc.nextInt();
            switch (choice) {
                case 1:
                   System.out.println("Enter your name");
                   String name=sc.next();
                   System.out.println("Enter Minimum Amount To Deposit");
                   int minAmount=sc.nextInt();
                   CustomerInfo c2=new CustomerInfo(name, 102, minAmount);
                   c2.message();
                   c2.customerInfo();
                    break;
                case 2:
                break;
                default:
                    System.out.println("Enter Valid Option");
                    break;
            }
        }
        sc.close();
    }
}