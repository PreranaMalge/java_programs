import java.awt.*;
import java.applet.*;
import java.awt.event.*;

/*
<applet code="CheckBoxDemo" width=300 height=300>
</applet>
*/

public class CheckBoxDemo extends Applet implements ItemListener 
{	
	String msg ="";
	Checkbox win98,winNT,solaris,mac;

	public void init()
	{
		win98=new Checkbox("windows 98",null,true);
		winNT=new Checkbox("windows NT");
		solaris=new Checkbox("solaris");
		mac =new Checkbox("macos");

		add(win98);
		add(winNT);
		add(solaris);
		add(mac);
		
		win98.addItemListener(this);
		winNT.addItemListener(this);
		solaris.addItemListener(this);
		mac.addItemListener(this);
	}
	public void itemStateChanged(ItemEvent ie)
	{
		repaint();
	}
	public void paint(Graphics g)
	{
		msg="current state:";
		g.drawString(msg,6,100);
		msg="windows 98:"+win98.getState();
		g.drawString(msg,6,120);
		msg="windows NT:"+winNT.getState();
		g.drawString(msg,6,140);
		msg="solaris :"+solaris.getState();
		g.drawString(msg,6,160);
		msg="macos :"+mac.getState();
		g.drawString(msg,6,180);
		
	}
}