package swati.Assignment21;

/*
Find the difference between oldest and youngest family member.
Age is in the form of array.
int[] age = {10,34,38,68,72,95,6};
output : 89
*/

public class DiffBetYoungestAndOldest {
	int returnYoungestMember(int[] input) {
		int youngest=input[0];
		for(int index=1;index<input.length;index++) {
			if(input[index]<youngest)
				youngest=input[index];
		}
		return youngest;
	}

	int returnOldestMember(int[] input) {
		int oldest=0;
		for(int index=0;index<input.length;index++) {
			if(input[index]>oldest)
				oldest=input[index];
		}
		return oldest;
	}
	
	void findDiff(int[] input) {
		int diff=returnOldestMember(input)-returnYoungestMember(input);
		System.out.println("Difference between oldest and youngest family membe: "+diff);
	}
	
	public static void main(String[] a) {
		DiffBetYoungestAndOldest diffBetYoungOld=new DiffBetYoungestAndOldest();
		int[] age= {10,34,38,68,72,95,6};
		diffBetYoungOld.findDiff(age);
	}
}

