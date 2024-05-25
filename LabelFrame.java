import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class LabelFrame extends Frame
{
	LabelFrame()
	{	
		//create obj of label class
		
		Label one=new Label("One");
		Label two=new Label("Two");
		Label three=new Label("Three");
		
		//add label to frame
		add(one);
		one.setBounds(30,150,30,60);
		two.setBounds(60,150,30,50);
		three.setBounds(90,150,50,50);
		setLayout(null);
		add(two);
		add(three);
	}
	public static void main(String args[])
	{
		LabelFrame l=new LabelFrame();
		l.setSize(300,300);
		l.setVisible(true);
	}
}