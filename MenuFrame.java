import java.awt.*;
import java.awt.event.*;

public class MenuFrame extends Frame implements ActionListener,ItemListener
{
	TextArea ta;
	public MenuFrame()
	{
		ta=new TextArea(10,20);
		MenuBar mb=new MenuBar();
		setMenuBar(mb);
		Menu a=new Menu("A");
		mb.add(a);
		
		MenuItem a1=new MenuItem("A1");
		MenuItem a2=new MenuItem("A2");
		MenuItem a3=new MenuItem("A3");

		a.add(a1);
		a.add(a2);
		a.add(a3);

		a1.addActionListener(this);
		a2.addActionListener(this);
		a3.addActionListener(this);

		Menu b=new Menu("B");
		mb.add(b);
		
		MenuItem b1=new MenuItem("B1");
		MenuItem b2=new MenuItem("B2");
		Menu b3=new Menu("B3");

		b.add(b1);
		b.add(b2);
		b.add(b3);

		b1.addActionListener(this);
		b2.addActionListener(this);
		
		MenuItem b31=new MenuItem("B31");
		MenuItem b32=new MenuItem("B32");
		MenuItem b33=new MenuItem("B33");

		b3.add(b31);
		b3.add(b32);
		b3.add(b33);
	
		b31.addActionListener(this);
		b32.addActionListener(this);
		b33.addActionListener(this);

		Menu c=new Menu("C");
		mb.add(c);

		CheckboxMenuItem c1=new CheckboxMenuItem("c1");
		CheckboxMenuItem c2=new CheckboxMenuItem("c2");

		c.add(c1);
		c.add(c2);

		c1.addItemListener(this);
		c2.addItemListener(this);

		setLayout(new FlowLayout());
		setVisible(true);
		setSize(200,200);
		add(ta);
		show();
	}
	public void actionPerformed(ActionEvent ae)
	{
		ta.append("ActionEvent:"+ae.getActionCommand()+"\n");
	}
	public void itemStateChanged(ItemEvent ie)
	{
		CheckboxMenuItem cbmi=(CheckboxMenuItem)ie.getSource();
		ta.append("ItemEvent:"+cbmi.getLabel()+"\n");
	}
	public static void main(String args[])
	{
		new MenuFrame();
	}
}