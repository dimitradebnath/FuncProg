import java.util.*;

/*
javadoc 
Harmonic   Number  
a. Desc   ­>   Prints   the   Nth   harmonic   number:   1/1   +   1/2   +   ...   +   1/N 
(http://users.encs.concordia.ca/~chvatal/notes/harmonic.html). 
b. I/P   ­>   The   Harmonic   Value   N.   E
  nsure   N   !=   0  
c. Logic   ­>   compute   1/1   +   1/2   +   1/3   +   ...   +   1/N 
d. O/P   ­>   Print   the   Nth   Harmonic   Value. 

*/
class Harmonic
	{
public static void main(String...args)
		{
		int n;
		double s=0;
		System.out.println("enter the number for the harmonic value");
		Scanner sc = new Scanner(System.in);
		n =sc.nextInt();
		if (n!=0)
			{
				for(int i=1;i<=n;i++)
				{
				
				s=s+(double)1/i;
		System.out.print("1/"+i+" +");
				}
		System.out.print("= "+s);
		System.out.println();
			}
		else
		System.out.println("Please enter a valid number");
		}
	}

