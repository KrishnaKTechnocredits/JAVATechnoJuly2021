package gauravk.Test_5;

import java.util.Arrays;

/*
 * Test 4 : Shift all Zero's at the end of the array. 
int[] arr = {1,0,0,6,0,2,3,0,4,0,5};
ouput : {1,6,2,3,4,5,0,0,0,0,0};


Test 5 :
Find first 5 perfect numbers.

 */
public class PrintingFirstFivePerfectNumbers {

	void isFirstNPerfectNumber(int count) {
		int i=1;
		int[] arr = new int[count];
		int j=0;
		while(count>0) {
			if(i==isPerfectNumber(i)) {
				arr[j]=i;
				j++;
				count--;
				System.out.println(i);
			}
			i++;
		}
	}
	
	int isPerfectNumber(int num) {
		int divisor = 1;
		int remainder = 0;
		int sumOfDivisor = 0;
		while(divisor<num) {
			remainder = num%divisor;
			if(remainder==0) {
				sumOfDivisor += divisor;
			}
			divisor++;
		}
		if(num==sumOfDivisor)
			return sumOfDivisor;
		return remainder;
	}	
		
	public static void main(String[] args) {
		PrintingFirstFivePerfectNumbers abc = new PrintingFirstFivePerfectNumbers();
		abc.isFirstNPerfectNumber(5);
	}
}
