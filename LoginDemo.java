import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class LoginDemo extends JFrame implements ActionListener 
{
	JLabel userLabel,passwordLabel;
	JTextField userField;
	JPasswordField passwordField;
	JButton okButton,cancelButton;
	Container c;
	static int attempt;

	public LoginDemo()
	{
		userLabel=new JLabel("UserName:",JLabel.RIGHT);
		passwordLabel=new JLabel("Password:",JLabel.RIGHT);
		userField=new JTextField(20);
		passwordField=new JPasswordField(20);
		okButton=new JButton("OK");
		cancelButton=new JButton ("Cancel");
		okButton.addActionListener(this);
		cancelButton.addActionListener(this);
		userLabel.setDisplayedMnemonic("U");
		passwordLabel.setDisplayedMnemonic("P");
		userLabel.setLabelFor(userField);
		passwordLabel.setLabelFor(passwordField);
		c.getContentPane();
		c.setLayout(new gridLayout(3,2));
		c.add(userLabel);
		c.add(userField);
		c.add(passwordLabel);
		c.add(passwordField);
		c.add(okButton);
		c.add(cancelButton);

		setTitle("Login");
		setSize(150,100);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String args[])
	{
		new LoginDemo();
	}

	public void actionPerformed(ActionEvent ae)	
	{
		String cmd=ae.getActionCommand();

		if(cmd.compareTo("OK")==O)
		{
			String user=userField.getText();
			String pass=new String(passwordField.getPassword());
			if(user.compareTo("sybcs")==O && pass.compareTo			                        	("sy1")==O)||
				(user.compareTo("tybcs")==O && pass.compareTo						("ty1")==O)||
				(user.compareTo("admin")==O && pass.compareTo						("super")==O))
				{
				    				new MenuDemo();
					JOptionPane.showMessageDialog(null,"Login 						Successful");
					//System.exit(O);	
				}

			else 
			{
				JOptionPane.showMessageDialog(null,"Login 						Failed");
				userField.setText("");
				passwordField.setText("");
				attempt++;
				if(attempt==3)
				{
					JOptionPane.showMessageDialog(null,"3 							attempts over");
					System.exit(O);	
				}
			}	
		}
	
		if(cmd.compareTo("Cancel")==O)
		{
			System.exit(O);		
		}
	}
}

