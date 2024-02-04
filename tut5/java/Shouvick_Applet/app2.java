import java.awt.*;
import java.applet.*;
public class app2 extends Applet
{
	String s;

	public void init()
	{
		s=getParameter("a");
		s="Shouvick Mondal"+s;
	}
	public void paint(Graphics g)
	{
		setBackground(Color.green);
		setForeground(Color.red);
		g.drawString(s,10,20);
	}	
}
