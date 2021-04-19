package practice.java;

public class If_Else_If_Int_biggest_2_Ex3 {
	
	public static void main(String[] args){
		
		int a = 30;
		int b = 20;
		
		if(a!=b & a>b)
		{
			System.out.println("Biggest value a is " + a);
			/* a=30
			 * b=20
			 * o/p:Biggest value a is 30
			 */
		}else if (a!=b & b>a) {
			System.out.println("Biggest value b is " + b);
			/* a=10
			 * b=20
			 * o/p:Biggest value b is 20
			 */
		}else
		{
			System.out.println("Both are same");
			/* a=10
			 * b=10
			 * o/p:Both are same
			 */
		}
	}

}
