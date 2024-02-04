abstract class x
{
	int len,bre,hgt,area,vol;
	
	x()
	{
		System.out.println("Inside x'x constructor..");
	}
	public void getinfo(int l,int b,int h)
	{
		len=l;
		bre=b;
		hgt=h;
	}
	public void area()
	{
		area=len*bre;
		System.out.println("The area is="+area+"sq.units");
	}
	public void display()
	{
		System.out.println("Length="+len);
		System.out.println("Breadth="+bre);
		System.out.println("Height="+hgt);
	}
	abstract public void volume();
}
class y extends x
{
	y()
	{
		System.out.println("Inside y's constructor..");
	}
	public void volume()
	{
		int vol=len*bre*hgt;
		System.out.println("The Volume="+vol+"cu.units");
	}
}
class xabstract
{
	public static void main(String args[])
	{
		x obj;
		obj=new	y();
		obj.getinfo(2,3,4);
		obj.area();
		obj.volume();
		obj.display();
	}
}		
		
			
	
