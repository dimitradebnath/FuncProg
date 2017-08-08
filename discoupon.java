import java.util.*;
import java.util.concurrent.ThreadLocalRandom;
/* javadoc Coupon   Numbers 
	a. Desc   ­>   Given   N   distinct   Coupon   Numbers,   how   many   random   numbers   do   you 
		need   to   generate   distinct   coupon   number?   This   program   simulates   this   random process. 
	b. I/P   ­>   N   Distinct   Coupon   Number 
	c. Logic   ­>   repeatedly   choose   a   random   number   and   check   whether   it's   a   new   one. 
	d. O/P   ­>   total   random   number   needed   to   have   all   distinct   numbers. 
	e. Functions   =>   Write   Class   Static   Functions   to   generate   random   number   and   to process   distinct   coupons. 
*/
	class Discoupon
		{
		public static void main(String... args)
			{
				System.out.println("Enter the range from which the random numbers  is to be generated");
				Scanner sc = new Scanner(System.in);
				System.out.println("Low range");
				int a = sc.nextInt();
				System.out.println("high range");
				int b =sc.nextInt();
				System.out.println("Enter the size of the array in which the coupons are to be placed");
				int size= sc.nextInt();
				int ditnct[]= new int[size];
				System.out.println("random number generates:",check(ditnct,size));
			}

		static int get_Random(int low, int high)
			{
				int rand = ThreadLocalRandom.current().nextInt(low, high + 1);
				return rand;
			}

		static int check(int a[],int size)
			{
				int i=0,c=0;
				do
				{
					int g=get_Random(a,b);
					c++;
					for(int j=0;j=i;j++)
						{
							if(g==ditnct[j])
								{
									g=get_Random(a,b);
									c++;
								}

							else
								{
									ditnct[i]=g;
								}
						}
					i--;

				}

				while(i<size);
				return c;
			}
	}

