package dattaraj;

import java.util.Arrays;

public class Assignment31_P4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment31_P4 p4 = new Assignment31_P4();
		int start=1;int end=170;
		System.out.println("The perfect numbers between " +start+ " & " +end+ " are "+Arrays.toString(p4.inRangePerfectNumber(start,end)));
	}
	long PerfectNumber(int num) {
		// TODO Auto-generated method stub
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
		if(num==sumOfDivisor) {
			return sumOfDivisor;
		}
		return remainder;
		  
	}
	int[] inRangePerfectNumber(int startNum, int endNum) {
		// TODO Auto-generated method stub
		int j=0;
		int[] arr = new int[endNum-startNum];
		for(int i=startNum; i<=endNum; i++) {
			if(i==PerfectNumber(i)) {
				arr[j]=i;
				j++;
			}
		}
		int[] arr1 = new int[j];
		for(int i=0; i<arr1.length; i++) {
			arr1[i]=arr[i];
		}

		return arr1;
	}

}
