import java.awt.*;
import java.applet.*;

/*<applet code="Color1" width=200 height=200>
</applet>*/

public class Color1 extends Applet
{	
	String msg;
	public void init()
	{
		setBackground(Color.red);
		setForeground(Color.white);
		msg="inside init()";
	}
	public void start()
	{
		msg+="inside start()";
	}
	public void paint(Graphics g)
	{
		msg+="inside paint()";
		g.drawString(msg,20,30);	
	}
}