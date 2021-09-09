package neha.assignment_30;

/*Program 3 : Verify given number is a perfect number or not.
Input: n = 15
Output: false
Divisors of 15 are 1, 3 and 5. Sum of 
divisors is 9 which is not equal to 15.

Input: n = 6
Output: true
Divisors of 6 are 1, 2 and 3. Sum of 
divisors is 6.*/
public class PerfectNumPg3 {
	void findAndDisplayPerfectNum(int num) {
		int sum = 0;
		for (int index = 1; index <= num/2; index++) {
			if (num % index == 0)
				sum += index;
		}
		if (sum == num)
			System.out.println("Number " + num + " is a perfect number");
		else
			System.out.println("Number " + num + " is not a perfect number");

	}

	public static void main(String[] args) {
		PerfectNumPg3 perfectNumPg3 = new PerfectNumPg3();
		int num = 6;
		perfectNumPg3.findAndDisplayPerfectNum(num);
		num = 15;
		perfectNumPg3.findAndDisplayPerfectNum(num);
	}
}
