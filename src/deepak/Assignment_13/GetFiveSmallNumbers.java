//Assignment 13 [Program 3]-[5 smaller numbers of the given number] DATE: 08/15
package deepak.Assignment_13;

public class GetFiveSmallNumbers {
	
	void get5smallNumbers(int num) {
		int[] arr=new int[5];
		int j=0;
		for(j=0;j<5;j++) {
			--num;
			arr[j]=num;
			System.out.print(arr[j]+" ");
		}
	}
	
	public static void main(String[] args) {
		GetFiveSmallNumbers getnumbers=new GetFiveSmallNumbers();
		getnumbers.get5smallNumbers(50);
	}
}
