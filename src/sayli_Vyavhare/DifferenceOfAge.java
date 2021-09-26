
/*Find the difference between oldest and youngest family member.
Age is in the form of array.
int[] age = {10,34,38,68,72,95,6};
output : 89*/

package sayli_Vyavhare;

public class DifferenceOfAge {

	int[] age = {10,34,38,68,72,95,6};
	int maxAge=0,minAge=age[0];

	void getDifferenceOfAge() {
		
		for(int index=0;index<age.length;index++){
			if(age[index]>maxAge)
				maxAge=age[index];
			else
				minAge=age[index];
		}
		  System.out.println("Difference between oldest and youngest member is:"+ (maxAge-minAge) );
	}
	
	public static void main(String[] args) {
		new DifferenceOfAge().getDifferenceOfAge();	
	}
}
