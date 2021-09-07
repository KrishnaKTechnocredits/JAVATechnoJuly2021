package paresh.assignemnt21;

/*Assignment - 21 : 22nd Aug'2021

Find the difference between oldest and youngest family member.
Age is in the form of array.
int[] age = {10,34,38,68,72,95,6};
output : 89*/

public class AgeDiffrence {
	
	int ageDiffrenceBetweenYoungAndOld(int [] input) {
		
		int youngestMember = input[0];
		int oldestMember = input[0];
		int diffBetweenYoungAndOld;
		for(int index=0;index < input.length;index++) {
			if(youngestMember > input[index])
				youngestMember=input[index];
			if(oldestMember < input[index])
				oldestMember = input[index];
		}
		diffBetweenYoungAndOld=oldestMember-youngestMember;
		return diffBetweenYoungAndOld;
	}
	public static void main(String[] args) {
		AgeDiffrence ageDiffrence = new AgeDiffrence();
		int [] output = {10,34,38,68,72,95,6};
		System.out.println("Diffrence between youngest and oldest age of a family members : "+ageDiffrence.ageDiffrenceBetweenYoungAndOld(output));
	}

}