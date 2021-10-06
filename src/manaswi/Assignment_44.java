/*Find out the max number from an ArrayList.
input: [10,7,99,53,74]
output: 99*/

package manaswi;
import java.util.ArrayList;

class Assignment_44
{
	int maxNum(ArrayList<Integer> arrayList)
	{
		int max=0;
		for(int index=0;index<arrayList.size();index++)
		{
			if(max<arrayList.get(index))
			{
				max=arrayList.get(index);
			}
		}
		return max;
	}


	public static void main(String[] args)
	{
		Assignment_44 assignment_44=new Assignment_44();
		ArrayList<Integer> num= new ArrayList<Integer>();
		num.add(10);
		num.add(7);
		num.add(99);
		num.add(53);
		num.add(74);
		System.out.println("Max Number is " +assignment_44.maxNum(num));
	}
}