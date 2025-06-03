import java. util.*;
class Bank
{
	String holderName;
	long acNumber;
	String acType;
	double acBalance;
	Bank(String name, long acNumber, String acType, double acBalance)
	{
		this.holderName = name;
        	this.acNumber = acNumber;
        	this.acType = acType;
        	this.acBalance = acBalance;
	}
	void deposit(double amount) 
	{
        	if (amount > 0)
       		{
          		acBalance+= amount;
            		System.out.println("Deposited " + amount + " successfully.");
        	}
		else 
		{
         		System.out.println("Invalid deposit amount.");
        	}
    	}

    	void withdraw(double amount) 
    	{
        	if (amount > 0)
          	{
            		if (acBalance >= amount) 
            		{
                		acBalance = acBalance - amount;
                		System.out.println("Withdrawn " + amount + " successfully.");
            		} 
            		else
            		{
                		System.out.println("Insufficient balance.");
            		}
          	} 
        	else
       		{
            		System.out.println("Invalid withdrawal amount.");
        	}
	}
	void display()
	{
		System.out.println("Name = "+this.holderName +'\n'+ "Account Number = "+this.acNumber +'\n'+"Account Type ="+this.acType+'\n'+"Account Balance Amount; = "+this.acBalance);
	}

}
class Bankmain
{
    public static void main(String arg[]) 
	{
		Scanner sc = new Scanner(System.in);
		int tnoc;
		String n,act,yn;
   		long acn,yacn;
 		double acb;
		System.out.println("Enter Total No Of customer in database ");
		tnoc=sc.nextInt(); 
		Bank b[]=new Bank[tnoc];
		for (int i = 0;i<tnoc;i++ )
		{
			System.out.println("");
			System.out.println("Enter account Number of coustomer " +(i+1));
			acn=sc.nextLong();
			System.out.println("Enter Name of coustomer " +(i+1));
			n=sc.next();
			System.out.println("Enter account type of coustomer " +(i+1));
			act=sc.next();
			System.out.println("Enter Account Balance of coustomer " +(i+1));
			acb=sc.nextDouble();
			b[i]=new Bank(n,acn,act,acb);
		}
		System.out.println("**********************************************************************xxx*********************************************************************");
		System.out.println("Enter your Name");
		yn=sc.next();
		System.out.println("Enter your account number ");
		yacn=sc.nextLong();
		int j ;
		for (j= 0;j<tnoc;j++)
		{
			if(b[j].acNumber==yacn)
			break;
		}
		if (j < tnoc)
		{
			while (true) 
			{
			System.out.println("*****************************************************************xxx*************************************************************************");
            			System.out.println("\nMenu:");
            			System.out.println("1. TO Deposit");
            			System.out.println("2. TO Balance and Withdraw");
            			System.out.println("3. TO Display Account Details");
            			System.out.println("4. TO Exit");
            			System.out.print("Enter your choice (1-4): ");
            			int choice = sc.nextInt();

            			switch (choice)
				{
                			case 1:
                    				System.out.print("Enter deposit amount: ");
                    				double depositAmount = sc.nextDouble();
                    				b[j].deposit(depositAmount);
                    				break;
                			case 2:
						System.out.println("yore Account balance:-  "+b[j].acBalance);
						System.out.print("DO you want to withdraw money ? [y/n]  ");
						char c = sc.next().charAt(0);
						if(c=='y'||c=='Y')
						{ 
        	            				System.out.print("Enter withdrawal amount: ");
   	                 				double withdrawAmount = sc.nextDouble();
        	            				b[j].withdraw(withdrawAmount);
 	                   				break;
						}
						else
						{
							break;
						}
               				case 3:
                    				b[j].display();
                    				break;
                			case 4:
                   				System.out.println("Exiting...");
                    				System.exit(0);
                			default:
                    				System.out.println("Invalid choice. Please enter a valid option.");
						break;
				}
			}
        	} 
		else
		{
            		System.out.println("Account not found.");
        	}
	}
}