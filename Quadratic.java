import java.util.*;
/*
javadoc  
Write   a   program     Quadratic.java   to   find   the   roots   of   the   equation   a*x*x   +   b*x   +   c.  
Since   the   equation   is   x*x,   hence   there   are   2   roots.   The   2   roots   of   the   equation  
can   be   found   using   a   formula  
delta   =   b*b   ­   4*a*c 
Root   1   of   x   =   (­b   +   sqrt(delta))/(2*a) 
Root   2   of   x   =   (­b   ­   sqrt(delta))/(2*a) 
Take   a,   b   and   c   as   input   values   to   find   the   roots   of   x. 
Author
Dimitra Debnath 
since
31st July 2017
*/

class Quadratic{

	/*
	desc...
	param
	return
	*/
	public static void main(String...args){

		int a,b,c;
		double delta=0.0,root1=0.0,root2=0.0;
		
		System.out.println("enter the a");
		Scanner sc = new Scanner(System.in);
		a=sc.nextInt();

		System.out.println("enter the b");
		b =sc.nextInt();
		
		System.out.println("enter the c");
		c=sc.nextInt();

		delta = (Math.pow((double)b,2)-(4*(double)a*(double)c));

		root1= ((-(double)b +(Math.sqrt(delta))) /(2*(double)a));
		root2= ((-(double)b -(Math.sqrt(delta))) /(2*(double)a));

		System.out.println("Root 1 of X is = "+root1);
		System.out.println("Root 2 of X is = "+root2);


						}

}
		
