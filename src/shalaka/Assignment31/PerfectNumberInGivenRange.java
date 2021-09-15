/*Program 4:
In a user given range find all perfect numbers.
input : start range -> 40 , end range -> 170
output : ------ */
package shalaka.Assignment31;

import java.util.Scanner;

public class PerfectNumberInGivenRange {
	int getPerfectNumber(int num) {
		int sum = 1;
		int orignalNum = num;
		for (int index = 2; index <= num / 2; index++) {
			if (num % index == 0)
				sum += index;
		}
		if (sum == orignalNum)
			return sum;
		else
			return 0;
	}
	
	void printPerfectNumber(int startNum, int endNum) {
		System.out.println("Perfect numbers in given range are: ");
		for (int num=startNum;num<=endNum;num++) {
		int output=getPerfectNumber(num);
		if(output>0)
		System.out.println(output);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PerfectNumberInGivenRange perfectNumberInGivenRange = new PerfectNumberInGivenRange();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Start Number:");
		int startNum=scanner.nextInt();
		System.out.println("Enter End Number:");
		int endNum=scanner.nextInt();
		perfectNumberInGivenRange.printPerfectNumber(startNum,endNum);
		scanner.close();	
	}

}
