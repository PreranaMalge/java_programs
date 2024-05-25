import java.awt.*;
import java.awt.event.*;

public class PanelExample1
{
	PanelExample1()
	{
		Frame f=new Frame("PanelExample");
		Panel panel=new Panel;
		panel.setBackground(Color.gray);
		panel.setBounds(40,80,200,200);
		Button b1=new Button("Button 1");
		b1.setBackground(Color.yellow);
		b1.setBounds(50,100,80,30);
		Button b2=new Button("Button 2");
		b2.setBackground(Color.green);
		b2.setBounds(100,100,80,30);
		
		panel.add(b1);
		panel.add(b2);
		
		f.add(panel);
		f.setVisible(true);
		f.setSize(400,400);
		f.setLayout(null);	
	}
	public static void main(String args[])
	{
		new PanelExample();
	}
}