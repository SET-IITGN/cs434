abstract class Abs
{
	float breadth,length,area;
		
	Abs()
	{
		System.out.println("Inside Super Class Constructor...");
	}

	public void area()
	{
		area=breadth*length;
		
	}
	public void getinfo(float b,float l)
	{
		breadth=b;
		length=l;
	}
	abstract void display();
}
class imp extends Abs
{
	imp()
	{	
		super();
		System.out.println("Inside Sub Class Constructor...");  
		
		
	}
	void display()
	{
		System.out.println("The area="+area+" sq.units");
	}
}
class abs
{
	public static void  main(String args[])
	{
		Abs obj1,obj2,obj3;
		
		obj1=new imp();
		obj1.getinfo(3.4f,4.5f);
		
		obj1.area();
		obj1.display();
		System.out.println();

		obj2=new imp();
		obj2.getinfo(5.6f,7.8f);
		obj2.area();
		obj2.display();
		System.out.println();

		obj3=new imp();
		obj3.getinfo(8.4f,2.5f);
		obj3.area();
		obj3.display();
	}
}

		

