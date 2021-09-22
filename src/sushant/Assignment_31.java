/*Program 1: verify given number is a perfect number or not.
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
*/

package sushant;

import java.util.Arrays;
import java.util.Scanner;

public class Assignment_31 {
	void getPerectNumber(int number) {
		int count=1;
		int sum=0;
		while(count<number) {
			if(number%count==0) 
				sum=sum+count;
			count++;
		}
		if(sum==number)
			System.out.println("Output: "+number+ " is perfect number");
		else
			System.out.println("Output: "+number+" is not a perfect number");
	}
	void getSqaureNumber(int number) {
		double out=Math.sqrt(number);
		if(out==(int)out)
			System.out.println("Output: "+number+" is perfect Square number");
		else
			System.out.println("Output: "+number+" is not a perfect square number");
	}
	void getTripleNumbers(int[] arr) {
		int count=0;
		for(int index=0;index<arr.length;index++) {
			if(index<=arr.length-3) {
			if(arr[index]+1== arr[index+1] &&arr[index]+2==arr[index+2]) {
				count++;
			}
		}
	}
	System.out.print(count);
	}
	boolean getPerfect(int startIndex,int lastIndex) {
		boolean result=false;
		System.out.print("Perfect numbers are : ");
		for(int index=startIndex;index<lastIndex;index++) {
		int count=1;
		int sum=0;
			while(count<index) {
				if(index%count==0) 
					sum=sum+count;
				count++;
			}
		if(sum==index) {
			System.out.print(index+" ");
			result=true;
		}
		}
		return result;
	}
	public static void main(String[] args) {
		Assignment_31 assignment_31=new Assignment_31();
		System.out.println("************Perfect Number************");
		System.out.print("Enter number:");
		Scanner scanner=new Scanner(System.in);
		int number=scanner.nextInt();
		assignment_31.getPerectNumber(number);
		System.out.print("Enter number:");
		number=scanner.nextInt();
		assignment_31.getPerectNumber(number);
		System.out.println("************Perfect Sqaure ************");
		System.out.print("Enter number : ");
		number=scanner.nextInt();
		assignment_31.getSqaureNumber(number);
		System.out.print("Enter number : ");
		number=scanner.nextInt();
		assignment_31.getSqaureNumber(number);
		System.out.println("************Program 3**********");
		int[] arr = {10,23,24,25,26,61,62,64,65,66};
		System.out.println(Arrays.toString(arr));
		System.out.print("Triple which in sequence: ");
		assignment_31.getTripleNumbers(arr);
		System.out.println("\n************Program 4************");
		System.out.print("Enter start range : ");
		int start=scanner.nextInt();
		System.out.print("Enter End range : ");
		int endRange=scanner.nextInt();

		if(!assignment_31.getPerfect(start,endRange)) 
			System.out.println("No perfect numbers found in the given range ");


	}
}
