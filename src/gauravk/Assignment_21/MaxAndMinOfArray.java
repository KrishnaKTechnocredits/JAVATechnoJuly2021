package gauravk.Assignment_21;
/*
 * Assignment - 21 : 22nd Aug'2021

Find the difference between oldest and youngest family member.
Age is in the form of array.
int[] age = {10,34,38,68,72,95,6};
output : 89
 */
public class MaxAndMinOfArray {
	
	int maxNumFromArray(int[] arr) {
		int max = arr[0];
		for(int i=1; i<arr.length; i++) {
			if(arr[i]>max)
				max=arr[i];
			else max=max;
		}
		return max;
	}

	int minNumFromArray(int[] arr) {
		int min = arr[0];
		for(int i=1; i<arr.length; i++) {
			if(arr[i]<min)
				min=arr[i];
			else min=min;
		}
		return min;
	}
	
	public static void main(String[] args) {
		MaxAndMinOfArray t1 = new MaxAndMinOfArray();
		int[] age = {10,34,38,68,72,95,6};
		System.out.print("The difference between oldest and youngest family member is: "+(t1.maxNumFromArray(age)-t1.minNumFromArray(age)));
	}
}
