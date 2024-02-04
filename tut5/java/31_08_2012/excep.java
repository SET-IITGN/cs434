import java.io.*;
class excep
{
	public static void main(String args[])
	throws IOException
	{
		int ar[]=new int[10];
		int a,b,res;
	
	   BufferedReader k=new BufferedReader(new InputStreamReader(System.in));
		
	   try
	   {
		System.out.print("Enter value of a:");
		a=Integer.parseInt(k.readLine());
		System.out.print("Enter value of b:");
		b=Integer.parseInt(k.readLine());
		res=a/b;
		System.out.println("Result="+res);
	
		System.out.print("Enter data to be inserted:");
		a=Integer.parseInt(k.readLine());
		System.out.print("Enter position within 0-9 both incl:");
		b=Integer.parseInt(k.readLine());
		ar[b]=a;
		System.out.println("Array successfully updated");
		System.out.print("Enter any number:");
		a=Integer.parseInt(k.readLine());
			
	   }
	   catch(ArithmeticException obj1)
	   {
		System.out.println("Division by Zero Error!!");
	   } 
	   catch(ArrayIndexOutOfBoundsException obj2)
	   {
		System.out.println("Array Bounds Exceeded!!");
	   }
	   catch(NumberFormatException obj3)
	   {
		System.out.println("Number Format Invalid!!");
	   }
      }
}	
  	 	
							
		
	

