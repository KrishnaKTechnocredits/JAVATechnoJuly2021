package neha.assignment_30;

/*Program 4 : verify given number is a perfect square.
Example: 1,4,9,16,25
*/
public class PerfectSquarePg4 {
	void findAndDisplayPerfectSquare(int num) {
		double sqrt = Math.sqrt(num);
		if (sqrt == Math.floor(sqrt))
			System.out.println("Number " + num + " is perfect square");
		else
			System.out.println("Number " + num + " is not perfect square");
	}

	public static void main(String[] args) {
		PerfectSquarePg4 perfectSquarePg4 = new PerfectSquarePg4();
		int num = 25;
		perfectSquarePg4.findAndDisplayPerfectSquare(num);
		num = 10;
		perfectSquarePg4.findAndDisplayPerfectSquare(num);
	}
}
