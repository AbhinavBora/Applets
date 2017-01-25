import java.awt.*;
import javax.swing.*;
import java.applet.Applet;
import java.awt.event.*;
public class punishselect extends Applet implements ActionListener
{
JLabel punish;
JTextField late;
public void init ()
{
resize (290, 110);
late = new JTextField (3);
JLabel title = new JLabel ("Punishment Selector");
title.setFont (new Font ("Jokerman", Font.BOLD, 20));
JLabel ins = new JLabel("Times Late");
punish = new JLabel ("So far you have no punishments. ");
punish.setForeground (Color.blue);
JButton findLevel = new JButton ("Find It");
findLevel.addActionListener (this);
findLevel.setActionCommand ("cut");
findLevel.setBackground (Color.black);
findLevel.setForeground (Color.white);
add (title);
add (ins);
add (late);
add (findLevel);
add (punish);
} //init
public void actionPerformed (ActionEvent e)
{
int m = Integer.parseInt (late.getText ());
if (m >= 4)
punish.setText ("A meeting with the VP");
else if (m == 3)
punish.setText ("10 minute detention");
else if (m == 2)
punish.setText ("A phone call home");
else if (m == 1)
punish.setText ("A warning");
else 
punish.setText ("Well done");
} //actionPerformed
}
