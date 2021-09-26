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
output : ------*/
package sagar_Anasane;

public class Assignment31 {
	int givenNoIsPerfectOrNot(int num) {
		int sum=0;
		for(int index=1;index<num;index++) {
			if(num%index==0) {
				sum=sum+index;
			}
		}
		if(num==sum) {
			System.out.println(num+" is a Perfect Number");
		}else
			System.out.println(num+" is not a Perfect Number");
		return num;
	}
	
	void givenNoIsPerfectSquare(int num) {
		int var=0;
		for(int index=1;index<num;index++) {
			if(num%index==0) {
				var=num/index;
			}
		}
		if(num==(var*var)) {
				System.out.println(num+" is a Perfect Sqaure");
			}else
				System.out.println(num+" is not a Perfect Sqaure");
	}
	
	void findAllPerfectNosInGivenRange(int start,int end) {
		int sum=0;
		int num=0;
		boolean flag=false;
		for(int index=start;index<=end;index++) {
			num=index;
			for(int nIndex=1;nIndex<start;nIndex++) {
				if(index%nIndex==0&&index!=nIndex) {
					sum=sum+nIndex;
					//System.out.println(sum);
				}
			}
			if(num==sum) {
				flag=true;
				System.out.println(num);
			}else
				flag=false;
		}
		if(flag==false) {
			System.out.println("Perfect numbers not available for the Given Range");
		}
		//System.out.println(sum);
	}
	void findThePairsInIncreasingOrder(int[] arr){
		int count=0;
		for(int index=0;index<arr.length-2;index++) {
			if(arr[index]<arr[index+1]) {
				if(arr[index+1]==arr[index]+1) {
					if(arr[index+2]==arr[index]+2) {
						count++;
					}
				}
			}
		}
		System.out.println("Number of Pairs in Increasing Order :"+count);
	}
		
	public static void main(String[] args){
		int[] arr = {10,23,24,25,26,61,62,64,65,66};
		Assignment31 assignment31 = new Assignment31();
		assignment31.givenNoIsPerfectOrNot(6);
		assignment31.givenNoIsPerfectOrNot(50);
		//System.out.println("\n");
		assignment31.givenNoIsPerfectSquare(25);
		assignment31.givenNoIsPerfectSquare(20);
		assignment31.findAllPerfectNosInGivenRange(40,170);
		assignment31.findThePairsInIncreasingOrder(arr);
	}
}
