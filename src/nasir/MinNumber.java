package nasir;

public class MinNumber {
	int numberMin(int[] arr) {
		int min=arr[0];
		for(int index=0;index<arr.length;index++) {
			if(arr[index]<min) {
				min=arr[index];
			}
			
		}
		return min;
	}

	public static void main(String[] args) {
		int[] input = {1,11,44,23,55,99,23};
		MinNumber minNumber=new MinNumber();
		System.out.println(minNumber.numberMin(input));

	}

}
