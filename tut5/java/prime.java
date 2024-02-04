class prime
{
	public static void main(String args[])
	{
		int i,j,n,rem,f=0;

		n=Integer.parseInt(args[0]);
		
		if(n<2)
			System.out.println("Non prime number!!");
		else
		{
			for(i=2;i<=n;i++)
			{	
				rem=n%i;
				if(rem==0)
				{	
					if(n==i)
					{	
						System.out.print("Prime Number!!");
						break;
					}
					else
					{
						System.out.print("Non Prime Number!!");
						break;
					}
										
				}

			}
		}
				
		
	}
}
				
