public class moviePosters
{
    public static void main (String args[])
    {
	new moviePosters ();
    }


    public moviePosters ()
    {
	String first[] = {"Sam", "Zoe", "Sigourney", "Stephen", "Michelle", "Laz", "Wes", "Dileep", "Joel", "Giovanni", "CCH"};
	String last[] = {"Worthington", "Saldana", "Weaver", "Lang", "Rodriguez", "Alonzo", "Studi", "Rao", "Moore", "Ribisi", "Pounder"};
	System.out.println ("Avatar starring....");
	int times = 0;

	for (int i = 0 ; i < first.length ; i++)
	{
	    if (times == 0)
		System.out.println ("\t" + first [i] + " " + last [i]);
	    else if (times == 1)
		System.out.println ("\t" + (i + 1) + ". " + first [i] + " " + last [i]);
	    if (i == 10 && times == 0)
	    {
		i = -1;
		times++;
		System.out.println ("");
	    }
	}

	String min = first [0];
	for (int i = 0 ; i < first.length ; i++)
	{
	    if (min.compareTo (first [i]) > 0)
		min = first [i];
	}
	System.out.println ("\nThe earliest first name is: " + min);

	String min2 = last [0];
	for (int i = 0 ; i < last.length ; i++)
	{
	    if (min2.compareTo (last [i]) > 0)
		min2 = last [i];
	}
	System.out.println ("\nThe earliest last name is: " + min2);

	String min3 = first [0];
	for (int i = 0 ; i < first.length ; i++)
	{
	    if (min3.compareTo (first [i]) < 0)
		min3 = first [i];
	}
	System.out.println ("\nThe last first name is: " + min3);

	String min4 = last [0];
	for (int i = 0 ; i < last.length ; i++)
	{
	    if (min4.compareTo (last [i]) < 0)
		min4 = last [i];
	}
	System.out.println ("\nThe last last name is: " + min4);
	System.out.println ("\nAvatar starring....");
	System.out.print ("\t");
	for (int i = 0 ; i < first.length ; i++)
	{
	    System.out.print (first [i] + " " + last [i]);
	    if ((i + 1) % 3 == 0)
		System.out.print (", \n\t");
	    else if (i == 10)
		System.out.print (".");
	    else
		System.out.print (", ");

	}
    }
}


