import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.applet.Applet;

public class practiceifs extends Applet implements ActionListener
{
    JLabel digits;
    JLabel pricecop;
    JLabel evaluate;
    JTextField twod;
    JTextField copies;
    JTextField model;
    public void init ()
    {
	resize (200, 250);
	Panel p = new Panel ();
	JLabel num = new JLabel ("Enter a Number less than 100:");
	twod = new JTextField (3);
	JButton check = new JButton ("Check Number");
	check.addActionListener (this);
	check.setActionCommand ("opt");
	digits = new JLabel ("How many digits?                 ");
	JLabel numcop = new JLabel ("Enter the number of copies:");
	copies = new JTextField (3);
	JButton price = new JButton ("Price");
	price.addActionListener (this);
	price.setActionCommand ("opt2");
	pricecop = new JLabel ("Price per Copy?               ");
	JLabel nummodel = new JLabel ("Enter your model number:");
	model = new JTextField (3);
	JButton eval = new JButton ("Evaluate");
	eval.addActionListener (this);
	eval.setActionCommand ("opt3");
	evaluate = new JLabel ("Is it defective?               ");
	p.add (num);
	p.add (twod);
	add(p);
	add (check);
	add (digits);
	add (numcop);
	add (copies);
	add (price);
	add (pricecop);
	add (nummodel);
	add (model);
	add (eval);
	add (evaluate);
    }


    public void actionPerformed (ActionEvent e)
    {
	
	
	
	if (e.getActionCommand ().equals ("opt"))
	{int input1 = Integer.parseInt (twod.getText ());
	    if (input1 > 9)
		digits.setText ("This number has 2 digits.");
	    else
		digits.setText ("This number has 1 digit.");
	}
	else if (e.getActionCommand ().equals ("opt2"))
	{
	int input2 = Integer.parseInt (copies.getText ());
	    if (input2 <= 0)
		pricecop.setText ("Please enter a valid number of copies.");
	    else if (input2 <= 499)
		pricecop.setText ("The price per copy is $0.30");
	    else if (input2 <= 749)
		pricecop.setText ("The price per copy is $0.28");
	    else if (input2 <= 999)
		pricecop.setText ("The price per copy is $0.27");
	    else
		pricecop.setText ("The price per copy is $0.25");
	}
	else
	{
	int input3 = Integer.parseInt (model.getText ());
	    if (input3 == 119 || input3 == 179 || (input3 >= 189 && input3 <= 195) || input3 == 221 || input3 == 278)
		evaluate.setText ("Your car is defective.");
	    else
		evaluate.setText ("Your car is fine.");
	}


    }
}

