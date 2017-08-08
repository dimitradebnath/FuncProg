import java.util.*;
/*javadoc Flip   Coin   and   print   percentage   of   Heads   and   Tails 
		a. I/P   ­>   The   number   of   times   to   Flip   Coin.   Ensure   it   is   positive   integer  . 
		b. Logic   ­>   Use   Random   Function   to   get   value   between   0   and   1.   If   <   0.5   then   tails   or  heads 
		c. O/P   ­>   Percentage   of   Head   vs   Tails  */
class Cointoss
	{
	public static void main(String...args)
		{
		int toss,tail=0,head=0;
		double headpercentage,tailpercentage;

		System.out.println("Enter the no of times you want the toss to happen");
		Scanner sc =new Scanner(System.in);
		toss=sc.nextInt();
			if (toss>0)
				   {
					for(int i=0;i<toss;i++)
					{
						/*System.out.println(" toss number  " +(i+1));
						System.out.println();*/
						double r=Math.random();

							if(r<0.5)
							{
								tail++;
								//System.out.println("tail");
							}
							else
							{
								head++;
								//System.out.println("head");

							}
					}

					headpercentage=(double)head/(double)toss;
					headpercentage=headpercentage*100;
					tailpercentage=(double)100-(double)headpercentage;
					System.out.println("headpercentage "+headpercentage+"  "+ "tailpercentage= "+tailpercentage);

		   		}
	
		}

}
