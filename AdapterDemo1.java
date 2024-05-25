import java.awt.*;
import java.applet.*;
import java.awt.event.*;

/*
<applet code="AdapterDemo1" width=300 height=300>
</applet>
*/

public class AdapterDemo1 extends Applet
{
	public void init()
	{
		addMouseListener(new MouseAdapter()
	        {
			public void mouseClicked(MouseEvent me)
			{
				showStatus("mouse clicked");
			}
		}
		);
	}
}