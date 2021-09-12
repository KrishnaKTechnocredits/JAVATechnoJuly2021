package mratunjay.Assignment_31;

public class Program_2 {

	void getPerfectSquareNumbers(int N) {
		boolean flag = true;
		int num = 0;
		for (int index = 1; index <= N/2; index++) {

			for (int j = 1; j <= N/2; j++) {

				if (index == j)
				num = index * j;

				if (num == N) {
					flag = true;
					break;
				} else
					flag = false;
			}

			if (flag)
				break;

		}

		if (flag) {

			System.out.println("Number is perfect square:   " + N);
		} else

			System.out.println("Number is not perfect square:   " + N);
	}

	public static void main(String[] args) {

		Program_2 P_5 = new Program_2();
		P_5.getPerfectSquareNumbers(36);

	}

}
