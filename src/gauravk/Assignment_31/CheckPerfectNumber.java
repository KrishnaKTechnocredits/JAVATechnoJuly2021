package gauravk.Assignment_31;

import java.util.Arrays;
import java.util.Scanner;

/*
 * Assignment - 31 : 9th Sep'2021
Program 1: verify given number is a perfect number or not.
input : 6
output : 6 is a perfect number

input : 50
output : 50 is not a perfect number

Program 2 : verify given number is a perfect square.
input : 25 
output : 25 is perfect square.

input : 20
output : 20 is not a perfect square.


Program 3: 
int[] arr = {10,23,24,25,26,61,62,64,65,66};
output : 3
Note : 23,24,25
       24,25,26
	   64,65,66

Program 4:
In a user given range find all perfect numbers.
input : start range -> 40 , end range -> 170
output : ------ 

-----------------------------------------------
	   
Test 4 : Shift all Zero's at the end of the array. 
int[] arr = {1,0,0,6,0,2,3,0,4,0,5};
ouput : {1,6,2,3,4,5,0,0,0,0,0};


Test 5 :
Find first 5 perfect numbers.

---------------------------------------------
Assignment - 32 : 10th Sep'2021

Program 1: find the triple which in sequence and having maximum sum.
int[] arr = {10,64,65,66,23,24,25,26,61,62};
output : 64,65,66 is a triple having maximum sum
Note : 23,24,25
       24,25,26
	   64,65,66 -> having max sum
 */
public class CheckPerfectNumber {
	
	String isPerfectNumber(int num) {
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
			return "Perfect Number";
		else return "NOT Perfect Number";
	}
	

	
	void isPerfectSquare(int num) {
		int i =1;
		for(i=1; i<=num; i++) {
			if(num/i==i) {
				System.out.println(num+" is the perfect square of "+i);
				break;
			}
		}
		if(i!=num/i)
			System.out.println(num+" is NOT the perfect square of any number.");
	}
	
	
	public static void main(String[] args) {
		int input1=6;
		int input2=49;
		CheckPerfectNumber abc = new CheckPerfectNumber();
		System.out.println("The number "+input1+" is "+abc.isPerfectNumber(input1));
		System.out.println("The number "+input2+" is "+abc.isPerfectNumber(input2));
		abc.isPerfectSquare(input1);
		abc.isPerfectSquare(input2);
	}
}
