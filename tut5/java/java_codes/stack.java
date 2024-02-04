import java.io.*;
class stack
{
	public static void main(String args[])
	throws IOException
	{
		int ar[]=new int[10];

		int top=-1,i,ch,max=9,n=0,yes=1;

		BufferedReader k=new BufferedReader(new InputStreamReader(System.in));

		while(yes==1)
		{
		System.out.println("Menu");
		System.out.println("1.Push");
		System.out.println("2.Pop");
		System.out.println("3.Display");
		
		System.out.print("Enter choice:");
		ch=Integer.parseInt(k.readLine());
		
		switch(ch)
		{
			case 1:	
				if(top==max)
				{
					System.out.println("Overflow");
				}
				else
				{
					System.out.print("Enter number:");
					n=Integer.parseInt(k.readLine());
					top++;
					ar[top]=n;

				}
				break;
			case 2:
				if(top==-1)
				{
					System.out.print("Underflow");
				}
				else
				{
					n=ar[top];
					top--;
				}
				System.out.print("The popped element="+n);
				break;	
			case 3:
				System.out.print("TOS");
				for(i=top;i>=0;i--)
				{
						
					System.out.println(ar[i]);
				}
				break;
			default:
				System.out.println("Wrong Choice!!");
			
		}
		System.out.println("Do you want to continue??(Yes=1||No=0):");
		yes=Integer.parseInt(k.readLine());
		
		}
		
	}
}
