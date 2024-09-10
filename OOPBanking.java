import java.util.Scanner;

public class OOPBanking {
	
	int accnum;
	int balance;
	
	OOPBanking(int acct)
	{
		accnum=acct;
		balance = 0;
	}
	
	void deposit()
	 {
		 int dep;
		 int acc;
		 Scanner in = new Scanner(System.in);
		 System.out.println("Enter Account Number: ");
		 acc=in.nextInt();
		 if(acc==accnum)
		 {
		 System.out.println("Enter Amount To Be Deposited: ");
		 dep = in.nextInt();
		 balance = balance + dep;
		 }
		 else
		 {
			 System.out.println("Account is Invalid");
		 }
	 }
	 
	 void withdrawal()
	 {
		 
		 int with;
		 Scanner in = new Scanner (System.in);
		 int acc;
		 System.out.println("Enter Account Number: ");
		 acc=in.nextInt();
		 if(acc==accnum)
		 {
			 System.out.println("Enter Amount To Be Withdrawn: ");
			 with = in.nextInt();
			 if (balance >= with)
			 {
				 balance  = balance - with;
				 
			 }
			 else 
			 {
				 System.out.println("Insufficient Balance");
			 }
			
			 
		 }
		 else
		 {
			 
			 System.out.println("Account is Invalid");
		 }
		 
		 
		  
		 
	 }
	 
	 void check()
	 {
		 System.out.println("Your Balance: " + balance);
	 }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int choice;
		int acc;
		Scanner in = new Scanner (System.in);
		System.out.println("Enter Account Number: ");
		acc= in.nextInt();
		
		OOPBanking Obj = new OOPBanking(acc);
		
		
		
		
		while (true)
		{
			
			 System.out.println("MENU: ");
			 System.out.println("1: Press One For Deposit.");
			 System.out.println("2: Press Two For Withdrawal.");
			 System.out.println("3: Press Three To Check Your Balance.");
			 System.out.println("4: Press Four For EXIT. ");
			 
			 System.out.println("ENTER YOUR CHOICE: ");
			 choice = in.nextInt();
			 
			 if (choice == 1)
			 {
				 Obj.deposit();
			 }
			 else if (choice == 2)
			 { 
				 Obj.withdrawal();
			 }
			 else if (choice == 3)
			 {
				 Obj.check();
			 }
			 else if (choice == 4)
			 {
				 
				 break;
			 }
			 else
			 {
				 System.out.println("Incorrect Choice :- ");
			 }
		}
		

	}

}
