package vivek;

public class Assignment21 {

	int diffOldestYoungest(int[] age) {
		int maxAge = age[0];
		int minAge = age[0];
		for (int index = 0; index < age.length; index++) {
			if (age[index] > maxAge)
				maxAge = age[index];
			else if (age[index] < minAge) 
				minAge = age[index];
		}
		return maxAge - minAge;
	}

	public static void main(String[] args) {
		Assignment21 assignment21 = new Assignment21();
		int[] age = { 10, 34, 38, 68, 72, 95, 6 };
		System.out.println("Diff between Oldest & Youngest family member is " + assignment21.diffOldestYoungest(age));
	}
}
