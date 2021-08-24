package sushant;

public class Assignment_21 {

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
		Assignment_21 assignment_21 = new Assignment_21();
		int[] age = {10,34,38,68,72,95,6};
		System.out.print("The difference between oldest and youngest family member is: "+(assignment_21.maxNumFromArray(age)-assignment_21.minNumFromArray(age)));
	}
}