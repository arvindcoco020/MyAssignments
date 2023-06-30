//Java Challenge (3/20)

//Write an algorithm to determine if a number n is happy.

//A happy number is a number defined by the following process:

//Starting with any positive integer, replace the number by the sum of the squares of its digits.
//Repeat the process until the number equals 1 (where it will stay), or it loops endlessly in a cycle which does not include 1.
//Those numbers for which this process ends in 1 are happy.
//Return true if n is a happy number, and false if not.

//******************************************************************************************************************

package week1.day2;

public class HappyNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num= 22;
		int Sum = 0;
		int fd= (num/10);
		int ld= (num%10);
		
		for (int i=1; i<=num; i++) {
			fd= (fd*fd);
			ld= (ld*ld);
			Sum= fd+ld;
			fd= (Sum/10);
			ld= (Sum%10);
			
			if (Sum==1) {
				System.out.println("Given Number is Happy Number= "+num);
				break;
			}
		}
		if (Sum!=1)
		{
			System.out.println("Given Number is not Happy Number= "+num);
			
	    }
		}

	}


