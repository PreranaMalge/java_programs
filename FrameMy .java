import java.awt.*;
import java.awt.event.*;
import java.applet.*;

/*<applet code="FrameMy" width =300 height =200> </applet>*/

public class FrameMy extends Applet implements ActionListener
{
	public void init()
	{
		TextField t1=new TextField("My Frame",50);
		t1.setEditable(false);
		add(t1);
		Label l1=new Label("First");
		TextField t2=new TextField(10);
		add(l1);
		add(t2);
		Label l2=new Label("Second");
		TextField t3=new TextField(10);
		add(l2);
		add(t3);
		Button b1=new Button("OK");
		add(b1);
		t1.addActionListener(this);
		l1.addActionListener(this);
		t2.addActionListener(this);
		l2.addActionListener(this);
		t3.addActionListener(this);
		b1.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae)
	{
		
	}

}	
	