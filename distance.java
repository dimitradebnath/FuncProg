import java.util.*;
/* javadoc 
Write   a   program     Distance.java     that   takes   two   integer   command­line   arguments   x  
and   y   and   prints   the   Euclidean   distance   from   the   point   (x,   y)   to   the   origin   (0,   0).   The  
formulae   to   calculate   distance   =   sqrt(x*x   +   y*y).   Use   Math.power   function 
*/
class Distance{
	public static void main(String []args)
		{
			int x,y;
			int distance=0;
			for(int i=0;i<args.length;i++) 
					{ 
 
					
					System.out.println(args[i]);
					x=Integer.parseInt(args[i]);//command line arguments
					y=Integer.parseInt(args[i]);

			
					distance= (int)Math.sqrt((double)Math.pow(x,2)   + (double)  Math.pow(y,2));
						}
			
			System.out.println("The Euclidean distance of the points to the origin is "+distance);

		}
}
			
