package precilla.assignment43;
import java.util.Arrays;
public class StringProgram {
	int lengthOfString(String str) {
		int count=0;
		while(true){
			try{
				str.charAt(count);
				count++;
			}
			catch(StringIndexOutOfBoundsException e){
				break;
			}	
		}
		return count;
	}
	int lengthOfArray(int[] arr) {
		int count=0;
		while(true){
			try{
				int nm=arr[count];
				count++;
			}
			catch(ArrayIndexOutOfBoundsException e){
				break;
			}	
		}
		return count;
	}
	public static void main(String[] args) {
		StringProgram program1= new StringProgram();
		System.out.println("Program to find String length without using length() method");
		String str="technocredits";
		System.out.println("input : "+str);
		System.out.println("output: "+program1.lengthOfString(str));
		System.out.println("Program to find array length without using length property");
		int[] arr= {10,4,5,6,7,8,7,9};
		System.out.println("input : "+Arrays.toString(arr));
		System.out.println("output: "+program1.lengthOfArray(arr));	
	}
}