//Java Challenge (1/20)

//Given a non-negative integer x, compute and return the square root of x.

//Since the return type is an integer, the decimal digits are truncated, and only the integer part of the result is returned.

//Note: You are not allowed to use any built-in exponent function or operator, such as pow(x, 0.5) or x ** 0.5.

//********************************************************************************************************************

package week1.day2;

public class SquareRoot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num= 17;
		int SR;
		
		for (int i=2; i<num; i++) {
			if((i*i)>num) {
				
				SR=i-1;
				
					System.out.println("Square Root of given number is "+SR);
					break;
					
			}
			
			}
			
		}
		
	}


