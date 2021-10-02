/*
Assignment - 44 : 1st  Oct'2021 
Find out the max number from an ArrayList.
 */
package precilla.assignment44;
import java.util.ArrayList;
public class FindingMaxNumber {
	public static void main(String[] args) {
		System.out.println("Find out the max number from an ArrayList");
		System.out.print("Input:[");
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(10);
		al.add(7);
		al.add(99);
		al.add(53);
		al.add(74);
		int max=al.get(0);
		for(int index=0;index<al.size();index++) {
			if(index==al.size()-1)
				System.out.print(al.get(index)+"]");
			else
				System.out.print(al.get(index)+",");
			if(max<al.get(index))
				max=al.get(index);	
		}
		System.out.println("\nOutput:"+max);
	}
}
