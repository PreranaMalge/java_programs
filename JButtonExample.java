import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class JButtonExample extends JFrame implements ActionListener
{
	private JButton plainButton,fancyButton;
	
	public JButtonExample()
	{
		super("Testing buttons");
		Container container=getContentPane();
		container.setLayout(new FlowLayout());
		plainButton=new JButton("plainButton");
		container.add(plainButton);
		Icon bug1=new ImageIcon("frog.gif");
		Icon bug2=new ImageIcon("fish1.gif");

		fancyButton=new JButton("fancyButtton",bug1);
		fancyButton.setRolloverIcon(bug2);
		container.add(fancyButton);
		
		fancyButton.addActionListener(this);
		plainButton.addActionListener(this);

		setSize(275,100);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String args[])
	{
		new JButtonExample();
	}	
	public void actionPerformed(ActionEvent ae)
	{
		JOptionPane.showMessageDialog(null,"You 		pressed:"+ae.getActionCommand());
	
	}
}