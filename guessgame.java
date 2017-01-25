import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.applet.Applet;

public class guessgame extends Applet implements ActionListener
{
    int s = (int) ((Math.random () * 100) + 1);
    int g;
    JLabel text;
    JTextField gsbox;
    JLabel text2;
    public void init ()
    {
	resize (250, 400);
	JLabel gg = new JLabel ("The Guessing Game");
	gg.setFont (new Font ("Jokerman", Font.BOLD, 20));
	gg.setForeground (Color.red);
	JLabel num = new JLabel ("The number is between 1 and 100.");
	JLabel yg = new JLabel ("Your Guess: ");
	text = new JLabel ("Type in a number and press guess.");
	text2 = new JLabel ("You have taken 0 guesses so far.");
	gsbox = new JTextField (3);
	JButton guessb = new JButton ("Guess");
	guessb.setForeground (Color.white);
	guessb.setBackground (Color.lightGray);
	guessb.addActionListener (this);
	guessb.setActionCommand ("opt");
	JLabel pic = new JLabel (createImageIcon ("guessingPic.jpg"));

	add (gg);
	add (num);
	add (pic);
	add (yg);
	add (gsbox);
	add (guessb);
	add (text);
	add (text2);
    }


    public void actionPerformed (ActionEvent e)
    {
	int input = Integer.parseInt (gsbox.getText ());
	if (input > s)
	{
	    text.setText ("Too High");
	    g++;
	    text2.setText ("You have taken "+g+" guesses so far.");
	}
	else if (input < s)
	{
	    text.setText ("Too Low");
	    g++;
	    text2.setText ("You have taken "+g+" guesses so far.");
	}
	else
	{
	    text.setText ("Right!, the number has been reset.");
	    text2.setText ("You took "+g+" guesses.");
	    s = (int) ((Math.random () * 100) + 1);
	    g = 0;
	}
    }


    protected static ImageIcon createImageIcon (String path)
    {
	java.net.URL imgURL = guess.class.getResource (path);
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

