/* program 1: Find total digit in a given string
			String str =  "Te1ch2no3cr4ed3it4s" 
			output : 6 */

package somnath;
public class Assignment22_1 {
	int getTotalDigitsInString(String arr) {
		int count=0;
		for(int index=0;index<arr.length();index++) {
			if(Character.isDigit(arr.charAt(index)))
				count++;
		}
		return count;
	}
	public static void main(String[] args) {
		Assignment22_1 assignment22_1=new Assignment22_1();
		String str="Te1ch2no3cr4ed3it4s";
		System.out.println("-----------------------------------------------------------");
		System.out.println("Total present digits in a string is "+"\""+str+"\""+": "+assignment22_1.getTotalDigitsInString(str));
        System.out.println("-----------------------------------------------------------");
	}

}