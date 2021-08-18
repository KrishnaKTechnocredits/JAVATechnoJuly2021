package prajwal;

public class MaximumNo {

int findMaxNo(int[] arr) 
	{
	int Max=arr[0];
	for(int i=0; i<arr.length ; i++) {
	if(Max<arr[i])
	Max=arr[i];
	}
	 return Max;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	MaximumNo assignment14=new MaximumNo();
	int[] arr= {1,11,44,23,55,99,23};
	System.out.println("greatest number is "+ assignment14.findMaxNo(arr));
	}

}
