package week1.day1;

public class Conditional_IfElse {
	
	public static void main(String[] args) {
		int Age = 29;
		System.out.println("Confirm the number category");
		
		if (Age>=31)
			System.out.println("Age is high, not applicable.");
		
		else if (Age<15)
		{
			System.out.println("Age is not good to apply for job");
		}
		else if (Age<=30) {
			System.out.println("Age is normal to apply for job");
		}
		
		
			else {
			System.out.println("Not applicable");
			}
			
		
	}

}
