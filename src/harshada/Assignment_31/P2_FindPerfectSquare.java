/* Assignment - 31 : 9th Sep'2021
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

public class P2_FindPerfectSquare {

	void getPerfectSquare(int num) {
		//int num=36;
		double sqrtValue=0;
		sqrtValue=Math.sqrt(num);
		if(num==sqrtValue*sqrtValue) {
			System.out.println("number "+ num + " Is Perfect Sqaure ");
		}else
			System.out.println("number "+ num + " Is Not Perfect Sqaure ");
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		P2_FindPerfectSquare p2_FindPerfectSquare=new P2_FindPerfectSquare();
		p2_FindPerfectSquare.getPerfectSquare(36);
		p2_FindPerfectSquare.getPerfectSquare(25);
		p2_FindPerfectSquare.getPerfectSquare(50);
	}

}
