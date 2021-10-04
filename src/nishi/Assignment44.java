/*Assignment - 44 : 1st  Oct'2021 
Find out the max number from an ArrayList.
input: [10,7,99,53,74]
output: 99*/
package nishi;
import java.util.ArrayList;

public class Assignment44 {
	public static void main(String[] args) {
	    ArrayList<Integer> list=new ArrayList<Integer>();
	    list.add(10);
	    list.add(7);
	    list.add(99);
	    list.add(53);
	    list.add(74);
	    System.out.println("input : ");
	    for(Integer i : list)
	    {
	    	System.out.print(i + " ");
	    }
	    System.out.println();
		System.out.println("Output : "+new Assignment44().getMax(list));
	}

	private int getMax(ArrayList<Integer> list) {
		int max=0;
		for(int index=0;index<list.size();index++)
		{
			if(list.get(index)>max)
			{
				max=list.get(index);
			}
		}
		return max;
	}
}
