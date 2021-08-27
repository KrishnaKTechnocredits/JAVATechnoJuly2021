package riten;

class Assignment_7 {

	void even_Number(int start_Index, int end_Index) {
		System.out.println("Range to find even numbers: " + start_Index + " to " + end_Index);

		for (int index = start_Index; index <= end_Index; index++) {

			if (index % 2 == 0) {
				System.out.println(index + " is Even Number");
			}

		}

	}

	void divisible_5(int start_Index, int end_Index) {

		for (int index = start_Index; index <= end_Index; index++) {
			if (index % 5 == 0) {
				System.out.println(index + " Is divisiable by 5");
			}

		}

	}

	void divisiable_5_3(int start_Index, int end_Index) {

		for (int index = start_Index; index <= end_Index; index++) {
			if (index % 3 == 0 && index % 5 == 0) {
				System.out.println(index + " Num is divisiable by 3 & 5");
			}

		}

	}

	void divisiable_7_or_13(int start_Index, int end_Index) {

		for (int index = start_Index; index <= end_Index; index++) {
			if (index % 7 == 0) {
				System.out.println(index + " Num is div by 7");

			} else if (index % 13 == 0) {
				System.out.println(index + " Num is div by 13");
			}

		}

	}

	void sum_Of_All(int start_Index, int end_Index) {
		int sum = 0;
		for (int index = start_Index; index <= end_Index; index++) {
			sum = sum + index;
		}
		System.out.println("Total sum is :" + sum);
	}

	void sum_Of_Odd_Even(int start_Index, int end_Index) {
		int difference = 0;
		int evensum = 0;
		int oddsum = 0;
		for (int index = start_Index; index <= end_Index; index++) {
			if (index % 2 == 0) {
				evensum = evensum + index;
			}

			else if (index % 2 != 0) {
				oddsum = oddsum + index;
			}

		}

		difference = oddsum - evensum;
		System.out.println("difference between sum of odd numbers and even numbers is: " + difference);

	}

	void reverserOrder(int start_Index, int end_Index) {
		for (int index = start_Index; index >= end_Index; index--) {
			if (index % 2 != 0) {
				System.out.println("reverser Odd num is :" + index);
			}

		}

	}

	public static void main(String[] args) {
		Assignment_7 assignment_7 = new Assignment_7();
		assignment_7.even_Number(10, 15);
		System.out.println("----Check div 5 numbers---");
		assignment_7.divisible_5(10, 30);
		System.out.println("----Check div by 3 and 5 numbers---");
		assignment_7.divisiable_5_3(5, 18);
		System.out.println("----Check div by 7 or 13 numbers---");
		assignment_7.divisiable_7_or_13(5, 40);
		System.out.println("----Check sum_Of_All numbers---");
		assignment_7.sum_Of_All(1, 5);
		System.out.println("----Check sum_Of_Odd_Even numbers---");
		assignment_7.sum_Of_Odd_Even(3, 9);
		System.out.println("----Check reverserOrder odd	numbers---");
		assignment_7.reverserOrder(20, 10);
	}

}