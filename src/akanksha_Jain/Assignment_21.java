/* Assignment - 21 : 22nd Aug'2021
Find the difference between oldest and youngest family member.
Age is in the form of array.
int[] age = {10,34,38,68,72,95,6};
output : 89
*/

package akanksha_Jain;

public class Assignment_21 {
	static int max=0;
	static int min=100;
	
	int findMaxAge(int[] age) {
		for(int index = 0;index<age.length;index++){
			if(age[index]>max)
				max = age[index];
		}			
		return max;
	}
	
	int findMinAge(int[] age) {
		for(int index = 0;index<age.length;index++){
			if(age[index]<min)
				min = age[index];
		}			
		return min;
	}
	
	public static void main(String[] args) {
		int diff;
		int[] age = {10,34,38,68,72,95,6};
		Assignment_21 assignment_21 = new Assignment_21();
		assignment_21.findMaxAge(age);
		assignment_21.findMinAge(age);
		diff = max - min;
		System.out.println("The difference between youngest and oldest family member is " + diff);
	}
}
