// write the difference between max odd and maximum even. Differnce should be positive

package sneha;

public class Assignment_14_4 {
	
	int getMaxOdd(int[] arr) {
		int maxOdd = 0;
		
		for(int index = 0; index < arr.length; index++) {
			if((arr[index] % 2 != 0) && arr[index] > maxOdd) {
				maxOdd = arr[index];
			}
		}
		return maxOdd;
	}
	
	int getMaxEven(int[] arr) {
		int maxEven = 0;
		
		for(int index = 0; index < arr.length; index++) {
			if((arr[index] % 2 == 0) && arr[index] > maxEven) {
				maxEven = arr[index];
			}
		}
		return maxEven;
	}

public static void main(String[] a) {
		
		int ans1 = 0, ans2 = 0;
		int[] arr = {1,11,44,23,55,99,23};
		Assignment_14_4 assignment_14_4 = new Assignment_14_4();
		ans1 = assignment_14_4.getMaxOdd(arr);
		ans2 = assignment_14_4.getMaxEven(arr);
		int ans = ans1 - ans2;
		
		if(ans < 0) {
			ans = - ans;
		}
		System.out.println("Difference between maximum odd and maximum even is " + ans);
	}
}
