package week1.day2;

public class Find_Intersections {
	
	public static void main(String[] args) {
		
		int[] set1 = {2,4,7,9,12,17,90,55,24};
		int[] set2 = {23,7,8,55,12,19,44,90};
		
		int set1_len= set1.length;
		int set2_len= set2.length;
		
		for (int i=0; i<set1_len; i++) {
			for(int j=0; j<set2_len; j++) {
				if (set1[i] == set2[j]) {
					System.out.println(set1[i]);
				}
				
			}
		}
		
		
		
	}

}
