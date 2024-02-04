import java.awt.*;
import java.applet.*;
public class gui1 extends Applet
{
	Label l1,l2,l3,l4;
	TextField t1,t2,t3;

	public void init()
	{
		l1=new Label("First Value");
		add(l1);
		t1=new TextField(5);
		add(t1);
		l2=new Label("Second Value");
		add(l2);
		t2=new TextField(5);
		add(t2);
		l3=new Label("Result");
		add(l3);
		t3=new TextField(5);
		t3.setText(" ");
		add(t3);
	}
	public void paint(Graphics g)
	{
		g.drawString("Press enter to add the numbers...",135,80);
	}
	public boolean action(Event e,Object ob)
	{
		int x,y,z;
		x=Integer.parseInt(t1.getText());
		y=Integer.parseInt(t2.getText());
		z=x+y;
		t3.setText(String.valueOf(z));
		return(true);
	}
}
