import java.awt.*;
import java.awt.event.*;
import java.applet.*;
public class app4 extends Applet implements ActionListener
{

	Label l1,l2,l3;
	TextField t1,t2,t3,t4,t5;
	Button b1,b2;
	public void init()
	{
		setLayout(new GridLayout(5,2,20,5));
		setFont(new Font("SansSerif",Font.PLAIN|Font.ITALIC,16));
		
		l1=new Label("Name");
		l2=new Label("Password");
		l3=new Label("Retype password");

		t1=new TextField(10);
		t2=new TextField(10);
		t3=new TextField(10);

		t4=new TextField(10);
		t5=new TextField(10);

		b1=new Button("CLICK");
		b2=new Button("CLEAR");
		
		t1.setText("");
		t2.setText("");
		t3.setText("");
		t4.setText("");
		t5.setText("");
		t2.setEchoChar('*');
		t3.setEchoChar('*');

		add(l1);
		add(t1);
		add(l2);
		add(t2);
		add(l3);
		add(t3);
		add(t4);
		add(t5);
		add(b1);
		add(b2);
		
			
		b1.addActionListener(this);
		b2.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==b1)
		{
			if((t2.getText()).equals(t3.getText()))
			{
				t4.setText("MATCH");
				t5.setText("");
			}
			else
			{
				t5.setText("NOT MATCH");
				t4.setText("");
			}
		}
		if(e.getSource()==b2)
		{
			t1.setText("");
			t2.setText("");
			t3.setText("");
			t4.setText("");
			t5.setText("");
		}
	}
	public Insets getInsets()
	{
		return(new Insets(35,35,35,35));
	}
	public void paint(Graphics g)
	{			
		setBackground(Color.pink);
		setForeground(Color.black);
	}			
}
