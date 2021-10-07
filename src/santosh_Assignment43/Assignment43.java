
/* Assignment43 :
find length of String without using Length Method & length property
*/
package santosh_Assignment43;
public class Assignment43 {
	int findStringLength(String str) {
		int count = 0;
		while(true) {
			try {
				str.charAt(count);
				count++;
			}catch (IndexOutOfBoundsException e) {
				break;
			}
		}
		return count;
	}
	public static void main(String[] args) {
        Assignment43 ass43=new Assignment43();	
		String str = "WelcomeToTechnocredits";
		System.out.println("\nLength Of The Given String " + str + " is :" + ass43.findStringLength(str));
	}
}
