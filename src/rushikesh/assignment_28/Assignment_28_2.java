package rushikesh.assignment_28;

public class Assignment_28_2 {
	
	int getMax(int[] arr) {
		int maxNum=0;
		int maxIndex=0;
		for(int index1=0;index1<arr.length;index1++) {
			if(arr[index1]>maxNum) {
				maxNum=arr[index1];
				maxIndex=index1;
			}
		}
		arr[maxIndex]=0;
		return maxNum;
	}
	
	int getNthHigh(int[] arr,int nth) {
		int nthmax=0;
		for(int index2=0;index2<nth;index2++) {
			nthmax=getMax(arr);
		}
		return nthmax;
	}
	public static void main(String[] args) {
		Assignment_28_2 assignment_28_2= new Assignment_28_2();
		int[] arr = {10,23,2,11,55,43,99};
		int nthMax=assignment_28_2.getNthHigh(arr,3);
		System.out.println("Nth Highest number is"+nthMax);
	}
}
