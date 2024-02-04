
interface Student
{
	public void getinfostu(String sname,int roll,String dept);
}
interface Dept
{
	public void getinfodept(String Dname,int Dcode);
}
interface College extends Student,Dept
{
	public void getinfocoll(String collname,int collcode,String loc);
}
class xinter implements College
{
	
	
	
		String sn,Dn,cname,l,dep;
		int r,Dc,ccode;

		

		public void getinfostu(String sname,int roll,String dept)
		{
			sn=sname;
			r=roll;
			dep=dept;
			System.out.println("Student Info...");
			System.out.println("Name="+sn);
			System.out.println("Roll="+r);
			System.out.println("Dept="+dep);
		}
		public void getinfodept(String Dname,int Dcode)
		{
			Dn=Dname;
			Dc=Dcode;
			System.out.println("Department Info...");
		
			System.out.println("Dept Name="+Dn);
			System.out.println("Dept Code="+Dc);
		}
		public void getinfocoll(String collname,int collcode,String loc)
		{

			cname=collname;
			ccode=collcode;
			l=loc;
			System.out.println("College Info...");
			System.out.println("College name="+cname);
			System.out.println("College code="+ccode);
			System.out.println("College location="+l);
		}

}
class inter
{
	public static void main(String args[])
	
	{
		
		
		College c;
		c=new xinter();
		c.getinfostu("Shouvick",1,"CS");
		c.getinfodept("Computer Science & Engineering",1);
		c.getinfocoll("CEMK",107,"Kolaghat");
		System.out.println();
		
		c.getinfostu("Debojit",2,"ECE");
		c.getinfodept("Electronics and Communication Engineering",2);
		c.getinfocoll("IIT Roorkee",001,"Roorkee");
		System.out.println();
		
		c.getinfostu("Projjwal",7,"CS");
		c.getinfodept("Computer Science & Engineering",1);
		c.getinfocoll("NIT Durgapur",002,"Durgapur");
		System.out.println();
	}
}
		
		
		
	


