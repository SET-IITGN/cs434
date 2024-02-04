class Demo
{
	int a;
	
	Demo()//base class constructor
	{
		a=1;
		System.out.println("Inside base class constructor");
	}
	public int incrementBy(int x)//base class method
	{
		a=a+x;
		return(a);
	}
}
class sonOfDemo extends Demo
{
	sonOfDemo()//sub class constructor
	{
		super();//calling super class constructor
		System.out.println("Inside sub class constructor");
	}
	public int incrementBy(int x)//overridden method
	{
		a=a+(++x);
		return(a);
	}
	public void getResult()
	{
		int res=super.incrementBy(5);
		System.out.println("res="+res);
		res=incrementBy(5);
		System.out.println("res="+res);
	}
}
class superdemo
{
	public static void main(String args[])
	{
		sonOfDemo s=new sonOfDemo();
		System.out.println("incrementBy() returned "+s.incrementBy(1));
		s.getResult();
	}
}		
		
