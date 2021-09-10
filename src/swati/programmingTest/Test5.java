package swati.programmingTest;

/*
 * Test 5 :
Find first 5 perfect numbers.
 */

public class Test5 {
	int count=0;
	void findPerfect(int num) {
		int sum=0;
		for(int index=1;index<=num/2;index++) {
			if(num%index==0) {
			sum=sum+index;
			}
		}
		
		if(sum==num) {
			count++;
			System.out.println(sum);
		}
	}
	
	void findFirstFivePrefect(int range) {
		int input=1;
		while(count<=range) {
			findPerfect(input);
			input++;
		}
	}

	public static void main(String[] a) {
		Test5 t5=new Test5();
		t5.findFirstFivePrefect(5);
	}
}
