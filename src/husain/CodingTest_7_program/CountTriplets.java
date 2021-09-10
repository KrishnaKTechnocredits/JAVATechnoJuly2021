package husain.CodingTest_7_program;

import java.util.Arrays;

public class CountTriplets {
	
	boolean findTriplets(int num1, int num2, int num3) {
		
		if(num2>num1&&num3>num2)
			return true;
		return false;
		
	}
	
	void loopArray(int arr[]) {
		
		int count = 0;
		for(int index = 0; index < arr.length; index++) {
			if(index+2<arr.length) {
				if(findTriplets(arr[index], arr[index+1], arr[index+2]))
					count++;
			}
		}
		
		System.out.println("The count of increasing triplets in the given array "+Arrays.toString(arr)+" is "+count);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CountTriplets obj = new CountTriplets();
		int arr[] = {10,9,11,6,23,25,22,66,74};
		obj.loopArray(arr);

	}

}
