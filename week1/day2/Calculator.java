package week1.day2;

public class Calculator {
		
	public int addition(int a,int b) {
		return (a+b);
	}
	
	public int subtraction(int a,int b) {
		return (a-b);
	}

	public int devide(int a,int b) {
		return (a/b);
	}
	
	public int multiply(int a,int b) {
		return (a*b);
	}
	
	public static void main(String[] args) {
		Calculator lm = new Calculator();
		
		int sum= lm.addition(2,3);
		System.out.println(sum);
		
		int subs= lm.subtraction(5,3);
		System.out.println(subs);

		int div= lm.devide(10,5);
		System.out.println(div);
		
		int mul= lm.multiply(5,3);
		System.out.println(mul);
	
	
	}

}
