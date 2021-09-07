/*WAP to remove a specific element from an array
int input[] = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
specific number: 14
output[] = {25, 56, 15, 36, 56, 77, 18, 29, 49}
*/

package indrani;
import java.util.Arrays;

public class CodingTest3_removespecificelement {
	
	void removeElement(int[] array,int element) {
		int output[]= new int[array.length];
		
		for(int index=0;index<array.length;index++) {
			
			if(array[index]!=element) {
				
				output[index]=array[index];
				
				System.out.print(output[index]+" ");
			}
		}	
	}

	public static void main(String[] args) {
		int[] array= {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
		int element=14;
		CodingTest3_removespecificelement Test3=new CodingTest3_removespecificelement();
		System.out.println("Input :"+Arrays.toString(array));
		Test3.removeElement(array,element);
	}

}
