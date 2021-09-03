package astha.Assignment26;

public class Assignment26 {

	String getReverseString(String input) {
		String outputString= "";
		for(int index=input.length()-1; index>=0;index--) {
			outputString += input.charAt(index);
		}
		return outputString;
	}
	
	String[] getReverseArray(String[] input) {
		String[] output = new String[input.length];
		for(int index=input.length-1; index>=0; index--) {
			output[index] = input[(input.length-1) - index];
		}
		return output;
	}
	
	void swapNumberWithVariable(int x, int y) {
		System.out.println("Before Swapping : x = " +x +"  y = " +y);
		int z = 0;
		z = x;
		x = y;
		y = z;
		System.out.println("After Swapping : x = " +x +"  y = " +y);
	}
	
	void swapNumberWithoutVariable(int x, int y) {
		System.out.println("Before Swapping : x = " +x +"  y = " +y);
		y= x*y;
		x= y/x;
		y= y/x;
		System.out.println("After Swapping : x = " +x +"  y = " +y);
	}
		
	
	public static void main(String[] args) {
		Assignment26 assignment26 = new Assignment26();
		System.out.println(assignment26.getReverseString("This is technocredits"));
		String[] inputArray = {"Credits", "Techno","From","Diwali","Happy"};
		String[] outputArray = assignment26.getReverseArray(inputArray);
		for(int index=0; index<outputArray.length;index++) {
			System.out.print(outputArray[index]+" ");
		}
		System.out.println('\n');
		assignment26.swapNumberWithoutVariable(55,15);
		System.out.println("-------------------------------------------------------------------");
		assignment26.swapNumberWithVariable(20,10);
	}
}
