import java.awt.*;
import java.awt.event.*;
import java.applet.*;

/*<applet code="keyeventsdemo" width=300 height=300>
</applet>*/

public class keyeventsdemo extends Applet implements KeyListener
{
	String msg="";
	int X=10;
	int Y=20;

	public void init()
	{
		addKeyListener(this);
	}
	public void keyPressed(KeyEvent ke)
	{
		int key=ke.getKeyCode();
		System.out.println(key);
		switch(key)
		{
			case KeyEvent.VK_F1:
			msg+="F1";
			case KeyEvent.VK_F2:
			msg+="F2";
		}
		repaint();	
	}
	public void keyReleased(KeyEvent ke)
	{
		showStatus("key up");	
	}
	public void paint(Graphics g)
	{
		g.drawString(msg,X,Y);
	}
	public void keyTyped(KeyEvent ke)
	{
		showStatus("key down");
	}
}