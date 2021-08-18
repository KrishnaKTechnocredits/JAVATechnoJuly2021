/*program 3 : write a method which returns 5 smaller numbers of the given number.
input : 50
output : 49, 48, 47, 46, 45*/

package nasir;

public class SmallerNumbers {
	
	int[] numberSmaller(int num) {
		int count=0;
		int[] input=new int[5];
		for(int index=num;index>num-5;num--) {
			if(count!=5) {
				input[count]=num-1;
				System.out.println(input[count]);
				count++;
			}
				
		}
		return input;
		
		
	}
	

	public static void main(String[] args) {
		SmallerNumbers smallerNumbers=new SmallerNumbers();
		smallerNumbers.numberSmaller(50);
		

	}

}
