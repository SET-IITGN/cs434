class fibonacci
{
	public static int fib(int n)
	{
		int rem;
		if((n==0)||(n==1))
			return(n);
		else
		{	
			rem=fib(n-1)+fib(n-2);
			return(rem);
		}
	}
	public static void main(String args[])
	{
		int num,i;
		num=Integer.parseInt(args[0]);
		
		for(i=0;i<num;i++)
		{
			System.out.println(fib(i));
		}
		
	}
}	
