package anuja_Test;

public class Test5 {
	
	void display() {
		long sum;
		int count=1;
		while(count<=5) {
			for (long num=1;count<=6;num++) {
				sum=0;
				for(int j=1;j<num;j++) {
					if(num%j==0) {
						sum+=j;
					}
				}
				if(sum==num ) {
					System.out.println(sum);
					count++ ;
				}
			}
		}
	}

	public static void main(String[] args) {
		Test5 test5=new Test5();
		test5.display();
	}
}
