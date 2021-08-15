/*program 1 : find maximum number from given array.

int[] input = {1,11,44,23,55,99,23};
output : 99
*/
package elizabeth;

class ArrayProgram4{
	
	int getMaxNumber(int[] input){
		int maxNum=input[0];
		for(int index=0;index<input.length;index++){
			if(input[index]>maxNum){
				maxNum=input[index];
			}
		}
		return maxNum;
	}
	
	public static void main(String[] args){
		int[] input={1,11,44,23,55,99,23};
		ArrayProgram4 arrayProgram4=new ArrayProgram4();
		System.out.println("Max Number is:");
		System.out.println(arrayProgram4.getMaxNumber(input));
	}
}