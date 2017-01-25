import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.applet.Applet;

public class dice extends Applet implements ActionListener
{
    JLabel dice;
    public void init ()
    {
	resize (409, 154);
	JLabel roll = new JLabel ("Click to Roll the Dice");
	roll.setFont (new Font ("Ravie", Font.ITALIC, 20));
	roll.setForeground (Color.red);
	dice = new JLabel (createImageIcon ("dice1.gif"));
	JButton rollb = new JButton ("Roll");
	rollb.addActionListener (this);
	rollb.setActionCommand ("opt");

	add (roll);
	add (dice);
	add (rollb);
    }

    public void actionPerformed (ActionEvent e)
    {
	int n = (int) ((Math.random () * 6) + 1);
	showStatus ("You rolled a " + n + ".");
      
	    dice.setIcon (createImageIcon ("dice"+n+".gif"));
      
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








