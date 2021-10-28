// Java program to print
// berth type of a provided
// seat number.
import java .io.*;

class GFG
{
	
// Function for
// printing berth type
static void berth_type(int s)
{
	
	if (s > 0 && s < 73)
		if (s % 8 == 1 ||
			s % 8 == 4)
		System.out.println(s +
				" is lower berth");
		else if (s % 8 == 2 ||
				s % 8 == 5)
			System.out.println(s +
					" is middle berth");
		else if(s % 8 == 3 ||
				s % 8 == 6)
			System.out.println(s +
					" is upper berth");
		else if(s % 8 == 7)
			System.out.println(s +
					" is side lower berth");
		else
			System.out.println(s +
					" is side upper berth");
	else
		System.out.println(s +
				" invalid seat number");
}

// Driver code
public static void main(String[] args)
{
int s = 10;
berth_type(s); // fxn call for berth type

s = 7;
berth_type(s); // fxn call for berth type

s = 0;
berth_type(s); // fxn call for berth type
}
}

