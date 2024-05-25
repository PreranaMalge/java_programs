import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class FrameDemo extends Frame
{
	int m1,m2;
	String mousemsg;
		
	FrameDemo()
	{
		addMouseListener(new MyMouseAdapter());
		addWindowListener(new MyWindowAdapter());
	}
	public void paint(Graphics g)
	{
		g.drawString(mousemsg,m1,m2);
	}
	public static void main(String args[])
	{	
		FrameDemo t=new FrameDemo();
		t.setTitle("awt based window");
		t.setVisible(true);
		t.setSize(300,300);	
	}
	public class MyMouseAdapter extends MouseAdapter
	{
		public void mousePressed(MouseEvent me)
		{
			m1=me.getX();
			m2=me.getY();
			mousemsg="mouse pressed";
			repaint();
		}
	}
	public class MyWindowAdapter extends WindowAdapter
	{
		public void windowClosing(WindowEvent we)
		{
			System.exit(0);
		}	
	}
}