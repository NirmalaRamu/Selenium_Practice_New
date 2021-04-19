package practice.java;

public class Switch_String_Methods_Ex1 {
	
	public static void main(String[] args) {
		
		String course = "Q";
		
		switch (course.toLowerCase()) {
		case "s":
			System.out.println("Selenium");
			/* course="s"    course="S"
			 * case "s"      case "s"
			 * o/p:Selenium  o/p:Selenium
			 */
			break;
		case "q":
			System.out.println("QTP");
			/* course="q"    course="Q"
			 * case "q"      case "q"
			 * o/p:Selenium  o/p:Selenium
			 */
			break;

		default:
			System.out.println("Invalid");
			/* course="s"    course="S"
			 * case "S"      case "S"
			 * o/p:Invalid   o/p:Invalid
			 * 
			 * course="q"    course="S"
			 * case "Q"      case "Q"
			 * o/p:Invalid   o/p:Invalid
			 */
			break;
		}
	}

}
