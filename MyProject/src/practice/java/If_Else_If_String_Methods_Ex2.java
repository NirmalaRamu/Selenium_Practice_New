package practice.java;

public class If_Else_If_String_Methods_Ex2 {

	public static void main(String[] args) {
		
		String course = "s";
		
		if (course.equalsIgnoreCase("S")) 
		{
			System.out.println("Selenium");
			/* course="s"
			   o/p:Selenium */
		}
		else if (course.equalsIgnoreCase("Q")) 
		{
			System.out.println("QTP");
			/* course="Q"
			   o/p:QTP */
		}
		else if (course.equalsIgnoreCase("l")) 
		{
			System.out.println("Load Runner");
			/* course="l"
			   o/p:Load Runner */
		}
		else
		{
			System.out.println("Invalid course");
			/* course!="s" or "Q" or "l"
			   o/p:Invalid course */
		}
			

	}

}
