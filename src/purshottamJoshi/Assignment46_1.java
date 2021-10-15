/*Example 1 : 
Write a program to find given number is present in the arrayList or not.*/

package purshottamJoshi;
import java.util.ArrayList;
import java.util.Arrays;

public class Assignment46_1 {
	//1st approach
	void checkNumberIsPresent(Integer[] input,int number) {
		ArrayList<Integer> al = new ArrayList<Integer>(Arrays.asList(input));
		al.add(1);
		for(int index=0; index< al.size(); index++) {
			if(al.get(index) == number) {
				
				System.out.println(number+" Number is present in the arrayList");
				break;
			
			}else  {
				System.out.println(number+" number is not present in arrayList");
				break;
			}
		}
	}
	//2nd approach
	void checkNumber(Integer[] input,int number) {
		ArrayList<Integer> al = new ArrayList<Integer>(Arrays.asList(input));
		boolean containNumber =al.contains(number);
		
			if(containNumber) {
				System.out.println(number+" Number is present in the arrayList");
			}else  {
				System.out.println(number+" number is not present in arrayList");
			}
	
	}
	public static void main(String[] args) {
		Integer[] arr = {1,2,3,5,6,8};
		int number=1;
		new Assignment46_1().checkNumberIsPresent(arr, number);
		new Assignment46_1().checkNumber(arr,7);
	}
}
