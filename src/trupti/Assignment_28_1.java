package trupti;

public class Assignment_28_1 {
	
	public static void main(String[] args){
		Assignment_28_1 max=new Assignment_28_1();
		int[] arr={10,23,2,11,55,43,99};
		max.secondMaxNumber(arr);
	}
	
	void secondMaxNumber(int[] input){
		int max=23;
		int secondMax=10;
		for(int index=2; index<input.length; index++){
			if(input[index]>max){
				secondMax=max;
				max=input[index];
			}
			else if(secondMax<input[index]){
				secondMax=input[index];
			}
		}
		System.out.println("Secondhighest no in array is:" +secondMax);
	}
}
