import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class Example extends Applet implements ActionListener 
{
	Label l1,l2,l3;
	TextField t1,t2;
	Button b1;
	public void init()
	{
		l1=new Label("My Frame");
		l2=new Label("First");
		l3=new Label("Second");
		t1=new TextField();
		t2=new TextField();
		b1=new Button("OK");
		add(l1);
		add(l2);
		add(t1);
		add(l3);
		add(t2);
		add(b1);
		b1.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae)
	{
		String temp=t1.getText();
		t1.setText(t2.getText());
		t2.setText(temp);
	}
}