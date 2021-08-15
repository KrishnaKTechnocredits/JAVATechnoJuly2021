/*program 2 : count number of zero's in given array.
int[] input = {1,-11,0,0,55,0,-23,0};

output : 4

*/
package elizabeth;

class ArrayProgram2{

	int getZeroCount(int[] arr){
		int count=0;
		for(int index=0;index<arr.length;index++){
			if(arr[index]==0){
				count++;
			}
		}
		return count;
	}
	
	public static void main(String[] args){
		
		ArrayProgram2 arrayProgram2= new ArrayProgram2();
		int[] arr= {1,-11,0,0,55,0,-23,0};
		System.out.println("Zeros count from the given array is:");
		System.out.println(arrayProgram2.getZeroCount(arr));
	}
}
