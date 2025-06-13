package elizabeth.coding_test_9;

public class CodingTest9 {

		int getClosestNegNumToZero(int[] arr){
			int output=arr[0];
			for(int num=0;num<=arr.length;num++){
				if(num<0 && num>output){
					output=num;
				}
			}
			return output;
		}
		
		public static void main(String[] args){
			CodingTest9 test9 = new CodingTest9();
			int[]arr = {-3,11,123,-11,-9,-55,33,44};
			System.out.println(test9.getClosestNegNumToZero(arr));
		}
		
	}
