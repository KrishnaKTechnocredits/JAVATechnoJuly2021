//WAP to remove a specific element from an array

package anuja_Codingtest_3;

public class Test3 {
	
	void display(int input[],int x) {
		int k=(input.length)-1;
		int[] arr=new int[k];
		for(int i=0,j=0;i<input.length;i++) {
			if(input[i]==x) {
				continue;
			}
			arr[j]=input[i];
			j++;
		}
		for(int i=0;i<arr.length;i++) {
			
			if (i==(arr.length)-1){
					System.out.print(arr[i]);
		}
			else {
		System.out.print(arr[i]+",");
			}
		}
	}
	
	public static void main(String[] args) {
		Test3 test3=new Test3();
		int input[]= {25,14,56,15,36,56,77,18,29,49};
		int x=14;
		test3.display(input,x);
	}
}
