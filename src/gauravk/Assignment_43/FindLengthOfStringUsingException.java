package gauravk.Assignment_43;
/*
 * WAP to iterate over string without using string length method or array length property
 */
public class FindLengthOfStringUsingException {
	
	int findingStringLength(String str) {
		int i=0;
		while(true) {
			try {
				str.charAt(i);
				i++;
			}catch(StringIndexOutOfBoundsException se) {
				break;			
			}
		}
		/*{
			System.out.println("The length of the String ["+str+"] is "+i);
		}*/
		return i;
	}
	
	public static void main(String[] args) {
		String s = "TechnoCredits Java";
		System.out.println("Finding the length of the string. ["+s+"] is "+new FindLengthOfStringUsingException().findingStringLength(s));
	}
}
