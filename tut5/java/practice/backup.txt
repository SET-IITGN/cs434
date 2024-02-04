import java.util.*;
class account
{
	int accno;
	String name;
	String acctype;
	float balance;
	static int x;
	
	account()
	{
		accno=-1;
		name="Unnamed";
		acctype="Uncategorized";
		balance=0.0f;
		System.out.println("Object created!!");
	}
	public void createAcc(int n,String s,String c,float bal)
	{	
		x++;
		accno=n;
		name=s;
		acctype=c;
		balance=bal;
		System.out.println("Account creation successful!!");
	}
	public void deposit(float a)
	{
		balance+=a;
	}
	public void withdraw(float a)
	{
		if((balance<0)||(balance-a<0))
			System.out.println("Low account balance cannot withdraw..");
		else
			balance-=a;
	}
	public void display()
	{
		System.out.println("Accno:"+accno);
		System.out.println("Acctype:"+acctype);
		System.out.println("Name:"+name);
		System.out.println("Balance:"+balance);
	}
}
class bank
{
	public static void main(String args[])
	{
		int n=0,an;
		Scanner sc=new Scanner(System.in);
		account obj[]=new account[5];
		int ch=1,repeat=1;
		String nam,at;
		float bal=0.0f;
		
		while(repeat==1)
		{
			System.out.println("1.Create account");
			System.out.println("2.Deposit");
			System.out.println("3.Withdraw");
			System.out.println("4.Display");
			System.out.println("Enter your choice:");
			ch=sc.nextInt();

			System.out.println("Enter account number:");
			an=sc.nextInt();
	
			if(an>0&&an<=5)
			{
				switch(ch)
				{
					case 1:
						System.out.println("Enter name:");
						nam=sc.next();
						System.out.println("Enter accytpe:");
						at=sc.next();
						System.out.println("Enter initial balance:");
						bal=sc.nextFloat();
						obj[an]=new account();
						obj[an].createAcc(an,nam,at,bal);
						break;
					case 2:
						System.out.println("Enter amount to deposit");
						bal=sc.nextFloat();
						obj[an].deposit(bal);
						break;
					case 3:
						System.out.println("Enter amount to be withdrawn:");
						bal=sc.nextFloat();
						obj[an].withdraw(bal);
						break;
					case 4:
						obj[an].display();
						break;
					default:
						System.out.println("Wrong choice!!");
						
				}
			}
			else
			{
				System.out.println("Account does not exist!!");
			}
			System.out.print("Do you want to continue(Yes=1||No=0)?:");
			repeat=sc.nextInt();
		}
	}
}
											
					
		
		
										  
		
