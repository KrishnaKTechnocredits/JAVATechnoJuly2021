/* Assignment - 31 : 9th Sep'2021
Program 4:
In a user given range find all perfect numbers.
input : start range -> 40 , end range -> 170
output : ------
*/

package akanksha_Jain.Assignment_31;

public class Program_4_PerfectNumbersInRange {
	static String output = "";
	int count=0;
	
	int isPerfectNumber(int number) {
		int pNumber=0;
		for (int index=1; index<number; index++) {
			if(number%index == 0) {
				pNumber = pNumber + index;
			}
		}
		return pNumber;
	}

	int findPerfectNumberInRange(int startRange, int endRange) {
		for(int index=startRange; index<=endRange; index++) {
			if(isPerfectNumber(index)==index) {
				output = output + index + " ";
				count ++;
			}
		}
		return count;
	}
	
	public static void main(String[] args) {
		int startIndex=40, endIndex=170;
		Program_4_PerfectNumbersInRange perfNumbers = new Program_4_PerfectNumbersInRange();
		int result = perfNumbers.findPerfectNumberInRange(startIndex, endIndex);
		if(result==0)
			System.out.println("No perfect numbers exists in the range from " + startIndex + " to " + endIndex);
		else
			System.out.println("Perfect numbers in the range from " + startIndex + " to " + endIndex + " are " + output);
		
	}
}