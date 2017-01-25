import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.applet.Applet;

public class friends extends Applet implements ActionListener
{
    public void init ()
    {
	resize (1000, 704);
       
	JLabel pic = new JLabel (createImageIcon ("pic2.jpg"));
	add (pic);
	
	JButton b1 = new JButton ("Dana, Michael, Eve");
	b1.addActionListener(this);
	b1.setActionCommand("opt1");
	JButton b2 = new JButton ("Dana, Eve, Monica");
	b2.addActionListener(this);
	b2.setActionCommand("opt2");
	JButton b3 = new JButton ("Michael, Eve, Jacob");
	b3.addActionListener(this);
	b3.setActionCommand("opt3");
	JButton b4 = new JButton ("Michael, Peter, Monica");
	b4.addActionListener(this);
	b4.setActionCommand("opt4");
	Panel p = new Panel (new GridLayout (4, 1));
	p.add (b1);
	p.add (b2);
	p.add (b3);
	p.add (b4);
	add (p);
    }


    public void actionPerformed (ActionEvent e)
    {
    if (e.getActionCommand().equals ("opt1"))
    showStatus ("Correct");
    else
    showStatus ("Incorrect");
    }


    protected static ImageIcon createImageIcon (String path)
    {
	java.net.URL imgURL = friends.class.getResource (path);
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
