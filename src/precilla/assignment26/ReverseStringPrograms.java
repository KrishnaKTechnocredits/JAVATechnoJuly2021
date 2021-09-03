package precilla.assignment26;

public class ReverseStringPrograms {
	String reverseString(String string) {
		String reverse="";
		for(int index=string.length()-1;index>=0;index--)
		{
			char ch=string.charAt(index);
			reverse=reverse+String.valueOf(ch);
		}
		return reverse;
	}
 void reverseStringArray(String[] stringArray) {
	 System.out.print("Input: ");
		for(int index=0;index<stringArray.length;index++) {
			System.out.print(stringArray[index]+" ");
		}
		System.out.print("\nOutput: ");
		for(int index=stringArray.length-1;index>=0;index--)
		{
			System.out.print(stringArray[index] + " ");
		}
			
	}
 	void swapNumber(int num1,int num2) {
 		System.out.println("Before swapping: Number 1 :" +num1+" Number 2: "+num2);
 		int temp=num1;
 		num1=num2;
 		num2=temp;
 		System.out.println("After swapping : Number 1 :" +num1 +" Number 2: "+ num2);	
 	}
 	void swapNumberWithoutVariable(int num1, int num2) {
 		System.out.println("Before swapping: Number 1 :" +num1+" Number 2: "+num2);
 		num1=num1+num2;//40
 		num2=Math.abs(num1)-Math.abs(num2);
 		num1=Math.abs(num1)-Math.abs(num2);
 		System.out.println("After swapping : Number 1 :" +num1 +" Number 2: "+ num2);
 	}
	public static void main(String[] args) {
		ReverseStringPrograms reverse=new ReverseStringPrograms();
		String string="This is technocredits";
		String stringArray[]= {"Credits", "Techno","From","Diwali","Happy"};
		System.out.println("Program 1: Reverse a given String \ninput: "+string);
		System.out.println("Output: "+ reverse.reverseString(string));
		System.out.println("\nProgram 2: Reverse a given String array");
		reverse.reverseStringArray(stringArray);
		System.out.println("\n\nProgram 3:swap 2 numbers with using 3rd variable");
		reverse.swapNumber(10, 20);
		System.out.println("\nProgram 4:swap 2 numbers without using 3rd variable");
		reverse.swapNumberWithoutVariable(50, 70);
	}
}