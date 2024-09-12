package sayli_Vyavhare;

public class NearestToZero_CodingTest_9 {
	
		static void getNearestToZeroInNegative(int[] arr) {

			int temp = 0;
			for (int index = 0; index < arr.length; index++) {

				for (int index1 = index + 1; index1 < arr.length; index1++) {
					if (arr[index] < arr[index1]) {

						temp = arr[index];
						arr[index] = arr[index1];
						arr[index1] = temp;
					}
				}
			}
			
			for(int index2=0;index2<arr.length;index2++) {
			    if(arr[index2]< 0) {
				  System.out.println("Negative number nearest to zero is:"+arr[index2]);
			    break;
			    }
			}
		}

		public static void main(String[] args) {
			int[] arr = {-3,11,123,-11,-9,-55,33,44}; 

			getNearestToZeroInNegative(arr);
		}
	}
