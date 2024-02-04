import java.util.*;
class sum
{
	public static void main(String args[])
	{
		int s=0,rem=0,n;
		
		Scanner sc=new Scanner(System.in);
	
		System.out.print("Enter a number:");
		n=sc.nextInt();
		
		while(n>0)
		{
			rem=n%10;
			s=s+rem;
			n/=10;
		}
		System.out.println("The Sum of digits="+s);
	}
}	
	
	

	
	
	
