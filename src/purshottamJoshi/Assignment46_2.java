/*Example 2 :
Write a program to find given number is duplicate in arrayList.
*/

package purshottamJoshi;

import java.util.ArrayList;
import java.util.Arrays;

public class Assignment46_2 {
	
	void getDuplicateNumber(Integer[] input,Integer number) {
		
		ArrayList al = new ArrayList<>(Arrays.asList(input));
		
		boolean checknumber=al.contains(number);
		
		for(int index=0; index < al.size(); index++) {
			if(checknumber) {
				if(al.indexOf(al.get(index)) != al.lastIndexOf(al.get(index))) {
				//System.out.println(al.get(index));
					if(al.get(index) == number) {
						System.out.println("number is duplicate");
						break;
					}else {
						System.out.println("number is not duplicate:");
						break;
					}
				}
			}else {
				if(al.get(index) == number) {
					System.out.println("number is not duplicate");
					//System.out.println(number);
					break;
					
				}else {
			
					System.out.println("Invalid Number");
					break;
					//System.out.println(al.get(index));
				}
			}
		}
		
	}
	
	public static void main(String[] args) {
		Integer[] arr= {1,2,3,4,3,5,6};
		new Assignment46_2().getDuplicateNumber(arr, 9);
		new Assignment46_2().getDuplicateNumber(arr, 1);
		new Assignment46_2().getDuplicateNumber(arr, 3);
		
	}
}
