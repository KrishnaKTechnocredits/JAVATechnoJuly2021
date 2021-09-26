/*Assignment - 28 : 4th Sep'2021 

Program 1: Find second highest number from array.
int[] arr = {10,23,2,11,55,43,99};
output : 55

Program 2: Find nth highest number from array.
int[] arr = {10,23,2,11,55,43,99};
input n = 3;
output : 43

Note : Please watch session recording for hints*/
package sagar_Anasane;

public class Assignment28 {
	int nThMaxNo = 0;
	void secondHighestNoFromArray(int[] arr) {
		int firstMaxNo = arr[0];
		int secondMaxNo = arr[1];
		if(firstMaxNo>secondMaxNo) {
			firstMaxNo = secondMaxNo;
		}
		for (int index=0; index<arr.length;index++) {
				if(arr[index]>firstMaxNo) {
					secondMaxNo = firstMaxNo;
					firstMaxNo = arr[index];
				}else if(secondMaxNo>arr[index]) {
					secondMaxNo = arr[index];
				}	
		}
		System.out.println("Second Max No :"+secondMaxNo);
		nThMaxNo = secondMaxNo;
	 }
	
	void nThHighestNoFromArray(int[] arr,int n) { 
		int cnt=0;
		int temp=0;
		if(cnt<n) {
			for(int index=0;index<arr.length;index++) { //{10,23,2,11,55,43,99};
				for(int nIndex=0;nIndex<arr.length;nIndex++) {
					if(arr[index]>arr[nIndex]) {
						temp=arr[index];
						arr[index]=arr[nIndex];
						arr[nIndex]=temp;
					}
				}
				cnt++;
			}
		}
		/*for(int index=0;index<arr.length;index++) {
			System.out.print(" "+arr[index]);
		}*/
		System.out.println("\n"+"nTh Highest no as per input Given : "+arr[n-1]);
	}
	public static void main(String[] args) {
		int[] arr = {10,23,2,11,55,43,99};
		Assignment28 assignment28 = new Assignment28();
		assignment28.secondHighestNoFromArray(arr);
		assignment28.nThHighestNoFromArray(arr,3);
	}
}
