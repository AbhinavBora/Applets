public class fish
{
    public static void main (String args[])
    {
	new fish ();
    }


    public fish ()
    {
	int weight[] = {226, 305, 233, 244, 224, 235, 238, 244, 222, 239, 233, 243,
	    221, 230, 237, 240, 309, 230, 236, 242, 222, 235, 237, 240,
	    220, 235, 238, 243, 222, 232, 232, 242};
	int max = weight [0];
	double average, total = 0;
	for (int i = 0 ; i < weight.length ; i++)
	{
	    total += (weight [i]);
	    if (max < weight [i])
		max = weight [i];
	}
	average = total/32;
	System.out.println ("The maximum is " + max + "g.");
	System.out.println ("The average is " +average+ "g.");
if (average < 200)
System.out.println("Not enough food for population.");
else
System.out.println("Enough food for population.");
if (max < 300)
System.out.println("Not living long enough");
else
System.out.println("Living long enough.");
	}
}


