import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.applet.Applet;

public class redb extends Applet implements ActionListener
{
    JButton red;
    JLabel text;
    int a = 1;
    public void init ()
    {
	red = new JButton (createImageIcon ("redButton.jpg"));
	red.addActionListener (this);
	red.setActionCommand ("opt");
	text = new JLabel ("Do not press the red button.");
	text.setPreferredSize (new Dimension (350, 20));

	add (red);
	add (text);
    }


    public void actionPerformed (ActionEvent e)
    {
	
	if (a == 1)
	    text.setText ("*Ahem* Do NOT press the red button.");
	else if (a == 2)
	    text.setText ("Don't do it.");
	else if (a == 3)
	    text.setText ("Seriously.");
	else if (a == 4)
	    text.setText ("Not this again.");
	else if (a == 5)
	    text.setText ("... you pressed it again. Do NOT press the button.");
	else if (a == 6)
	    text.setText ("...this displeases me.");
	else if (a == 7)
	    text.setText ("Quick! What's that behind you.");
	else if (a == 8)
	    text.setText ("All right, press it again. See if I care.");
	else if (a == 9)
	    text.setText ("Again.");
	else if (a == 10)
	    text.setText ("Do it again.");
	else if (a == 11)
	    text.setText ("Click it!");
	else if (a == 12)
	    text.setText ("And again.");
	else if (a == 13)
	    text.setText ("OK, that's enough. You've got your fill.");
	else if (a == 14)
	    text.setText ("I mean it. It's time to stop pressing it.");
	else if (a == 15)
	    text.setText ("You see, this is why we can't be friends.");
	else if (a == 16)
	    text.setText ("You are just too selfish.");
	else if (a == 17)
	    text.setText ("Now you've asked for it. DoNoT pReSs It AgAiN!");
	else if (a == 18)
	    text.setText ("You seem immune to my mind control.");
	else if (a == 19)
	    text.setText ("Time for plan B. Press it. You know you want to.");
	else if (a == 20)
	    text.setText ("See that was reverse psychology! Oh wait, it didn't work.");
	else if (a == 21)
	    text.setText ("Really? aren't you getting bored yet?");
	else
	{
	    text.setText ("Don't you have anything else to do?");
	    a = 0;
	}
	a++;
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


