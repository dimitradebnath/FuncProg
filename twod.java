import java.util.*;
import java.lang.*;
import java.io.*;

/*

Javadoc
2D   Array 
a. Desc   ­>   A   library   for   reading   in   2D   arrays   of   integers,   doubles,   or   booleans   from 
standard   input   and   printing   them   out   to   standard   output. 
b. I/P   ­>   M   rows,   N   Cols,   and   M   *   N   inputs   for   2D   Array.   Use   Java   Scanner   Class 
c. Logic   ­>   create   2   dimensional   array   in   memory   to   read   in   M   rows   and   N   cols  
d. O/P   ­>   Print   function   to   print   2   Dimensional   Array.   In   Java   use   PrintWriter   with 
OutputStreamWriter   to   print   the   output   to   the   screen. */


	class Twod
		{
		public static void main(String[] args)
			{

			int a[][] =new int[10][10];
			int r,c;
			PrintWriter p =new PrintWriter(System.out);
			Scanner sc=new Scanner(System.in);
			p.println("Enter the no of rows ");
			p.flush();
			r=sc.nextInt();
			p.println("Enter the no of columns ");
			p.flush();
			c=sc.nextInt();//immediately after taking the input you  will require t o flush else wont run #pw
			
			p.println("Enter the "+(r*c)+"  number of elements");
			p.flush();
			for(int i=0;i<r;i++)
			{
					for(int j=0;j<c;j++)
						{
							a[i][j]=sc.nextInt();
						}

			}
			p.println("the array is");
			
			for(int i=0;i<r;i++)
			{
					for(int j=0;j<c;j++)
						{
							
							p.print(a[i][j]+" ");
							
						}
				p.println();
			}
				
				p.flush();


			}
}			
