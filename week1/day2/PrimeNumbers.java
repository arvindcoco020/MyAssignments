package week1.day2;

public class PrimeNumbers {
	
public static void main(String[] args) {
	
	int input=11;
	boolean isPrime = true;
	
	
	for(int i=2; i<input; i++) {
		if(input%i ==0) {
			isPrime = false;
			System.out.println(input+" is not Prime number");
			
		}
		else {
			System.out.println(input+" is Prime number");
		}
		break;
		
	}
}
}
