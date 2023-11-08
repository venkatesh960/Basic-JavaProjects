public class ATM
{
	String userName="Admin";
	int password=123;
	int balance=1000;
	public void deposit(int amount,String name,int userpassword)
	{
		if (userName.equals(name))
		{
			System.out.println("Valid UserName");
			if (password==userpassword) {
				System.out.println("Valid Password");
                balance+=amount;
		        System.out.println(amount+" Deposite succesful");
			}
			else
			{
				try {
					throw new InvalidPasswordException();
				} catch (InvalidPasswordException e) {
					System.out.println("Enter Valid Password");
				}
			}
		}
		else
		{
			try {
				throw new InvalidUserNameException();
			} catch (InvalidUserNameException e) {
				System.out.println("Enter Valid UserName");
			}
		}
	}
	public void withdraw(int amount)
	{
		if (amount<balance) {
			balance-=amount;
			System.out.println(amount+" Withdraw Successful:");
		}
		else
			try {
				InsufficientFundsException e =new InsufficientFundsException();
				throw e;
			} catch (InsufficientFundsException e) {
				System.out.println("Insufficient Funds:");
			}
	}
	public void showBalance()
	{
		System.out.println("Balanace is :"+balance);
	}
}
class InsufficientFundsException extends RuntimeException
{
	
}
class InvalidPasswordException extends RuntimeException
{
	
}
class InvalidUserNameException extends RuntimeException
{
	
}
