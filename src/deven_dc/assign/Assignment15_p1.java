package deven_dc.assign;

public class Assignment15_p1 {
	static int x = 10;
	int getDiffEvenOddLength(String[] num) {
		int sumEven = 0;
		int sumOdd = 0;
		for (int index=0; index < num.length; index++) {
			if(num[index].length() % 2 == 0)
				sumEven+= num[index].length();
			else
				sumOdd+= num[index].length();
		}
		return sumEven - sumOdd;
	}

	public static void main(String[] args) {
		 String[] input = {"Mon","Chan","Ross","Rach","Joe","Phibs"};
		Assignment15_p1 a15_p1 = new Assignment15_p1();
		System.out.println("Difference of Even Length Name & Odd Length Name = "+a15_p1.getDiffEvenOddLength(input));
	}
}
