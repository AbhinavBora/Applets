public class mocap
{
    public static void main (String args[])
    {
	new mocap ();
    }


    public mocap ()
    {
	int x[] = {234, 345, 348, 456, 567, 765, 654, 544, 587, 578};
	int y[] = {456, 456, 345, 347, 346, 467, 562, 562, 532, 576};
	int z[] = {345, 324, 312, 317, 304, 305, 307, 308, 309, 298};
	for (int i = 0 ; i < x.length ; i++)
	{
	    System.out.println ("{" + x [i] + ", " + y [i] + ", " + z [i] + "}");
	}

	int min = x [0];
	for (int i = 0 ; i < x.length ; i++)
	{
	    if (min > x [i])
		min = x [i];
	}
	System.out.println ("\nThe minimum x is: " + min);

	int min2 = y [0];
	for (int i = 0 ; i < y.length ; i++)
	{
	    if (min2 > y [i])
		min2 = y [i];
	}
	System.out.println ("\nThe minimum y is: " + min2);

	int min3 = z [0];
	for (int i = 0 ; i < z.length ; i++)
	{
	    if (min3 > z [i])
		min3 = z [i];
	}
	System.out.println ("\nThe minimum z is: " + min3);

	int max = x [0];
	for (int i = 0 ; i < x.length ; i++)
	{
	    if (max < x [i])
		max = x [i];
	}
	System.out.println ("\nThe maximum x is: " + max);

	int max2 = y [0];
	for (int i = 0 ; i < y.length ; i++)
	{
	    if (max2 < y [i])
		max2 = y [i];
	}
	System.out.println ("\nThe maximum y is: " + max2);

	int max3 = z [0];
	for (int i = 0 ; i < z.length ; i++)
	{
	    if (max3 < z [i])
		max3 = z [i];
	}
	System.out.println ("\nThe maximum z is: " + max3);

	double total = 0;
	for (int i = 0 ; i < x.length ; i++)
	{
	    total += x [i];
	}
	System.out.println ("\nThe average for x is: " + total / 10);

	total = 0;
	for (int i = 0 ; i < y.length ; i++)
	{
	    total += y [i];
	}
	System.out.println ("\nThe average for y is: " + total / 10);

	total = 0;
	for (int i = 0 ; i < z.length ; i++)
	{
	    total += z [i];
	}
	System.out.println ("\nThe average for z is: " + total / 10);

	System.out.println ("\nControl Points close");
	for (int i = 0 ; i < x.length ; i++)
	{

	    if (x [i] <= 550)
	    {
		System.out.println ("{" + x [i] + ", " + y [i] + ", " + z [i] + "}");
	    }
	}
	
	System.out.println ("\nIn focus points");
	for (int i = 0 ; i < z.length ; i++)
	{

	    if (z [i] <= 315 && z[i] >= 304)
	    {
		System.out.println ("{" + x [i] + ", " + y [i] + ", " + z [i] + "}");
	    }
	}
    }
}
