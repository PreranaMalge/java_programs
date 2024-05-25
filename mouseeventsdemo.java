import java.awt.*;
import java.applet.*;
import java.awt.event.*;

/* <applet code="mouseeventsdemo" width=300 height=300>
</applet>*/

public class mouseeventsdemo extends Applet implements MouseListener,MouseMotionListener
{
	String msg="";
	int mouseX=0;
	int mouseY=10;
	
	public void init()
	{
		addMouseListener(this);
		addMouseMotionListener(this);
	}
	public void mouseClicked(MouseEvent me)
	{
		mouseX=0;
		mouseY=10;
		msg="mouse clicked";
		repaint();
	}
	public void mouseEntered(MouseEvent me)
	{
		mouseX=0;
		mouseY=10;
		msg="mouse entered in applet area";
		repaint();
	}
	public void mouseExited(MouseEvent me)
	{
		mouseX=0;
		mouseY=10;
		msg="mouse exited the applet area";
		repaint();
	}
	public void mousePressed(MouseEvent me)
	{
		mouseX=me.getX();
		mouseY=me.getY();
		msg="mouse Pressed";
		repaint();
	}
	public void mouseReleased(MouseEvent me)
	{
		mouseX=me.getX();
		mouseY=me.getY();
		msg="mouse released";
		repaint();
	}
	public void mouseDragged(MouseEvent me)
	{
		mouseX=me.getX();
		mouseY=me.getY();
		msg="*";
		showStatus("Dragging mouse at "+mouseX+","+mouseY);
		repaint();
	}
	public void mouseMoved(MouseEvent me)
	{
		showStatus("Moving mouse at "+me.getX()+","+me.getY());
		repaint();
	}
	public void paint(Graphics g)
	{
		g.drawString(msg,mouseX,mouseY);
	}	
}
