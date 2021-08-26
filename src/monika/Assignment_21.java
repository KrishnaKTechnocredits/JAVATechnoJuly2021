/*
 
Find the difference between oldest and youngest family member.
Age is in the form of array.
int[] age = {10,34,38,68,72,95,6};
output : 89
 */
package monika;

public class Assignment_21 {

	int getAgeDifferenceBetweenOldestAndYungest(int[] input) {
		int maxAge=input[0], minAge=input[0];
		for(int index=1;index<input.length;index++) {
			if(input[index]>maxAge)
				maxAge=input[index];
			else if(input[index]<minAge)
				minAge=input[index];
		}
		return(maxAge-minAge);
	}
	
	public static void main(String[] args) {
		int[] age = { 10, 34, 38, 68, 72, 95, 6 };
		System.out.print("The difference between oldest and youngest family member is: ");
		System.out.println(new Assignment_21().getAgeDifferenceBetweenOldestAndYungest(age));
	}
}
