/*Assignment - 21 : 22nd Aug'2021

Find the difference between oldest and youngest family member.
Age is in the form of array.
int[] age = {10,34,38,68,72,95,6};
output : 89 */

package akshay;

public class AgeDifference {
	
	int getDiffBetweenAge(int[] age) {
		int maxAge = 0;
		int minAge = age[0];
		for(int index = 0; index < age.length; index++) {
			if(maxAge < age[index])
				maxAge = age[index];
			if(minAge > age[index])
				minAge = age[index];
		}
		return maxAge - minAge;
	}
	
	public static void main(String[] args) {
		AgeDifference agediff = new AgeDifference();
		int[] age = {10,34,38,68,72,95,6};
		System.out.println("Maximum and minimum age difference is: " + agediff.getDiffBetweenAge(age));
	}
}
