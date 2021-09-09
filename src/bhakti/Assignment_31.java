/*Assignment - 31 : 9th Sep'2021
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
*/

package bhakti;

import java.util.Arrays;

public class Assignment_31 {
	//Program 1: verify given number is a perfect number or not.
	
	void isNumberPerfect(int num) {
		System.out.println("------------------------");
		int sum=1;
		for (int index=2; index<num; index++) {
			if (num%index==0)
				sum+=index;
		}
		if (sum==num)
			System.out.println(num +" Perfect number");
		else
			System.out.println(num+ " Not perfect number");
			
	}
	
	//Program 2 : verify given number is a perfect square.
	void isPerfectSquare(int number) {
		System.out.println("------------------------");
		double root= Math.sqrt(number);
		if ((root*root)==number)
			System.out.println(number+" is a perfect square number and it's square root is "+root);
		else 
			System.out.println(number+" is NOT a perfect square number and it's square root is "+root);
			
	}
	//Program 3: find consecutive number 
	
	void find3consecutiveNumber(int[] arr) {
		System.out.println("------------------------");
		System.out.println(Arrays.toString(arr));
		boolean flag= false;
		
		for (int i=0; i< arr.length-2 ; i++) {
			
			if 	(arr[i]+1==arr[i+1])	
				if (arr[i+1]+1==arr[i+2]) {
						System.out.println(arr[i]+ " , "+ arr[i+1]+ " , "+ arr[i+2]);
						flag= true;
				}		
			
		}
		if (flag== false)
			System.out.println("No consecutive available");
		
	}
	//Programm 4 //perfect number in range
	void findPerfectNumberinRange(int start, int end) {
		System.out.println("------------------------");
		System.out.println("Perfect number between " +start+" - "+end);

		for (int num=start; num<=end; num++) {
			int sum=1;
			for (int index=2; index<num; index++) {
				if (num%index==0)
					sum+=index;
			}
			if (sum==num)
				System.out.println(num );
		}	
		
	}
	
	public static void main(String[] j) {
		Assignment_31 assignment_31 =new Assignment_31();
		assignment_31.isNumberPerfect(6);
		assignment_31.isNumberPerfect(50);
		
		assignment_31.isPerfectSquare(16);
		assignment_31.isPerfectSquare(-16);
		assignment_31.isPerfectSquare(0);
		
		int[] arr = {10,23,24,25,26,61,62,64,65,66}; 
		int[] arr1 = {10,23,25,25,26,6,62,64,67,66}; 
		
		assignment_31.find3consecutiveNumber(arr);
		assignment_31.find3consecutiveNumber(arr1);
		
		assignment_31.findPerfectNumberinRange(1,100);
			
	}

}
