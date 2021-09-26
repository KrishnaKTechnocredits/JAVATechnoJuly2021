/*WAP to remove a specific element from an array
int input[]={25,14,56,15,36,56,77,18,29,49};
specific number:14
output[]={25,56,15,36,56,77,18,29,49}*/
package elizabeth;
import java.util.Arrays;

class CodingTest3{
	
	int [] getSpecficNumberFromInputArray(int[] input,int specificNum){
		int index1=0;
		int[] output=new int[input.length-1];
		for(int index=0;index<input.length;index++){
			if(input[index]!=specificNum){
				output[index1]=input[index];
				index1++;
			}
		}
		return output;
	}
	
	public static void main(String[] args){
		CodingTest3 codingTest3=new CodingTest3();
		int input[]={25,14,56,15,36,56,77,18,29,49};
		System.out.println("Output is: " +Arrays.toString(codingTest3.getSpecficNumberFromInputArray(input,14)));
	}
	
}