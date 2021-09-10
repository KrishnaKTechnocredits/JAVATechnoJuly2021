package husain.Assignment31;

import java.util.Arrays;

public class Program3 {
	
	boolean findConsecutive(int num1, int num2, int num3) {
		if(num2 == num1 + 1 && num3 == num2 + 1)
			return true;
		return false;
		
	}
	
	void loopArray(int arr[]) {
		
		int count = 0;
		
		for(int index = 0; index < arr.length; index++) {
			if(index+2<arr.length)
				if(findConsecutive(arr[index], arr[index+1], arr[index+2]))
					count++;
		}
		System.out.println("The count of cosnecutive numbers in the given array "+Arrays.toString(arr)+" is "+count);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Program3 obj =new Program3();
		int[] arr = {10,23,24,25,26,61,62,64,65,66};
		obj.loopArray(arr);

	}

}
