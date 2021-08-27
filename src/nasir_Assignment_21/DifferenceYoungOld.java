/*Find the difference between youngest and oldest family member.
Age is in the form of array.
int[] age = {10,34,38,68,72,95,6};
output : 89
*/
package nasir_Assignment_21;

public class DifferenceYoungOld {
	int getDiffrence(int[] arr) {
		int minAge=arr[0];
		int maxAge=arr[0];
		for(int index=0;index<arr.length;index++) {
			if(arr[index]>maxAge) {
				maxAge=arr[index];
			}else if (arr[index]<minAge) {
				minAge=arr[index];
			}
			
		}
		return maxAge-minAge;
	}

	public static void main(String[] args) {
		int[] age = {10,34,38,68,72,95,6};
		DifferenceYoungOld differenceYoungOld=new DifferenceYoungOld();
		System.out.println("The difference between youngest and oldest family member: "+ differenceYoungOld.getDiffrence(age));

	}

}
