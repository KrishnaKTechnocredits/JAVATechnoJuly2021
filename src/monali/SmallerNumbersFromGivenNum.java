package monali;

public class SmallerNumbersFromGivenNum {
		/*
		 * program 3 : write a method which returns 5 smaller numbers of the given
		 * number. input : 50 output : 49, 48, 47, 46, 45
		 * 
		 */
		int[] getSmallerNumbers(int num) {

			int[] output = new int[5];
			for (int index = 0; index < 5; index++) {

				num--;
				output[index] = num;
				// System.out.println(output[index]);
			}
			return output;
		}

		public static void main(String[] args) {
			SmallerNumbersFromGivenNum smallernumbers = new SmallerNumbersFromGivenNum();
			int[] output = smallernumbers.getSmallerNumbers(50);
			for (int index = 0; index < 5; index++) {
				System.out.println(output[index]);
			}

		}
	}


