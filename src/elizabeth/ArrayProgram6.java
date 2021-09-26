/*program 3 : print difference between max and min number from given array.
int[] input = {1,11,44,23,55,99,23};
output : 98*/

package elizabeth;

class ArrayProgram6{

	int getDiffOfMaxAndMin(int[] input){
			int maxNum=input[0];
			int minNum=input[0];
			for(int index=0;index<input.length;index++){
				if(input[index]>maxNum){
					maxNum=input[index];
				}
				if(input[index]<minNum){
					minNum=input[index];
				}
			}	
			int difference=maxNum-minNum;
			return difference;
		}
	
	public static void main(String[] args){
		int[] input={1,11,44,23,55,99,23};
		ArrayProgram6 arrayProgram6=new ArrayProgram6();
		System.out.println("Difference between max and min number from given array:");
		System.out.println(arrayProgram6.getDiffOfMaxAndMin(input));
	}
}