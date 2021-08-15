/*program 1 : return count of positive numbers from given array.
int[] input = {1,-11,-44,23,55,-99,-23,-22};
output : 3
*/
package elizabeth;

class ArrayProgram1{

	int getPositiveCount(int[] input){
		int count=0;
		for(int index=0;index<input.length;index++){
			if(input[index]>0){
				count++;
			}
		}
		return count;
	}
	
	public static void main(String[] args){
		
		ArrayProgram1 arrayProgram1= new ArrayProgram1();
		int[] input = {1,-11,-44,23,55,-99,-23,-22};
		System.out.println("Positive Numbers count from the given array is:");
		System.out.println(arrayProgram1.getPositiveCount(input));
	}
}
