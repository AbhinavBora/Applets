import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.applet.Applet;

public class frog extends Applet implements ActionListener
{
    public void init ()
    {
	resize (1000, 704);
	JTextArea TA = new JTextArea (5, 15);
	TA.setBackground (Color.yellow); //change this later, it is just so you can see it's edges
	TA.setText ("A frog gets exercise by jumping around a pond. It jumps from lily pad to lily pad in the\n");
	TA.append ("sequence shown in the picture below. It starts at the lily pad labelled S. It ends on the lily\n");
	TA.append ("pad as shown (i.e., the frog shown has finished jumping). Each black dot marks a lily pad on\n");
	TA.append ("which the frog has landed.\n");
	TA.append ("\n ");
	TA.append ("The legend below labels each of the 8 possible directions of a jump with an integer from 0\n");
	TA.append ("to 7.\n ");
	JLabel pic = new JLabel (createImageIcon ("pic.jpg"));
	JLabel TA2 = new JLabel ("Which sequence describes the frog's path?\n");
	add (TA);
	add (pic);
	add (TA2);
	JButton b1 = new JButton ("4,1,0,0,0,6,6,4,4,2,2,1");
	b1.addActionListener(this);
	b1.setActionCommand("opt1");
	JButton b2 = new JButton ("0,0,6,6,6,4,4,2,2,4,4,1");
	b2.addActionListener(this);
	b2.setActionCommand("opt2");
	JButton b3 = new JButton ("0,0,6,6,6,0,0,2,2,2,2,4,4,4");
	b3.addActionListener(this);
	b3.setActionCommand("opt3");
	JButton b4 = new JButton ("6,6,4,4,4,2,4,1,1,1");
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
    if (e.getActionCommand().equals ("opt2"))
    showStatus ("Correct");
    else
    showStatus ("Incorrect");
    }


    protected static ImageIcon createImageIcon (String path)
    {
	java.net.URL imgURL = frog.class.getResource (path);
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
