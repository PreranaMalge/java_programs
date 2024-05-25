import java.awt.*;
import java.applet.*;
public class Simple1 extends Applet
{
	String str;
	public void init()
	{
		str=getParameter("prerana");
	}
	public void paint(Graphics g)
	{
		g.drawString(str,10,20);
	}
}