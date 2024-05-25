import java.awt.*;
import java.applet.*;

/*<applet code="Student" width=200 height=200>
<param name="fname" value="prerana">
<param name="lname" value="malge">
<param name="clg" value="hrm">
<param name="std" value="tybcs">
<param name="div" value="A">
</applet>*/

public class Student extends Applet
{
	String str1,str2,str3,str4,str5;
	
	public void init()
	{
		str1=getParameter("fname");
		str2=getParameter("lname");
		str3=getParameter("clg");
		str4=getParameter("std");
		str5=getParameter("div");
	}
	public void paint(Graphics g)
	{
		g.drawString(str1,10,20);
		g.drawString(str2,10,30);
		g.drawString(str3,10,40);
		g.drawString(str4,10,50);
		g.drawString(str5,10,60);
	}
}