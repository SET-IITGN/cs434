import java.io.*;
class bankclass
{
	String name;
	int accno;
	String acctype;
	float balance;
	static int x;
	

	bankclass()
	{
		name="Unnamed";
		accno=-1;
		acctype="Uncategorized";
		balance=0f;
		
		
		
	}
	public void getinfo(String s,int a,String c,float b)
	{
	
		name=s;
	
		accno=a;
	
		acctype=c;
		balance=b;
	
		
		
		
	}
	public void deposit(float bal)
	{
		balance+=bal;
	}
	public void withdraw(float bal)
	{
		if(balance==0)
		{
			System.out.println("Cannot withdraw Zero balance..");
		}
		else
			balance-=bal;
	}
	public void display()
	{
		System.out.println("Name:"+name);
		System.out.println("Accno:"+accno);
		System.out.println("Acctype:"+acctype);
		System.out.println("Balance="+balance+" INR");
	}
	
	
	
	
}
class bank
{
	public static void main(String args[]) throws IOException
	{
		String s;
		int accno=0,ch,i,max=3;
		String acctype;
		float bal;
		bankclass obj[]=new bankclass[3];
		for(i=0;i<3;i++)
		obj[i]=new bankclass();
		max=obj.length;
		BufferedReader k=new BufferedReader(new InputStreamReader(System.in));
		int c=1;
		while(c==1)
		{
			System.out.println("Menu:");
			System.out.println("1.Create an account");
			System.out.println("2.Deposit");
			System.out.println("3.Withdraw");
			System.out.println("4.Display Info");
			System.out.print("Enter choice:");
			ch=Integer.parseInt(k.readLine());

	
			
			System.out.print("Enter accno:");
			accno=Integer.parseInt(k.readLine());
		
			if(accno<=max)
			{
			switch(ch)
			{
				case 1:
					
					
						
					
					System.out.print("Enter name:");
					s=k.readLine();
					System.out.print("Enter acctype:");
					acctype=k.readLine();
		
					obj[accno-1].getinfo(s,accno,acctype,0f);
					System.out.println("Total accounts left="+(max-++bankclass.x));			
					break;
					
				case 2:
					
					
					System.out.print("Enter amount:");
					bal=Float.parseFloat(k.readLine());
					obj[accno-1].deposit(bal);
					break;
				case 3:

					
					

					System.out.print("Enter amount:");
					bal=Float.parseFloat(k.readLine());
					obj[accno-1].withdraw(bal);
					break;
				case 4:					
				
					
					
					obj[accno-1].display();
			
					break;
				default:
					System.out.print("Wrong choice!!");
					break;
			}
			}
			else
			System.out.println("Account does not exist!!");
			System.out.print("Do you want to continue(Yes=1||No=0):");
			c=Integer.parseInt(k.readLine());
		}
	}
}
