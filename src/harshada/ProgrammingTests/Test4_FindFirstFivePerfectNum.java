package harshada.ProgrammingTests;

import java.util.Arrays;

public class Test4_FindFirstFivePerfectNum {
	
	void getPerfectNum(int num) {
		int sum=01;
		for(int index=2; index<=num/2; index++) {
			if(num%index==0) {
				sum=sum+index;
			}
		}
	}
	
	void getFirstFivePerfectNo(int size) {
		
		int count=0;
		int number=2;
		System.out.println("First FIVE perfect numbers are : ");

		while(count <= size) {//condition
			int sum=01;
			for(int index=2; index<=number/2; index++) {// like prime we divide number by 2
				if(number%index==0) { //if num is perfectly divisible then add it to sum
					sum=sum+index;
				}
			}
				if(sum==number) {//PN
				System.out.println(number);
				count++;
				}
			number++;//CHECK NEXT NUMBER
		}
		
	}
		


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Test4_FindFirstFivePerfectNum test4_FindFirstFivePerfectNum=new Test4_FindFirstFivePerfectNum();
		test4_FindFirstFivePerfectNum.getFirstFivePerfectNo(5);// pass the count number of PN
		
		
	}

}
