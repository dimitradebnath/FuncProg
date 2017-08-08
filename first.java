import java.util.*;
/*javadoc User   Input   and   Replace   String   Template   “Hello   <<UserName>>,   How   are   you?”  
		a. I/P     ­>   Take   User   Name   as   Input.   Ensure   UserName   has   min   3   char 
		b. Logic     ­>   Replace   <<UserName>>   with   the   proper   name 
		c. O/P    ­>   Print   the   String   with   User   Name   */
class First
	{
		public static void main(String...args)
			{

				System.out.println("Enter a name");
				Scanner sc=new Scanner(System.in);
				String b=sc.next();
				String a="Hello <<username>> how are you?";
				if(b.length()>=3)
				{
					String c=a.replace("<<username>>",b);
					System.out.println(c);
				}
				else
				System.out.println("Enter a name that is atleast  of 3 chracters");
			}

	}
