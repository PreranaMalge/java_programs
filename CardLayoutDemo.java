import java.awt.*;
import java.awt.event.*;
import java.applet.*;

/*<applet code="CardLayoutDemo" width =300 height=300> </applet>*/

public class CardLayoutDemo extends Applet implements ActionListener,MouseListener
{
	Checkbox win98,winNT,solaris,mac;
	Panel osCards;
	CardLayout cardLO;
	Button win,Other;
	
	public void init()
	{
		win=new Button("windows");
		Other=new Button("Other");
		add(win);
		add(Other);
		
		cardLO=new CardLayout();
		osCards=new Panel();
		osCards.setLayut(cardLO);

		win98=new Checkbox("windows 98",null,true);
		winNT=new Checkbox ("windows NT");
		solaris=new Checkbox("Solaris");
		mac=new Checkbox("Macos");
	
		Panel otherpan=new Panel();
		otherpan.add(solaris);
		otherpan.add(mac);
		
		Panel winpan=new Panel();
		winpan.add(win98);
		winpan.add(winNT);
		
		osCards.add(winpan,"windows");
		osCards.add(otherpan,"Other");
		add(osCards);

		win.addActionistener(this);
		Other.addActionistener(this);
		addMouseListener(this);
	}
	public void mousePressed(MouseEvent me)
	{cardLO.next(osCards);}

	public void mouseClicked(MouseEvent me) {}
	public void mouseEntered(MouseEvent me) {}
	public void mouseExited(MouseEvent me) {}
	public void mouseReleased(MouseEvent me) {}
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource() ==win)
		cardLO.show(osCards,"windows");
		else 
		cardLO.show(osCards,"Other");
	}

}
