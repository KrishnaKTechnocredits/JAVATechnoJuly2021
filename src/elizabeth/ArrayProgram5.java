/*program 2 : find minimum number from given array.
int[] input = {1,11,44,23,55,99,23};
output : 11
*/
package elizabeth;

class ArrayProgram5{
	
	int getMinNumber(int[] input){
		int minNum=input[0];
		for(int index=0;index<input.length;index++){
			if(input[index]<minNum){
				minNum=input[index];
			}
		}
		return minNum;
	}
	
	public static void main(String[] args){
		int[] input={1,11,44,23,55,99,23};
		ArrayProgram5 arrayProgram5=new ArrayProgram5();
		System.out.println("Min Number is:");
		System.out.println(arrayProgram5.getMinNumber(input));
		
	}
}