import java.awt.*;
import java.applet.*;

/*<applet code="Disp" width=20 height=20 >
</applet>*/
public class Disp extends Applet
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
		g.drawString(msg,10,30);
	}

}