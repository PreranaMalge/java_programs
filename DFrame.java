import java.awt.*;
import java.awt.event.*;

public class DFrame extends Frame implements ActionListener  
{
	DFrame()
	{
	Label l1,l2,l3;
	TextField t1,t2;
	Button b1;
	
	l1=new Label("My Frame",Label.CENTER);
	l2=new Label("First");
	l3=new Label("Second");
	t1=new TextField();
	t2=new TextField();
	b1=new Button("OK");
	
	setLayout(null);
	l1.setBounds(50,50,200,20);
	l2.setBounds(50,80,100,20);
	t1.setBounds(150,80,100,20);
	l3.setBounds(50,130,100,20);
	t2.setBounds(150,130,100,20);
	b1.setBounds(80,180,100,20);
	
	add(l1);
	add(l2);
	add(t1);
	add(l3);
	add(t2);
	add(b1);
	b1.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae)
	{
		 String temp=t1.getText();
		t1.setText(t2.getText());
		t2.setText(temp);
		
	}
}

	
public static void main(String args[])
	{
	DFrame fd=new DFrame();
	fd.setTitle("My Frame");
	fd.setVisible(true);
	fd.setSize(300,300);
	
	}
}
