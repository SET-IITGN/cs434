import java.awt.*;
import java.applet.*;
public class app1 extends Applet
{
	public void paint(Graphics g)
	{
		setForeground(Color.green);
		g.drawRect(40,20,80,70);
		g.drawOval(140,120,140,120);
	}
}
