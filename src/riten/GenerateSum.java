package riten;

class GenerateSum {

	int Sum = 0;
	int totalCount = 1;

	void generateTotal(int num) {
		int index = 1;

		while (index <= num) {
			Sum = Sum + index;
			if (Sum >= num) {

				break;
			}
			index++;
			totalCount++;
		}
		System.out.println("Num is " + index);
		System.out.println("Total num to get 100 is " + totalCount);
	}


	public static void main(String[] args) {
		GenerateSum generatesum = new GenerateSum();
		generatesum.generateTotal(100);
	}

}
