import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.applet.Applet;

public class fortune extends Applet implements ActionListener
{

    JLabel text;
    JLabel close;
    public void init ()
    {
    resize (500, 400);
	close = new JLabel (createImageIcon ("cookieClose.jpg"));
	JLabel cookie = new JLabel ("Fortune Cookie");
	cookie.setFont (new Font ("Arial", Font.BOLD, 20));
	text = new JLabel ("Click to Find out your Fortune");
	text.setFont (new Font ("Arial", Font.BOLD, 12));
	JButton find = new JButton ("Find Fortune");
	find.addActionListener (this);
	find.setActionCommand ("opt");
	JButton newf = new JButton ("New Fortune");
	newf.addActionListener (this);
	newf.setActionCommand ("opt2");
	add (cookie);
	add (close);
	add (text);
	add (find);
	add (newf);
    }


    public void actionPerformed (ActionEvent e)
    {
	if (e.getActionCommand ().equals ("opt"))
	{
	close.setIcon (createImageIcon ("cookieOpen.jpg"));
	    int n = (int) ((Math.random () * 10) + 1);
	    if (n == 1)
		text.setText ("You will die soon.");
	    else if (n == 2)
		text.setText ("Your car wil blow up.");
	    else if (n == 3)
		text.setText ("You will win the lottery next Wednesday.");
	    else if (n == 4)
		text.setText ("You will get some new clothes.");
	    else if (n == 5)
		text.setText ("You will find a dollar tomorrow.");
	    else if (n == 6)
		text.setText ("You will ace your next text");
	    else if (n == 7)
		text.setText ("You will get hit by a meteorite");
	    else if (n == 8)
		text.setText ("You will choke on this cookie");
	    else if (n == 9)
		text.setText ("You will win the lottery twice.");
	    else
		text.setText ("You will go on a vacation");
	}
	else
	{
	    close.setIcon (createImageIcon ("cookieClose.jpg"));
	    text.setText ("Click to Find out your Fortune");
	}
    }


    protected static ImageIcon createImageIcon (String path)
    {
	java.net.URL imgURL = dice.class.getResource (path);
	if (imgURL != null)
	{
	    return new ImageIcon (imgURL);
	}
	else
	{
	    System.err.println ("Couldn't find file: " + path);
	    return null;
	}
    }
}


