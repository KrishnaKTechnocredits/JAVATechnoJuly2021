/*Assignment - 44 : 1st  Oct'2021 
Find out the max number from an ArrayList.
input: [10,7,99,53,74]
output: 99*/
package indu.ArrayList;

import java.util.ArrayList;

public class FindMaxNumberUsingArrayList_44 {

	static void findMaxNumber()
	{	int max=0;
		ArrayList<Integer> listofNumbers = new ArrayList<Integer>();
		listofNumbers.add(10);
		listofNumbers.add(7);
		listofNumbers.add(99);
		listofNumbers.add(53);
		listofNumbers.add(74);
		
		for(int index=0;index<listofNumbers.size();index++ )
		{
			if(max<listofNumbers.get(index))
			{
				max=listofNumbers.get(index);
			}
		}
		System.out.println("ArrayList is  : " +listofNumbers);
		System.out.println("Max number is : "+max);
	}
	
	public static void main(String[] args) {
		findMaxNumber();
	}
}
