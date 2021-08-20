package tarang;

public class Assignment_11 {
	
	int count = 0;

	void getPrimeNum(int num) {

		boolean flag = true;
		int index = 2;
		while (index < num) {

			if (num % index == 0) {
				flag = false;
				break;
			}
			index++;
		}
		if (flag) {
			System.out.print(num + ",");
			count++;
		}
	}

	void setNum(int num) {
		int index = 2;
		while (num > count) {
			getPrimeNum(index);
			index++;
		}
	}

	void sumOfNumbers() {
		int sum = 0;
		int count = 0;
		int index = 1;
		while (sum < 100) {
			sum = sum + index;
			index++;
			count++;
		}
		System.out.println("Total required numbers to generate sum more than 100 are : " + count);
	}

	public static void main(String args[]) {
		Assignment_11 assignment_11 = new Assignment_11();
		System.out.print("First 10 prime numbers are : ");
		assignment_11.setNum(10);
		System.out.println();
		assignment_11.sumOfNumbers();

	}

}

