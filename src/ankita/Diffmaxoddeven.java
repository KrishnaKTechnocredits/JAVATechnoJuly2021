package ankita;

public class Diffmaxoddeven {

	int getMaxEvenOddDiff(int[] num) {
		int evenmax = 0;
		int oddmax = 0;
		for (int index = 0; index < num.length; index++) {
			if (num[index] % 2 == 0) {
				if (num[index] > evenmax)
					evenmax = num[index];
			} else if (num[index] > oddmax)
				oddmax = num[index];
		}
		if (oddmax - evenmax > 0)
			return oddmax - evenmax;
		else
			return evenmax - oddmax;
	}

	public static void main(String[] args) {
		int[] number = { 1, 11, 44, 23, 55, 99, 23, 22 };
		Diffmaxoddeven M1= new Diffmaxoddeven();
		System.out.println("Diff between Evenmax and OddMax is " +M1.getMaxEvenOddDiff(number));
	}
	
	
}
