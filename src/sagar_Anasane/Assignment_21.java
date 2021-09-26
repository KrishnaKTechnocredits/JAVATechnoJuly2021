/*Assignment - 21 : 22nd Aug'2021

Find the difference between oldest and youngest family member.
Age is in the form of array.
int[] age = {10,34,38,68,72,95,6};
output : 89*/
package sagar_Anasane;

public class Assignment_21 {
	int[] age = {10,34,38,68,72,95,6};
	int maxAge = 0;
	int minAge = 0;
	int diffBetOldAndYoungFamilyMember() {
		for (int index=0;index<age.length;index++) {
			if(age[index]>maxAge) {
				maxAge = age[index];
			}else
			{
				minAge= age[index];
			}	
		}

		System.out.println(maxAge-minAge);
		return maxAge - minAge;
	}

	public static void main(String[] args) {
		Assignment_21  assignment21 = new Assignment_21();
		assignment21. diffBetOldAndYoungFamilyMember();
	}

}
