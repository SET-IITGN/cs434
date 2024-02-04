import java.awt.*;
import java.applet.*;
public class collegename extends Applet
{
	String s="Shouvick Mondal",s2;
	public void init()
	{
		s2=getParameter("a");
		s=s+s2;
	}
	public void paint(Graphics g)
	{
		g.drawString(s,50,70);
	}
}
