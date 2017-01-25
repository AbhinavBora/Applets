import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.applet.Applet;

public class pizza extends Applet implements ActionListener
{
    JCheckBox mushrooms, pepperoni, cheese, pineapple;
    protected final static String Regular = "Regular";
    protected final static String Large = "Large";
    ButtonGroup bg1 = new ButtonGroup ();
    JLabel total;
    double cost = 0;
    int timem = 0, timep = 0, timec = 0, timepa = 0, timereg = 0, timelg = 0;

    public void init ()
    {
	resize (380, 470);
	JLabel title = new JLabel ("Perfect Pizza Maker");
	title.setFont (new Font ("Jokerman", Font.BOLD, 29));
	title.setForeground (Color.pink);
	JLabel ins = new JLabel ("Select toppings: ");
	mushrooms = new JCheckBox ("Mushrooms");
	mushrooms.setActionCommand ("m");
	mushrooms.addActionListener (this);
	pepperoni = new JCheckBox ("Pepperoni");
	pepperoni.setActionCommand ("p");
	pepperoni.addActionListener (this);
	cheese = new JCheckBox ("Cheese");
	cheese.setActionCommand ("c");
	cheese.addActionListener (this);
	pineapple = new JCheckBox ("Pineapple");
	pineapple.setActionCommand ("pa");
	pineapple.addActionListener (this);
	Panel p = new Panel (new GridLayout (2, 2));
	p.add (mushrooms);
	p.add (pepperoni);
	p.add (cheese);
	p.add (pineapple);
	JLabel size = new JLabel ("Select size:          ");
	JRadioButton reg = new JRadioButton ();
	reg.setText (Regular);
	reg.setActionCommand ("r");
	reg.addActionListener (this);
	reg.setSelected (true);
	bg1.add (reg);
	JRadioButton lg = new JRadioButton ();
	lg.setText (Large);
	lg.setActionCommand ("l");
	lg.addActionListener (this);
	bg1.add (lg);
	total = new JLabel ("Total: $0.00");
	total.setForeground (Color.red);
	JButton reset = new JButton ("Next Customer - Reset");
	reset.addActionListener (this);
	reset.setActionCommand ("reset");
	Panel p2 = new Panel (new GridLayout (1, 2));
	p2.add (total);
	p2.add (reset);
	add (title);
	add (ins);
	add (p);
	add (size);
	add (reg);
	add (lg);
	add (p2);
    }


    public void actionPerformed (ActionEvent e)
    {
	if (e.getActionCommand ().equals ("m") && timem < 1)
	{
	    cost += 0.50;
	    timem++;
	}
	else if (e.getActionCommand ().equals ("m") && timem > 0)
	{
	cost -= 0.50;
	timem = 0;
	}
	else if (e.getActionCommand ().equals ("p") && timep < 1)
	{
	    cost += 1.00;
	    timep++;
	}
	else if (e.getActionCommand ().equals ("p") && timep > 0)
	{
	cost -= 1.00;
	timep = 0;
	}
	else if (e.getActionCommand ().equals ("c") && timec < 1)
	{
	    cost += 0.50;
	    timec++;
	}
	else if (e.getActionCommand ().equals ("c") && timec > 0)
	{
	cost -= 0.50;
	timec = 0;
	}
	else if (e.getActionCommand ().equals ("pa") && timepa < 1)
	{
	    cost += 2.00;
	    timepa++;
	}
	else if (e.getActionCommand ().equals ("pa") && timepa > 0)
	{
	cost -= 2.00;
	timepa = 0;
	}
	else if (e.getActionCommand ().equals ("r") && timereg < 1 && timelg < 1)
	{
	    cost += 5.00;
	    timereg++;
	}
	else if (e.getActionCommand ().equals ("r") && timereg > 0)
	{
	cost -= 5.00;
	timereg = 0;
	}
	else if (e.getActionCommand ().equals ("l") && timelg < 1 && timereg < 1)
	{
	    cost += 8.00;
	    timelg++;
	}
	else if (e.getActionCommand ().equals ("l") && timelg > 0)
	{
	cost -= 8.00;
	timelg = 0;
	}
	else
	{
	    cost = 0;
	    mushrooms.setSelected (false);
	    pepperoni.setSelected (false);
	    cheese.setSelected (false);
	    pineapple.setSelected (false);
	    timem = 0;
	    timep = 0;
	    timec = 0;
	    timepa = 0;
	    timereg = 0;
	    timelg = 0;
	}
	total.setText ("Total: $" + cost);

    }
}
