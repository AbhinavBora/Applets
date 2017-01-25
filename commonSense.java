public class commonSense
{
    public static void main (String args[])
    {
	new commonSense ();
    }


    public commonSense ()
    { //Example: Days of the Week
	String week[] = {"Sunday", "Monday", "Tuesday", "Wednesday",
	    "Thursday", "Friday", "Saturday"};
	for (int i = 0 ; i < week.length ; i++)
	    System.out.print (week [i] + " ");
	System.out.println ("");
	//1. Roman Numerals
	String rnum[] = {"I", "II", "III", "IV",
	    "V", "VI", "VII", "IX", "X"};
	for (int i = 0 ; i < rnum.length ; i++)
	    System.out.print (rnum [i] + " ");
	System.out.println ("");
	//2. Fibonacci Sequence
	int fseq[] = {1, 1, 2, 3, 5, 8, 13, 21, 34, 55};
	for (int i = 0 ; i < fseq.length ; i++)
	    System.out.print (fseq [i] + " ");
	System.out.println ("");
	//3. Rainbow Colours
	String rainbow[] = {"Red", "Orange", "Yellow", "Green",
	    "Blue", "Indigo", "Violet"};
	for (int i = 0 ; i < rainbow.length ; i++)
	    System.out.print (rainbow [i] + " ");
	System.out.println ("");
	//4. Counting Words
	String count[] = {"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten"};
	for (int i = 0 ; i < count.length ; i++)
	    System.out.print (count [i] + " ");
	System.out.println ("");
	//5. Head & Shoulders Words
	String hswords[] = {"Head", "Shoulders", "Knees", "Toes", "Eyes", "Ears", "Mouth", "Nose"};
	for (int i = 0 ; i < hswords.length ; i++)
	    System.out.print (hswords [i] + " ");
	System.out.println ("");
	//6. Period start times
	String pstimes[] = {"8:15", "9:40", "10:59", "12:14", "1:33"};
	for (int i = 0 ; i < pstimes.length ; i++)
	    System.out.print (pstimes [i] + " ");
	System.out.println ("");
	//7. Powers
	int pow[] = {1, 4, 9, 16, 25, 36, 49, 64, 81, 100};
	for (int i = 0 ; i < pow.length ; i++)
	    System.out.print (pow [i] + " ");
	System.out.println ("");
	//8. Start of Alphabet
	char alpha[] = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i'};
	for (int i = 0 ; i < alpha.length ; i++)
	    System.out.print (alpha [i] + " ");
	System.out.println ("");
    }
}
