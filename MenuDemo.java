import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/* <APPLET CODE =MenuDemo WIDTH=350 HEIGHT=280>
   </APPLET>
*/

public class MenuDemo extends JApplet implements ActionListener 
{
	public void init()
	{
		JMenuBar jmb=new JMenuBar();

		JMenu jm1=new JMenu("File");

		JMenuItem jmi1=new JMenuItem("New");
		JMenuItem jmi2=new JMenuItem("Open");
		JMenuItem jmi3=new JMenuItem("Exit");

		jm1.add(jmi1);
		jm1.add(jmi2);
		jm1.addSeparator();
		jm1.add(jmi3);

		jmi1.setActionCommand("You Selected New");
		jmi2.setActionCommand("You Selected Open");

		jmi1.addActionListener(this);
		jmi2.addActionListener(this);

		
		JMenu jm2=new JMenu("Edit");

		JMenuItem jmi4=new JMenuItem("cut");
		JMenuItem jmi5=new JMenuItem("copy");
		JMenuItem jmi6=new JMenuItem("paste");

		jm2.add(jmi4);
		jm2.add(jmi5);
		jm2.add(jmi6);

		jmi4.setActionCommand("You Selected cut");
		jmi5.setActionCommand("You Selected copy");
		jmi6.setActionCommand("You Selected paste");

		jmi4.addActionListener(this);
		jmi5.addActionListener(this);
		jmi6.addActionListener(this);

		jmb.add(jm1);
		jmb.add(jm2);
	}
}