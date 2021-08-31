/* Assignment - 22 :Program 1 : Find total digits in a given string.
String str = "Te1ch2no3cr4ed3it4s" 
output : 6*/

package santosh;
public class TotalDigitsInString {
	int getTotalDigitsInString(String arr) {
		int count=0;
		for(int index=0;index<arr.length();index++) {
			if(Character.isDigit(arr.charAt(index)))
				count++;
		}
		return count;
	}
	public static void main(String[] args) {
		TotalDigitsInString totalDigitsInString=new TotalDigitsInString();
		String str="Te1ch2no3cr4ed3it4s";
		System.out.println("-----------------------------------------------------------");
		System.out.println("Total digits present in a string is "+"\""+str+"\""+": "+totalDigitsInString.getTotalDigitsInString(str));
        System.out.println("-----------------------------------------------------------");
	}

}

