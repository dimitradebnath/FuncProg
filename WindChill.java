import java.util.*;

/*

Javadoc
Write   a   program     WindChill.java   that   takes   two   double   command­line   arguments   t  
and   v   and   prints   the   wind   chill.   Use   Math.pow(a,   b)   to   compute   ab.  
Given   the   temperature   t   (in   Fahrenheit)   and   the   wind   speed   v   (in   miles   per   hour),  
the   National   Weather   Service   defines   the   effective   temperature   (the   wind   chill)   to  
be: 
 
Note  :   the   formula   is   not   valid   if   t   is   larger   than   50   in   absolute   value   or   if   v   is   larger  
than   120   or   less   than   3   (you   may   assume   that   the   values   you   get   are   in   that   range). */
	class WindChill
		{
			public static void main(String...args)
				{

				double t,v,windspeed=0.0;
				for(int i=0;i<args.length;i++)
				  {
					System.out.println(args[i]);
					t=Double.parseDouble(args[i]);
					v=Double.parseDouble(args[i]);
					if(t>50|| v<3 || v>120)
						System.out.println("Please enter the correct values in the correct ranges");
						else
						windspeed= (35.74 + (0.625*t) + ((0.4275*t) -35.75) * (Math.pow(v,0.16)));
				  }
				System.out.println("Windspeed = "+windspeed);

				}
		}
