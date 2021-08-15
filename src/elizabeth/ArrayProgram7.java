/*program 4 : print difference between max odd number and max even number from given array. difference should be positive

int[] input = {1,11,44,23,55,99,23,22};
hint : 99 - 44
output : 55
*/
package elizabeth;

class ArrayProgram7{

	int getDiffOfMaxOddAndMaxEven(int[] arr){
			int maxOdd=arr[0];
			int maxEven=arr[0];
			int difference=0;
			for(int index=0;index<arr.length;index++){
				if(arr[index]%2!=0){
					if(arr[index]>maxOdd){
						maxOdd=arr[index];
					}
				}else{
					if(arr[index]>maxEven){
						maxEven=arr[index];
					}
				}
			}
			if(maxOdd>maxEven){
				difference=maxOdd-maxEven;
			}else{
				difference=maxEven-maxOdd;
			}
			return difference;
	}
	
	public static void main(String[] args){
		int[] arr = {1,11,44,23,55,99,23,22};
		ArrayProgram7 arrayProgram7=new ArrayProgram7();
		System.out.println("Difference between max odd number and max even number from given array:");
		System.out.println(arrayProgram7.getDiffOfMaxOddAndMaxEven(arr));
		
	}
}
	