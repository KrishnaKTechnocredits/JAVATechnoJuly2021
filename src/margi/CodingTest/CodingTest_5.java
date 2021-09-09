package margi.CodingTest;

public class CodingTest_5 {

	void getPerfectNumbers() {
		int count=0;
		long sum, number = 1;
		while(count<5) {
			sum=0;
			for(int index=1; index<number; index++) {
				if(number%index==0)
					sum += index;
			}
			if(number == sum) {
				System.out.println(number);
				count++;
			}
			number++;
		}
	}
	
	public static void main(String[] args) {
		CodingTest_5 codingTest_5 = new CodingTest_5();
		codingTest_5.getPerfectNumbers();
	}
}
