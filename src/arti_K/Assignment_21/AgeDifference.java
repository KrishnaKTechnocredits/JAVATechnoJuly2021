/*  Assignment - 21 : 22nd Aug'2021

Find the difference between oldest and youngest family member.
Age is in the form of array.
int[] age = {10,34,38,68,72,95,6};
output : 89
 */

package arti_K.Assignment_21;

public class AgeDifference {
	
	int findAgeDiff(int[] arr) {
		int ageDiff = 0;
		int oldAge = arr[0];
		int youngAge = arr[0];
		
			for(int index = 0; index < arr.length; index++) {
				if(arr[index] > oldAge)
					oldAge = arr[index];
				else
					youngAge = arr[index];
			}
		return ageDiff = oldAge - youngAge;
	}
	
	public static void main(String[] args) {
		int[] ageArray = {10,34,38,68,72,95,6};
		AgeDifference age = new AgeDifference();
		int ageDifference = age.findAgeDiff(ageArray);
		System.out.println("Difference between oldest and yougest family member is : "+ageDifference);
	}

}
