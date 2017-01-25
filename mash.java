import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.applet.Applet;

public class mash extends Applet implements ActionListener
{
    JButton head, mid, feet;
    int h = 1;
    int m = 1;
    int f = 1;
    public void init ()
    {
	JLabel title = new JLabel ("Welcome to the Monster Mash");
	title.setFont (new Font ("Jokerman", Font.BOLD, 20));
	title.setForeground (Color.white);
	head = new JButton (createImageIcon ("head1.jpg"));
	head.setBackground (Color.black);
	head.addActionListener (this);
	head.setActionCommand ("h");
	mid = new JButton (createImageIcon ("mid1.jpg"));
	mid.setBackground (Color.black);
	mid.addActionListener (this);
	mid.setActionCommand ("m");
	feet = new JButton (createImageIcon ("feet1.jpg"));
	feet.setBackground (Color.black);
	feet.addActionListener (this);
	feet.setActionCommand ("f");
	JLabel ins = new JLabel ("         Click on the head, middle or feet to change it.");
	ins.setForeground (Color.white);
	Panel p = new Panel (new GridLayout (5, 1));
	p.setBackground (Color.black);
	p.add (title);
	p.add (head);
	p.add (mid);
	p.add (feet);
	p.add (ins);
	add (p);


    }


    public void actionPerformed (ActionEvent e)
    {
	if (e.getActionCommand ().equals ("h"))
	{
	    h++;
	    if (h == 2)
		head.setIcon (createImageIcon ("head2.jpg"));
	    else if (h == 3)
		head.setIcon (createImageIcon ("head3.jpg"));
	    else if (h == 4)
		head.setIcon (createImageIcon ("head4.jpg"));
	    else if (h == 5)
		head.setIcon (createImageIcon ("head5.jpg"));
	    else
	    {
		head.setIcon (createImageIcon ("head1.jpg"));
		h = 1;
	    }
	}
	else if (e.getActionCommand ().equals ("m"))
	{
	    m++;
	    if (m == 2)
		mid.setIcon (createImageIcon ("mid2.jpg"));
	    else if (m == 3)
		mid.setIcon (createImageIcon ("mid3.jpg"));
	    else if (m == 4)
		mid.setIcon (createImageIcon ("mid4.jpg"));
	    else if (m == 5)
		mid.setIcon (createImageIcon ("mid5.jpg"));
	    else
	    {
		mid.setIcon (createImageIcon ("mid1.jpg"));
		m = 1;
	    }
	}
	else
	    {
		f++;
	if (f == 2)
	    feet.setIcon (createImageIcon ("feet2.jpg"));
	else if (f == 3)
	    feet.setIcon (createImageIcon ("feet3.jpg"));
	else if (f == 4)
	    feet.setIcon (createImageIcon ("feet4.jpg"));
	else if (f == 5)
	    feet.setIcon (createImageIcon ("feet5.jpg"));
	else
	{
	    feet.setIcon (createImageIcon ("feet1.jpg"));
	    f = 1;
	}
    }
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


