package priti;

public class Assingment_28_1 {
	
	void find2ndHightestNumFromArray(int [] arr) { 
		int max=0;
		int secondMax=0;
		if (arr[0]>arr[1]) {
			max=arr[0];
		}else {
			max =arr[1];
			secondMax=arr[0];
		}
		for (int index=2;index<arr.length;index++) {
			if (max<arr[index]) {
				secondMax=max;
				max=arr[index];
				
			}else if (secondMax<arr[index]){
				secondMax= arr[index];
			}
		}
		System.out.println("Max is :"+ max);
		System.out.println("secondMax is :"+ secondMax);
	}
	
	public static void main(String[] a) {
		Assingment_28_1 assingment_28_1 =new Assingment_28_1();
		int[] arr = {10,23,2,11,55,43,99};
		assingment_28_1.find2ndHightestNumFromArray(arr);
		
	}
	
}

/*else if (arr[index]>max)
	else if (arr[index]<max && arr[index]>secondMax) {
		secondMax=arr[index]*/
/*Program 1: Find second highest number from array.
int[] arr = {10,23,2,11,55,43,99};
output : 55*/

