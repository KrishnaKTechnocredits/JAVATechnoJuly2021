package devendra_SurprizeTest;
/*Count the number of triplets in increasing order*/
import java.util.Arrays;

public class CodingTest7_10Sept {
	boolean getTriplets(int num1, int num2, int num3) {
		if(num2 > num1 && num3 > num2)
			return true;
		return false;
	}
	
	void loopArray(int arr[]) {
		int count = 0;
		for(int index = 0; index < arr.length; index++) {
			if(index + 2 < arr.length) {
				if(getTriplets(arr[index], arr[index + 1], arr[index + 2]))
					count++;
			}
		}
		System.out.println("Count of Increasing Triplets is "+count);
	}

	public static void main(String[] args) {
		CodingTest7_10Sept obj = new CodingTest7_10Sept();
		int arr[] = {10,9,11,6,23,25,22,66,74};
		System.out.println("Input Array = "+Arrays.toString(arr));
		obj.loopArray(arr);
	}
}
