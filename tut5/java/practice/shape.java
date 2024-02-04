import java.awt.*;
import java.applet.*;
public class shape extends Applet
{
	public void paint(Graphics g)
	{
		setForeground(Color.red);
		setBackground(Color.cyan);
		g.drawRect(100,70,100,70);
		g.drawOval(230,150,130,90);
		g.fillOval(100,200,100,70);
		g.drawRoundRect(100,300,100,120,50,50);
		g.fillRoundRect(270,350,100,120,70,70);
		g.drawLine(235,160,110,210);
		
			
	}
}		
