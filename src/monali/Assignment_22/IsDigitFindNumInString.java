package monali.Assignment_22;
/*Program 1 : Find total digits in a given string.
String str = "Te1ch2no3cr4ed3it4s" 
output : 6
*/
public class IsDigitFindNumInString {

		// find total numbers in string

		static int findNumbersInString(String str) {

			int count = 0;
			for (int index = 0; index < str.length(); index++) {
				if (Character.isDigit(str.charAt(index)))
					count++;
			}
			// System.out.println("Total Numbers in string: "+count);
			return count;
		}

		public static void main(String[] args) {
			String str = "Tec1chn2o3cre4di3ts";
			System.out.println("Total Numbers in given String : " + findNumbersInString(str));

		}
	}

