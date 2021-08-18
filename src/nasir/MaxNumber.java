package nasir;

public class MaxNumber {
	
	public int numberMaximum(int[] arr) {
		int max=0;
		for(int index=0;index<arr.length;index++) {
			if(arr[index]>max)
			{
				max=arr[index];
			}
			
		}
		return max;
		
	}

	public static void main(String[] args) {
		int[] input={1,11,44,23,55,99,23};
		MaxNumber maxNumber=new MaxNumber();
		System.out.println(maxNumber.numberMaximum(input));
		

	}

}
