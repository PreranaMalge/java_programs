import java.awt.*;
import java.applet.*;

/*<applet code="PassParam" width=200 height=200>
<param name="msg" value="welcome">
</applet>*/

public class PassParam extends Applet
{
	String str;
	public void init()
	{
		str=getParameter("msg");
	}
	public void paint(Graphics g)
	{
		g.drawString(str,10,20);
	}
}