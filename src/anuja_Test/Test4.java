// Shift all zeroes at the end of array int[] arr={1,0,0,6,0,2,3,0,4,0,5} O/P 1,6,2,3,4,5,0,0,0,0,0
package anuja_Test;

public class Test4 {
	int count=-1;

	void display(int[] arr) {
		int[] output=new int[arr.length];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==0) {
				count++;
				output[(arr.length-1)-count]=arr[i];
			}
			else 
				output[i-count-1]=arr[i];
		}
		for(int i=0;i<output.length;i++) {
			if(i==0)
				System.out.print("{"+output[i]+",");
			else if(i==output.length-1)
				System.out.print(output[i]+"}");
			else
				System.out.print(output[i]+",");
		}
	}

	public static void main(String[] args) {
		int[] arr={1,0,0,6,0,2,3,0,4,0,5};
		Test4 test4=new Test4();
		test4.display(arr);
	}
}
