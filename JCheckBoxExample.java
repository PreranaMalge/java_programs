import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class JCheckBoxExample extends JFrame implements ItemListener
{
	private JTextField field;
	private JCheckBox bold,italic;
	
	public JCheckBoxExample()
	{
		field=new JTextField("Watch the font style change",20);
		field.setFont(new Font("Serif",Font.PLAIN,14));
		bold=new JCheckBox("Bold");
		italic=new JCheckBox("Italic");
		bold.addItemListener(this);
		italic.addItemListener(this);

		Container container=getContentPane();
		container.setLayout(new FlowLayout());
		container.add(field);
		container.add(bold);
		container.add(italic);

		setTitle("JCheckBoxExample");
		setSize(275,100);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String args[])
	{
		new JCheckBoxExample();
	}
	private int valBold=Font.PLAIN;
	private int valItalic=Font.PLAIN;
	
	public void itemStateChanged(ItemEvent ie)
	{
		if(ie.getSource()==bold)
			if(ie.getStateChanged()==ItemEvent.SELECTED)
				valBold=Font.BOLD;
		else
			valBold=Font.PLAIN;

		if(ie.getSource()==italic)
			if(ie.getStateChanged()==ItemEvent.SELECTED)
				valItalic=Font.ITALIC;
		else
			valBold=Font.PLAIN;
								JCheckBox cb=(JCheckBox)ie.getItem();
								field.setText("u selected"+cb.getText());
	field.setFont(new Font("Serif",valBold+ valItalic,14));
	}
}