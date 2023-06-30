package week1.day2;

import java.util.Arrays;


public class Missing_Elements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	int nums []= {2,3,1,8,5,7,6};
		
		Arrays.sort(nums);
		int len= nums.length;
		System.out.println("2nd largest no is "+nums[len-2]);
		
	for(int i=1; i<=nums[len-1]; i++) {
		if(nums[i-1]!=i) {
			System.out.println("Missing Numbers are "+i);
			//i++;
			
			}
			
		}
		
		

	}
	}

