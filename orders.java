import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.applet.Applet;

public class orders extends Applet implements ActionListener
{
    public void init ()
    {
	JLabel order = new JLabel ("Order Form");
	order.setFont (new Font ("Ravie", Font.ITALIC, 20));
	JLabel prc1 = new JLabel ("Fries @ $1.50 each ");
	JLabel prc2 = new JLabel ("Burgers @ $3.50 each ");
	JLabel prc3 = new JLabel ("Sodas @ $1.00 each ");
	JTextField many = new JTextField (3);
	JTextField many1 = new JTextField (3);
	JTextField many2 = new JTextField (3);
	JButton now = new JButton ("Order Now");
	now.setForeground (Color.black);
	now.setBackground (Color.lightGray);

	add (order);
	add (prc1);
	add (many);
	add (prc2);
	add (many1);
	add (prc3);
	add (many2);
	add (now);
    }

    public void actionPerformed (ActionEvent e)
    {
    }
}







