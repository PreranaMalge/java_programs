import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class SBDemo1 extends Applet implements AdjustmentListener,MouseMotionListener
{
	String msg="";
	Scrollbar vertSB,horzSB;

	public void init()
	{
		int width=Integer.parseInt(getParameter("width"));
		int height=Integer.parseInt(getParameter("height"));
		vertSB=new Scrollbar(Scrollbar.VERTICAL,0,1,0,height);
		horzSB=new Scrollbar(Scrollbar.HORIZONTAL,0,1,0,width);
		add(vertSB);
		add(horzSB);
		vertSB.addAdjustmentListener(this);
		horzSB.addAdjustmentListener(this);
		addMouseMotionListener(this);
	}
	public void adjustmentValueChanged(AdjustmentEvent ae)
	{
		repaint();
	}
	public void mouseDragged(MouseEvent me)
	{
		int x=me.getX();
		int y=me.getY();
		vertSB.setValue(y);
		horzSB.setValue(x);
		repaint();
	}
	public void mouseMoved(MouseEvent me)
	{
		
	}
	public void paint(Graphics g)
	{
		msg="Vertical:"+vertSB.getValue();
		msg+="Horizontal:"+horzSB.getValue();
		g.drawString(msg,6,160);
		g.drawString("*",horzSB.getValue(),vertSB.getValue());
	}
}