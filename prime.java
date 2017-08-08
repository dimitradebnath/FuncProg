import java.util.*;
/*

Javadoc

Factors 


Desc   ­>   Computes   the   prime   factorization   of   N   using   brute   force. 
I/P   ­>   Number   to   find   the   prime   factors 
Logic   ­>   Traverse   till   i*i   <=   N   instead   of   i   <=   N   for   efficiency  .  
O/P   ­>   Print   the   prime   factors   of   number   N*/
class Prime
	{
public static void main(String...args)
		{
		int n,c=0,i;
		
		System.out.println("enter the number for whom you want to find the prime factors");
		Scanner sc = new Scanner(System.in);
		n =sc.nextInt();
		if (n!=0)
			{
			for (i = 2; i*i <= n; i++)
			{
			while (n % i == 0)
				{
               	 	System.out.print(i + " ");
                	n = n / i;
            			}
        		}
 
        		if (n < 1) 
	System.out.println(n);

			
			}
		else
		System.out.print("Enter a valid number");
		}
	}

