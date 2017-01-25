import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.applet.Applet;

public class hidden extends Applet implements ActionListener
{
    public void init ()
    {
	resize (415, 495);
	JLabel hp = new JLabel ("Hidden Pictures");
	hp.setFont (new Font ("Jokerman", Font.BOLD, 20));
	hp.setForeground (Color.blue);
	JLabel find = new JLabel ("See if you can find the hidden picture!");
	find.setFont (new Font ("Arial", Font.ITALIC, 14));
	JLabel enter = new JLabel ("Enter the letter and number of the box where you find it");
	JLabel pic = new JLabel (createImageIcon ("hiddenPicGrid.jpg"));
	JLabel pic2 = new JLabel (createImageIcon ("hiddenPicSock.jpg"));

	JLabel letter = new JLabel ("Letter: ");
	JLabel num = new JLabel ("Number: ");
	JTextField ltbox = new JTextField (3);
	JTextField numbox = new JTextField (3);
	JButton foundit = new JButton ("I Found It!");
	foundit.setForeground (Color.white);
	foundit.setBackground (Color.blue);

	add (hp);
	add (find);
	add (enter);
	add (pic);
	add (pic2);
	add (letter);
	add (ltbox);
	add (num);
	add (numbox);
	add (foundit);
    }


    public void actionPerformed (ActionEvent e)
    {
    }


    protected static ImageIcon createImageIcon (String path)
    {
	java.net.URL imgURL = hidden.class.getResource (path);
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

