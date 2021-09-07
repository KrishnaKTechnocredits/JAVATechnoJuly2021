package siddharth;

	public class Assignment28_1 {

		void getSecondHighestNumber(int[] arr) {
			int maxNo = 0;
			int cnt = 0;
			int secondMax = 0;
			for (int index = 0; index < arr.length; index++) {
				if (arr[index] > maxNo) {
					maxNo = arr[index];
					cnt = index;
				}
			}
			arr[cnt] = 0;
			for (int index1 = 0; index1 < arr.length; index1++) {
				if (arr[index1] > secondMax)
					secondMax = arr[index1];
			}
			System.out.println(secondMax);
		}

		public static void main(String[] args) {
			Assignment28_1 assignment28_1 = new Assignment28_1();
			int[] arr = { 10, 23, 2, 11, 55, 43, 99 };
			assignment28_1.getSecondHighestNumber(arr);
		}
	}

