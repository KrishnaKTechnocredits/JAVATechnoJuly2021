package shreya_assignment_28;

public class NthHighestNumber {
	int getNthHighestNumber(int[] arr,int num) {
		int maxIndexValue=0;
		int max=0;
		for(int index=1;index<=num;index++) {
			max=arr[0];
			for(int index2=1;index2<arr.length;index2++) {
				if(max<arr[index2]) {
					max=arr[index2];
					maxIndexValue=index2;
				}
			}
			arr[maxIndexValue]=0;
		}
		return max;
	}

	public static void main(String[] args) {
		NthHighestNumber nthHighestNumber=new NthHighestNumber();
		int[] arr= {10,23,2,11,55,43,99};
		int num=3;
		System.out.println("Nth highest number is: "+nthHighestNumber.getNthHighestNumber(arr,num));
	}
}
