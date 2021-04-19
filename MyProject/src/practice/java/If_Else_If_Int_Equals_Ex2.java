package practice.java;

public class If_Else_If_Int_Equals_Ex2 {
	
	public static void main(String[] args) {
		
		int a,b;
		a=20;
		b=10;
		
		if(a==b) {
			System.out.println("Both are same");
			/* a=10
			 * b=10
			 * o/p:Both are same
			 */
		}else if (a>b) {
			System.out.println(a);
			/* a=20
			 * b=10
			 * o/p:20
			 */
		}else {
			System.out.println(b);
			/* a=10
			 * b=20
			 * o/p:20
			 */
		}
		
	}
	

}
