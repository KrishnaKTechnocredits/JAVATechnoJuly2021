package monali.Assignment_21;

public class OldestAndYoungestDiff {

	int findDiffOldandYoungMember(int[] age) {
		int oldest = age[0];
		int youngest = age[0];
		for (int index = 0; index < age.length; index++) {
			if (age[index] > oldest)
				oldest = age[index];
			if (age[index] < youngest)
				youngest = age[index];
		}
		return oldest - youngest;
	}

	public static void main(String[] args) {
		OldestAndYoungestDiff oldAndYoungDiff = new OldestAndYoungestDiff();
		int[] age = { 10, 34, 38, 68, 72, 95, 6 };
		System.out.println("Difference between oldest and youngest member in family : "
				+ oldAndYoungDiff.findDiffOldandYoungMember(age));

	}
}
