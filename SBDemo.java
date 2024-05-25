import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class SBDemo extends Applet implements AdjustmentListener,MouseMotionListener
{
	String msg="";
	Scrollbar vertSB,hozSB;

	public void init()
	{
		int width=Integer.parseInt(getParameter("width"));
		int height=Integer.parseInt(getParameter("height"));
		vertSB=new Scrollbar(Scrollbar.VERTICAL,0,1,0,height);
		horzSB=new Scrollbar(Scrollbar.HORIZONTAL,0,1,0,width);
		add(vretSB);
		add(horzSB);
		vertSB.addAdjustmentListener(this);
		horzSB.addAdjustmentListener(this);
		addMouseMOtionListener(this);
	}
	public void adjustmentValueChanged(AdjustmentEvent ae)
	{
		repaint();
	}
	public void mouseDragged(MouseEvent me)
	{
		int X=me.getX();
		int y=me.getY();
		vertSB.setValue(Y);
		horzSB.setValue(X);
		repaint();
	}
	public void mouseMoved(MouseEvent me)
	{
		
	}
	public void paint(Grphics g)
	{
		msg="Vertical:"+vertSB.getValue();
		msg+="Horizontal:"+horzSB.getValue();
		g.drawString(msg,6,160);
		g.drwString("*",horzSB.getValue(),vertSB.getValue());
	}
}