package himanshu_array_assignment;

public class Assignment_21 {

	int oldestMember;
	int youngestMember;
	int diffOfBoth;

	void differnceBtwOldestYoungest(int[] age) {

		int older = age[0];
		int younger = age[0];

		for (int index = 0; index < age.length; index++) {

			if (older < age[index]) {
				oldestMember = age[index];
			}

			if (younger > age[index]) {
				youngestMember = age[index];
			}

		}

		System.out.println("The differnce between the Oldest and the Youngest family member is : "
				+ (oldestMember - youngestMember));

	}

	public static void main(String[] args) {

		int[] age = { 10, 34, 38, 68, 72, 95, 6 };

		Assignment_21 assignment21 = new Assignment_21();
		assignment21.differnceBtwOldestYoungest(age);
	}
}
