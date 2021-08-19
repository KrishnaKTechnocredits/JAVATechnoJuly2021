package aniket;

public class DiffSumofEvenOdd {
	int evenSum;
	int oddSum;
	int diff;
	void sumofEven(int[] num) {
		for(int index = 0; index< num.length; index++)
			if(num[index]%2 == 0)
				evenSum = evenSum + num[index];
			else
				oddSum = oddSum + num[index];
	}

	void diffSumofEvenOdd() {
		if(evenSum > oddSum)
			diff = evenSum - oddSum;
		else
			diff = oddSum - evenSum;

		System.out.println("Difference between Sum of even and odd numbers: " +diff);
	}

	public static void main(String[] args) {
		DiffSumofEvenOdd diffsumofevenodd = new DiffSumofEvenOdd();
		int[] arr = {13,22,10,33};
		diffsumofevenodd.sumofEven(arr);
		diffsumofevenodd.diffSumofEvenOdd();

	}
}
