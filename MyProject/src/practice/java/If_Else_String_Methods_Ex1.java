package practice.java;

public class If_Else_String_Methods_Ex1 {
	
	public static void main(String[] args) {
		
		String expectedtitle = "Ramu";
		String actualtitle = "Nirmala Ramu";
		
		if(actualtitle.contains(expectedtitle))
		{
			System.out.println("Pass");
			//o/p:Pass
			
		}else
		{
			System.out.println("Fail");
		}
	}

}
