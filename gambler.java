import java.util.*;
/*
javadoc 

Gambler 
a. Desc   ­>   Simulates   a   gambler   who   start   with   $stake   and   place   fair   $1   bets   until 
he/she   goes   broke   (i.e.   has   no   money)   or   reach   $goal.   Keeps   track   of   the   number   of 
times   he/she   wins   and   the   number   of   bets   he/she   makes.   Run   the   experiment   N 
times,   averages   the   results,   and   prints   them   out. 
b. I/P   ­>   $Stake,   $Goal   and   Number   of   times 
c. Logic   ­>   Play   till   the   gambler   is   broke   or   has   won 
d. O/P   ­>   Print   Number   of   Wins   and   Percentage   of   Win   and   Loss. 

authr Dimitra Debnath 
since july 2017
*/

class Gambler{

	/*
	desc...
	param
	return
	*/
	public static void main(String...args){

		int stake,goal,no_of_times,win=0,loss=0;
		
		System.out.println("enter the amount of money you are entering the game with");
		Scanner sc = new Scanner(System.in);
		stake =sc.nextInt();

		System.out.println("enter the amount of money you wish to leave with");
		goal =sc.nextInt();
		
		System.out.println("enter the no of times you want to play");
		no_of_times =sc.nextInt();

		if (no_of_times>0)
   		{
			for(int i=0;i<no_of_times;i++)
			{
				System.out.println("  chance number " +(i+1));
				if(stake==goal)
				{
					System.out.println("your goal is acheived");
					break;
				}
		
				if(stake==0)
				{
					System.out.println("you are broke sorry");
					break;
				}

				double r=Math.random();

				if(r<0.5)
				{	
					
					loss++;
					System.out.println("loss");
					
				}
				else
				{
					win++;
					System.out.println("win");
					
				}
			}

			System.out.println(win+"  is the number of wins");
			double win_pct= ((double)win/(double)no_of_times)*100;
			System.out.println("win percentage"+win_pct);
			System.out.println(loss+"  is the number of loss");
			double loss_pct= ((double)loss/(double)no_of_times)*100;
			System.out.println("loss percentage"+loss_pct);
		}
		else{
			System.out.println("give a valid bumber of times");
		}
	}
}
