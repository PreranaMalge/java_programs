import java.awt.*;
import java.applet.*;
import java.awt.event.*;

/*
<applet code="ButtonDemo" width=300 height=300>
</applet>
*/

public class ButtonDemo extends Applet implements ActionListener 
{	
	String msg ="";
	Button yes,no,maybe;
	
	public void init()
	{
		yes=new Button ("yes");
		no=new Button ("no");
		maybe=new Button ("undecided ");
		
		add(yes);
		add(no);
		add(maybe);
	
		yes.addActionListener(this);
		no.addActionListener(this);
	        maybe.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent  ae)
	{
		String str=ae.getActionCommand();
		if(str.equals("yes"))
		msg="you pressed yes";
		else if(str.equals("no"))
		msg="you pressed no";
		else 
		msg="you pressed undecided";
		repaint();
	}
	public void paint(Graphics g)
	{
		g.drawString(msg ,6,100);
	}
}
