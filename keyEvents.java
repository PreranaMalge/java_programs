import java.awt.*;
import java.applet.*;
import java.awt.event.*;

/* <applet code="keyEvents" width=300 height=300>
</applet>*/

public class keyEvents extends Applet implements KeyListener
{
	String msg="";
	int X=10;
	int Y=20;

	public void init()
	{
		addKeyListener(this);
		requestFocus();
	}
	public void keyPressed(KeyEvent ke)
	{
		showStatus("key up");	
	}
	public void keyReleased(KeyEvent ke)
	{
		showStatus("key down");	
	}
	public void keyTyped(KeyEvent ke)
	{
		msg+=ke.getKeyChar();
		repaint();
	}
	public void paint(Graphics g)
	{
		g.drawString(msg,X,Y);
	}
}
	
	