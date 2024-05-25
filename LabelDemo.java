import java.awt.*;
import java.applet.*;
import java.awt.event.*;

/*
<applet code="LabelDemo" width=300 height=300>
</applet>
*/

public class LabelDemo extends Applet
{
	public void init()
	{	
		//create obj of label class
		
		Label one=new Label("One");
		Label two=new Label("Two");
		Label three=new Label("Three");
		
		//add label to frame
		add(one);
		add(two);
		add(three);
	}
	
}