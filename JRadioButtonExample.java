import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class JRadioButtonExample extends JFrame implements ItemListener
{
	private JTextField field;
	private Font plainFont,boldFont,italicFont,boldItalicFont;
	private JRadioButton plainButton,boldButton,italicButton,boldItalicButton; 
	private ButtonGroup radioGroup;
	
	public JRadioButtonExample()
	{
		plainFont=new Font("Serif",Font.PLAIN,14);
		boldFont=new Font("Serif",Font.BOLD,14);
		italicFont=new Font("Serif",Font.ITALIC,14);
		boldItalicFont=new Font("Serif",Font.BOLD+Font.ITALIC,14);	
		
		field=new JTextField("Watch the font style change",25);
		plainButton=new JRadioButton("Plain",true);
		boldButton=new JRadioButton("Bold",false);
		italicButton=new JRadioButton("Italic",false);
		boldItalicButton=new JRadioButton("Bold/Italic",false);
		radioGroup=new ButtonGroup();

		Container container=getContentPane();
		container.setLayout(new FlowLayout());
		container.add(field);
		container.add(plainButton);
		container.add(boldButton);
		container.add(italicButton);
		container.add(boldItalicButton);

		
		plainButton.addItemListener(this);
		boldButton.addItemListener(this);
		italicButton.addItemListener(this);
		boldItalicButton.addItemListener(this);

		public static void main(String args[])
		{
			new JRadioButtonExample();
		}
		
		public void itemStateChanged(ItemEvent ie)
		{
			if(ie.getSource()==plainButton)
				field.setFont(plainFont);
			else if(ie.getSource()==boldButton)
				field.setFont(boldFont);
			else if(ie.getSource()==italicButton)
				field.setFont(italicFont);
			else if(ie.getSource()==bolditalicButton)
				field.setFont(bolditalicFont);
		}
		

	}
