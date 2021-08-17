package trupti;

public class Assignment_11 {

	void toFindOutReqNoToGenerateSum(int no) {
		int sum = 0;
		int count = 0;
		int num = 1;
		while (sum <= no) {
			sum = sum + num;
			count++;
			num++;
		}
		System.out.println("Required total numbers to get sum equals to given parameter are: " + count);

	}

	void toDisplayFirstTenPrimeNumber(int no) {
		System.out.println("------------------------------------------------------ ");
		System.out.println("First ten prime nos are: ");
		int number = 2;
		int count = 0;
		while (count < no) {
			boolean status = true;
			int index = 2;
			while (index < number) {
				if (number % index == 0) {
					status = false;
					break;
				}
				index++;
			}
			if (status) {
				System.out.println(index);
				count++;
			}
			number++;
		}
	}

	public static void main(String[] args) {
		Assignment_11 assignment_11 = new Assignment_11();
		assignment_11.toFindOutReqNoToGenerateSum(150);
		assignment_11.toDisplayFirstTenPrimeNumber(10);
	}
}
