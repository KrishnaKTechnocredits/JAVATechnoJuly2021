/*	Test 5 : Find first 5 perfect numbers.
 */

package arti_K.Aarti_Test_5;

public class Test5 {

	void findPerfectNum() {
		System.out.println("First 5 Perfect Numbers are :");
		int count = 0;
		long num = 1;
		while (num > 0) {
			long sum = 0;
				for (int i = 1; i <= num / 2; i++) {
					if (num % i == 0)
						sum = sum + i;
				}
				if(sum == num) {
					System.out.print(num+" ");
					count++;
				}
				if(count == 5)
					break;
			num++;	
		}
	}
	public static void main(String[] args) {
		new Test5().findPerfectNum();
	}

}
