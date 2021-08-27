/*Assignment - 22 :Program 2 : Find sum of all the digits in a given string
String str = "Te11ch2no3cr4edi2ts" 
output : 13*/

package santosh;
public class SumOfDigitsInString {
int getSumOfDigits(String str) {
	int sum=0;
	for(int index=0;index<str.length();index++) {
		char ch=str.charAt(index);
		if(Character.isDigit(str.charAt(index))) {
			sum=sum+Integer.parseInt(str.charAt(index)+"");;
		}
	}
	return sum;
}
public static void main(String[] args) {
	SumOfDigitsInString sumOfDigitsInString=new SumOfDigitsInString();
	String input="Te11ch2no3cr4edi2ts";
	System.out.println("---------------------------------------------------------");
	System.out.println("Sum of all digits in a string is "+"\""+input+"\""+": "+sumOfDigitsInString.getSumOfDigits(input));
    System.out.println("---------------------------------------------------------");
}

}