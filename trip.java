import java.util.*;

/*

Javadoc
Sum   of   three   Integer   adds   to   ZERO 
a. Desc   ­>   A   program   with   cubic   running   time.   Read   in   N   integers   and   counts   the 
number   of   triples   that   sum   to   exactly   0. 
b. I/P   ­>   N   number   of   integer,   and   N   integer   input   array 
c. Logic   ­>   Find   distinct   triples   (i,   j,   k)   such   that   a[i]   +   a[j]   +   a[k]   =   0 
d. O/P   ­>   One   Output   is   number   of   distinct   triplets   as   well   as   the   second   output   is   to 
print   the   distinct   triplets  */
 public class Trip {
    public static void main(String[] args)
    {
        int count=0;
	Scanner s=new Scanner(System.in);
	System.out.println("enter number of elements");
	int n=s.nextInt();
	int array[]=new int[n];
	System.out.println("enter elements");
    			for(int i=0;i<n;i++)
			{//for reading array
        			array[i]=s.nextInt();

    			}

		Arrays.sort( array );

	for( int i = 0; i < array.length - 2; i++ )
        {
            for( int j = i+1; j < array.length - 1; j++ )
            {
		for(int k= j+1;k< array.length; k++)
			{                
				int sum = array[i] + array[j] + array[k];
                		if(  sum == 0 )
                			{
						++count;
                    				System.out.println( array[i] + " " + array[j] + " " + array[k] );
						
		    				
                			}
                
            		}
            }
       	 

       }

		System.out.println(count+ " no of triplets are there" );
    
    }
  
}
