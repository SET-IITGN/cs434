import java.io.*;
class recarea
{
	float b,d,ar;
	
	recarea()//default constructor
	{
		b=0f;
		d=0f;
		System.out.println("Default constructor used..");
	}
	recarea(float br,float dp)//parameterized constructor
	{
		b=br;
		d=dp;
		System.out.println("Parameterised constructor used..");
	}
	recarea(recarea obj)//copy constructor
	{
		b=obj.b;
		d=obj.d;
		System.out.println("Copy constructor used..");
	}
	public void area()
	{
		ar=b*d;
		
	}
	public void display()
	{
		System.out.println("Area="+ar+"sq.units");
	}
}	
class rect
{
	public static void main(String args[])throws IOException
	{
		float b,d;
		BufferedReader k=new BufferedReader(new InputStreamReader(System.in));
	
			
		System.out.print("Enter the value of b:");
		b=Float.parseFloat(k.readLine());


		System.out.print("Enter the value of d:");
		d=Float.parseFloat(k.readLine());

		recarea r1,r2,r3,r4;
		r1=new recarea();
		r1.area();
		r1.display();
		r2=new recarea(b,d);
		r2.area();
		r2.display();
		r3=new recarea(r2);
		r3.area();
		r3.display();
	}
}
		

	
