//Java Challenge (2/20)

//Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.

//You must implement a solution with a linear runtime complexity and use only constant extra space.

//********************************************************************************************************************

package week1.day2;
import java.util.*;

public class FindSingleNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numbs []= {11,3,2,3,2,4,6,5,4,6,5};
		
		
		
		Arrays.sort(numbs);
		int leng= numbs.length;
		
		for (int i=0; i<leng; i++) 
		{
			if (i==leng-1) 
			{
				System.out.println("Single Number is "+ numbs[i]);
			}
			
			for(int j=i+1; j<leng; j++ ) {
				
				if (numbs[i]==numbs[j]) {
					i++;
				break;
				}
				else {
					
					System.out.println("Single Number is "+ numbs[i]);
				break;
				}
			
				}
			
			
			//else {
				
				//System.out.println("There is no single number in Array");
				//break;
			//}
			//}
		}

	}

}
