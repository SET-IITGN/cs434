import java.awt.*;
import java.awt.event.*;
import java.applet.*;
public class myapp extends Applet implements ActionListener
{
	Label l1,l2,l3;
	TextField t1,t2,t3,t4,t5;
	Button b1,b2;

	public void init()
	{
		setLayout(new GridLayout(5,2,15,10));
		setFont(new Font("SansSerif",Font.PLAIN|Font.ITALIC,16));

		l1=new Label("Name");
		add(l1);
		t1=new TextField(8);
		t1.setText("");
		add(t1);

		l2=new Label("Password");
		add(l2);
		t2=new TextField(8);
		t2.setEchoChar('*');
		t2.setText("");
		add(t2);

		l3=new Label("Retype Password");
		add(l3);
		t3=new TextField(8);
		t3.setEchoChar('*');
		t3.setText("");
		add(t3);

		t4=new TextField(8);
		t4.setText("");
		add(t4);

		t5=new TextField(8);
		t5.setText("");
		add(t5);
	
		b1=new Button("CLICK");
		add(b1);
		b2=new Button("CLEAR");
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
				t5.setText("");
				t4.setText("MATCH");
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
