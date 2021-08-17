/* Assignment 14 : 15th Aug'2021
program 1 : find maximum number from given array.
int[] input = {1,11,44,23,55,99,23};
output : 99
program 2 : find minimum number from given array.
int[] input = {1,11,44,23,55,99,23};
output : 11
program 3 : print difference between max and min number from given array.
int[] input = {1,11,44,23,55,99,23};
output : 98
program 4 : print difference between max odd number and max even number from given array. difference should be positive
int[] input = {1,11,44,23,55,99,23,22};
hint : 99 - 44
output : 55
*/
package sagar_Anasane;

public class Assignment14 {
	int[] input ={1,11,44,23,55,99,23};
	int[] input1 = {1,11,44,23,55,99,23,22};
	int maxNum = input[0];
	int minNum = input[0];
	int maxEvenNum = input1[0];
	int maxOddNum = input1[0];
	int diff;
	int findMaxNumber(){
			for(int index = 0; index < input.length;index++){
				if(input[index]> maxNum){
					maxNum=input[index];
				}	
			}
			System.out.println(maxNum);
			
	return maxNum;		
	}
	
	int findMinNumber(){
		for(int index = 0; index < input.length;index++){
			if(input[index]< minNum){
				minNum=input[index];
			}	
		}
		System.out.println(minNum);
		
		return maxNum;		
	}
	
	int diffBetweenMaxAndMin() {
		System.out.println(maxNum-minNum);
		return maxNum-minNum;
	}
	
	int printDiffBetweenMaxOddNosAndMaxEvenNos() {
		int printDiff;
		for (int index = 0;index<input1.length;index++) {
			if(input1[index]%2==0 && input1[index] > maxEvenNum) {
				maxEvenNum = input1[index];
		    }
		}
	
		for (int index = 0;index<input1.length;index++) {
			if(input1[index]%2 != 0 && input1[index] > maxOddNum) {
				maxOddNum = input1[index];
			}
		}
		
		if (maxEvenNum < maxOddNum) {
			printDiff = maxOddNum -maxEvenNum;
		}
		else {
			printDiff = maxEvenNum -maxOddNum;
		}
		System.out.println(printDiff);
		return printDiff;	
	}

	
	public static void main(String[] args){
		Assignment14 assignment14 = new Assignment14();
		System.out.println("Maximum Number from given Array :");
		assignment14.findMaxNumber();
		System.out.println("\n"+"Minimum Number from given Array :");
		assignment14.findMinNumber();
		System.out.println("\n"+"Difference between Maximum and Minimum Nos :");
		assignment14.diffBetweenMaxAndMin();
		System.out.println("\n"+"Difference between Maximum Odd Nos and Maximum Even Nos :");
		assignment14.printDiffBetweenMaxOddNosAndMaxEvenNos();
	}
}
