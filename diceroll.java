import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.applet.Applet;

public class diceroll extends Applet implements ActionListener
{
    JLabel picture;
    public void init ()
    {
	resize (409, 154);
	JLabel roll = new JLabel ("Click to Roll the Dice");
	roll.setFont (new Font ("Ravie", Font.ITALIC, 20));
	roll.setForeground (Color.red);
	picture = new JLabel (createImageIcon ("dice1.jpg"));
	JButton rollb = new JButton ("Roll");

	add (roll);
	add (picture);
	add (rollb);
    }

    public void actionPerformed (ActionEvent e)
    {
	int n = (int) ((Math.random () * 6) + 1);
	showStatus ("You rolled a " + n + ".");
	if (n == 1)
	    picture.setIcon (createImageIcon ("dice1.jpg"));
	else if (n == 2)
	    picture.setIcon (createImageIcon ("dice2.jpg"));
	else if (n == 3)
	    picture.setIcon (createImageIcon ("dice3.jpg"));
	else if (n == 4)
	    picture.setIcon (createImageIcon ("dice4.jpg"));
	else if (n == 5)
	    picture.setIcon (createImageIcon ("dice5.jpg"));
	else
	    picture.setIcon (createImageIcon ("dice6.jpg"));

    }


    protected static ImageIcon createImageIcon (String path)
    {
	java.net.URL imgURL = diceroll.class.getResource (path);
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








