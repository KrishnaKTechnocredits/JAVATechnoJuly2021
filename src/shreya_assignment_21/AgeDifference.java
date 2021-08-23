//Find the difference between oldest and youngest family member.
package shreya_assignment_21;
public class AgeDifference {
	int getAgeDifference(int[] age) {
		int maxAge = age[0], minAge = age[0];
		for(int index = 0; index < age.length; index++) {
			if(maxAge < age[index])
				maxAge = age[index];
			else if(minAge > age[index])
				minAge = age[index];
		}
		return maxAge-minAge;
	}
	
	void displayAgeDifference(int[] age) {
		System.out.println("Difference between the age oldest and youngest family member is: "+ getAgeDifference(age));
	}
	public static void main(String[] args) {
		AgeDifference ageDifference = new AgeDifference();
		int[] age = {10,34,38,68,72,95,6};
		ageDifference.displayAgeDifference(age);
	}

}
