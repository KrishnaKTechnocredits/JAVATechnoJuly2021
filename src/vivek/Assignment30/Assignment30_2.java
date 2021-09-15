package vivek.Assignment30;

public class Assignment30_2 {

	void armstrongNumber(int num) {
		int sum = 0;
		int r = 0;
		int num1 = num;
		while (num1 > 0) {
			r = num1 % 10;
			sum += (r * r * r);
			num1 = num1 / 10;
		}
		if (num == sum)
			System.out.println(num + " is an armstrong number");
		else
			System.out.println(num + " is not an armstrong number");
	}

	public static void main(String[] args) {
		Assignment30_2 assignment30_2 = new Assignment30_2();
		int num = 153;
		assignment30_2.armstrongNumber(num);
	}
}
