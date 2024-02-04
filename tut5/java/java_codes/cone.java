class cone
{
	
	public static void main(String args[])
	
	{
		
		double r1=0.0,l1=0.0,h1=0.0,ar=0.0,vol=0.0;
		
		r1=Double.parseDouble(args[0]);
		l1=Double.parseDouble(args[1]);
		h1=Double.parseDouble(args[2]);
			
		cone c1=new cone();
		ar=c1.area(r1,l1);
		System.out.println("Area of Cone="+ar+"sq.units");
		vol=c1.volume(r1,h1);
		System.out.println("Volume of Cone="+vol+"cubic units");
	}
		
		
	public double area(double r,double l)
	{
		double area=0.0;
		area=3.14*r*l;
		return(area);
	}
	public double volume(double r,double h)
	{
			
		double vol=0.0;
		vol=0.33*3.14*r*r*h;
		return(vol);
	}
}
