/*
 Assignment - 31 : 9th Sep'2021
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
	   
Test 4 : 
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
package harshada.Assignment_31;

public class P1_FindPerfectNo {

	void getFirstFivePerfectNum(int num) {
		int sum=01;
		for(int index=2; index<=num/2; index++) {
			if(num%index==0) {// mod by index not by 2- I did mistake here
				sum=sum+index;
			}
		}
			if(sum==num) 
				System.out.println("Answer : Number "+ num + " is Perfect Number \n");
			
			else{
				System.out.println("Answer : Number "+ num + " is not a Perfect Number\n" );
			}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		P1_FindPerfectNo p1_FindPerfectNo=new P1_FindPerfectNo();
		int num1=6;
		System.out.println("Question: Verify number "+ num1 + " is a Perfect Number or Not");
		p1_FindPerfectNo.getFirstFivePerfectNum(num1);
		int num2=50;
		System.out.println("Question: Verify number "+ num2 + " is a Perfect Number or Not ");
		p1_FindPerfectNo.getFirstFivePerfectNum(num2);
	}

}