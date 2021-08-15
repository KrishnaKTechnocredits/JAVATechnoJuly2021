/*program 3 : write a method which returns 5 smaller numbers of the given number.
input : 50
output : 49, 48, 47, 46, 45 */

package elizabeth;

class ArrayProgram3{

	void get5SmallerNumbers(int num){
			int[] output=new int[5];
			for(int index=0;index<5;index++){
				num--;
				output[index]=num;
				System.out.println(output[index]);
			}
		}
		public static void main(String[] args){
			
			ArrayProgram3 arrayProgram3= new ArrayProgram3();
			System.out.println("Below are the 5 smaller numbers from the given number: ");
			arrayProgram3.get5SmallerNumbers(50);
		}
}