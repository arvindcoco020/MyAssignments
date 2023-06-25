package week1.day1;

public class Fibbinocci_Series {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int FNum=0;
int SNum=1;
int Sum=0;

System.out.println(FNum);
System.out.println(SNum);
				
		for (int i=0; Sum<=50; i++) {
			Sum=FNum+SNum;
			FNum=SNum;
			SNum=Sum;
			System.out.println(Sum);
			
		}
			
		
		
	}

}
