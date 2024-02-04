class cone
{
	float ar,vol,pi=3.14f;
		
	public void area(float r,float l)
	{
		ar=pi*r*l;
		System.out.println("The area is "+ar+" sq.units");
	}
	public void volume(float r,float h)
	{
		vol=0.33f*pi*r*r*h;
		System.out.println("The volume is "+vol+" cu.units");
	}
}
class ijk
{
	public static void main(String args[])
	{
		float r,l,h;
		r=Float.parseFloat(args[0]);
		l=Float.parseFloat(args[1]);
		h=Float.parseFloat(args[2]);
		cone obj1=new cone();
		obj1.area(r,l);
		obj1.volume(r,h);
	}
}
	


	
