import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class JLabelTest extends JFrame
{
	private JLabel label1,label2,label3;
	public JLabelTest()
	{
		super("Testing JLabel");
		Container container=getContentPane();
		container.setLayout(new FlowLayout());
		label1=new JLabel("Label with text");
		label1.setToolTipText("This is label1");
		container.add(label1);

		Icon bug=new ImageIcon("fish.jpg");
		label2=new JLabel("Label with text and                 icon",bug,SwingConstants.LEFT);
		label1.setToolTipText("This is label2");
		container.add(label2);
	
		label3=new JLabel();
		label3.setText("label with icon and text at bottom");
		label3.setIcon(bug);
		label3.setHorizontalTextPosition(SwingConstants.CENTER);
		label3.setVerticalTextPosition(SwingConstants.BOTTOM);
		label3.setToolTipText("This is label3");
		container.add(label3);
	
		setSize(275,170);
		setVisible(true);
	}
	public static void main(String args[])
	{
		JLabelTest application=new JLabelTest();
		application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
	}	
}