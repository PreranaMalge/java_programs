import java.awt.*;
import java.applet.*;
import java.awt.event.*;

/*
<applet code="CBGroup" width=300 height=300>
</applet>
*/

public class CBGroup extends Applet implements ItemListener 
{	
	String msg ="";
	Checkbox win98,winNT,solaris,mac;
	CheckboxGroup cbg;

	public void init()
	{
		cbg=new CheckboxGroup();
		win98=new Checkbox("windows 98",cbg,true);
		winNT=new Checkbox("windows NT",cbg,false);
		solaris=new Checkbox("solaris",cbg,false);
		mac =new Checkbox("macos",cbg,false);

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
		msg="current selection:";
		msg+=cbg.getSelectedCheckbox().getLabel();
		g.drawString(msg,6,120);	
	}
}