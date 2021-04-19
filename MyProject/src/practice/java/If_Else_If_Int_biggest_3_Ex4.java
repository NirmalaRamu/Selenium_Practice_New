package practice.java;

public class If_Else_If_Int_biggest_3_Ex4 {
	
	public static void main(String[] args) {
		
		int a,b,c;
		a=10;
		b=4;
		c=3;
		if(a>b & a>c)
		{
			System.out.println(a);
			/* a=10
			 * b=4
			 * c=3
			 * o/p:10
			 */
		}else if (b>c) 
		{
			System.out.println(b);
			/* a=10
			 * b=40
			 * c=30
			 * o/p:40
			 */
		}else
		{
			System.out.println(c);
			/* a=10
			 * b=20
			 * c=30
			 * o/p:30
			 */
		}
	}

}
