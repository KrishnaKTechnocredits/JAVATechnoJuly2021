package anuja_Test;

public class Test8 {

	void display(int[] arr) {

		int value=0;
		int sum=0;
		for(int i=0;i<arr.length-1;i++) {
			int count=1;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j] && arr[j]!=0) {
					arr[j]=0;
					count++;
				}
			}
			if(count%2==0 ) {
				value=count/2;
				sum=sum+value;
			}
			else if(count%2!=0 && count>1 ){
				value=(count-1)/2;
				sum=sum+value;
			}
		}
		System.out.println("The number of pairs in the sock size array is " +sum); 
	}

	public static void main(String[] args) {
		int[] arr= {3,5,6,3,5,3,7,7,8,3,3,5,8,8};
		Test8 test=new Test8();
		test.display(arr);
	}
}
