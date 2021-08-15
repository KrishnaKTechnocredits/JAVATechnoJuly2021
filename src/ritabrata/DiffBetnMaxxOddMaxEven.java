/*Assignment14:15th Aug'2021
 program 4 : print difference between max odd number and max even number from given array. difference should be positive

int[] input = {1,11,44,23,55,99,23,22};
hint : 99 - 44
output : 55
 */

package ritabrata;

public class DiffBetnMaxxOddMaxEven {
	
	
	void getDiffBetnMaxOddMaxEven(int[] input) {
		int even= input[0];
		int odd= input[0];
		for(int i=0; i<input.length; i++) {
			if(input[i]%2==0) {
				if(even<input[i])
					even=input[i];
			}
				else {
					if(odd<input[i])
						odd=input[i];
				}
				
		}
		if (even > odd) {
			int maxDif = even - odd;
			System.out.println("Difference between max odd and max even number is :" + even + " - " + odd + " = "
					+ maxDif);
		} else {
			int maxDif = odd - even;
			System.out.println("Difference between max odd and max even number is :" + odd + " - " + even + " = "
					+ maxDif);
		}
	}
		
	public static void main(String[] args) {
		DiffBetnMaxxOddMaxEven difference= new DiffBetnMaxxOddMaxEven();
		int[] arr= {1,11,44,23,55,99,23,22};
		difference.getDiffBetnMaxOddMaxEven(arr);
		
		
		

	}

}
