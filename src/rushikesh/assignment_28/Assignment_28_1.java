package rushikesh.assignment_28;

public class Assignment_28_1 {
	int getSecondHigh(int[] arr) {
	int maxNum=0;
	int secondMax=0;
	for(int index=0;index<arr.length;index++) {
		if(arr[index]>maxNum) {
			secondMax=maxNum;
			maxNum=arr[index];
		}else if(arr[index]>secondMax) {
			secondMax=arr[index];
		}
	}
	return secondMax;
}
	public static void main(String[] args) {
		Assignment_28_1 assignment_28_1= new Assignment_28_1();
		int[] arr = {10,23,2,11,55,43,99};
		int secMax=assignment_28_1.getSecondHigh(arr);
		System.out.println("Second high number is"+secMax);
	}
}
