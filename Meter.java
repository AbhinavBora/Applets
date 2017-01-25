import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.applet.Applet;

public class Meter extends Applet implements ActionListener
{
    Panel p_card; //to hold all of the screens
    Panel card1, card2, card3; //the screens
    CardLayout cdLayout = new CardLayout ();
    JLabel per;

    public void init ()
    {
	p_card = new Panel ();
	p_card.setLayout (cdLayout);
	screen1 ();
	screen2 ();
	screen3 ();
	resize (500, 380);
	setLayout (new BorderLayout ());
	add ("Center", p_card);
    }


    public void screen1 ()
    { //screen 1 is set up.
	card1 = new Panel ();
	card1.setBackground (Color.white);
	JButton next = new JButton (createImageIcon ("meter1.jpg"));
	next.setBackground (Color.white);
	next.setActionCommand ("2");
	next.addActionListener (this);
	card1.add (next);
	p_card.add ("1", card1);
    }


    public void screen2 ()
    { //screen 2 is set up.
	card2 = new Panel ();
	card2.setBackground (Color.pink);
	JLabel ins = new JLabel ("Enter her and his names and dates of birth                              ");
	Panel p1 = new Panel (new GridLayout (2, 2));
	JLabel male = new JLabel ("Male:");
	JTextField m = new JTextField (6);
	JTextField md = new JTextField (8);
	JLabel female = new JLabel ("Female:");
	JTextField f = new JTextField (6);
	JTextField fd = new JTextField (8);
	p1.add (male);
	p1.add (m);
	p1.add (md);
	p1.add (female);
	p1.add (f);
	p1.add (fd);
	JLabel space = new JLabel ("                ");
	JButton ent = new JButton (createImageIcon ("meter2.jpg"));
	ent.setBackground (Color.pink);
	ent.setActionCommand ("3");
	ent.addActionListener (this);
	card2.add (ins);
	card2.add (p1);
	card2.add (space);
	card2.add (ent);
	p_card.add ("2", card2);
    }


    public void screen3 ()
    { //screen 3 is set up.
	card3 = new Panel ();
	card3.setBackground (Color.white);
	JLabel pic = new JLabel (createImageIcon ("meter3.jpg"));
	JButton res = new JButton (createImageIcon ("meter4.jpg"));
	res.setBackground (Color.white);
	res.setActionCommand ("1");
	res.addActionListener (this);
	int n = (int) (Math.random () * 100 + 1);
	per = new JLabel (n + "% in love");
	Panel p2 = new Panel (new GridLayout (2, 1));
	p2.add (pic);
	p2.add (res);
	card3.add (p2);
	card3.add (per);
	p_card.add ("3", card3);
    }


    //****************** Add in the other screens here ******************


    public void actionPerformed (ActionEvent e)
    { //moves between the screens
	if (e.getActionCommand ().equals ("1"))
	    cdLayout.show (p_card, "1");
	else if (e.getActionCommand ().equals ("2"))
	    cdLayout.show (p_card, "2");
	else
	{
	    int n = (int) (Math.random () * 100 + 1);
	    per.setText (n + "% in love");
	    cdLayout.show (p_card, "3");
	}
    }


    protected static ImageIcon createImageIcon (String path)
    {
	java.net.URL imgURL = Meter.class.getResource (path);
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

