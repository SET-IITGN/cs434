

class pattern
{
	public static void main(String args[])
	{
		int i=0,j=0,k=0;

		
		int ar[]=new int[7];	

		int n=7,x=0; 
		
		x=n/2;
		int c=0,d1=0,d2=0;
		for(i=1;i<=4;i++)
		{	
			d1=x+c;
			d2=x-c;
			ar[d1]=i;
			ar[d2]=i;
			for(k=0;k<7;k++)
			{
				if(ar[k]==0)
				System.out.print(" ");
				else
				System.out.print(ar[k]);
			}
			System.out.println();
			
			
			c++;
		}
	}
}	
	
