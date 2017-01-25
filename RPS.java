import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.applet.Applet;

public class RPS extends Applet implements ActionListener
{
    JRadioButton rock, paper, scissors;
    JLabel ypic, cpic, ins, score;
    int ychoice, cchoice, ypts, cpts;
    JButton play;

    public void init ()
    {
	resize (500, 300);
	JLabel title = new JLabel ("Rock, Paper, Scissors Game");
	title.setFont (new Font ("Jokerman", Font.BOLD, 20));
	title.setForeground (Color.red);

	JLabel pick = new JLabel ("Pick one:");
	JLabel you = new JLabel ("Your choice:");
	JLabel comp = new JLabel ("Computer's choice");

	ypic = new JLabel (createImageIcon ("blank.jpg"));
	cpic = new JLabel (createImageIcon ("blank.jpg"));

	rock = new JRadioButton ("Rock");
	rock.addActionListener (this);
	rock.setActionCommand ("rock");
	paper = new JRadioButton ("Paper");
	paper.addActionListener (this);
	paper.setActionCommand ("paper");
	scissors = new JRadioButton ("Scissors");
	scissors.addActionListener (this);
	scissors.setActionCommand ("scissors");

	Panel p1 = new Panel (new GridLayout (3, 1));
	p1.add (rock);
	p1.add (paper);
	p1.add (scissors);

	Panel p2 = new Panel (new GridLayout (2, 3));
	p2.add (pick);
	p2.add (you);
	p2.add (comp);
	p2.add (p1);
	p2.add (ypic);
	p2.add (cpic);

	play = new JButton ("Play");
	play.addActionListener (this);
	play.setActionCommand ("play");
	play.setEnabled (false);
	JButton reset = new JButton ("Reset Scores");
	reset.addActionListener (this);
	reset.setActionCommand ("reset");
	ins = new JLabel ("Click Play");
	score = new JLabel ("Score: You - 0  Computer - 0");
	score.setForeground (Color.red);

	Panel p4 = new Panel (new GridLayout (1, 2));
	p4.add (play);
	p4.add (reset);
	Panel p3 = new Panel (new GridLayout (2, 1));
	p3.setBackground (Color.yellow);
	p3.add (ins);
	p3.add (score);

	add (title);
	add (p2);
	add (p4);
	add (p3);

	ButtonGroup group = new ButtonGroup ();
	group.add (rock);
	group.add (paper);
	group.add (scissors);

    }


    public void actionPerformed (ActionEvent e)
    {
	if (e.getActionCommand ().equals ("rock"))
	{
	    ypic.setIcon (createImageIcon ("rock.jpg"));
	    ychoice = 1;
	    play.setEnabled (true);
	}
	else if (e.getActionCommand ().equals ("scissors"))
	{
	    ypic.setIcon (createImageIcon ("scissors.jpg"));
	    ychoice = 2;
	    play.setEnabled (true);

	}
	else if (e.getActionCommand ().equals ("paper"))
	{
	    ypic.setIcon (createImageIcon ("paper.jpg"));
	    ychoice = 3;
	    play.setEnabled (true);

	}
	else if (e.getActionCommand ().equals ("play"))
	{
	    int num = (int) (Math.random () * 3 + 1);
	    if (num == 1)
		cpic.setIcon (createImageIcon ("rock.jpg"));
	    else if (num == 2)
		cpic.setIcon (createImageIcon ("scissors.jpg"));
	    else
		cpic.setIcon (createImageIcon ("paper.jpg"));

	    if (num == ychoice)
		ins.setText ("Tie");
	    else if (ychoice == 1 && num == 2)
	    {
		ins.setText ("You win");
		ypts++;
	    }
	    else if (ychoice == 2 && num == 3)
	    {
		ins.setText ("You win");
		ypts++;
	    }
	    else if (ychoice == 3 && num == 1)
	    {
		ins.setText ("You win");
		ypts++;
	    }
	    else
	    {
		ins.setText ("You lose");
		cpts++;
	    }
	    score.setText ("Score: You - " + ypts + "  Computer - " + cpts);
	}
	else
	{
	    score.setText ("Score: You - 0  Computer - 0");
	    ypic.setIcon (createImageIcon ("blank.jpg"));
	    cpic.setIcon (createImageIcon ("blank.jpg"));
	    cpts = 0;
	    ypts = 0;
	}
    }


    protected static ImageIcon createImageIcon (String path)
    {
	java.net.URL imgURL = RPS.class.getResource (path);
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


