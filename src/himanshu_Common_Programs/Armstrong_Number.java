package himanshu_Common_Programs;

public class Armstrong_Number {

	void Armstrong_Method(int no) {

		int sum = 0;
		int temp = no;

		while (temp % 10 != 0){
			int b = temp / 10;
			int p = temp % 10;
			int d = p * p * p;
			sum = d + sum;
			temp = b;
		}

		if (sum == no)
			System.out.println(no + " Number is Armstrong Number");
		else
			System.out.println(no + " Number is not Armstrong Number");
	}

	public static void main(String[] args) {

		Armstrong_Number arm = new Armstrong_Number();
		arm.Armstrong_Method(153);
	}
}
