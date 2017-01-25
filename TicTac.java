import javax.swing.*;
import java.applet.*;
import java.awt.*;
import java.awt.event.*;
public class TicTac extends Applet implements ActionListener
{
    String turn = "X";
    JButton b11, b12, b13, b21, b22, b23, b31, b32, b33;
    int xWins = 0;
    int oWins = 0;
    JLabel score;
    public void init ()
    {
	setBackground (Color.black);
	Panel p = new Panel (new GridLayout (3, 3));
	b11 = new JButton ("__");
	b11.setActionCommand ("11");
	b11.addActionListener (this);
	p.add (b11);
	b12 = new JButton ("__");
	b12.setActionCommand ("12");
	b12.addActionListener (this);
	p.add (b12);
	b13 = new JButton ("__");
	b13.setActionCommand ("13");
	b13.addActionListener (this);
	p.add (b13);
	b21 = new JButton ("__");
	b21.setActionCommand ("21");
	b21.addActionListener (this);
	p.add (b21);
	b22 = new JButton ("__");
	b22.setActionCommand ("22");
	b22.addActionListener (this);
	p.add (b22);
	b23 = new JButton ("__");
	b23.setActionCommand ("23");
	b23.addActionListener (this);
	p.add (b23);
	b31 = new JButton ("__");
	b31.setActionCommand ("31");
	b31.addActionListener (this);
	p.add (b31);
	b32 = new JButton ("__");
	b32.setActionCommand ("32");
	b32.addActionListener (this);
	p.add (b32);
	b33 = new JButton ("__");
	b33.setActionCommand ("33");
	b33.addActionListener (this);
	p.add (b33);

	JLabel title = new JLabel ("         Tic-Tac-Toe        ");
	title.setFont (new Font ("Jokerman", Font.BOLD, 20));
	title.setForeground (Color.red);

	JLabel ins = new JLabel ("Click on the squares to play your move");
	ins.setForeground (Color.white);

	score = new JLabel ("Score: X - 0  O - 0");
	score.setForeground (Color.yellow);

	add (title);
	add (p);
	add (ins);
	add (score);
    }


    public void actionPerformed (ActionEvent e)
    { //Switch the button's label
	if (e.getActionCommand ().equals ("11") && b11.getText ().equals ("__"))
	    b11.setText (turn);
	else if (e.getActionCommand ().equals ("12") && b12.getText ().equals ("__"))
	    b12.setText (turn);
	else if (e.getActionCommand ().equals ("13") && b13.getText ().equals ("__"))
	    b13.setText (turn);
	else if (e.getActionCommand ().equals ("21") && b21.getText ().equals ("__"))
	    b21.setText (turn);
	else if (e.getActionCommand ().equals ("22") && b22.getText ().equals ("__"))
	    b22.setText (turn);
	else if (e.getActionCommand ().equals ("23") && b23.getText ().equals ("__"))
	    b23.setText (turn);
	else if (e.getActionCommand ().equals ("31") && b31.getText ().equals ("__"))
	    b31.setText (turn);
	else if (e.getActionCommand ().equals ("32") && b32.getText ().equals ("__"))
	    b32.setText (turn);
	else if (e.getActionCommand ().equals ("33") && b33.getText ().equals ("__"))
	    b33.setText (turn);
	//Calculate if someone won
	String winner = "__";
	if (b11.getText ().equals (b12.getText ()) && b11.getText ().equals
		(b13.getText ()) && !b11.getText ().equals ("__"))
	{
	    JOptionPane.showMessageDialog (null, b11.getText () + " won!", "We have a winner!", JOptionPane.ERROR_MESSAGE);
	    winner = b11.getText ();
	}
	else if (b21.getText ().equals (b22.getText ()) && b21.getText ().equals
		(b23.getText ()) && !b21.getText ().equals ("__"))
	{
	    JOptionPane.showMessageDialog (null, b21.getText () + " won!", "We have a winner!", JOptionPane.ERROR_MESSAGE);
	    winner = b21.getText ();
	}
	else if (b31.getText ().equals (b32.getText ()) && b31.getText ().equals
		(b33.getText ()) && !b31.getText ().equals ("__"))
	{
	    JOptionPane.showMessageDialog (null, b31.getText () + " won!", "We have a winner!", JOptionPane.ERROR_MESSAGE);
	    winner = b31.getText ();
	}
	else if (b11.getText ().equals (b21.getText ()) && b11.getText ().equals
		(b31.getText ()) && !b11.getText ().equals ("__"))
	{
	    JOptionPane.showMessageDialog (null, b11.getText () + " won!", "We have a winner!", JOptionPane.ERROR_MESSAGE);
	    winner = b11.getText ();
	}
	else if (b12.getText ().equals (b22.getText ()) && b12.getText ().equals
		(b32.getText ()) && !b12.getText ().equals ("__"))
	{
	    JOptionPane.showMessageDialog (null, b12.getText () + " won!", "We have a winner!", JOptionPane.ERROR_MESSAGE);
	    winner = b12.getText ();
	}
	else if (b13.getText ().equals (b23.getText ()) && b13.getText ().equals
		(b33.getText ()) && !b13.getText ().equals ("__"))
	{
	    JOptionPane.showMessageDialog (null, b13.getText () + " won!", "We have a winner!", JOptionPane.ERROR_MESSAGE);
	    winner = b13.getText ();
	}
	else if (b11.getText ().equals (b22.getText ()) && b11.getText ().equals
		(b33.getText ()) && !b11.getText ().equals ("__"))
	{
	    JOptionPane.showMessageDialog (null, b11.getText () + " won!", "We have a winner!", JOptionPane.ERROR_MESSAGE);
	    winner = b11.getText ();
	}
	else if (b13.getText ().equals (b22.getText ()) && b13.getText ().equals
		(b31.getText ()) && !b13.getText ().equals ("__"))
	{
	    JOptionPane.showMessageDialog (null, b13.getText () + " won!", "We have a winner!", JOptionPane.ERROR_MESSAGE);
	    winner = b13.getText ();
	}
	//If someone won, reset and display new score
	if (!winner.equals ("__"))
	{
	    b11.setText ("__");
	    b12.setText ("__");
	    b13.setText ("__");
	    b21.setText ("__");
	    b22.setText ("__");
	    b23.setText ("__");
	    b31.setText ("__");
	    b32.setText ("__");
	    b33.setText ("__");
	    if (winner.equals ("X"))
		xWins++;
	    else
		oWins++;
	    showStatus ("X's points: " + xWins + " O's points: " + oWins);
	}
	//Switch whose turn it was
	if (turn.equals ("X"))
	    turn = "O";
	else
	    turn = "X";
	    score.setText ("Score: X - "+xWins+"  O - "+oWins);
    }
}
