/* P1:
 * find the second highest no. from array
 * int[] arr = {10,23,11,55,43,99}
 * P2:
 * find out the nth highest no.from array*/
package atul_K.Assignments.Ass28;

public class Program1 {
	int getSecondHighestNum(int[] arr) {
		int fH = arr[0];
		int sH = arr[0];
		for (int index =1;index< arr.length;index++) {
		  if (arr[index] > fH) {
			  sH = fH;
			  fH = arr[index];
		  }else if(arr[index] > sH) {
			  sH = arr[index];
		  }
		}
	return sH;
	}
	int getNthHighestNum(int[] arr, int N) {
		int nH = 0;
		int iH = 0;
		int cnt =0;
		if (N > 0) {
			while (cnt != N) {
				int fH = arr[0];
				for (int index =1;index< arr.length;index++) {
				  if (arr[index] > fH) {
					  iH = index;
					  fH = arr[index];
				  }
				}
			cnt++;
			nH =fH;
			arr[iH] = 0;
			}
		}
	return nH;
	}
	
	public static void main(String[] args) {
		int[] arr = {10,23,11,55,43,99};
		Program1 p1 =new Program1();
		System.out.println(p1.getSecondHighestNum(arr));
		System.out.println(p1.getNthHighestNum(arr, 4));
	}
	
}
