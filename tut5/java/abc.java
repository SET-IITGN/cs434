import java.io.*;
class stack
{
	int top,i,MAX;
	int ar[]=new int[10];
	
	stack()//constructor
	{
		this.top=-1;
		this.MAX=9;
		this.i=9;
	}
	public void push(int item)//push operation
	{
		if(top==MAX)
			System.out.print("Stack Overflow!!\n");
		else
			ar[++top]=item;
	}	
	public void pop()//pop operation
	{
		if(top==-1)
			System.out.print("Stack Underflow!!\n");
		else
		{
			System.out.println("The Popped Item="+ar[top--]);
		}
	}
	public void display()//display the entire stack
	{
		System.out.println("Top of stack");
		
		for(i=top;i>=0;i--)
			System.out.println(ar[i]);
				
	}	
}
class abc
{
	public static void main(String args[])
	throws IOException
	{
		int data,ch,yes=1;
	
		stack sc=new stack();
		BufferedReader k=new BufferedReader(new InputStreamReader(System.in));
		while(yes==1)
		{

			
			System.out.println("Menu");
			System.out.println("1.Push");
			System.out.println("2.Pop");
			System.out.println("3.Display Stack");
			System.out.print("Enter choice:");
			
			ch=Integer.parseInt(k.readLine());
			
			switch(ch)
			{
				case 1: System.out.print("Enter the data:");
					data=Integer.parseInt(k.readLine());
					sc.push(data);
					break;

				case 2: sc.pop();
					break;

				case 3: sc.display();
					break;
				
				default: System.out.println("Wrong Choice!!");
			}
			System.out.print("Do you want to continue(Yes=1||No=0)?:");
			yes=Integer.parseInt(k.readLine());
		}

	}
}
