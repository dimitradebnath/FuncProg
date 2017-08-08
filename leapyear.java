import java.util.*;
/*
javadoc 
Leap   Year 
a. I/P   ­>   Year,   ensure   it   is   a   4   digit   number. 
b. Logic   ­>   Determine   if   it   is   a   Leap   Year. 
c. O/P   ­>   Print   the   year   is   a   Leap   Year   or   not

*/



class Leapyear
{
		public static void main(String[] args)
			{
			int year;
			System.out.print("Enter the year");
			Scanner sc = new Scanner(System.in);
			year=sc.nextInt();


		if((year>999) && (year%4==0) && (year%100!=0) || (year%400==0))
				System.out.println("year is a leap year");
		else

				System.out.println("year is not a leap year");

			}
}

