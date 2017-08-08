import java.util.*;
import java.lang.*;
/* javadoc Simulate   Stopwatch   Program 
a. Desc   ­>   Write   a   Stopwatch   Program   for   measuring   the   time   that   elapses   between 
the   start   and   end   clicks 
b. I/P   ­>   Start   the   Stopwatch   and   End   the   Stopwatch 
c. Logic   ­>   Measure   the   elapsed   time   between   start   and   end 
d. O/P   ­>   Print   the   elapsed   time. 
*/
	class Elapse
		{
		public static void main(String...args)
			{

	Scanner sc = new Scanner(System.in);
	String s;
	Elapse e =new Elapse();
       
	System.out.println("do you want to start? Press {Y/N}");
	s=sc.next();
	if(s.equalsIgnoreCase("Y"))
		{
		System.out.println("Starting");
		e.start();
		}
		else if(s.equalsIgnoreCase("N"))
		{
			
		
		System.out.println("Stoping");
		e.stop();
		}
		
		else
		System.out.println("invalid option");
	
	
		}

			double t1,t2,elapsedtime,t3;
			Scanner sc = new Scanner(System.in);
			String ch,ch1;
 			

		void start()
			{

			t1=(System.currentTimeMillis())/1000;
			System.out.println("the starting time is "+t1);
			System.out.println("do you want to stop? Press {Y/N}");
			System.out.println("TO PAUSE THE TIMER? Press P");
			ch=sc.next();
			if(ch.equalsIgnoreCase("Y"))
				{
				stop();
				}
			else if(ch.equalsIgnoreCase("n"))
				{
			System.out.println("thank you");
				}
			       
        		else if  (ch.equalsIgnoreCase("P"))
				{
					pause();	
				}	

			}


		void stop()
		{
			t2=(System.currentTimeMillis())/1000;
			elapsedtime=t1-t2;
			System.out.println("elapsed time" +elapsedtime);
		}

		void pause()
		{
				t3=(System.currentTimeMillis())/1000;			
				System.out.println("Timer is Paused");
				System.out.println("Press S to stop the timer and R for resetting the timer ");
				ch1=sc.next();
				if(ch1.equalsIgnoreCase("s"))
				{
				System.out.println("elapsed time" +t3);
				stop();
				}
				else
				start();


		}

}


