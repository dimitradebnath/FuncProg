import java.util.*;
/*
javadoc 
Power   of   2  
a. Desc   ­>   This   program   takes   a   command­line   argument   N   and   prints   a   table   of   the 
powers   of   2   that   are   less   than   or   equal   to   2^N. 
b. I/P   ­>   The   Power   Value   N.   O
  nly   works   if   0   <=   N   <   31   since   2^31   overflows   an   int 
c. Logic   ­>   repeat   until   i   equals   N. 
d. O/P   ­>   Print   the   year   is   a   Leap   Year   or   not.

*/

class Power
{

	public static void main(String...args)
		{

		int n;
		System.out.println("enter the number");
		n = Integer.parseInt(args[0]);

//Scanner sc= new Scanner(System.in);
//n= sc.nextInt();
		if(n>=0 && n<31)
			{

				for(int i=0;i<=n;i++)
					{
			System.out.println("2 to the power "+i+ "= "+((int)Math.pow(2,i)));

					}

			}	
		else
			System.out.println("power greater than 31 violates integer");
		}
}
