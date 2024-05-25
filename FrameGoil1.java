import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class FrameGoil1 
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
	Frame f=new Frame();
	f.setSize(300,300);
	f.setVisible(true);
	f.setBounds(100,100,80,30);
	f.setLayout(null);
}
public static void main(String args[])
{
	new FrameGoil1();

}