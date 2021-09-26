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
output : ------ */


package ritabrata;
import java.lang.Math;
public class Assignment31 {
	
	void perfectNo(int input) {
		int number=input;
		int sum=0;
		for(int index=1;index<input;index++) {
			if(number%index==0) {
				sum+=index;
			}
		}
		if(input==sum) 
			System.out.println("The input: "+input+" is a perfect number");
		else
			System.out.println("The input: "+input+" is not a perfect number");	
	}
	
	void getPerfectSquare(int input) {
		int sqrt, temp=0;
		sqrt= (int) Math.sqrt(input);
		temp=sqrt*sqrt;
		if(temp==input)
			System.out.println("The numuber: "+input+" is a perfect square");
		else
			System.out.println("The numuber: "+input+ " is not a perfect square");	
	}
	
	void getConsNumber(int[] input) {
		int count=0;
		int temp=0;
		for(int index=1; index<input.length-1; index++) {
			int ch=input[index];
			if (2*ch==(input[index-1]+input[index+1])) {
				temp=ch;
				System.out.println("The three consecutive numbers are: "+(temp-1)+" "+(temp)+" "+(temp+1));
				count++;
			}
		}
		System.out.println("The total number of sets are: "+count);
	}
	
	void findPerfectRange(int lr, int ur) {	
		for(int input=lr; input<=ur; input++) {
			int number=input;
			int sum=0;
			for(int index=1;index<input;index++) {
				if(number%index==0) {
					sum+=index;
				}
			}
			if(input==sum) 
				System.out.println("The input: "+input+" is a perfect number");
			
		}	
	}

	public static void main(String[] args) {
		Assignment31 assignment= new Assignment31();
		assignment.perfectNo(6);
		System.out.println("------------------------------------------");
		assignment.getPerfectSquare(25);
		assignment.getPerfectSquare(30);
		System.out.println("------------------------------------------");
		int[] arr = {10,23,24,25,26,61,62,64,65,66};
		assignment.getConsNumber(arr);
		System.out.println("------------------------------------------");
		assignment.findPerfectRange(6, 40);
		

	}

}
