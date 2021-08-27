/*Assignment - 21 : 
Find the difference between oldest and youngest family member.
Age is in the form of array.
int[] age = {10,34,38,68,72,95,6};
output : 89*/
package santosh;
import java.util.Arrays;

public class Assignment_21 {

	int  findDiffrenceBtnOldestandYoungest(int[] age)
	{
		int max =0;
		int min = age[0];
		for(int index=0 ; index  < age.length ;index++)
		{
			if(age[index]> max)
			{
				max=age[index];
			}
			if(age[index]<min)
			{
				min=age[index];
			}
		}
		return max-min;
	}

	public static void main(String[] ar)
	{
		Assignment_21 assignment_21 = new Assignment_21();
		int[] age = {10,34,38,68,72,95,6};
        System.out.println("-------------------------------------------------------------");
		System.out.println("Differene between oldest and youngest from given array \n " + 
		Arrays.toString(age)+"\n is : " +assignment_21.findDiffrenceBtnOldestandYoungest(age));
        System.out.println("-------------------------------------------------------------");
	}
}