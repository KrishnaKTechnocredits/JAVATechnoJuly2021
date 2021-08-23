
/*Assignment - 21 : 22nd Aug'2021

Find the difference between oldest and youngest family member.
Age is in the form of array.
int[] age = {10,34,38,68,72,95,6};
output : 89*/

package bhakti;

public class Assignment_21 {
	 void differenceOldestYoungest(int[] age) {
		 int lowerAge=age[0];
		 int maxAge=0;
		 
		for (int index = 0; index < age.length; index++) {
			if (age[index]>maxAge)
				maxAge=age[index];
			if (age[index]<lowerAge)
				lowerAge=age[index];
		}
		System.out.println("Difference between oldest and youngest family member is " + (maxAge-lowerAge));
	 }
	 public static void main(String[] df) {
		 int[] age = {10,34,38,68,72,95,6};
		 Assignment_21 assignment_21= new Assignment_21();
		 assignment_21.differenceOldestYoungest(age);
	 }

}
