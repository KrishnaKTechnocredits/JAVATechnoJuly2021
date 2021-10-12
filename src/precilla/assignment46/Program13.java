package precilla.assignment46;

import java.util.ArrayList;
import java.util.Arrays;

public class Program13 {
/*input : [19,12,18,17,23,22]
output : [19,17,23]
*/
	public static void main(String[] args) {
		Integer arr[]= {19,12,18,17,23,22};
		ArrayList<Integer> al=new ArrayList<Integer>(Arrays.asList(arr));
		ArrayList<Integer> output=new ArrayList<Integer>();
		System.out.println("input : "+al);
		for(int index=0;index<al.size();index++) {
			boolean flag=true;
			for(int i=2;i<Math.sqrt(al.get(index));i++) {
				if(al.get(index)%i==0) {
					flag=false;
					break;
				}
			}
			if(flag==true)
				output.add(al.get(index));
			
		}
		System.out.println("output : "+output);
	}
}

