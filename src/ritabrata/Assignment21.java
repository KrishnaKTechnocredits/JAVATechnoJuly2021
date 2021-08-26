/*Assignment - 21 : 22nd Aug'2021

Find the difference between oldest and youngest family member.
Age is in the form of array.
int[] age = {10,34,38,68,72,95,6};
output : 89*/

package ritabrata;
import java.util.Scanner;
public class Assignment21 {
	int getAgeDif(int[] age) {
		int maxAge=age[0];
		int minAge=age[0];
		for (int index=1; index< age.length; index++) {
			if(age[index]>maxAge) {
				maxAge= age[index];
			}
			else if(age[index]<minAge) {
				minAge=age[index];
			}
		}
		return (maxAge-minAge);
	}
	int[] getAge(){
		Scanner scanner= new Scanner(System.in);
		System.out.println("Enter the number of members: ");
		int length= scanner.nextInt();
		System.out.println("Enter the age of members: ");
		int[] input=new int[length];
		for(int i=0;i<input.length;i++) {
			input[i]=scanner.nextInt();
		}
		scanner.close();
		return input;
	}

	public static void main(String[] args) {
		Assignment21 ageDiff= new Assignment21();
		int[] input= ageDiff.getAge();
		System.out.println("The difference between the maximum and minimum age is: "+ageDiff.getAgeDif(input));
	}
}
