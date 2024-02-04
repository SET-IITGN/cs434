import java.awt.*;
import java.applet.*;
public class app3 extends Applet
{
	
	Label label1,label2,label3;
	TextField Text1,Text2,Text3;
		
	public void init()
	{

		label1=new Label("First Value");
		label2=new Label("Second Value");
		
		Text1=new TextField(5);
		Text2=new TextField(5);
		
		add(label1);
		add(Text1);
		add(label2);
		add(Text2);
		label3=new Label("Result");
		Text3= new TextField(8);		
		add(label3);
		add(Text3);
		Text1.setText("0");
		Text2.setText("0");
		Text3.setText(" ");
		
	}
	public void paint(Graphics g)
	{
		
		int x=0,y=0,z=0;
		String s1,s2,s3;
		
		s1=Text1.getText();
		s2=Text2.getText();
			
		x=Integer.parseInt(s1);
		y=Integer.parseInt(s2);
		
		z=x+y;
		s3=String.valueOf(z);	
		g.setColor(Color.red);
		g.drawString("Press Enter to add the numbers..",150,150);

		Text3.setText(s3);

	}
	public boolean action(Event e,Object ob)
	{
		repaint();
		return(true);
	}
		
}
