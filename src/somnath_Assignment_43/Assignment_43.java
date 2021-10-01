
package somnath_Assignment_43;
public class Assignment_43 {
	int findLength(String str) {
		int count = 0;
		while(true) {
			try {
				str.charAt(count);
				count++;

			}catch (StringIndexOutOfBoundsException e) {
				break;
			}
		}
		return count;
		
	}
	

	public static void main(String[] args) {
		
		String str = "Somnath";
		System.out.println("Length Of The String " + str + " is :" + new Assignment_43().findLength(str));
	}
}
