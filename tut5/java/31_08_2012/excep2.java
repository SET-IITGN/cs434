class myexcep extends Exception//custom exception
{
	myexcep()//default constructor
	{
		System.out.println("myexcep object created");
	}
	public String toString()//overriding object description function
	{
		return("I am the exception of type myexcep");
	}
}
class xexcep
{
	static int x=8;
	public int incr(int temp)throws myexcep
	{
		System.out.println("I am inside incr() method of class excep2");
	
		if(temp<0)
			throw new myexcep();
		else
		{
			x=x+temp;
			return(x);
		}
	}
}		
class excep2
{
	public static void main(String args[])
	{
		int getval;
	
		try
		{
			getval=new xexcep().incr(2);
			System.out.println("getval="+getval);
			getval=new xexcep().incr(-3);
			System.out.println("getval="+getval);		
		}	
		catch(myexcep e)//exception caught
		{
			System.out.println(e);
		}
	}
}	
