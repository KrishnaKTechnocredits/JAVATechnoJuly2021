/*Assignment 13 : 15th Aug'2021

program 1 : return count of positive numbers from given array.
int[] input = {1,-11,-44,23,55,-99,-23,-22};
output : 3

program 2 : count number of zero's in given array.
int[] input = {1,-11,0,0,55,0,-23,0};

output : 4


program 3 : write a method which returns 5 smaller numbers of the given number.
input : 50
output : 49, 48, 47, 46, 45 */



package mayur;

public class Assignment13 {
	
	void countOfPositiveNumber(int[] input){
		int count =0;
		for(int index=0; index<input.length;index++) {
			if(input[index]>0) 
				count++;
		}System.out.println("count of positive numbers :"+count);		
	}
	void countOfZerosNumber(int[]arr) {
		int count =0;
		for(int index=0; index<arr.length; index++) {
			if(arr[index]==0)
				count++;
		}System.out.println("count number of zero's in given array :"+count);
	}
	
	void getSmallerNumberOfArray(int num) {
		int[] arr = new int[5];
		for (int index = 0; index < 5; index++) {
			num--;
			arr[index] = num;
		    System.out.print(arr[index]+" ");
		}
	}
	public static void main(String[] args) {
		Assignment13 assignment13 = new Assignment13();
		int [] input = { 1, -11, -44, 23, 55, -99, -23, -22 };
		assignment13.countOfPositiveNumber(input);
		int[] arr = {1,-11,0,0,55,0,-23,0};
		assignment13.countOfZerosNumber(arr);
		assignment13.getSmallerNumberOfArray(50);
	}

}
