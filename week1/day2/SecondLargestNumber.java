package week1.day2;

import java.util.*;

public class SecondLargestNumber {
	
	public static void main(String[] args) {
		int numbers []= {3,2,5,7,9,1};
		
		//Arrays.sort(nums);
		//1,2,3,4,7,9
		Arrays.sort(numbers);
		int len= numbers.length;
		System.out.println("2nd largest no is "+numbers[len-2]);
		
	}

}
